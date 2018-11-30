package uem.ast.stmt.cmd;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import org.bytedeco.javacpp.PointerPointer;
import uem.IR.LLVMEmitter;
import uem.ast.Position;
import uem.ast.expr.Expression;

import static org.bytedeco.javacpp.LLVM.*;

public class ReturnCmd implements CmdStatement {
    String varName = null;
    private final Position position = null;
    private Token symToken;
    private Expression varExpr;

    public ReturnCmd(Expression varExpr) {
        super();
        this.varExpr = varExpr;
        this.getLLVMValue();
    }

    @Override
    public Expression getExpr() {
        return this.varExpr;
    }


    public String getVarName() {
        return this.varName;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public void setSymbol(Token sym) {
        this.symToken = sym;
    }

    @Override
    public Token getSymbol() {
        return this.symToken;
    }

    @Override
    public LLVM.LLVMValueRef getLLVMValue() {
        LLVMEmitter llve = LLVMEmitter.getInstance();
        LLVM.LLVMValueRef res = LLVMBuildPhi(llve.builder,
                LLVMInt32Type(), "result");
//        LLVM.LLVMValueRef[] phi_vals = { res_iftrue, res_iffalse };
//        LLVM.LLVMBasicBlockRef[] phi_blocks = { iftrue, iffalse };
//        LLVMAddIncoming(res, new PointerPointer(phi_vals), new PointerPointer(phi_blocks), 2);
        LLVMBuildRet(llve.builder, res);

        return null;
    }
}
