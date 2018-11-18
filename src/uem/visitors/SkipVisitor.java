package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;
import uem.ast.type.SkipType;

public class SkipVisitor extends GraceParserBaseVisitor<Statement> {
    public Statement visitCmSkip(GraceParser.CmSkipContext ctx) {
        return new SkipType();
    }
}
