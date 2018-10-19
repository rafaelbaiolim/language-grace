package uem.ast;

public class Point {
    private final int line;
    private final int column;

    public Point(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public final int getLine() {
        return this.line;
    }

    public final int getColumn() {
        return this.column;
    }

}

