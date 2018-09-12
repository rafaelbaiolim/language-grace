package uem.ast.expr;

import uem.ast.Position;

public class StringLiteral implements Expression {

    private final Position position;
    private String value;

    @Override
    public Position getPosition() {
        return this.position;
    }

    public StringLiteral(Position pos) {
        this.position = pos;
    }

    public StringLiteral(String tex) {
        this.position = null;
        this.value = tex;
    }


}
