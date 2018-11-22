package uem.ast;

import uem.ast.stmt.Statement;

import java.util.LinkedList;
import java.util.List;

public class Ast {
    private List<Statement> listStmt;

    public Ast() {
        this.listStmt = new LinkedList<>();
    }

    public static final Position getPos(int startLine, int startCol, int endLine, int endCol) {
        return new Position(
                new Point(startLine, startCol),
                new Point(endLine, endCol)
        );
    }


    public List<Statement> getListStmt() {
        return listStmt;
    }


}
