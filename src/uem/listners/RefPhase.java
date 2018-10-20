package uem.listners;

import org.antlr.v4.runtime.tree.ParseTreeProperty;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseListener;
import uem.ast.expr.BinaryExpression;
import uem.ast.expr.Expression;
import uem.ast.expr.VarReference;
import uem.ast.scope.CheckSymbols;
import uem.ast.scope.GlobalScope;
import uem.ast.scope.Scope;
import uem.ast.scope.Symbol;
import uem.ast.stmt.Statement;
import uem.ast.type.Type;
import uem.visitors.ExpressionVisitor;
import uem.visitors.ListSpecVarVisitor;
import uem.visitors.ListTypeVisitor;

import java.util.List;

public class RefPhase extends GraceParserBaseListener {
    ParseTreeProperty<Scope> scopes;
    GlobalScope globals;
    Scope currentScope; // resolve symbols starting in this scope

    public RefPhase(GlobalScope globals, ParseTreeProperty<Scope> scopes) {
        this.scopes = scopes;
        this.globals = globals;
    }

    public void enterGraceFile(GraceParser.GraceFileContext ctx) {
        currentScope = globals;
    }


    public void exitDeclVar(GraceParser.DeclVarContext declVarCtx) {
        try {
            GraceParser.ListSpecVarsContext listSpecVarsContext = declVarCtx.listSpecVars();
            GraceParser.LstTypeContext listTypeCtx = declVarCtx.lstType();

            ListSpecVarVisitor listExprVisit = new ListSpecVarVisitor();
            ListTypeVisitor listTypeVisitor = new ListTypeVisitor();

            List<Statement> lst = listExprVisit.visit(listSpecVarsContext);
            Type currentType = listTypeVisitor.visit(listTypeCtx);
            lst.forEach(stmt -> {
                String name = stmt.getVarName();
                Symbol var = currentScope.resolve(name);
                if (var == null) {
                    CheckSymbols.error(stmt.getSymbol(), "no such variable: " + name);
                }
            });
        }catch (Exception ex){
            //err sintatico
        }
    }

    /**
     * Validação expressões binárias
     *
     * @param binCtx
     */
    public void exitBinaryOperation(GraceParser.BinaryOperationContext binCtx) {
        Expression exp = new ExpressionVisitor().visit(binCtx);
        if (exp instanceof BinaryExpression) {
            Expression left = ((BinaryExpression) exp).getLeft();
            Expression right = ((BinaryExpression) exp).getRight();
            resolveVarRef(left);
            resolveVarRef(right);
        }
    }

    /**
     * Método auxiliar para tratar
     * instâncias de @VarReference
     *
     * @param exp
     */
    private void resolveVarRef(Expression exp) {
        VarReference refToResolve;
        if (exp instanceof VarReference) {
            refToResolve = ((VarReference) exp);
            Symbol var = currentScope.resolve(refToResolve.getVarName());
            if (var == null) {
                CheckSymbols.error(exp.getSymbol(), "no such variable: " + refToResolve.getVarName());
            }
        }
    }


}
