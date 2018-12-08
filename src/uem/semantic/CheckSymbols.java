package uem.semantic;

import org.antlr.symtab.Symbol;
import org.antlr.symtab.VariableSymbol;
import org.antlr.v4.runtime.Token;
import uem.ast.type.BooleanType;
import uem.ast.type.IntegerType;
import uem.listners.FrontEnd;

public class CheckSymbols {

    public static int hasError = 1;
    private static boolean noMain = true;

    public static void error(Token t, String msg) {
        System.err.printf("Line %d:%d %s\n: ", t.getLine(), t.getCharPositionInLine() + 1, msg);
        hasError++;
    }

    public static void checkVarExist(String varName, Token t, String msg) {
        try {

            Symbol sym = FrontEnd.currentScope.resolve(varName).
                    getScope().getSymbol(varName);

        } catch (NullPointerException ex) {
            error(t, msg);
        }
    }


    public static void callFunError(int totDecl, int totCall, Token t) {
        if (totCall != totDecl) {
            System.err.printf("Line %d:%d: error:Too few arguments to function `" + t.getText() + "(...)’\n",
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
            System.err.printf("error: undefined reference to `main’\n");
//          *TODO: DESCOMENTAR / VERIFICAR COM O NANNI System.exit(1);
        }
        return false;
    }

    public static void checkTypeAtrib(Token tok, Symbol currentSym, String expr) {
        try {
            VariableSymbol sym = ((VariableSymbol) currentSym);
            if (sym.getType() instanceof IntegerType) {
                if (!expr.matches("-?\\d+(\\.\\d+)?")) {
                    error(tok, ":error: expecting integer type expression.");
                }
            }
            if (sym.getType() instanceof BooleanType) {
                if (!expr.toLowerCase().equals("true") &&
                        !expr.toLowerCase().equals("false")
                ) {
                    error(tok, ":error: expecting boolean type expression.");
                }
            }


        } catch (Exception ex) {

        }
    }
}