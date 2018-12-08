package uem.ast.expr;

import org.antlr.symtab.Type;
import uem.ast.Node;

public interface Expression extends Node {
    void setType(Type type);

    public Type getType();
}
