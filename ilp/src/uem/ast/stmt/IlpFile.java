package uem.ast.stmt;

import uem.ast.Position;
import uem.ast.expr.Expression;

import java.util.List;

public class IlpFile implements Statement {

    private final String varName;
    private final Expression value;
    private final Position position;
    private final List<Statement> lstStmt;


    public IlpFile(String varName, Expression value, Position position, List<Statement> lstStmt) {
        super();
        this.varName = varName;
        this.value = value;
        this.position = position;
        this.lstStmt = lstStmt;
    }

    public Expression getValue() {
        return this.value;
    }

    public String getVarName() {
        return this.varName;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }
}
