package uem.visitors;

import uem.IR.LLVMPresets;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.CondicionalStmt;
import uem.ast.stmt.Statement;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class CondicionalVisitor extends GraceParserBaseVisitor<CondicionalStmt> {

    public CondicionalStmt visitCmdIf(GraceParser.CmdIfContext ctx) {
        Expression exprCond = new ExpressionVisitor().visit(ctx.expression());
        CondicionalStmt condicionalStmt = new CondicionalStmt(exprCond);

        AtomicInteger i = new AtomicInteger();
        int totalComands = ctx.command().toArray().length;
        boolean temElseStmt = false;
        if (ctx.getTokens(GraceParser.T_ELSE).toArray().length > 0) {
            temElseStmt = true;
        }
        boolean finalTemElseStmt = temElseStmt;

        AtomicReference<List<Statement>> lstElse = new AtomicReference<>();
        AtomicReference<List<Statement>> lstIF = new AtomicReference<>();
        LLVMPresets.getInstance().pushConditionalScope(condicionalStmt.getCond());
        ctx.command().forEach(stmt -> {
            if (finalTemElseStmt && (i.get() == (totalComands - 1))) {
                LLVMPresets.getInstance().popConditionalScope();
                lstElse.set(new CommandVisitor().visit(stmt));
                return;
            }
            lstIF.set(new CommandVisitor().visit(stmt));
            i.getAndIncrement();
        });
        LLVMPresets.getInstance().popConditionalScope();
        condicionalStmt.setElseStatment(lstElse.get());
        condicionalStmt.setIfStatment(lstIF.get());

        return condicionalStmt;
    }


}
