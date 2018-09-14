package uem.ast.stmt;

import uem.ast.Position;
import uem.ast.expr.Expression;

import java.util.List;

public class SpecvarList implements Statement {

    private final String varName;
    private final List<Statement> stmt;
    private final Position position;

    public SpecvarList(String varName, Expression value, List<Statement> stmt, Position position) {
        super();
        this.varName = varName;
        this.stmt = stmt;
        this.position = position;
    }

    public SpecvarList(String varName, Expression value, List<Statement> stmt) {
        super();
        this.varName = varName;
        this.stmt = stmt;
        this.position = null;
    }

    public String getVarName() {
        return varName;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }
}
