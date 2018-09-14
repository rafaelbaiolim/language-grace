package uem.semantic;

import uem.ast.Position;

public class Error {
    private String msg;

    private Position pos;

    public Error(String msg, Position pos) {
        this.msg = msg;
        this.pos = pos;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

}
