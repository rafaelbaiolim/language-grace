package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.WhileStmt;

public class WhileVisitor extends GraceParserBaseVisitor<WhileStmt> {

    public WhileStmt visitCmdWhile(GraceParser.CmdWhileContext ctx) {
        Expression exprCond = new ExpressionVisitor().visit(ctx.expression());
        String nodeCtxStr = ctx.command().getClass().getSimpleName().toLowerCase();
        WhileStmt whileStmt = new WhileStmt(null, exprCond);
        if (nodeCtxStr.equals(GraceParser.CmdSimpleContext.class.getSimpleName().toLowerCase())) {
            //Visitor de comando simples
        } else {
            //Visitor de block
            whileStmt.setStatment(new CommandVisitor().visit(ctx.command()));
        }


        return whileStmt;
    }


}
