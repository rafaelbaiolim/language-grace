package uem.IR;

import org.bytedeco.javacpp.LLVM;
import org.bytedeco.javacpp.PointerPointer;

import java.util.List;

import static org.bytedeco.javacpp.LLVM.*;

public class LLVMPresets {
    private final LLVMEmitter llve;

    public LLVMPresets(LLVMEmitter llvmEmitter) {
        this.llve = llvmEmitter;
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
    public void buildScopeFn(
            Object pos,
            String name,
            String debugName,
            LLVMTypeRef returnType,
            List<LLVMTypeRef> argTypes,
            List<LLVMMetadataRef> argDebugTypes,
            Runnable bodyBuilder) {

        LLVMBasicBlockRef prevBlock = LLVMGetInsertBlock(llve.builder);

        LLVMTypeRef funcType = functionType(
                returnType, argTypes.toArray(new LLVMTypeRef[0]));

        LLVMValueRef func = getFunction(name, funcType);
        //llve.debugInfo.beginFuncDebugInfo(pos, func, name, debugName, argDebugTypes);
        llve.pushScope(func);

        //bloco reservado para alocação de instruções
        LLVMBasicBlockRef entry = buildBlock("entry");
        LLVMBasicBlockRef body = buildBlock("body");

        // Build body.
        LLVMPositionBuilderAtEnd(llve.builder, body);
        bodyBuilder.run();

        // Add terminator if necessary.
        if (!blockTerminated()) {
            if (returnType.equals(llve.types.voidType())) {
                LLVMBuildRetVoid(llve.builder);
            } else {
                LLVMBuildUnreachable(llve.builder);
            }
        }

        LLVMPositionBuilderAtEnd(llve.builder, entry);
        LLVMBuildBr(llve.builder, body);

        // Cleanup.
//        v.debugInfo.popScope();
        llve.popScope();
        LLVMPositionBuilderAtEnd(llve.builder, prevBlock);
    }


    /**
     * Tratar o parametro de ValueRef em CondBR
     *
     * @param trueBlock
     * @param falseBlock
     */
    public void translateLLVMConditional(
            LLVMValueRef If, //deixar generico
            LLVMBasicBlockRef trueBlock,
            LLVMBasicBlockRef falseBlock) {
        LLVMBuildCondBr(llve.builder, If, trueBlock, falseBlock);
    }
}
