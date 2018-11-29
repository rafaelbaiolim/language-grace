package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.cmd.AtribCmd;
import uem.ast.stmt.cmd.AtribVar;
import uem.ast.stmt.cmd.AtribVarArr;

public class AtribVisitor extends GraceParserBaseVisitor<AtribCmd> {
    public AtribCmd visitAtrib(GraceParser.AtribContext ctx) {
        AtribVar atribVar = new AtribVar(ctx.ID().getText(),
                ctx.operator.getText(),
                new ExpressionVisitor().visit(ctx.expression()));
        return atribVar;
    }

    public AtribCmd visitAtribVar(GraceParser.AtribVarContext ctx) {
        AtribVar atribVar = new AtribVar(ctx.atrib().ID().getText(),
                ctx.atrib().operator.getText(),
                new ExpressionVisitor().visit(ctx.atrib().expression())
        );
        return atribVar;
    }

    public AtribCmd visitAtribArr(GraceParser.AtribArrContext ctx) {
        AtribVarArr atribVarArr = new AtribVarArr(
                ctx.arrAtrib().ID().getText(),
                new ExpressionVisitor().visit(ctx.arrAtrib().expression().get(0)),
                new ExpressionVisitor().visit(ctx.arrAtrib().expression(1))
        );
        return atribVarArr;
    }


}