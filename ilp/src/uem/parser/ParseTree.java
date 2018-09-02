package uem.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ParseTree extends ParseTreeNode {

    public ParseTreeNode getParseTree(ParserRuleContext node) {
        ParseTreeNode res = new ParseTreeNode(node.getClass().getSimpleName().
                replace("Context", ""));
        node.children.forEach(child -> {
            String simpleNameClass = child.getClass().getSimpleName();
            if (simpleNameClass.contains("Context")) {
                res.getChild(new ParseTree().getParseTree((ParserRuleContext) child));
            } else if (simpleNameClass.contains(TerminalNode.class.getSimpleName())) {
                res.getChild(new ParseLeaf(child.getText()));
            }
        });
        return res;
    }

}
