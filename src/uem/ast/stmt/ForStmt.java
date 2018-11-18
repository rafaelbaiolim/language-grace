package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import uem.antlr.GraceParser;
import uem.ast.Position;
import uem.ast.expr.Expression;
import uem.ast.stmt.cmd.AtribCmd;

import java.util.List;

public class ForStmt implements LoopStatement {

    private AtribCmd init;
    private AtribCmd itera;
    private Expression cond;

    private final List<Statement> stmt;
    private final Position position;
    private Token symToken;

    public ForStmt(AtribCmd init, Expression cond, AtribCmd itera, List<Statement> body) {
        super();
        this.position = null;
        this.init = init;
        this.cond = cond;
        this.itera = init;
        this.stmt = body;
    }

    public String getVarName() {
        return String.valueOf(GraceParser.T_FOR);
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
    public Position getPosition() {
        return this.position;
    }

    @Override
    public List<Statement> getBody() {
        return this.stmt;
    }

    @Override
    public Expression getCond() {
        return this.cond;
    }

    public AtribCmd getItera() {
        return this.itera;
    }

    public AtribCmd getInit() {
        return this.init;
    }

}
