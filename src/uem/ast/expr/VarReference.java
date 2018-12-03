package uem.ast.expr;

import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.listners.FrontEnd;

import static org.bytedeco.javacpp.LLVM.LLVMBuildLoad;

public class VarReference extends VarRefExpression {

    public VarReference(String varName) {
        super(varName);
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        LLVM.LLVMValueRef load = null;

        try {
            LLVM.LLVMValueRef varAllocated =
                    FrontEnd.currentScope.resolve(this.varName).getScope().getLLVMSymRef(this.varName);
            if (varAllocated != null) {
                load = LLVMBuildLoad(LLVMEmitter.getInstance().builder,
                        varAllocated, "temp"
                );
            }
        } catch (Exception ex) {

        }

        return load;
    }
}
