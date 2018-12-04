package uem.visitors;

import org.antlr.symtab.FunctionSymbol;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;
import uem.ast.stmt.sub.DeclFunction;
import uem.ast.stmt.sub.DeclProcedure;
import uem.listners.FrontEnd;
import uem.semantic.CheckSymbols;

public class SubVisitor extends GraceParserBaseVisitor<Statement> {


    public Statement visitProcedure(GraceParser.ProcedureContext ctx) {
        FunctionSymbol fSymbol = new FunctionSymbol(ctx.decProc().ID().getText(), true);
        fSymbol.setEnclosingScope(FrontEnd.currentScope);
        FrontEnd.currentScope.define(fSymbol);
        FrontEnd.pushScope(fSymbol);
        ctx.scope = FrontEnd.currentScope;
        DeclProcedure dclProc = new DeclProcedureVisitor().visit(ctx);
        FrontEnd.popScope();
        return dclProc;
    }

    public Statement visitFunction(GraceParser.FunctionContext ctx) {
        FunctionSymbol fSymbol = new FunctionSymbol(ctx.decFunc().ID().getText());
        fSymbol.setEnclosingScope(FrontEnd.currentScope);
        FrontEnd.currentScope.define(fSymbol);
        FrontEnd.pushScope(fSymbol);
        ctx.scope = FrontEnd.currentScope;
        DeclFunction dclFun = new DeclFunctionVisitor().visit(ctx);
        FrontEnd.popScope();
        return dclFun;
    }

}
