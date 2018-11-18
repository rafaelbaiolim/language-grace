package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;
import uem.ast.type.ReturnType;

public class ReturnVisitor extends GraceParserBaseVisitor<Statement> {
    public Statement visitCmReturn(GraceParser.CmReturnContext ctx) {
        return new ReturnType();
    }
}
