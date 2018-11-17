package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;

import java.util.LinkedList;
import java.util.List;

public class CommandVisitor extends GraceParserBaseVisitor<List<Statement>> {

    public List<Statement> visitCmblock(GraceParser.CmblockContext ctx) {
        List<Statement> lst = new LinkedList<>();
        StatementVisitor stmtVisitor = new StatementVisitor();
        ctx.block().statement().forEach(stmt -> {
            lst.add(stmtVisitor.visit(stmt));
        });
        return lst;
    }

    public List<Statement> visitCmsimple(GraceParser.CmsimpleContext ctx) {
        //return new StatementVisitor().visit(ctx);
        System.out.println("Não implementado");
        return null;
    }


}
