package uem.semantic;

import org.antlr.symtab.FunctionSymbol;
import org.antlr.symtab.Symbol;
import org.antlr.symtab.Type;
import org.antlr.symtab.VariableSymbol;
import org.antlr.v4.runtime.Token;
import uem.ast.expr.Expression;
import uem.ast.expr.VarReference;
import uem.ast.type.StringType;
import uem.listners.FrontEnd;

import java.util.LinkedList;

public class CheckSymbols {

    public static int hasError = 1;
    private static boolean noMain = true;

    /**
     * Método genérico para mostrar indicar erros
     * semanticos e controlar a quantidade de erros
     *
     * @param t
     * @param msg
     */
    public static void error(Token t, String msg) {
        System.err.printf("Line %d:%d %s\n", t.getLine(), t.getCharPositionInLine() + 1, msg);
        hasError++;
    }

    /**
     * Validação de simbulo já existente
     *
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
     *
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
     *
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
     *
     * @param tok
     * @param param
     * @param call
     */
    public static void checkTypeParam(Token tok, VariableSymbol param, Expression call) {
        checkTypeAtrib(tok, param, call);
    }

    private static String simplifyTypeName(String typeName) {
        if (typeName.contains("[]")) {
            return typeName.replace("[]", "");
        }
        return typeName;
    }


    /**
     * Validação de tipos compativeis
     *
     * @param tok
     * @param currentSym
     * @param expr
     */
    public static void checkTypeAtrib(Token tok, Symbol currentSym, Expression expr) {
        try {
            VariableSymbol sym = ((VariableSymbol) currentSym);
            if (!sym.getType().equals(expr.getType())) {
                String typeName = simplifyTypeName(sym.getType().toString());
                String typeExpr = simplifyTypeName(expr.getType().toString());
                typeName = simplifyTypeName(typeName);

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
     *
     * @param tok
     * @param paramSym
     */
    public static void verifyIlegalArrayAtrib(Token tok, Symbol paramSym) {
        VariableSymbol sym = ((VariableSymbol) paramSym);
        if (sym.getType().toString().contains("[]") && sym.getType().toString().contains("int")) {
            error(tok, ":error: assignment to expression with array type");
        }
    }

    public static void verifySizeStringArr(Token tok, VariableSymbol sym, String text) {
        if (sym.getType() instanceof StringType) {
            if (((StringType) sym.getType()).getSize() < text.length()) {
                error(tok, ":error: not enough space allocated to string `" + sym.getName() + "`");
            }
        }
    }

    public static void validateReturn(Token tok, FunctionSymbol funScope, LinkedList<Expression> exprL) {
        try {
            for (Expression expr : exprL) {
                Type currentType = null;
                if (expr instanceof VarReference) {
                    Symbol sym = FrontEnd.resolveWithScope(((VarReference) expr).getVarName());
                    currentType = ((VariableSymbol) sym).getType();
                } else {
                    currentType = expr.getType();
                }

                if (!funScope.getType().equals(currentType)) {
                    String currentStrType = simplifyTypeName(currentType.toString());
                    String funStrTypeName = simplifyTypeName(funScope.getType().toString());
                    if (!funStrTypeName.equals(currentStrType)) {
                        error(tok, ":error: expecting " + funStrTypeName +
                                " return type for `" + funScope.getName() + "`, " +
                                "" + currentStrType + " recived.");
                        break;
                    }
                }
            }
        } catch (ClassCastException castEx) {
            //não encontrou um varSymbol
        }

    }
}