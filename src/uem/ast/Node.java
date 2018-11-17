package uem.ast;

import org.antlr.v4.runtime.Token;

public interface Node {
    Position getPosition();

    void setSymbol(Token sym);

    Token getSymbol();
}