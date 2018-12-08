package uem.visitors;

import org.antlr.symtab.VariableSymbol;
import org.antlr.v4.runtime.Token;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.cmd.AtribCmd;
import uem.ast.stmt.cmd.AtribVar;
import uem.ast.stmt.cmd.AtribVarArr;
import uem.listners.FrontEnd;
import uem.semantic.CheckSymbols;

public class AtribVisitor extends GraceParserBaseVisitor<AtribCmd> {

    private void validatePhases(String varName,
                                Token tok, Expression aExp) {
        CheckSymbols.checkVarExist(varName,
                tok, "error: cannot find symbol '" +
                        varName + "'");

        CheckSymbols.checkTypeAtrib(tok,
                FrontEnd.resolveWithScope(varName), aExp);

    }

    public AtribCmd visitAtrib(GraceParser.AtribContext ctx) {
        GraceParser.ExpressionContext expr = ctx.expression();
        Expression aExp = new ExpressionVisitor().visit(expr);
        //Semântico
        this.validatePhases(ctx.ID().getText(), ctx.start, aExp);

        return new AtribVar(ctx.ID().getText(),
                ctx.operator.getText(),
                aExp);
    }

    public AtribCmd visitAtribVar(GraceParser.AtribVarContext ctx) {
        GraceParser.ExpressionContext expr = ctx.atrib().expression();
        Expression aExp = new ExpressionVisitor().visit(expr);
        //Semântico
        String varName = ctx.atrib().ID().getText();
        this.validatePhases(varName, ctx.start, aExp);
        CheckSymbols.verifyIlegalArrayAtrib(ctx.start,
                FrontEnd.resolveWithScope(varName));

        CheckSymbols.verifySizeStringArr(
                ctx.start,
                (VariableSymbol) FrontEnd.resolveWithScope(varName),
                ctx.atrib().getText()
        );

        return new AtribVar(varName,
                ctx.atrib().operator.getText(),
                new ExpressionVisitor().visit(expr)
        );
    }

    public AtribCmd visitAtribArr(GraceParser.AtribArrContext ctx) {
        GraceParser.ExpressionContext expr = ctx.arrAtrib().expression(1);

        //Semântico
        Expression aExp = new ExpressionVisitor().visit(expr);
        this.validatePhases(ctx.arrAtrib().ID().getText(), ctx.start, aExp);

        return new AtribVarArr(
                ctx.arrAtrib().ID().getText(),
                new ExpressionVisitor().visit(ctx.arrAtrib().expression().get(0)),
                aExp
        );
    }


}