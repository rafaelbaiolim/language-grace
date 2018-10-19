package uem.parser;

import uem.antlr.GraceParser;
import uem.ast.AstMap;
import uem.ast.stmt.GraceFile;

public class TreeToAst implements ParseTreeToAstMap {

    @Override
    public GraceFile map(GraceParser.GraceFileContext graceFileCtx) {
        return new AstMap().getAst(graceFileCtx);
    }
}
