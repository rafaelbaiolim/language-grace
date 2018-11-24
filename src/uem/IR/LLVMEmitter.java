package uem.IR;

import org.bytedeco.javacpp.LLVM;
import org.bytedeco.javacpp.LLVM.*;
import org.bytedeco.javacpp.PointerPointer;
import uem.TestUtils;

import java.util.*;

import static org.bytedeco.javacpp.LLVM.*;

public class LLVMEmitter {
    public final LLVMContextRef context;
    public final LLVMModuleRef mod;
    public final LLVMBuilderRef builder;
    public final LLVMType types;
    public static final String FORMAT_NUMBER = "NUMBER";
    public static final String FORMAT_STRING = "STRING";
    public static final String PRINT_FUN_NAME = "printf";

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


    private Deque<ScopeFn> fnCtxts = new ArrayDeque<ScopeFn>();

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
        LLVMLinkInMCJIT();
        LLVMInitializeNativeAsmPrinter();
        LLVMInitializeNativeAsmParser();
        LLVMInitializeNativeDisassembler();
        LLVMInitializeNativeTarget();
    }

    public final void Finalize() {
        LLVMBuildRetVoid(this.builder);
        LLVMDumpModule(this.mod);
        LLVMDisposeBuilder(this.builder);
        LLVMWriteBitcodeToFile(this.mod, TestUtils.GetFolderAssets("/llvm/") + "out.bc");
    }


    public HashMap<String, LLVMValueRef> printerArgs = new HashMap<>();

    private LLVMEmitter Printer() {
        LLVMTypeRef PrintfArgsTyList[] = {LLVMPointerType(LLVMInt8Type(), 0)};
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
            );
            this.printerArgs.put(FORMAT_STRING, formatString);
            this.printerArgs.put(FORMAT_NUMBER, formatNumber);
        } catch (Exception ex) {
            //System.out.println(ex.getMessage());
        }
        return this;
    }

    public void CallPrint(LLVMValueRef value, String format) {
        LLVMValueRef printArgs[] = {this.printerArgs.get(format), value};
        LLVMValueRef printf = LLVMGetNamedFunction(this.mod, PRINT_FUN_NAME);
        LLVMBuildCall(builder, printf, new PointerPointer(printArgs), 2, PRINT_FUN_NAME);
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
        LLVMPositionBuilderAtEnd(builder, BasicBlock);
        
        this.pushScope(MainFunction);

        this.Printer();
        return this;
    }

}
