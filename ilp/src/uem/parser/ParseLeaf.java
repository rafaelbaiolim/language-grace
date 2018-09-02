package uem.parser;

public class ParseLeaf extends ParseTreeEl {
    public String tex;

    public ParseLeaf(String tex) {
        this.tex = tex;
    }

    @Override
    public String toString() {
        return "{" + this.tex + "}";
    }

    @Override
    String identationMultLines(String ident) {
        return (ident + "{" + this.tex + "}\n");
    }

    @Override
    String identationMultLines() {
        return this.identationMultLines(" ");
    }
}
