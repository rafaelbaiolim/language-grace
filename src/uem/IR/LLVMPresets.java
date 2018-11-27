package uem.IR;

import org.bytedeco.javacpp.LLVM;
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
        this.llve = LLVMEmitter.getInstance();
    }

    private static LLVMPresets uniqueInstance;

    public static synchronized LLVMPresets getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LLVMPresets();
        }
        return uniqueInstance;
    }

    HashMap<String, Integer> LLVMPredicates = new HashMap<String, Integer>();

    private void populateLLVMPredicatesHash() {
        this.LLVMPredicates.put("<", LLVMIntSLT);
        this.LLVMPredicates.put("<=", LLVMIntSLE);
        this.LLVMPredicates.put(">", LLVMIntSGT);
        this.LLVMPredicates.put(">=", LLVMIntSGE);
        this.LLVMPredicates.put("==", LLVMIntEQ);
        this.LLVMPredicates.put("!=", LLVMIntNE);
    }

    public int getLLVMPredicate(String op) {
        return this.LLVMPredicates.get(op);
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
//
        llve.prevBasicBlocks.push(LLVMGetInsertBlock(llve.builder));

        LLVMTypeRef funcType = functionType(
                returnType, argTypes.toArray(new LLVMTypeRef[0]));

        LLVMValueRef func = getFunction(name, funcType);
        llve.pushScope(func);
        LLVMBasicBlockRef body = buildBlock("body");
        LLVMPositionBuilderAtEnd(llve.builder, body);

//        if (!blockTerminated()) {
//            if (returnType.equals(llve.types.voidType())) {
//                LLVMBuildRetVoid(llve.builder);
//            } else {
//                LLVMBuildUnreachable(llve.builder);
//            }
//        }
//        LLVMPositionBuilderAtEnd(llve.builder, entry);
//        LLVMBuildBr(llve.builder, body);
//        llve.popScope();
        return func;
    }

    public void finalizeFunctionScope() {
        //colocar o tipo de retorno aqui
        LLVMBuildRet(llve.builder, LLVMConstInt(LLVMInt32Type(), 1, 0));
        LLVMPositionBuilderAtEnd(llve.builder, llve.prevBasicBlocks.pop());
    }

    public LLVMValueRef parseExprToInt(Expression index) {
        LLVMValueRef valToSext = new SpecVar("result_expr_idx", index)
                .getLLVMValue(new IntegerType());
        return LLVMBuildLoad(llve.builder,
                valToSext,
                "ref_result_idx");

    }
}
