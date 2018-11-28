package uem.listners;

import org.antlr.symtab.*;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseListener;
import uem.ast.Ast;
import uem.ast.Node;
import uem.ast.stmt.CondicionalStmt;
import uem.ast.stmt.DeclVar;
import uem.ast.stmt.cmd.AtribCmd;
import uem.semantic.CheckSymbols;
import uem.symtab.CondScope;
import uem.symtab.WhileScope;
import uem.visitors.*;

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
    private boolean isGLobalScope() {
        return (currentScope.getName().toLowerCase().equals("global"));
    }

    private boolean isWhileScope() {
        return currentScope.getName().toLowerCase().equals("while");
    }

    private boolean isCondScope() {
        return currentScope.getName().toLowerCase().equals("condicional");
    }


    private void pushScope(Scope s) {
        currentScope = s;
//        System.out.println("entering: " + currentScope.getName() + ":" + s);
    }

    private void popScope() {
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
    }

    public void exitGraceFile(GraceParser.GraceFileContext ctx) {
        popScope();
    }

    /**
     * Escopos de Função / Procedure
     */

    public void enterDecFunc(GraceParser.DecFuncContext funCtx) {
        FunctionSymbol fSymbol = new FunctionSymbol(funCtx.ID().getText());
        fSymbol.setEnclosingScope(currentScope);
        currentScope.define(fSymbol);
        funCtx.scope = fSymbol;
        pushScope(fSymbol);
        this.ast.getListStmt().add(new DeclFunctionVisitor().visit(funCtx));
    }

    public void enterDecProc(GraceParser.DecProcContext procCtx) {
        FunctionSymbol fSymbol = new FunctionSymbol(procCtx.ID().getText());
        fSymbol.setEnclosingScope(currentScope);
        currentScope.define(fSymbol);
        procCtx.scope = fSymbol;
        pushScope(fSymbol);
        this.ast.getListStmt().add(new DeclProcedureVisitor().visit(procCtx));
    }

    public void exitFunction(GraceParser.FunctionContext funCtx) {
        popScope();
        LLVMEmitter.getInstance().popScope();               //sai do escopo da função
        LLVMPresets.getInstance().finalizeFunctionScope();  //volta para o bloco anterior
    }

    public void exitProcedure(GraceParser.ProcedureContext procCtx) {

        popScope();
        LLVMEmitter.getInstance().popScope();               //sai do escopo da procedure
        LLVMPresets.getInstance().finalizeFunctionScope();  //volta para o bloco anterior
    }

    // Argumentos de Função / Procedure : movido para visitor

    /**
     * Escopos de blocos (Locais)
     */

    public void enterBlock(GraceParser.BlockContext blkCtx) {
//
//        LocalScope locScope;
//        String rootParent = blkCtx.getParent().getParent().getClass().getSimpleName();
//        if (rootParent.toLowerCase().contains("cmdwhile")) {
//            locScope = new LocalScope(currentScope);
//            //verifica se não é um scope de loop
//            locScope = new WhileScope(currentScope);
//        }
//        if (rootParent.toLowerCase().contains("cmdfor")) {
//            locScope = new LocalScope(currentScope);
//            //verifica se não é um scope de loop
//            locScope = new ForScope(currentScope);
//        }
//
//        blkCtx.scope = locScope;
//        pushScope(locScope);
    }

    public void exitBlock(GraceParser.BlockContext blkCtx) {
//        popScope();
    }

    /**
     * Escopo de Variáveis
     */

    public void exitDeclVar(GraceParser.DeclVarContext declVarCtx) {
        if (isGLobalScope()) {
            try {
                declVarCtx.scope = currentScope;
                DeclVar declVar = new DeclVarVisitor().visit(declVarCtx);
                //set de scope movido para o visitor
                this.ast.getListStmt().add(declVar); //append AST
            } catch (Exception ex) {
                //Erro sintático
            }
        }
    }

    public void enterVarReference(GraceParser.VarReferenceContext ctx) {
        Symbol sym = currentScope.resolve(ctx.ID().getText());
        if (sym == null) {
            CheckSymbols.error(ctx.ID().getSymbol(), "variável não declarada: " + ctx.getText());
        }
    }

    public void enterAtribVar(GraceParser.AtribVarContext ctx) {
        Symbol sym = currentScope.resolve(ctx.atrib().ID().getText());
        if (sym == null) {
            CheckSymbols.error(ctx.atrib().ID().getSymbol(), "variável não declarada: " + ctx.getText());
        }
    }

    public void exitAtribVar(GraceParser.AtribVarContext ctx) {
        if (isGLobalScope()) {
            AtribCmd atribCmd = new AtribVisitor().visit(ctx);
            this.ast.getListStmt().add(atribCmd); //append AST
        }
    }

    /**
     * Arrays
     *
     * @param ctx
     */

    public void enterAtribArr(GraceParser.AtribArrContext ctx) {
        Symbol sym = currentScope.resolve(ctx.arrAtrib().ID().getText());
        if (sym == null) {
            CheckSymbols.error(ctx.arrAtrib().ID().getSymbol(), "variável não declarada: " + ctx.getText());
        }
    }

    public void exitAtribArr(GraceParser.AtribArrContext ctx) {
        if (isGLobalScope()) {
            AtribCmd atribCmd = new AtribVisitor().visit(ctx);
            this.ast.getListStmt().add(atribCmd); //append AST
        }
    }



    /**
     * While
     * TODO: COLOCAR WHILE SCOPE EM UMA CONST NO PACOTE DE UTILS
     */
    public void enterCmdWhile(GraceParser.CmdWhileContext ctx) {
        LocalScope locScope = new WhileScope(currentScope);
        pushScope(locScope);
    }


    public void exitCmdWhile(GraceParser.CmdWhileContext ctx) {
        if (currentScope.getEnclosingScope().getName().equals("global")) {
            this.ast.getListStmt().add(new WhileVisitor().visit(ctx));
        }

    }

    /**
     * For
     */
    public void enterCmFor(GraceParser.CmForContext ctx) {
        this.ast.getListStmt().add(new ForVisitor().visit(ctx));
    }


    /**
     * Loops Commons
     *
     * @param ctx
     */

    public void enterCmdSkip(GraceParser.CmdSkipContext ctx) {
        if (!isWhileScope()) {
            CheckSymbols.error(ctx.start, "comando skip precisa estar dentro de uma estrutura de repetição.");
        }
    }

    public void enterCmdStop(GraceParser.CmdStopContext ctx) {
        if (!isWhileScope()) {
            CheckSymbols.error(ctx.start, "comando stop precisa estar dentro de uma estrutura de repetição.");
        }
    }


    /**
     * Cmd Read
     */

    public void exitCmdRead(GraceParser.CmdReadContext ctx) {
//        Symbol sym = currentScope.resolve(ctx.variable().getText());
//        if (sym == null) {
//            CheckSymbols.error(ctx.variable().getStart(), "variável não declarada: " + ctx.variable().getText());
//        }
        if (isGLobalScope()) {
            this.ast.getListStmt().add(new ReadVisitor().visit(ctx));
        }
    }

    /**
     * Cmd write
     */
    public void exitCmdWrite(GraceParser.CmdWriteContext ctx) {
        if (isGLobalScope()) {
            this.ast.getListStmt().add(new WriteVisitor().visit(ctx));
        }
    }


    /**
     * Cmd Call Proc
     */
    public void exitCmdCallProc(GraceParser.CmdCallProcContext ctx) {
        if (isGLobalScope()) {
            this.ast.getListStmt().add(new CallProcVisitor().visit(ctx));
        }
    }

    /**
     * Cmd Condicional
     */
    public void enterCmdIf(GraceParser.CmdIfContext ctx) {
        LocalScope locScope = new CondScope(currentScope);
        pushScope(locScope);
    }

    public void exitCmdIf(GraceParser.CmdIfContext ctx) {
        if(currentScope.getEnclosingScope().getName().equals("global")) {
            this.ast.getListStmt().add(new CondicionalVisitor().visit(ctx));
        }
        popScope();
    }


}
