package uem.ast;

public class Position {
    private final Point start;
    private final Point end;

    public Position(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getEnd() {
        return end;
    }

    public Point getStart() {
        return start;
    }
}
