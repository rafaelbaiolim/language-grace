package uem.ast.stmt.cmd;

import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.ast.expr.Expression;
import uem.listners.FrontEnd;

import static org.bytedeco.javacpp.LLVM.LLVMBuildStore;

public class AtribVarArr extends AtribCmd {

    public AtribVarArr(String varName, String idx, Expression value) {
        super(varName, idx, value);
        this.getLLVMValue();
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        LLVMEmitter lle = LLVMEmitter.getInstance();
        LLVM.LLVMValueRef arrAllocated = FrontEnd.currentScope.getLLVMSymRef(this.varName);
        return LLVMBuildStore(
                LLVMEmitter.getInstance().builder,
                this.getExpr().getLLVMValue(),
                lle.getArray(this.idx, arrAllocated)
        );
    }
}
