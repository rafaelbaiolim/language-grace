package uem.ast.stmt;

import uem.ast.Position;
import uem.ast.type.Type;

import java.util.List;

public class DeclVar implements Statement {

    final String varName = null;
    private final List<Statement> stmt;
    private final Position position;
    private final Type type;

    public DeclVar(List<Statement> stmt, Type type) {
        super();
        this.stmt = stmt;
        this.position = null;
        this.type = type;
    }

    public String getVarName() {
        return varName;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }
}
