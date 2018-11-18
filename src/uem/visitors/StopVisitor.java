package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;
import uem.ast.type.StopType;
import uem.ast.type.Type;

public class StopVisitor extends GraceParserBaseVisitor<Statement> {
    public Statement visitCmStop(GraceParser.CmStopContext ctx) {
        return new StopType();
    }
}
