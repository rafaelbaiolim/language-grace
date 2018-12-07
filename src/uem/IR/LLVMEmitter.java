package uem.IR;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.LLVM;
import org.bytedeco.javacpp.LLVM.*;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.PointerPointer;
import uem.listners.FrontEnd;
import uem.semantic.CheckSymbols;
import uem.utils.TestUtils;

import java.util.*;

import static org.bytedeco.javacpp.LLVM.*;

public class LLVMEmitter {
    public final LLVMContextRef context;
    public final LLVMModuleRef mod;
    public final LLVMBuilderRef builder;
    public LLVMBasicBlockRef mainBlock;
    public final LLVMType types;
    private boolean optimization = true;
    public static final String FORMAT_NUMBER = "NUMBER";
    public static final String FORMAT_BOOL = "BOOL";
    public static final String FORMAT_STRING = "STRING";
    public static final String FORMAT_STRING_VAR = "STRING_VAR";
    public static final String FORMAT_CHAR = "STRING_VAR_CHAIN";
    public static final String PRINT_FUN_NAME = "printf";
    public static final String SCAN_FUN_NAME = "scanf";
    public static final String TERN_FUN_NAME = "_ternary";
    private boolean dumpAssembly;
    BytePointer error;

    private LLVMEmitter(
            LLVMContextRef context,
            LLVMModuleRef mod,
            LLVMBuilderRef builder
    ) {
        this.context = context;
        this.mod = mod;
        this.builder = builder;
        this.types = new LLVMType(this);
    }

    private static LLVMEmitter uniqueInstance;

    public static synchronized void setInstance(LLVMContextRef context,
                                                LLVMModuleRef mod,
                                                LLVMBuilderRef builder) {
        uniqueInstance = new LLVMEmitter(
                context,
                mod,
                builder);
    }

    public static synchronized LLVMEmitter getInstance() {
        return uniqueInstance;
    }


    public LLVMValueRef getArray(LLVMValueRef valIdex, LLVMValueRef arrAllocated, int numReg) {
        LLVM.LLVMValueRef[] indices;
        if (numReg > 1) {
            indices = new LLVMValueRef[]{
                    LLVMConstInt(
                            this.types.i32(),
                            0,
                            0), valIdex};
        } else {
            indices = new LLVMValueRef[]{
                    valIdex
            };

        }
        return LLVMBuildInBoundsGEP(this.builder,
                arrAllocated,
                new PointerPointer(indices),
                numReg, //total de registradores
                "arr_ptr");

    }


    public LLVMValueRef getArray(int idx, LLVMValueRef arrAllocated) {
        LLVM.LLVMValueRef[] indices = {
                LLVMConstInt(
                        this.types.i32(),
                        0,
                        0), //inicial
                LLVMConstInt(this.types.i32(),
                        idx,
                        0)  //indice
        };
        return LLVMBuildInBoundsGEP(this.builder,
                arrAllocated,
                new PointerPointer(indices),
                2, //total de registradores
                "arr_ptr");
    }

    public void setOptimization(boolean optimization) {
        this.optimization = optimization;
    }

    public void setDumpAssembly(boolean dumpAssembly) {
        this.dumpAssembly = dumpAssembly;
    }

    public LLVMValueRef LLVMBuildAllocWithScope(LLVMTypeRef byTypeName, String varName) {
        if (FrontEnd.isGLobalScope()) {
            LLVMValueRef globalArr = LLVMAddGlobal(
                    mod,
                    byTypeName,
                    varName);
            LLVMSetInitializer(globalArr, LLVMConstInt(LLVMInt32Type(), 0, 0));
            return globalArr;
        }
        return LLVMBuildAlloca(
                builder,
                byTypeName,
                varName);
    }


    /**
     * Auxiliar para indicar o inicio ou fim
     * de uma estrutura de repetição ou
     * declarações com label
     */
    public class ControlTransferLocation {
        private LLVMBasicBlockRef block;

