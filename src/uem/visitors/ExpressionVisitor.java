package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.*;

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

    public Expression visitIncrementOperation(GraceParser.IncrementOperationContext ctx){
//        String op = ;
//        switch (op) {
//            case "+=":
//            case "++":
//                return new SumExpression(visit(ctx.left), visit(ctx.right));
//            case "-=":
//            case "--":
//                return new SubtractionExpression(visit(ctx.left), visit(ctx.right));
//        }
        throw new UnsupportedOperationException(ctx.getText());
    }



    public Expression visitLiteralReference(GraceParser.LiteralReferenceContext literalRefCtx) {
        GraceParser.LiteralContext literal = literalRefCtx.literal();
        return new LiteralVisitor().visit(literal);
    }

    public Expression visitVarReference(GraceParser.VarReferenceContext varRefCtx) {
        VarReference varRef = new VarReference(varRefCtx.ID().getText());
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

}
