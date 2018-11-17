package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import uem.ast.Position;
import uem.ast.type.Type;

import java.util.List;

public class DeclVar implements Statement {

    final String varName = null;
    private final List<Statement> stmt;
    private final Position position;
    private final Type type;
    private Token symToken;

    public DeclVar(List<Statement> stmt, Type type) {
        super();
        this.stmt = stmt;
        this.position = null;
        this.type = type;
    }

    public List<Statement> getListStmt() {
        return this.stmt;
    }

    public Type getType() {
        return this.type;
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
}
