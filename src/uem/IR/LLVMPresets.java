package uem.IR;

import org.bytedeco.javacpp.PointerPointer;
import uem.ast.expr.Expression;
import uem.ast.stmt.SpecVar;
import uem.ast.type.IntegerType;

import java.util.HashMap;
import java.util.List;

import static org.bytedeco.javacpp.LLVM.*;

public class LLVMPresets {
    private final LLVMEmitter llve;

    private LLVMPresets() {
        this.populateLLVMPredicatesHash();
        this.populateLLVMBinPredicatesHash();
        this.llve = LLVMEmitter.getInstance();
    }

    private static LLVMPresets uniqueInstance;

    public static synchronized LLVMPresets getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LLVMPresets();
        }
        return uniqueInstance;
    }

    HashMap<String, Integer> LLVMPredicates = new HashMap<>();
    HashMap<String, Integer> LLVMBinPredicates = new HashMap<>();

    private void populateLLVMPredicatesHash() {
        this.LLVMPredicates.put("<", LLVMIntSLT);
        this.LLVMPredicates.put("<=", LLVMIntSLE);
        this.LLVMPredicates.put(">", LLVMIntSGT);
        this.LLVMPredicates.put(">=", LLVMIntSGE);
        this.LLVMPredicates.put("==", LLVMIntEQ);
        this.LLVMPredicates.put("!=", LLVMIntNE);
    }

    private void populateLLVMBinPredicatesHash() {
        this.LLVMBinPredicates.put("&&", LLVMAnd);
        this.LLVMBinPredicates.put("||", LLVMOr);
        this.LLVMBinPredicates.put("XOR", LLVMXor);
    }

    public int getLLVMPredicate(String op) {
        return this.LLVMPredicates.get(op);
    }

    public int getLLVMPredicateBin(String op) {
        return this.LLVMBinPredicates.get(op);
    }

    /**
     * Auxiliar para construir Basic Blocks da API
     *
     * @param name
     * @return
     */
    public LLVMBasicBlockRef buildBlock(String name) {
        return LLVMAppendBasicBlockInContext(llve.context, llve.currentScope(), name);
    }

    /**
     * Append para fim de blocos
     *
     * @return
     */
    public boolean blockTerminated() {
        LLVMBasicBlockRef curr = LLVMGetInsertBlock(llve.builder);
        return LLVMGetBasicBlockTerminator(curr) != null;
    }

    /**
     * Retorna um ponteiro da LLVM API para funções com nome e tipo
     * Se não estiver declarada é feito um append nas intruções antes do retorno
     */
    public LLVMValueRef getFunction(String nameFun, LLVMTypeRef functionType) {
        LLVMValueRef func = LLVMGetNamedFunction(llve.mod, nameFun);
        if (func == null)
            func = LLVMAddFunction(llve.mod, nameFun, functionType);
        return func;
    }

    public LLVMTypeRef functionType(LLVMTypeRef ret, LLVMTypeRef... args) {
        return LLVMFunctionType(ret, new PointerPointer<>(args), args.length, /* isVarArgs */ 0);
    }


    /**
     * Auxiliar para Construir Escopos de Func
     */
    public LLVMValueRef buildScopeFn(
            String name,
            LLVMTypeRef returnType,
            List<LLVMTypeRef> argTypes
    ) {
        this.pushAsPrevBlock();
        LLVMTypeRef funcType = functionType(
                returnType, argTypes.toArray(new LLVMTypeRef[0]));

        LLVMValueRef func = getFunction(name, funcType);
        llve.pushScope(func);
        LLVMBasicBlockRef body = buildBlock("body");
        LLVMPositionBuilderAtEnd(llve.builder, body);

        return func;
    }

    /**
     * Alias push prev block
     */
    public void pushAsPrevBlock() {
        llve.prevBasicBlocks.push(LLVMGetInsertBlock(llve.builder));
    }

    /**
     * Alias pop prev block
     */
    public void popPrevBlock() {
        LLVMPositionBuilderAtEnd(llve.builder, llve.prevBasicBlocks.pop());
    }

    public void finalizeFunctionScope() {
        this.popPrevBlock();
    }

    public LLVMValueRef parseExprToInt(Expression index) {

        LLVMValueRef valToSext = new SpecVar(
                "result_expr_idx", index).getLLVMValue(
                new IntegerType(), true);
        return LLVMBuildLoad(llve.builder,
                valToSext,
                "ref_result_idx");
    }


    public LLVMValueRef castExprToInt(LLVMValueRef val) {
        return LLVMBuildIntCast(
                llve.builder,
                val,
                llve.types.i32(),
                "icast"
        );
    }

    public LLVMValueRef castExprToBool(LLVMValueRef val) {
        return LLVMBuildIntCast(
                llve.builder,
                val,
                llve.types.i1(),
                "bcast"
        );
    }


}
