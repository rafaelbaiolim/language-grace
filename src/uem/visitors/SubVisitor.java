package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;

public class SubVisitor extends GraceParserBaseVisitor<Statement> {

    public Statement visitProcedure(GraceParser.ProcedureContext ctx) {
        return new DeclProcedureVisitor().visit(ctx);
    }

    public Statement visitFunction(GraceParser.FunctionContext ctx) {
        return new DeclFunctionVisitor().visit(ctx);
    }

}
