package uem.ast.type;

import org.antlr.v4.runtime.Token;
import uem.antlr.GraceParser;
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

    @Override
    public int getType() {
        return GraceParser.T_BOOL;
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
