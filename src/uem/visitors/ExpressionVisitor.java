package uem.visitors;

import org.antlr.symtab.Symbol;
import org.antlr.symtab.VariableSymbol;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.*;
import uem.ast.stmt.Statement;
import uem.listners.FrontEnd;
import uem.semantic.CheckSymbols;

import java.util.LinkedList;

public class ExpressionVisitor extends GraceParserBaseVisitor<Expression> {

    public Expression visitCompareOperation(GraceParser.CompareOperationContext ctx) {
        return new CompareExpression(
                visit(ctx.right),
                visit(ctx.left),
                ctx.operator.getText()
        );
    }

    public Expression visitBinaryOperation(GraceParser.BinaryOperationContext ctx) {
        String op = ctx.operator.getText();
        switch (op) {
            case "+":
                return new SumExpression(visit(ctx.left), visit(ctx.right));
            case "-":
                return new SubtractionExpression(visit(ctx.left), visit(ctx.right));
            case "*":
                return new MultiplicationExpression(visit(ctx.left), visit(ctx.right));
            case "/":
                return new DivisionExpression(visit(ctx.left), visit(ctx.right));
            case "%":
                return new ModExpression(visit(ctx.left), visit(ctx.right));
        }
        throw new UnsupportedOperationException(ctx.getText());
    }


    public Expression visitLiteralReference(GraceParser.LiteralReferenceContext literalRefCtx) {
        GraceParser.LiteralContext literal = literalRefCtx.literal();
        return new LiteralVisitor().visit(literal);
    }

    /**
     * Aqui ocorre o caso em que pode ser tanto uma variável como
     * um arranjo.: ex.: var a = 10:int; f(a) || var a[10]:int; f(a)
     *
     * @param varRefCtx
     * @return
     */
    public Expression visitVarReference(GraceParser.VarReferenceContext varRefCtx) {
        String varName = varRefCtx.ID().getText();
        Symbol sym = null;
        try {
            sym = FrontEnd.currentScope.resolve(varName).getScope().getSymbol(varName);
            VariableSymbol varSym = (VariableSymbol) sym;
            if (varSym.getType().getName().toLowerCase().contains("[]")) {
                VarArrReference arrRef = new VarArrReference(varName);
                arrRef.setSymbol(varRefCtx.ID().getSymbol());
                return arrRef;
            }
        } catch (Exception ex) {
            if(sym == null) {
                CheckSymbols.error(varRefCtx.ID().getSymbol(), "error: use of undeclared identifier: `" + varRefCtx.getText() + "´.");
            }
        }

        VarReference varRef = new VarReference(varName);
        varRef.setSymbol(varRefCtx.ID().getSymbol());
        return varRef;


    }

    public Expression visitSimpleVar(GraceParser.SimpleVarContext varRefCtx) {
        Variable varRef = new Variable(varRefCtx.ID().getText());
        varRef.setSymbol(varRefCtx.ID().getSymbol());
        return varRef;
    }

    public Expression visitArrVar(GraceParser.ArrVarContext varRefCtx) {
        VariableArr varArrRef = new VariableArr(
                varRefCtx.ID().getText(),
                new ExpressionVisitor().visit(varRefCtx.expression().get(0))
        );
        varArrRef.setSymbol(varRefCtx.ID().getSymbol());
        return varArrRef;
    }

    public Expression visitArrReference(GraceParser.ArrReferenceContext varArrRefCtx) {
        VarArrReference arrRef = new VarArrReference(
                varArrRefCtx.ID().getText(),
                new ExpressionVisitor().visit(varArrRefCtx.expression())
        );
        arrRef.setSymbol(varArrRefCtx.ID().getSymbol());
        return arrRef;
    }

    public Expression visitSubReference(GraceParser.SubReferenceContext ctx) {
        LinkedList<Expression> exprL = new LinkedList<>();
        ctx.expression().forEach(expr -> {
            exprL.add(new ExpressionVisitor().visit(expr));
        });
        return new SubReference(ctx.ID().getText(), exprL);
    }

    public Expression visitParenExpression(GraceParser.ParenExpressionContext ctx) {
        LinkedList<Expression> exprL = new LinkedList<>();
        ctx.expression().forEach(expr -> {
            exprL.add(new ExpressionVisitor().visit(expr));
        });
        return exprL.get(0);
    }

    public Expression visitTernaryOperation(GraceParser.TernaryOperationContext ctx) {
        return new CondicionalVisitor().visit(ctx);
    }

}
