package uem.ast.scope;

import org.antlr.v4.runtime.Token;
import uem.antlr.GraceParser;

public class CheckSymbols {
    public static Symbol.Type getType(int tokenType) {
        switch (tokenType) {
            case GraceParser.T_INT:
                return Symbol.Type.tNUMBER;
            case GraceParser.T_FALSE:
                return Symbol.Type.tBOOL;
            case GraceParser.T_BOOL:
                return Symbol.Type.tBOOL;
            case GraceParser.T_TRUE:
                return Symbol.Type.tBOOL;
            case GraceParser.T_STRING:
                return Symbol.Type.tSTRING;
        }
        return Symbol.Type.tINVALID;
    }

    public static void error(Token t, String msg) {
        System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(),
                msg);
    }

}
