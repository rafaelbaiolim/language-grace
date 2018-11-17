package uem.symtab;


import org.antlr.symtab.LocalScope;
import org.antlr.symtab.Scope;

public class WhileScope extends LocalScope {
    public WhileScope(Scope enclosingScope) {
        super(enclosingScope);
    }

    public String getName() {
        return "while";
    }
}