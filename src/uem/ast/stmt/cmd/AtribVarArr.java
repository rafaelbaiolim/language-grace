package uem.ast.stmt.cmd;

import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.ast.expr.Expression;
import uem.listners.FrontEnd;

import static org.bytedeco.javacpp.LLVM.LLVMBuildStore;

public class AtribVarArr extends AtribCmd {

    public AtribVarArr(String varName, Expression idx, Expression value) {
        super(varName, idx, value);
        this.getLLVMValue();
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        LLVMEmitter lle = LLVMEmitter.getInstance();
        LLVMPresets llp = LLVMPresets.getInstance();
        LLVM.LLVMValueRef arrAllocated = FrontEnd.currentScope.resolve(this.varName).getScope().getLLVMSymRef(this.varName);
        return LLVMBuildStore(
                LLVMEmitter.getInstance().builder,
                this.getExpr().getLLVMValue(),
                lle.getArray(llp.parseExprToInt(this.idx), arrAllocated, 2));
    }
}