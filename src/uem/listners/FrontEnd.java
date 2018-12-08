package uem.listners;

import org.antlr.symtab.*;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseListener;
import uem.ast.Ast;
import uem.semantic.CheckSymbols;
import uem.visitors.BlockVisitor;
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

    public static Scope isWithinScope(String scopeName) {
        for (Scope scope : FrontEnd.currentScope.getEnclosingPathToRoot()) {
            if (scope.getName().equals(scopeName)) {
                return scope;
            }
        }
        return null;
    }

    public static LocalScope isWithinLoopScope() {
        try {
            Scope enclosing = isWithinScope("while");
            if (enclosing == null) {
                enclosing = FrontEnd.isWithinScope("for");
            }
            return (LocalScope) enclosing;
        } catch (Exception ex) {
            return null;
        }
    }

    public static Symbol resolveWithScope(String varName) {
        Symbol currentSymbol = FrontEnd.currentScope.resolve(varName);
        if (currentSymbol != null) {//garante que o simbulo ref é o do escopo
            return currentSymbol.getScope().getSymbol(varName);
        }
        return null;
    }


    /**
     * Pega a função que encapsula desconsidrendo o scopo global
     * e retorna seu tipo, se houver
     *
     * @return
     */
    public static FunctionSymbol getFunctionWithin() {
        FunctionSymbol fun = null;
        for (Scope s : FrontEnd.currentScope.getEnclosingPathToRoot()) {
            try {
                fun = ((FunctionSymbol) s);
                return fun;
            } catch (Exception ex) {
                fun = null;
            }
        }
        return fun;
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
     */
    public void enterGraceFile(GraceParser.GraceFileContext ctx) {

        GlobalScope globalScope = new GlobalScope(null);
        ctx.scope = globalScope;
        pushScope(globalScope);
        for (GraceParser.StatementContext stmt : ctx.statement()) {
            try {
                GraceParser.DecSubContext sub = ((GraceParser.DecSubStatementContext) stmt).decSub();
                if (sub instanceof GraceParser.ProcedureContext) {
                    GraceParser.DecProcContext mainFun = ((GraceParser.ProcedureContext) sub).decProc();
                    if (mainFun.ID().getText().toLowerCase().equals("main")) {
                        CheckSymbols.error(stmt.start, ": erorr: Main should be instance of function. Procedure found.");
                        enterMainScope(mainFun);
                        continue;
                    }
                }

                if (sub instanceof GraceParser.FunctionContext) {
                    GraceParser.DecFuncContext mainFun = ((GraceParser.FunctionContext) sub).decFunc();
                    if (mainFun.ID().getText().toLowerCase().equals("main")) {
                        enterMainScope(mainFun);
                        continue;
                    }
                }

            } catch (Exception ex) {
//                System.out.println(ex.getMessage());
            }
                new StatementVisitor().visit(stmt);
        }
    }

    private void enterMainScope(GraceParser.DecProcContext mainFun) {
        FunctionSymbol fSymbol = new FunctionSymbol("main", true);
        visitMain(fSymbol, mainFun.block());
        FrontEnd.popScope();
    }

    protected void enterMainScope(GraceParser.DecFuncContext mainFun) {
        FunctionSymbol fSymbol = new FunctionSymbol("main");
        visitMain(fSymbol, mainFun.block());
        FrontEnd.popScope();
    }

    private void visitMain(FunctionSymbol fSymbol, GraceParser.BlockContext block) {
        fSymbol.setEnclosingScope(FrontEnd.currentScope);
        FrontEnd.currentScope.define(fSymbol);
        FrontEnd.pushScope(fSymbol);
        CheckSymbols.MainCreated();
        new BlockVisitor().visit(block);
    }

}
