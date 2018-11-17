package uem.symtab;


import org.antlr.symtab.LocalScope;
import org.antlr.symtab.Scope;

public class ForScope extends LocalScope {
    public ForScope(Scope enclosingScope) {
        super(enclosingScope);
    }

    public String getName() {
        return "for";
    }
}