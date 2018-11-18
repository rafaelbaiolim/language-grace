package uem.ast.type;

import org.antlr.v4.runtime.Token;
import uem.antlr.GraceParser;
import uem.ast.Position;
import uem.ast.stmt.Statement;

public class StopType implements Type, Statement {

    private final Position position;
    private Token symbol;

    public Position getPosition() {
        return this.position;
    }

    public StopType(Position position) {
        this.position = position;
    }

    public StopType() {
        this.position = null;
    }

    @Override
    public int getType() {
        return GraceParser.T_STOP;
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

    @Override
    public String getVarName() {
        return "STOP";
    }
}
