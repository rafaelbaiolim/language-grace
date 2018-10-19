package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.BoolLiteral;
import uem.ast.expr.Expression;
import uem.ast.expr.NumberLiteral;
import uem.ast.expr.StringLiteral;

public class LiteralVisitor extends GraceParserBaseVisitor<Expression> {
    public Expression visitIntLiteral(GraceParser.IntLiteralContext intLitCtx) {
        return new NumberLiteral(intLitCtx.getText());
    }

    public Expression visitStringLiteral(GraceParser.StringLiteralContext stringLitCtx) {
        return new StringLiteral(stringLitCtx.getText());
    }

    public Expression visitTrueLiteral(GraceParser.TrueLiteralContext boolCtx) {
        return new BoolLiteral(boolCtx.getText());
    }

    public Expression visitFalseLiteral(GraceParser.FalseLiteralContext boolCtx) {
        return new BoolLiteral(boolCtx.getText());
    }


}
