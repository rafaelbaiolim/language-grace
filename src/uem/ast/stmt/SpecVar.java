package uem.ast.stmt;

import org.antlr.v4.runtime.Token;
import uem.ast.Position;
import uem.ast.expr.Expression;

public class SpecVar implements Statement {

    private final String varName;
    private final Expression value;
    private final Position position;
    private Token symToken;

    public SpecVar(String varName, Expression value, Position position) {
        super();
        this.varName = varName;
        this.value = value;
        this.position = position;
    }

    public SpecVar(String varName) {
        super();
        this.varName = varName;
        this.value = null;
        this.position = null;
    }

    public SpecVar(String varName, Expression value) {
        super();
        this.varName = varName;
        this.value = value;
        this.position = null;
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public String getVarName() {
        return varName;
    }

    @Override
    public Token setSymbol(Token sym) {
        return this.symToken = sym;
    }

    @Override
    public Token getSymbol() {
        return this.symToken;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }
}
