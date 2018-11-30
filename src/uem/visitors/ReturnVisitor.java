package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.Return;
import uem.ast.stmt.Statement;

import java.util.LinkedList;

public class ReturnVisitor extends GraceParserBaseVisitor<Statement> {
    public Statement visitCmReturn(GraceParser.CmReturnContext ctx) {
        LinkedList<Expression> exprL = new LinkedList<Expression>();
        ctx.cmdReturn().expression().forEach(expr -> {
            exprL.add(new ExpressionVisitor().visit(expr));
        });
        return new Return(exprL);
    }
}
