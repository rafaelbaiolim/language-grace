package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.cmd.WriteCmd;

import java.util.LinkedList;
import java.util.List;

public class WriteVisitor extends GraceParserBaseVisitor<WriteCmd> {

    public WriteCmd visitCmdWrite(GraceParser.CmdWriteContext ctx) {
        List<Expression> lstExpr = new LinkedList<>();
        ctx.expression().forEach(stmtExpr -> {
            lstExpr.add(new ExpressionVisitor().visit(stmtExpr));
        });
        return new WriteCmd(lstExpr);
    }

}