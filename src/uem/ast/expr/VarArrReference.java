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

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        LLVM.LLVMValueRef load = null;
        LLVMEmitter lle = LLVMEmitter.getInstance();
        LLVMPresets llp = LLVMPresets.getInstance();
        try {
            LLVM.LLVMValueRef arrAllocated =
                    FrontEnd.currentScope.resolve(this.varName).getScope().getLLVMSymRef(this.varName);

            load = LLVMBuildLoad(LLVMEmitter.getInstance().builder,
                    lle.getArray(llp.parseExprToInt(this.index), arrAllocated), "temp"
            );
        } catch (Exception ex) {

        }

        return load;
    }
}