package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.cmd.CallProcCmd;

import java.util.LinkedList;
import java.util.List;

public class CallProcVisitor extends GraceParserBaseVisitor<CallProcCmd> {

    public CallProcCmd visitCmdCallProc(GraceParser.CmdCallProcContext ctx) {
        List<Expression> lstExpr = new LinkedList<>();
        ctx.expression().forEach(stmtExpr -> {
            lstExpr.add(new ExpressionVisitor().visit(stmtExpr));
        });
        return new CallProcCmd(ctx.ID().getText(), lstExpr);
    }


}
