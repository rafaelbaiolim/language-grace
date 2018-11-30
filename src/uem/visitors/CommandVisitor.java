package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;

import java.util.List;

public class CommandVisitor extends GraceParserBaseVisitor<List<Statement>> {

    public List<Statement> visitCmblock(GraceParser.CmblockContext ctx) {
        return new BlockVisitor().visit(ctx.block());
    }

    public List<Statement> visitCmsimple(GraceParser.CmsimpleContext ctx) {
//        return new CommandSimpleVisitor().visit(ctx.cmdSimple());
        return null;
    }


}
