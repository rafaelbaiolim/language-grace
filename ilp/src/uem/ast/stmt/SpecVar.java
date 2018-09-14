package uem.ast.stmt;

import uem.ast.Position;
import uem.ast.expr.Expression;

public class SpecVar implements Statement {

    private final String varName;
    private final Expression value;
    private final Position position;

    public SpecVar(String varName, Expression value, Position position) {
        super();
        this.varName = varName;
        this.value = value;
        this.position = position;
    }

    public SpecVar(String varName) {
        super();
        this.varName = varName;
        this.value = null;
        this.position = null;
    }

    public SpecVar(String varName, Expression value) {
        super();
        this.varName = varName;
        this.value = value;
        this.position = null;
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
