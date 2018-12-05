package uem.visitors;

import org.antlr.symtab.LocalScope;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;
import uem.ast.type.SkipType;
import uem.listners.FrontEnd;
import uem.semantic.CheckSymbols;

public class SkipVisitor extends GraceParserBaseVisitor<Statement> {
    public Statement visitCmSkip(GraceParser.CmSkipContext ctx) {
        LocalScope enclosing = FrontEnd.isWithinLoopScope();
        if (enclosing == null) {
            CheckSymbols.error(ctx.start, "error: skip statement not within loop.");
        }
        return new SkipType();
    }
}
