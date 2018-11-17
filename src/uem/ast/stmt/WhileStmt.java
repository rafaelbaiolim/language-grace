package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import uem.ast.Position;
import uem.ast.expr.Expression;

import java.util.List;

public class WhileStmt implements LoopStatement {

    final String varName = null;
    private List<Statement> stmt;
    private final Position position;
    private Expression cond;
    private Token symToken;

    public WhileStmt(List<Statement> stmt, Expression cond) {
        super();
        this.stmt = stmt;
        this.position = null;
        this.cond = cond;
    }

    public void setStatment(List<Statement> stmt) {
        this.stmt = stmt;
    }

    @Override
    public String getVarName() {
        return varName;
    }

    @Override
    public Token setSymbol(Token sym) {
        return this.symToken = sym;
    }

    @Override
    public Token getSymbol() {
        return this.symToken;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public Expression getCond() {
        return this.cond;
    }

    @Override
    public List<Statement> getBody() {
        return this.stmt;
    }


}
