package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.GraceFile;
import uem.ast.stmt.Statement;

import java.util.LinkedList;

public class GraceFileVisitor extends GraceParserBaseVisitor {

    public GraceFile visitGraceFile(GraceParser.GraceFileContext ctx) {
        LinkedList<Expression> linked = new LinkedList<>();
        ctx.line().forEach(el -> {
            Expression ast = (Expression) visit(el.statement());
            linked.add(ast);
        });
        return new GraceFile(null);
    }

    public Statement visitDeclVar(GraceParser.DeclVarContext declVarCtx) {
        GraceParser.ListSpecVarsContext listSpecVarsContext = declVarCtx.listSpecVars();
        ListSpecVarVisitor listExprVisit = new ListSpecVarVisitor();
        listExprVisit.visit(listSpecVarsContext);


        return null;
    }

    public Statement visitBinaryOperation(GraceParser.BinaryOperationContext exprCtx) {
        ExpressionVisitor loaderExpr = new ExpressionVisitor();
        Expression ex = loaderExpr.visit(exprCtx);
        System.out.println(ex);
        return null;
    }


}
