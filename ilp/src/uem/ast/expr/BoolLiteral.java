package uem.ast.expr;

import uem.ast.Position;

public class BoolLiteral implements Expression {

    private final Position position;
    private String value;

    @Override
    public Position getPosition() {
        return this.position;
    }

    public BoolLiteral(Position pos) {
        this.position = pos;
    }

    public BoolLiteral(String tex) {
        this.position = null;
        this.value = tex;
    }


}
