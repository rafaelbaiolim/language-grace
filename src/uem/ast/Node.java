package uem.ast;

import org.antlr.v4.runtime.Token;

public interface Node {
    Position getPosition();

    Token setSymbol(Token sym);

    Token getSymbol();
}