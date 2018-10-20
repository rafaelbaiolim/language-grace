package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.GraceFile;
import uem.ast.stmt.Statement;

import java.util.LinkedList;

public class GraceFileVisitor extends GraceParserBaseVisitor {

    public GraceFile visitGraceFile(GraceParser.GraceFileContext ctx) {
        LinkedList<Statement> linked = new LinkedList<>();
        ctx.statement().forEach(el -> {
            Statement ast = new StatementVisitor().
                    visit(el);
            linked.add(ast);
        });
        return new GraceFile(linked);
    }


}
