package uem.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import uem.antlr.IlpParser;
import uem.ast.Node;

public interface ParseTreeToAstMap {
    Node map(IlpParser.IlpFileContext ilpFileCtx);
}