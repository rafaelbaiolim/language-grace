package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.ForStmt;
import uem.ast.stmt.Statement;
import uem.ast.stmt.cmd.AtribCmd;

import java.util.List;

public class ForVisitor extends GraceParserBaseVisitor<ForStmt> {

    public ForStmt visitCmdFor(GraceParser.CmdForContext ctx) {
        AtribCmd forInit = new AtribVisitor().visit(ctx.forInit().atrib());
        AtribCmd forItera = new AtribVisitor().visit(ctx.forItera().atrib());

        Expression cond = new ExpressionVisitor().visit(ctx.expression());
        List<Statement> body = new CommandVisitor().visit(ctx.command());

        return new ForStmt(forInit, cond, forItera, body);
    }


}
