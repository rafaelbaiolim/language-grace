package uem.semantic;

import org.antlr.v4.runtime.Token;

public class CheckSymbols {

    public static int hasError = 1;
    private static boolean noMain = true;

    public static void error(Token t, String msg) {
        System.err.printf("Line %d:%d %s\n: ", t.getLine(), t.getCharPositionInLine() + 1, msg);
        hasError++;
    }

    public static void callFunError(int totDecl, int totCall, Token t) {
        if (totCall != totDecl) {
            System.err.printf("Line %d:%d: error:Too few arguments to function `" + t.getText() + "’\n",
                    t.getLine(), t.getCharPositionInLine() + 1
            );
        }
        hasError++;
    }

    public static void MainCreated() {
        if (noMain) {
            noMain = false;
            hasError--;
        }
    }

    public static boolean hasMainFatalEror() {
        if (noMain) {
            System.err.printf("No Grace Main found.");
//          *TODO: DESCOMENTAR / VERIFICAR COM O NANNI System.exit(1);
        }
        return false;
    }
}