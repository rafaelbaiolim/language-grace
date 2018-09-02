package uem.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ParseTree extends ParseTreeNode {

    public ParseTree(String name) {
        super(name);
    }

    public ParseTreeNode getParseTree(ParserRuleContext node) {
        ParseTreeNode res = new ParseTreeNode(node.getText());
        node.children.forEach(c -> {
            if (!c.getClass().getSimpleName().isEmpty()) {
                if (c.getClass() == ParserRuleContext.class) {
                    res.getChild(new ParseTree(c.getText()).getParseTree((ParserRuleContext) c));
                } else if (c.getClass() == TerminalNode.class) {
                    res.getChild(new ParseLeaf(c.getText()));
                }

            }
        });
        return res;
    }

}
