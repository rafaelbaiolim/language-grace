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
        }
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

    public Expression visitArrReference(GraceParser.ArrReferenceContext varArrRefCtx) {
        VarArrReference arrRef = new VarArrReference(
                varArrRefCtx.ID().getText(),
                varArrRefCtx.NUMBERLITERAL(0).getText()
        );
        arrRef.setSymbol(varArrRefCtx.ID().getSymbol());
        return arrRef;
    }

}
