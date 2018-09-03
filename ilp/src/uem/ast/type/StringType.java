package uem.ast.type;

import uem.ast.Position;

public class StringType implements Type {

    private final Position position;

    public Position getPosition() {
        return this.position;
    }

    public StringType(Position position) {
        this.position = position;
    }

    public StringType() {
        this.position = null;
    }

}
