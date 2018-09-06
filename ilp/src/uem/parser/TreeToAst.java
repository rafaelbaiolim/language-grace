package uem.parser;

import uem.antlr.IlpParser;
import uem.ast.AstMap;
import uem.ast.Node;
import uem.ast.stmt.IlpFile;

public class TreeToAst implements ParseTreeToAstMap {

    @Override
    public IlpFile map(IlpParser.IlpFileContext ilpFileCtx) {
        return new AstMap().getAst(ilpFileCtx);
    }
}
