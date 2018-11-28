package uem.symtab;


import org.antlr.symtab.LocalScope;
import org.antlr.symtab.Scope;

public class CondScope extends LocalScope {
    public CondScope(Scope enclosingScope) {
        super(enclosingScope);
    }

    public String getName() {
        return "condicional";
    }
}