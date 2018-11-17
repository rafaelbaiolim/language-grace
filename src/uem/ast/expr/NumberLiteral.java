package uem.ast.expr;

import org.antlr.v4.runtime.Token;
import uem.ast.Position;

public class NumberLiteral implements Expression {

    private final Position position;
    private String value;
    private Token symToken;

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public void setSymbol(Token sym) {
        this.symToken = sym;
    }

    @Override
    public Token getSymbol() {
        return this.symToken;
    }

    public NumberLiteral(Position pos) {
        this.position = pos;
    }

    public NumberLiteral(String tex) {
        this.position = null;
        this.value = tex;
    }


}
