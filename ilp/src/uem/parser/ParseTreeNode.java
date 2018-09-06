package uem.parser;

import java.util.LinkedList;

public class ParseTreeNode extends ParseTreeEl {
    public String name;
    LinkedList<ParseTreeEl> children = new LinkedList<>();

    public ParseTreeNode() {
        return;
    }

    public ParseTreeNode(String name) {
        this.name = name;
    }


    public ParseTreeNode getChild(ParseTreeEl child) {
        this.children.add(child);
        return this;
    }

    @Override
    public String toString() {

        return "Node(" + this.name + ") " + this.children;
    }

    @Override
    public String identationMultLines(String ident) {
        StringBuilder sbt = new StringBuilder();
        sbt.append(ident + this.name + "\n");
        children.forEach(child -> sbt.append(child.identationMultLines(ident + " ")));
        return sbt.toString();
    }

    @Override
    public String identationMultLines() {
        return this.identationMultLines(" ");
    }
}
