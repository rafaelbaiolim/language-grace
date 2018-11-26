package uem.ast.stmt.cmd;

import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.ast.expr.Expression;
import uem.listners.FrontEnd;

import static org.bytedeco.javacpp.LLVM.LLVMBuildStore;

public class AtribVar extends AtribCmd {

    public AtribVar(String varName, Expression expr) {
        super(varName, expr);
        this.getLLVMValue();
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        LLVM.LLVMValueRef allocatedVar = FrontEnd.currentScope.getLLVMSymRef(this.varName);
        LLVMBuildStore(
                LLVMEmitter.getInstance().builder,
                this.getExpr().getLLVMValue(),
                allocatedVar

        );
        return super.getLLVMValue();
    }
}
