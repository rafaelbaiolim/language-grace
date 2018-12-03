package uem.visitors;

import org.antlr.symtab.FunctionSymbol;
import org.antlr.symtab.Symbol;
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
        ctx.expression().forEach(stmtExpr -> {
            lstExpr.add(new ExpressionVisitor().visit(stmtExpr));
        });

        Symbol fun = FrontEnd.currentScope.getSymbol(ctx.ID().getText());
        FunctionSymbol func = (FunctionSymbol) fun;

        /**
         * semântico
         */
        try {
            int numParams = ((FunctionSymbol) fun).getNumberOfParameters();
            CheckSymbols.callFunError(
                    numParams, ctx.expression().size(), ctx.ID().getSymbol()
            );
        }catch (Exception ex){
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
