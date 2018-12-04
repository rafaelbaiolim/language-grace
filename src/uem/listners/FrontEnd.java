package uem.listners;

import org.antlr.symtab.GlobalScope;
import org.antlr.symtab.Scope;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseListener;
import uem.ast.Ast;
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

    /**
     * Escopos de Função / Procedure
     */

    /**
     * Escopo de Variáveis
     * @moved: visitor
     */
//    public void enterAtribVar(GraceParser.AtribVarContext ctx) {
//        Symbol sym = currentScope.resolve(ctx.atrib().ID().getText());
//        if (sym == null) {
//            CheckSymbols.error(ctx.atrib().ID().getSymbol(), "variável não declarada: " + ctx.getText());
//        }
//    }

    /**
     * Arrays
     *
     * @param ctx
     */

//    public void enterAtribArr(GraceParser.AtribArrContext ctx) {
//        Symbol sym = currentScope.resolve(ctx.arrAtrib().ID().getText());
//        if (sym == null) {
//            CheckSymbols.error(ctx.arrAtrib().ID().getSymbol(), "variável não declarada: " + ctx.getText());
//        }
//    }

    /**
     * While
     * TODO: COLOCAR WHILE SCOPE EM UMA CONST NO PACOTE DE UTILS
     */

    public void exitCmdWhile(GraceParser.CmdWhileContext ctx) {

        popScope();

    }

    /**
     * For
     */

    public void exitCmdFor(GraceParser.CmdForContext ctx) {
        popScope();
    }

    /**
     * Loops Commons
     * @param ctx
     */

//    public void enterCmdSkip(GraceParser.CmdSkipContext ctx) {
//        if (!isWhileScope()) {
//            CheckSymbols.error(ctx.start, "comando skip precisa estar dentro de uma estrutura de repetição.");
//        }
//    }

//    public void enterCmdStop(GraceParser.CmdStopContext ctx) {
//        if (!isWhileScope()) {
//            CheckSymbols.error(ctx.start, "comando stop precisa estar dentro de uma estrutura de repetição.");
//        }
//    }


    /**
     * Cmd Read
     * @movedTo: visitor
     */


    /**
     * Cmd write
     * @movedTo: visitor
     */


    /**
     * Cmd Call Proc
     * @movedTo:visitor
     */

    /**
     * Cmd Condicional
     *
     * @movedTo:visitor
     */
    public void exitCmdIf(GraceParser.CmdIfContext ctx) {
        popScope();
    }


}
