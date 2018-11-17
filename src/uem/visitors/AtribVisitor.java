package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.cmd.AtribCmd;

public class AtribVisitor extends GraceParserBaseVisitor<AtribCmd> {

    public AtribCmd visitAtribVar(GraceParser.AtribVarContext ctx) {
        AtribCmd atribCmd = new AtribCmd(ctx.atrib().ID().getText(),
                new ExpressionVisitor().visit(ctx.atrib().expression())
        );
        return atribCmd;
    }

}