        ControlTransferLocation(LLVMBasicBlockRef block) {
            this.block = block;
        }

        public LLVMBasicBlockRef getBlock() {
            return block;
        }

    }

    private class LabeledStmtLocation {
        ControlTransferLocation head, end;

        LabeledStmtLocation(LLVMBasicBlockRef head, LLVMBasicBlockRef end) {
            this.head = new ControlTransferLocation(head);
            this.end = new ControlTransferLocation(end);
        }
    }

    public void pushLabel(String label, LLVMBasicBlockRef before, LLVMBasicBlockRef after) {
        labelMap().put(label, new LabeledStmtLocation(before, after));
    }

    public void popLabel(String label) {
        labelMap().remove(label);
    }


    private ScopeFn fnCtxt() {
        return fnCtxts.getFirst();
    }

    private Map<String, LabeledStmtLocation> labelMap() {
        return fnCtxt().labelMap;
    }

    private Deque<ControlTransferLocation> continueLocs = new ArrayDeque<>();
    private Deque<ControlTransferLocation> breakLocs = new ArrayDeque<>();

    public ControlTransferLocation getBreakLoc(String label) {
        return label == null ? breakLocs.getLast() : labelMap().get(label).end;
    }

    public void pushLoop(LLVMBasicBlockRef head, LLVMBasicBlockRef end) {
        continueLocs.addLast(new ControlTransferLocation(head));
        breakLocs.addLast(new ControlTransferLocation(end));
    }

    private static class ScopeFn {
        final LLVM.LLVMValueRef scope;
        /**
         * Mapeamento das labels para IR.
         */
        final Map<String, LabeledStmtLocation> labelMap = new HashMap<String, LabeledStmtLocation>();

        ScopeFn(LLVMValueRef scope) {
            this.scope = scope;
        }
    }

    protected Deque<LLVMBasicBlockRef> prevBasicBlocks = new ArrayDeque<LLVMBasicBlockRef>();
    protected Deque<ScopeFn> fnCtxts = new ArrayDeque<ScopeFn>();

    /**
     * Empilha um Escopo de função LLVM
     */
    public void pushScope(LLVMValueRef fn) {
        fnCtxts.push(new ScopeFn(fn));
    }

    /**
     * Desempilha Escopo de função LLVM
     */
    public void popScope() {
        fnCtxts.pop();
    }

    public void popLoop() {
        continueLocs.removeLast();
        breakLocs.removeLast();
    }

    public LLVMValueRef currentScope() {
        return fnCtxts.peek().scope;
    }

    /**
     * Associa a syntax Grace a da LLVM
     */
    private Map<Object, Object> translations = new IdentityHashMap<>();

    public void setTranslation(Object n, Object ll) {
        translations.put(n, ll);
    }

    public <T> T getTranslation(Object n) {
        T res = (T) translations.get(n);
        if (res == null)
            throw new Error("Translation em null pointer [ " + n.getClass() + "] : " + n);
        return res;
    }

    private final void GetLLVMConfig() {
        error = new BytePointer((Pointer) null); // Erros são capturados por essa instância
        LLVMLinkInMCJIT();
        LLVMInitializeNativeAsmPrinter();
        LLVMInitializeNativeAsmParser();
        LLVMInitializeNativeDisassembler();
        LLVMInitializeNativeTarget();
    }

