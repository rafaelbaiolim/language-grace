package uem.ast.expr;

import org.bytedeco.javacpp.LLVM;
import org.bytedeco.javacpp.PointerPointer;
import uem.IR.LLVMEmitter;
import uem.listners.FrontEnd;

import static org.bytedeco.javacpp.LLVM.*;

public class VarReference extends VarRefExpression {

    public VarReference(String varName) {
        super(varName);
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        LLVM.LLVMValueRef load = null;

        try {
            LLVM.LLVMValueRef varAllocated = FrontEnd.currentScope.getLLVMSymRef(this.varName);

            load = LLVMBuildLoad(LLVMEmitter.getInstance().builder,
                    varAllocated, "temp"
            );
        } catch (Exception ex) {

        }

        return load;
    }
}
