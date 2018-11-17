package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.AtribStmt;

public class AtribVisitor extends GraceParserBaseVisitor<AtribStmt> {

    public AtribStmt visitAtribVar(GraceParser.AtribVarContext ctx) {
        AtribStmt atribStmt = new AtribStmt(ctx.atrib().ID().getText(),
                new ExpressionVisitor().visit(ctx.atrib().expression())
        );
        return atribStmt;
    }

}