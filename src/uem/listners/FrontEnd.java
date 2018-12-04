package uem.listners;

import org.antlr.symtab.GlobalScope;
import org.antlr.symtab.Scope;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseListener;
import uem.ast.Ast;
import uem.semantic.CheckSymbols;
import uem.visitors.StatementVisitor;

import java.util.Arrays;

public class FrontEnd extends GraceParserBaseListener {
    private Ast ast;
    public static Scope currentScope;

    public FrontEnd(Ast ast) {
        super();
        this.ast = ast;
    }

    /**
     * Estrutura para Escopo
     */
    public static boolean isGLobalScope() {
        return (currentScope.getName().toLowerCase().equals("global"));
    }

    public static boolean isWhileScope() {
        return currentScope.getName().toLowerCase().equals("while");
    }

    public static boolean isCondScope() {
        return currentScope.getName().toLowerCase().equals("condicional");
    }

    public static boolean isWithinScope(String scopeName) {
        for (Scope scope : FrontEnd.currentScope.getEnclosingPathToRoot()) {
            if (scope.getName().equals(scopeName)) {
                return true;
            }
        }
        return false;
    }


    public static void pushScope(Scope s) {
        currentScope = s;
//        System.out.println("entering: " + currentScope.getName() + ":" + s);
    }

    public static void popScope() {
//        System.out.println("leaving: " + currentScope.getName() + ":" + currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    /**
     * Escopo Global
     * TODO: Versão final: colocar try/catch
     */
    public void enterGraceFile(GraceParser.GraceFileContext ctx) {

        GlobalScope globalScope = new GlobalScope(null);
        ctx.scope = globalScope;
        pushScope(globalScope);
        ctx.statement().forEach(stmt -> {
            new StatementVisitor().visit(stmt);
        });
    }

}
