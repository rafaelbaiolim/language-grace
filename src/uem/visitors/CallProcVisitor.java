package uem.visitors;

import org.antlr.symtab.FunctionSymbol;
import org.antlr.symtab.Symbol;
import org.antlr.symtab.VariableSymbol;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.cmd.CallProcCmd;
import uem.listners.FrontEnd;
import uem.semantic.CheckSymbols;

import java.util.LinkedList;
import java.util.List;

public class CallProcVisitor extends GraceParserBaseVisitor<CallProcCmd> {

    public CallProcCmd visitCmdCallProc(GraceParser.CmdCallProcContext ctx) {
        List<Expression> lstExpr = new LinkedList<>();
        Symbol fun = FrontEnd.currentScope.resolve(ctx.ID().getText()).getScope().getSymbol(ctx.ID().getText());
        FunctionSymbol func = (FunctionSymbol) fun;
        /**
         * semântico - fun name
         */
        if (func == null) {
            CheckSymbols.error(ctx.start, ":error: undefined reference to '" +
                    ctx.ID().getText() + "(...)'.");
        }

        int i = 0;
        for (GraceParser.ExpressionContext stmtExpr : ctx.expression()) {
            Expression aExpr = new ExpressionVisitor().visit(stmtExpr);
            CheckSymbols.checkTypeParam(ctx.start,
                    (VariableSymbol) func.getSymbols().get(i),
                    aExpr);
            lstExpr.add(aExpr);
        }


        /**
         * semântico - num param
         */
        try {
            int numParams = ((FunctionSymbol) fun).getNumberOfParameters();
            CheckSymbols.callFunError(
                    numParams, ctx.expression().size(), ctx.ID().getSymbol()
            );
        } catch (Exception ex) {
            //tratar exceção para procedure
        }

        CallProcCmd callCmd = new CallProcCmd(ctx.ID().getText(), lstExpr);
        try {
            if (func.getType() == null || func.getType().getName().toLowerCase() == "void") {
                callCmd.setVoid(true);
            }
        } catch (NullPointerException nEx) {
            callCmd.setVoid(true);
        }

        callCmd.getLLVMValue();
        return callCmd;
    }


}
