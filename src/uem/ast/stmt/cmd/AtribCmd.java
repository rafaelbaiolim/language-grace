package uem.ast.stmt.cmd;

import org.antlr.v4.runtime.Token;
import org.bytedeco.javacpp.LLVM;
import uem.ast.Position;
import uem.ast.expr.Expression;

public abstract class AtribCmd implements CmdStatement {
    String varName = null;
    private final Position position = null;
    private Token symToken;
    private Expression expr;
    protected String length;
    protected String op;
    protected Expression idx;

    public AtribCmd(String varName, String op, Expression expr) {
        super();
        this.varName = varName;
        this.op = op;
        this.expr = expr;
    }

    public AtribCmd(String varName, String length) {
        super();
        this.varName = varName;
        this.length = length;
    }

    public AtribCmd(String varName, Expression idx, Expression value) {
        super();
        this.varName = varName;
        this.idx = idx;
        this.expr = value;
    }

    @Override
    public Expression getExpr() {
        return this.expr;
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
        return null;
    }
}
