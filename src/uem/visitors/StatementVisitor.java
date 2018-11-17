package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;

public class StatementVisitor extends GraceParserBaseVisitor<Statement> {
    public Statement visitDeclVarStatement(GraceParser.DeclVarStatementContext ctx) {
        return new DeclVarVisitor().visit(ctx.declVar());
    }

}
