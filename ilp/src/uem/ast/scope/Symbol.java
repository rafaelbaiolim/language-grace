package uem.ast.scope;

public class Symbol { // A generic programming language symbol
    public static enum Type {tINVALID, tNUMBER, tSTRING,tBOOL}

    String name;      // All symbols at least have a name
    Scope scope;      // All symbols know what scope contains them.
    Type type;

    public Symbol(String name) {
        this.name = name;
    }

    public Symbol(String name, Type type) {
        this(name);
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        if (type != Type.tINVALID) return '<' + getName() + ":" + type + '>';
        return getName();
    }
}