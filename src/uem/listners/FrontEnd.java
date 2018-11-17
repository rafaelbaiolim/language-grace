package uem.listners;

import org.antlr.symtab.*;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseListener;
import uem.ast.Ast;
import uem.ast.stmt.AtribStmt;
import uem.ast.stmt.DeclVar;
import uem.ast.stmt.Statement;
import uem.semantic.CheckSymbols;
import uem.symtab.ForScope;
import uem.symtab.WhileScope;
import uem.visitors.AtribVisitor;
import uem.visitors.DeclVarVisitor;
import uem.visitors.ListSpecParamVisitor;
import uem.visitors.WhileVisitor;

import java.util.List;

public class FrontEnd extends GraceParserBaseListener {
    private Ast ast;
    private Scope currentScope;

    public FrontEnd(Ast ast) {
        super();
        this.ast = ast;
    }

    /**
     * Estrutura para Escopo
     */

    private void pushScope(Scope s) {
        currentScope = s;
        System.out.println("entering: " + currentScope.getName() + ":" + s);
    }

    private void popScope() {
        System.out.println("leaving: " + currentScope.getName() + ":" + currentScope);
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
    }

    public void enterDecProc(GraceParser.DecProcContext procCtx) {
        FunctionSymbol fSymbol = new FunctionSymbol(procCtx.ID().getText());
        fSymbol.setEnclosingScope(currentScope);
        currentScope.define(fSymbol);
        procCtx.scope = fSymbol;
        pushScope(fSymbol);
    }


    public void exitFunction(GraceParser.FunctionContext funCtx) {
        popScope();
    }

    public void exitProcedure(GraceParser.ProcedureContext procCtx) {
        popScope();
    }

    /**
     * Argumentos de Função / Procedure
     */

    public void enterLstParam(GraceParser.LstParamContext ctxLstParam) {
        try {
            ListSpecParamVisitor listParamVisit = new ListSpecParamVisitor();
            List<Statement> lst = listParamVisit.visit(ctxLstParam);
            lst.forEach(stmt -> {
                VariableSymbol v = new VariableSymbol(stmt.getVarName());
                currentScope.define(v);
            });
        } catch (Exception ex) {
            //Erro sintático
        }
    }

    /**
     * Escopos de blocos (Locais)
     */

    public void enterBlock(GraceParser.BlockContext blkCtx) {

        LocalScope locScope = new LocalScope(currentScope);

        String rootParent = blkCtx.getParent().getParent().getClass().getSimpleName();
        if (rootParent.toLowerCase().contains("cmdwhile")) {
            //verifica se não é um scope de loop
            locScope = new WhileScope(currentScope);
        }
        if (rootParent.toLowerCase().contains("cmdfor")) {
            //verifica se não é um scope de loop
            locScope = new ForScope(currentScope);
        }

        blkCtx.scope = locScope;
        pushScope(locScope);
    }

    public void exitBlock(GraceParser.BlockContext blkCtx) {
        popScope();

    }

    /**
     * Escopo de Variáveis
     */

    public void exitDeclVar(GraceParser.DeclVarContext declVarCtx) {
        try {
            DeclVar declVar = new DeclVarVisitor().visit(declVarCtx);
            declVar.getListStmt().forEach(stmt -> {
                {
                    VariableSymbol v = new VariableSymbol(stmt.getVarName());
                    v.setType(v.getType());
                    currentScope.define(v);
                    if(currentScope.getName().toLowerCase().equals("global")) {
                        this.ast.getListStmt().add(stmt); //append AST
                    }
                }
            });

        } catch (Exception ex) {
            //Erro sintático
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
        AtribStmt atribStmt = new AtribVisitor().visit(ctx);
        this.ast.getListStmt().add(atribStmt); //append AST
    }

    /**
     * Escopo CMD
     * TODO: COLOCAR WHILE SCOPE EM UMA CONST NO PACOTE DE UTILS
     */

    /**
     * While
     */
    public void enterCmWhile(GraceParser.CmWhileContext ctx) {
        this.ast.getListStmt().add(new WhileVisitor().visit(ctx));
    }

    /**
     * Loops Commons
     *
     * @param ctx
     */

    public void enterCmdSkip(GraceParser.CmdSkipContext ctx) {
        if (!currentScope.getName().toLowerCase().equals("while")) {
            CheckSymbols.error(ctx.start, "comando skip precisa estar dentro de uma estrutura de repetição.");
        }
    }

    public void enterCmdStop(GraceParser.CmdStopContext ctx) {
        if (!currentScope.getName().toLowerCase().equals("while")) {
            CheckSymbols.error(ctx.start, "comando stop precisa estar dentro de uma estrutura de repetição.");
        }
    }


}
