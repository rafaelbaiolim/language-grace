package uem.parser;

import uem.antlr.GraceParser;
import uem.ast.Node;

public interface ParseTreeToAstMap {
    Node map(GraceParser.GraceFileContext graceFileCtx);
}