    public final void Finalize() {
        LLVMValueRef llvmMainRet = LLVMConstInt(types.i32(), 0, 0);
        if (CheckSymbols.hasError > 0) {
            llvmMainRet = LLVMConstInt(types.i32(), 1, 0);
        }
        LLVMBuildRet(builder, llvmMainRet);
        CheckSymbols.hasMainFatalEror();

        LLVMPassManagerRef pass = LLVMCreatePassManager();
        //TODO: deixar setavel via flag
//        LLVMVerifyModule(mod, LLVMAbortProcessAction, error);
//        LLVMDisposeMessage(error);

        if (this.optimization) {
            LLVMAddConstantPropagationPass(pass);
            LLVMAddInstructionCombiningPass(pass);
            LLVMAddPromoteMemoryToRegisterPass(pass);
            LLVMAddGVNPass(pass);
            LLVMAddCFGSimplificationPass(pass);
            LLVMRunPassManager(pass, mod);
        }
        if (this.dumpAssembly) {
            LLVMDumpModule(this.mod);
        }
        LLVMDisposeBuilder(this.builder);
        LLVMWriteBitcodeToFile(this.mod, TestUtils.GetFolderAssets("/llvm/") + "out.bc");
        LLVMDisposePassManager(pass);
    }

    public HashMap<String, LLVMValueRef> printerArgs = new HashMap<>();

    private LLVMEmitter Ternary() {
        List<LLVMTypeRef> args = new LinkedList<LLVMTypeRef>();
        args.add(types.i1());
        args.add(types.i32());
        args.add(types.i32());
        LLVMPresets llp = LLVMPresets.getInstance();
        LLVMValueRef fun = llp.buildScopeFn(TERN_FUN_NAME, LLVMInt32Type(), args);
        LLVM.LLVMBasicBlockRef ternThen = llp.buildBlock("ternThen");
        LLVM.LLVMBasicBlockRef ternElse = llp.buildBlock("ternElse");
        LLVM.LLVMValueRef condParam = LLVMGetParam(fun, 0); //primeiro param cond
        LLVM.LLVMValueRef thenParam = LLVMGetParam(fun, 1); //primeiro param then
        LLVM.LLVMValueRef elseParam = LLVMGetParam(fun, 2); //primeiro param else
        LLVMBuildCondBr(
                LLVMEmitter.getInstance().builder,
                condParam,
                ternThen,
                ternElse);
        LLVMPositionBuilderAtEnd(builder, ternThen);
        LLVMBuildRet(builder, thenParam);
        LLVMPositionBuilderAtEnd(builder, ternElse);
        LLVMBuildRet(builder, elseParam);
        LLVMPositionBuilderAtEnd(builder, mainBlock);
        this.popScope();
        return this;
    }

    public LLVMValueRef LLVMBuildLocalString(String data, int len) {
        LLVM.LLVMValueRef glob = LLVMAddGlobal(LLVMEmitter.getInstance().mod
                , LLVMArrayType(LLVMEmitter.getInstance().types.i8(), len), "localString");

        // set as internal linkage and constant
        LLVMSetLinkage(glob, LLVMInternalLinkage);
        LLVMSetGlobalConstant(glob, 1);

        // Initialize with string:
        LLVMSetInitializer(glob, LLVMConstString(data, len, 1));
        return glob;
    }


    public LLVMValueRef CallTernary(LLVMValueRef lvCond,
                                    LLVMValueRef lvThen,
                                    LLVMValueRef lvElse) {
        LLVMValueRef tern = LLVMGetNamedFunction(mod, TERN_FUN_NAME);
        LLVMValueRef args[] = {
                lvCond,
                lvThen,
                lvElse,
        };
        return LLVMBuildCall(builder, tern, new PointerPointer(args), 3, TERN_FUN_NAME);
    }


    private LLVMEmitter Printer() {
        LLVMTypeRef PrintfArgsTyList[] = {
                LLVMPointerType(LLVMInt8Type(), 0)
        };
        LLVMTypeRef PrintfTy = LLVMFunctionType(
                LLVMInt32Type(),
                PrintfArgsTyList[0], 1, 1
        );
        LLVMAddFunction(mod, PRINT_FUN_NAME, PrintfTy);
        try {
            LLVMValueRef formatNumber = LLVMBuildGlobalStringPtr(
                    this.builder,
                    "%d",
                    ".format_numer"
            ), formatString = LLVMBuildGlobalStringPtr(
                    this.builder,
                    "%s",
                    ".format_string"
            ), formatChar = LLVMBuildGlobalStringPtr(
                    this.builder,
                    "%c",
                    ".format_char"
            );
            this.printerArgs.put(FORMAT_STRING, formatString);
            this.printerArgs.put(FORMAT_STRING_VAR, formatString);
            this.printerArgs.put(FORMAT_CHAR, formatChar);
            this.printerArgs.put(FORMAT_NUMBER, formatNumber);
        } catch (Exception ex) {
            //System.out.println(ex.getMessage());
        }
        return this;
    }

