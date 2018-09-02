package uem.ast.stmt;

import uem.ast.Position;
import uem.ast.expr.Expression;

public class DeclVar implements Statement {

    private final String varName;
    private final Expression value;
    private final Position position;

    public DeclVar(String varName, Expression value, Position position) {
        super();
        this.varName = varName;
        this.value = value;
        this.position = position;
    }

    public Expression getValue() {
        return value;
    }

    public String getVarName() {
        return varName;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }
}
