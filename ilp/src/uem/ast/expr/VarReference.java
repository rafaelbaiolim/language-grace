package uem.ast.expr;

import org.antlr.v4.runtime.Token;
import uem.ast.Position;

public class VarReference implements Expression {

    private final String varName;
    private final Position position;
    private Token symToken;

    public VarReference(String varName, Position position) {
        super();
        this.varName = varName;
        this.position = position;
    }

    public VarReference(String varName) {
        super();
        this.varName = varName;
        this.position = null;
    }

    public String getVarName() {
        return this.varName;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public Token setSymbol(Token sym) {
        return this.symToken = sym;
    }

    @Override
    public Token getSymbol() {
        return this.symToken;
    }
}
