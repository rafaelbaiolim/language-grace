package uem.ast.stmt;

import uem.ast.Position;
import uem.ast.expr.Expression;

public class VarReference implements Expression {

    private final String varName;
    private final Position position;

    public VarReference(String varName, Position position) {
        super();
        this.varName = varName;
        this.position = position;
    }

    public VarReference(String varName) {
        super();
        this.varName = varName;
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
