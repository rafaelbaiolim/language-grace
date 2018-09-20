package uem.ast.type;

import uem.ast.Position;

public class BooleanType implements Type {

    private final Position position;

    public Position getPosition() {
        return this.position;
    }

    public BooleanType(Position position) {
        this.position = position;
    }

    public BooleanType() {
        this.position = null;
    }

}
