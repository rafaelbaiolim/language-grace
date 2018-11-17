package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.DeclVar;
import uem.ast.stmt.Statement;
import uem.ast.stmt.WhileStmt;
import uem.ast.type.Type;

import java.util.List;

public class WhileVisitor extends GraceParserBaseVisitor<WhileStmt> {

    public WhileStmt visitCmdWhile(GraceParser.CmdWhileContext ctx) {
        Expression exprCond = new ExpressionVisitor().visit(ctx.expression());


        WhileStmt whileStmt = new WhileStmt(null, exprCond);

        return whileStmt;
    }


}
