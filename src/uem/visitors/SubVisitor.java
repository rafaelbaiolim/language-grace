package uem.visitors;

import org.antlr.symtab.FunctionSymbol;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;
import uem.listners.FrontEnd;

public class SubVisitor extends GraceParserBaseVisitor<Statement> {


    public Statement visitProcedure(GraceParser.ProcedureContext ctx) {
        FunctionSymbol fSymbol = new FunctionSymbol(ctx.decProc().ID().getText());
        fSymbol.setEnclosingScope(FrontEnd.currentScope);
        FrontEnd.currentScope.define(fSymbol);
        FrontEnd.pushScope(fSymbol);
        ctx.scope = FrontEnd.currentScope;
        return new DeclProcedureVisitor().visit(ctx);
    }

    public Statement visitFunction(GraceParser.FunctionContext ctx) {
        FunctionSymbol fSymbol = new FunctionSymbol(ctx.decFunc().ID().getText());
        fSymbol.setEnclosingScope(FrontEnd.currentScope);
        FrontEnd.currentScope.define(fSymbol);
        FrontEnd.pushScope(fSymbol);
        ctx.scope = FrontEnd.currentScope;
        return new DeclFunctionVisitor().visit(ctx);
    }

}
