package uem.ast.expr;

import uem.ast.Position;

public class NumberLiteral implements Expression {

    private final Position position;
    private String value;

    @Override
    public Position getPosition() {
        return this.position;
    }

    public NumberLiteral(Position pos) {
        this.position = pos;
    }

    public NumberLiteral(String tex) {
        this.position = null;
        this.value = tex;
    }


}
