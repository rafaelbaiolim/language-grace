package uem.ast.type;

import org.antlr.v4.runtime.Token;
import uem.antlr.GraceParser;
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

    @Override
    public int getType() {
        return GraceParser.T_STRING;
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
    public Token setSymbol(Token sym) {
        return null;
    }

    @Override
    public Token getSymbol() {
        return null;
    }

}
