package uem.ast.type;

import org.antlr.v4.runtime.Token;
import uem.ast.Position;

public class InvalidType implements Type {

    private final Position position;

    public Position getPosition() {
        return this.position;
    }

    public InvalidType(Position position) {
        this.position = position;
    }

    public InvalidType() {
        this.position = null;
    }

    @Override
    public int getType() {
        return -1;
    }

    @Override
    public Token setSymbol(Token sym) {
        return null;
    }

    @Override
    public Token getSymbol() {
        return null;
    }
}
