package uem.ast.stmt.cmd;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.IR.LLVMEmitter;
import uem.ast.Position;
import uem.ast.expr.Expression;

public class ReadCmd implements CmdStatement {
    String varName = null;
    private final Position position = null;
    private Token symToken;
    private Expression varExpr;

    public ReadCmd(Expression varExpr) {
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

        LLVMEmitter.getInstance().CallScan(
                this.varExpr.getLLVMValue(),
                LLVMEmitter.FORMAT_NUMBER
        );

        return null;
    }
}
