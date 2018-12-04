package uem.semantic;

import org.antlr.v4.runtime.Token;

public class CheckSymbols {
//    public static ArrayType getType(int tokenType) {
//        switch (tokenType) {
//            case GraceParser.T_INT:
//                return Symbol.Type.tNUMBER;
//            case GraceParser.T_FALSE:
//                return Symbol.Type.tBOOL;
//            case GraceParser.T_BOOL:
//                return Symbol.Type.tBOOL;
//            case GraceParser.T_TRUE:
//                return Symbol.Type.tBOOL;
//            case GraceParser.T_STRING:
//                return Symbol.Type.tSTRING;
//        }
//        return Symbol.Type.tINVALID;
//    }

    public static void error(Token t, String msg) {

        System.err.printf("Line %d:%d %s\n: ", t.getLine(), t.getCharPositionInLine() + 1, msg);
    }

    public static void callFunError(int totDecl, int totCall, Token t) {
        if (totCall != totDecl) {
            System.err.printf("Line %d:%d: error:Too few arguments to function `" + t.getText() + "’\n",
                    t.getLine(), t.getCharPositionInLine() + 1
            );
        }
    }


}