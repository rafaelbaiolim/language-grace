package uem.listners;

import org.antlr.symtab.FunctionSymbol;
import org.antlr.symtab.GlobalScope;
import org.antlr.symtab.Scope;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseListener;
import uem.ast.Ast;
import uem.ast.stmt.sub.DeclFunction;
import uem.semantic.CheckSymbols;
import uem.visitors.BlockVisitor;
import uem.visitors.DeclFunctionVisitor;
import uem.visitors.StatementVisitor;

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

    /**
     * Pega a função que encapsula desconsidrendo o scopo global
     * e retorna seu tipo, se houver
     *
     * @return
     */
    public static FunctionSymbol getFunctionWithin() {
        FunctionSymbol f = null;
        for (Scope s : FrontEnd.currentScope.getEnclosingPathToRoot()) {
            try {
                f = ((FunctionSymbol) s);
                return f;
            } catch (Exception ex) {
                f = null;
            }
        }
        return f;
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
        for (GraceParser.StatementContext stmt : ctx.statement()) {
            try {
                GraceParser.DecSubContext sub = ((GraceParser.DecSubStatementContext) stmt).decSub();
                if (sub instanceof GraceParser.FunctionContext) {
                    GraceParser.DecFuncContext mainFun = ((GraceParser.FunctionContext) sub).decFunc();
                    if (mainFun.ID().getText().toLowerCase().equals("main")) {
                        enterMainScope(mainFun);
                        continue;
                    }
                }
            } catch (Exception ex) {
            }
            new StatementVisitor().visit(stmt);
        }
    }

    protected void enterMainScope(GraceParser.DecFuncContext mainFun) {
        FunctionSymbol fSymbol = new FunctionSymbol("main");
        fSymbol.setEnclosingScope(FrontEnd.currentScope);
        FrontEnd.currentScope.define(fSymbol);
        FrontEnd.pushScope(fSymbol);
        CheckSymbols.MainCreated();
        new BlockVisitor().visit(mainFun.block());
        FrontEnd.popScope();
    }

}
