package uem.ast.expr;

import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.listners.FrontEnd;

import static org.bytedeco.javacpp.LLVM.LLVMBuildLoad;

public class VarArrReference extends VarRefExpression {

    public VarArrReference(String varName, Expression posicao) {
        super(varName, posicao);
    }

    public VarArrReference(String varName) {
        super(varName);
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        LLVM.LLVMValueRef load = null;
        LLVMEmitter lle = LLVMEmitter.getInstance();
        LLVMPresets llp = LLVMPresets.getInstance();
        try {
            LLVM.LLVMValueRef arrAllocated = FrontEnd.currentScope.resolve(this.varName).getScope().getLLVMSymRef(this.varName);
            load = lle.getArray(llp.parseExprToInt(this.index),
                    arrAllocated,2); //GEP serve para setore e load
        } catch (Exception ex) {

        }

        return load;
    }
}