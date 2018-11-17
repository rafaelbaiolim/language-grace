package uem.ast.type;

import org.antlr.v4.runtime.Token;
import uem.ast.Node;
import uem.ast.Position;

public interface Type extends Node, org.antlr.symtab.Type {
    int getType();

    @Override
    String getName();

    @Override
    int getTypeIndex();

    @Override
    Position getPosition();

    @Override
    void setSymbol(Token sym);

    @Override
    Token getSymbol();
}