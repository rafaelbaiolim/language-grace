package uem.semantic;

import org.antlr.symtab.Symbol;
import org.antlr.symtab.VariableSymbol;
import org.antlr.v4.runtime.Token;
import uem.ast.expr.Expression;
import uem.listners.FrontEnd;

public class CheckSymbols {

    public static int hasError = 1;
    private static boolean noMain = true;

    /**
     * Método genérico para mostrar indicar erros
     * semanticos e controlar a quantidade de erros
     * @param t
     * @param msg
     */
    public static void error(Token t, String msg) {
        System.err.printf("Line %d:%d %s\n: ", t.getLine(), t.getCharPositionInLine() + 1, msg);
        hasError++;
    }

    /**
     * Validação de simbulo já existente
     * @param varName
     * @param t
     * @param msg
     */
    public static void checkVarExist(String varName, Token t, String msg) {
        try {

            Symbol sym = FrontEnd.currentScope.resolve(varName).
                    getScope().getSymbol(varName);

        } catch (NullPointerException ex) {
            error(t, msg);
        }
    }

    /**
     * Valida total de arumentos de chamada de func
     * @param totDecl
     * @param totCall
     * @param t
     */
    public static void callFunError(int totDecl, int totCall, Token t) {
        if (totCall != totDecl) {
            System.err.printf("Line %d:%d:error:Too few arguments to function `" + t.getText() + "(...)’\n",
                    t.getLine(), t.getCharPositionInLine() + 1
            );
        }
        hasError++;
    }

    /**
     * Remove o erro setado no inicio da execução
     * de main() não declarada
     */
    public static void MainCreated() {
        if (noMain) {
            noMain = false;
            hasError--;
        }
    }

    /**
     * Sem main declarada
     * @return
     */
    public static boolean hasMainFatalEror() {
        if (noMain) {
            System.err.printf(":error: undefined reference to `main’\n");
        }
        return false;
    }

    /**
     * Alias para função de tipos compativeis
     * utilizada para chamada de func / proc
     * @param tok
     * @param param
     * @param call
     */
    public static void checkTypeParam(Token tok, VariableSymbol param, Expression call) {
        checkTypeAtrib(tok, param, call);
    }

    /**
     * Validação de tipos compativeis
     * @param tok
     * @param currentSym
     * @param expr
     */
    public static void checkTypeAtrib(Token tok, Symbol currentSym, Expression expr) {
        try {
            VariableSymbol sym = ((VariableSymbol) currentSym);
            if (!sym.getType().equals(expr.getType())) {
                String typeName = sym.getType().toString();
                String typeExpr = expr.getType().toString();

                if (typeName.contains("[]")) {
                    typeName = typeName.replace("[]", "");
                }
                if (typeExpr.contains("[]")) {
                    typeExpr = typeExpr.replace("[]", "");
                }
                if (!typeName.equals(typeExpr)) {
                    error(tok, ":error: expecting " + sym.getType().toString() +
                            " type for `" + currentSym.getName() + "`, " +
                            "" + expr.getType().toString() + " recived.");
                }
            }
        } catch (Exception ex) {
        }
    }

    /**
     * Valida atribuição arr = exp
     * @param tok
     * @param paramSym
     */
    public static void verifyIlegalArrayAtrib(Token tok,Symbol paramSym) {
        VariableSymbol sym = ((VariableSymbol) paramSym);
        if (sym.getType().toString().contains("[]") && sym.getType().toString().contains("int")) {
            error(tok,":error: assignment to expression with array type");
        }
    }
}