    public HashMap<String, LLVMValueRef> scanArgs = new HashMap<>();

    private LLVMEmitter Scanner() {
        LLVMTypeRef ScanfArgsTyList[] = {
                LLVMPointerType(LLVMInt8Type(), 0)
        };
        LLVMTypeRef ScanfTy = LLVMFunctionType(
                LLVMInt32Type(),
                ScanfArgsTyList[0], 1, 1
        );
        LLVMAddFunction(mod, SCAN_FUN_NAME, ScanfTy);
        try { //TODO: generalizar esses argumentos scan e print
            LLVMValueRef formatNumber = LLVMBuildGlobalStringPtr(
                    this.builder,
                    "%d",
                    ".sc_format_numer"
            ), formatString = LLVMBuildGlobalStringPtr(
                    this.builder,
                    "%s",
                    ".sc_format_string"
            ), formatChar = LLVMBuildGlobalStringPtr(
                    this.builder,
                    "%c",
                    ".format_char"
            );
            this.scanArgs.put(FORMAT_STRING, formatString);
            this.printerArgs.put(FORMAT_STRING_VAR, formatString);
            this.printerArgs.put(FORMAT_CHAR, formatChar);
            this.scanArgs.put(FORMAT_NUMBER, formatNumber);
        } catch (Exception ex) {
            //System.out.scanln(ex.getMessage());
        }
        return this;
    }

    public void CallPrint(LLVMValueRef value, String format) {
        LLVMValueRef printArgs[] = {this.printerArgs.get(format), value};
        LLVMValueRef printf = LLVMGetNamedFunction(this.mod, PRINT_FUN_NAME);
        LLVMBuildCall(builder, printf, new PointerPointer(printArgs), 2, PRINT_FUN_NAME);
    }

    public void CallScan(LLVMValueRef value, String format) {
        LLVMValueRef scanArgs[] = {this.scanArgs.get(format), value};
        LLVMValueRef scanf = LLVMGetNamedFunction(this.mod, SCAN_FUN_NAME);
        LLVMBuildCall(builder, scanf, new PointerPointer(scanArgs), 2, SCAN_FUN_NAME);
    }

    public LLVMEmitter Bootstrap() {
        this.GetLLVMConfig();

        /**
         * Main Func LLVM
         */
        LLVMTypeRef[] ARGS1 = {LLVMVoidType()};
        LLVMTypeRef MainFunctionTy = LLVMFunctionType(
                LLVMVoidType(),
                ARGS1[0],
                0,
                0);

        LLVMValueRef MainFunction = LLVMAddFunction(mod, "main", MainFunctionTy);
        LLVMBasicBlockRef BasicBlock = LLVMAppendBasicBlock(MainFunction, "entrypoint");
        this.mainBlock = BasicBlock;
        LLVMPositionBuilderAtEnd(builder, BasicBlock);
        this.pushScope(MainFunction);

        this.Printer();
        this.Scanner();
        this.Ternary();
        return this;
    }

    /**
     * Verifica se a ultima condição do bloco não é de um tipo
     * terminal
     *
     * @param block
     * @return
     */
    public boolean canPutTerminatorInst(LLVMBasicBlockRef block) {
        int lastInstruction = LLVMGetInstructionOpcode(LLVMGetLastInstruction(block));
        return (lastInstruction != LLVMBr && lastInstruction != LLVMRet);
    }


}
