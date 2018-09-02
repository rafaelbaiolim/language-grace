package uem.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import uem.ast.Node;

public interface ParseTreeToAstMap {
    Node map(ParserRuleContext var1);
}