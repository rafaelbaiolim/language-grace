package uem.visitors;

import org.antlr.v4.runtime.Token;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.cmd.AtribCmd;
import uem.ast.stmt.cmd.AtribVar;
import uem.ast.stmt.cmd.AtribVarArr;
import uem.listners.FrontEnd;
import uem.semantic.CheckSymbols;

public class AtribVisitor extends GraceParserBaseVisitor<AtribCmd> {

    private void validatePhases(String varName,
                                Token tok, String exprStr) {
        CheckSymbols.checkVarExist(varName,
                tok, "error: cannot find symbol '" +
                        varName + "'");

        CheckSymbols.checkTypeAtrib(tok,
                FrontEnd.resolveWithScope(varName), exprStr);


    }

    public AtribCmd visitAtrib(GraceParser.AtribContext ctx) {
        //Semântico
        GraceParser.ExpressionContext expr = ctx.expression();
        this.validatePhases(ctx.ID().getText(), ctx.start, expr.getText());

        return new AtribVar(ctx.ID().getText(),
                ctx.operator.getText(),
                new ExpressionVisitor().visit(expr));
    }

    public AtribCmd visitAtribVar(GraceParser.AtribVarContext ctx) {
        //Semântico
        GraceParser.ExpressionContext expr = ctx.atrib().expression();
        this.validatePhases(ctx.atrib().ID().getText(), ctx.start, expr.getText());


        return new AtribVar(ctx.atrib().ID().getText(),
                ctx.atrib().operator.getText(),
                new ExpressionVisitor().visit(expr)
        );
    }

    public AtribCmd visitAtribArr(GraceParser.AtribArrContext ctx) {
        //Semântico
        GraceParser.ExpressionContext expr = ctx.arrAtrib().expression(1);
        this.validatePhases(ctx.arrAtrib().ID().getText(), ctx.start, expr.getText());

        return new AtribVarArr(
                ctx.arrAtrib().ID().getText(),
                new ExpressionVisitor().visit(ctx.arrAtrib().expression().get(0)),
                new ExpressionVisitor().visit(expr)
        );
    }


}