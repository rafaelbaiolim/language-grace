package uem.ast;

public class Ast {
    public static final Position getPos(int startLine, int startCol, int endLine, int endCol) {
        return new Position(
                new Point(startLine, startCol),
                new Point(endLine, endCol)
        );
    }
}
