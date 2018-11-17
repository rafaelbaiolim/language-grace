package uem.ast.stmt.cmd;

import org.antlr.v4.runtime.Token;
import uem.ast.Position;
import uem.ast.expr.Expression;
import uem.ast.expr.VarReference;

public class ReadCmd implements CmdStatement {
    String varName = null;
    private final Position position = null;
    private Token symToken;
    private VarReference varExpr;

    public ReadCmd(VarReference var) {
        super();
        this.varExpr = var;

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
}
