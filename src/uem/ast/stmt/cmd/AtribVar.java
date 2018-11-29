package uem.ast.stmt.cmd;

import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.ast.expr.Expression;
import uem.listners.FrontEnd;

import static org.bytedeco.javacpp.LLVM.*;

public class AtribVar extends AtribCmd {

    public AtribVar(String varName, String op, Expression expr) {
        super(varName, op, expr);
        this.getLLVMValue();
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {

        LLVM.LLVMValueRef allocatedVar =
                FrontEnd.currentScope.resolve(this.varName).getScope().getLLVMSymRef(this.varName);

        switch (this.op) {
            case "+=":
                LLVMBuildStore(LLVMEmitter.getInstance().builder,
                        LLVMBuildNSWAdd(LLVMEmitter.getInstance().builder,
                                LLVMBuildLoad(LLVMEmitter.getInstance().builder,
                                        allocatedVar, "load"),
                                this.getExpr().getLLVMValue(), "inc"), allocatedVar);
                break;
            case "-=":
                LLVMBuildStore(LLVMEmitter.getInstance().builder,
                        LLVMBuildNSWSub(LLVMEmitter.getInstance().builder,
                                LLVMBuildLoad(LLVMEmitter.getInstance().builder,
                                        allocatedVar, "load"),
                                this.getExpr().getLLVMValue(), "dec"), allocatedVar);
                break;
            case "*=":
                LLVMBuildStore(LLVMEmitter.getInstance().builder,
                        LLVMBuildNSWMul(LLVMEmitter.getInstance().builder,
                                LLVMBuildLoad(LLVMEmitter.getInstance().builder,
                                        allocatedVar, "load"),
                                this.getExpr().getLLVMValue(), "dec"), allocatedVar);
                break;

            default:
                LLVMBuildStore(
                        LLVMEmitter.getInstance().builder,
                        this.getExpr().getLLVMValue(),
                        allocatedVar);
        }

        return super.getLLVMValue();
    }
}
