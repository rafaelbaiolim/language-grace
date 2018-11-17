package uem.ast.type;

import org.antlr.v4.runtime.Token;
import uem.ast.Position;

public class InvalidType implements Type {

    private final Position position;
    private Token symbol;

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
    public String getName() {
        return null;
    }

    @Override
    public int getTypeIndex() {
        return 0;
    }

    @Override
    public void setSymbol(Token sym) {
        this.symbol = sym;
    }

    @Override
    public Token getSymbol() {
        return null;
    }
}
