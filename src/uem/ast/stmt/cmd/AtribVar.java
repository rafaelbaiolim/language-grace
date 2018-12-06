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
                                this.getExpr().getLLVMValue(), "isub"), allocatedVar);
                break;
            case "*=":
                LLVMBuildStore(LLVMEmitter.getInstance().builder,
                        LLVMBuildNSWMul(LLVMEmitter.getInstance().builder,
                                LLVMBuildLoad(LLVMEmitter.getInstance().builder,
                                        allocatedVar, "load"),
                                this.getExpr().getLLVMValue(), "imul"), allocatedVar);
                break;
            case "/=":
                LLVMBuildStore(LLVMEmitter.getInstance().builder,
                        LLVMBuildSDiv(LLVMEmitter.getInstance().builder,
                                LLVMBuildLoad(LLVMEmitter.getInstance().builder,
                                        allocatedVar, "load"),
                                this.getExpr().getLLVMValue(), "idiv"), allocatedVar);
                break;
            case "%=":
                LLVMBuildStore(LLVMEmitter.getInstance().builder,
                        LLVMBuildSRem(LLVMEmitter.getInstance().builder,
                                LLVMBuildLoad(LLVMEmitter.getInstance().builder,
                                        allocatedVar, "load"),
                                this.getExpr().getLLVMValue(), "imod"), allocatedVar);
                break;

            default:
                if (this.getExpr().getLLVMValue() != null) {
                    LLVMBuildStore(
                            LLVMEmitter.getInstance().builder,
                            this.getExpr().getLLVMValue(),
                            allocatedVar);
                }
        }

        return super.getLLVMValue();
    }
}
