package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;

import java.util.LinkedList;
import java.util.List;

public class BlockVisitor extends GraceParserBaseVisitor<List<Statement>> {

    public List<Statement> visitBlock(GraceParser.BlockContext ctx) {
        List<Statement> lst = new LinkedList<>();
        StatementVisitor stmtVisitor = new StatementVisitor();
        ctx.statement().forEach(stmt -> {
            lst.add(stmtVisitor.visit(stmt));
        });
        return lst;
    }
}
