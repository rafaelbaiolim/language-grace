package uem.ast.type;

import uem.ast.Position;

public class NumberType implements Type {

    private final Position position;

    public Position getPosition() {
        return this.position;
    }

    public NumberType(Position position) {
        this.position = position;
    }

    public NumberType() {
        this.position = null;
    }

}
