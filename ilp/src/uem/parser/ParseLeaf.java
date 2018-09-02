package uem.parser;

public class ParseLeaf extends ParseTreeEl {
    public String tex;

    public ParseLeaf(String tex) {
        this.tex = tex;
    }

    @Override
    public String toString() {
        return "T[" + this.tex + "]";
    }

    @Override
    String identationMultLines(String ident) {
        return (ident + "T[" + this.tex + "]\n");
    }
}
