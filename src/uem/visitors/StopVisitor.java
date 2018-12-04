package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;
import uem.ast.type.StopType;
import uem.ast.type.Type;
import uem.listners.FrontEnd;
import uem.semantic.CheckSymbols;

public class StopVisitor extends GraceParserBaseVisitor<Statement> {
    public Statement visitCmStop(GraceParser.CmStopContext ctx) {
        if (!FrontEnd.isWithinScope("while") &&
                !FrontEnd.isWithinScope("for")
        ) {
            CheckSymbols.error(ctx.start, "error: stop statement not within loop.");
        }
        return new StopType();
    }
}
