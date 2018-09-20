package uem.ast.stmt;

import uem.ast.Node;
import uem.ast.Position;

import java.util.List;

public class GraceFile implements Node {

    private final List<Statement> lstStmt;

    public GraceFile(List<Statement> lstStmt) {
        super();
        this.lstStmt = lstStmt;
    }

    @Override
    public Position getPosition() {
        return null;
    }
}
