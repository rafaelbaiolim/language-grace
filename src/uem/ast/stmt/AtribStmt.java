package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import uem.ast.Position;
import uem.ast.expr.Expression;

public class AtribStmt implements CmdStatement {
    String varName = null;
    private final Position position = null;
    private Token symToken;
    private Expression expr;

    public AtribStmt(String varName, Expression expr) {
        super();
        this.varName = varName;
        this.expr = expr;
    }

    @Override
    public Expression getExpr() {
        return this.expr;
    }

    @Override
    public String getVarName() {
        return this.varName;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public Token setSymbol(Token sym) {
        return this.symToken = sym;
    }

    @Override
    public Token getSymbol() {
        return this.symToken;
    }
}
