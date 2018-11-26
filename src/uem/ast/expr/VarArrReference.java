package uem.ast.expr;

import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.listners.FrontEnd;

import static org.bytedeco.javacpp.LLVM.LLVMBuildLoad;

public class VarArrReference extends VarRefExpression {

    public VarArrReference(String varName, String idx) {
        super(varName, idx);
        this.getLLVMValue();
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        LLVM.LLVMValueRef load = null;
        LLVMEmitter lle = LLVMEmitter.getInstance();
        try {
            LLVM.LLVMValueRef arrAllocated = FrontEnd.currentScope.getLLVMSymRef(this.varName);
            load = LLVMBuildLoad(LLVMEmitter.getInstance().builder,
                    lle.getArray(this.idx, arrAllocated), "temp"
            );
        } catch (Exception ex) {

        }

        return load;
    }
}
