package uem.ast;

import org.antlr.v4.runtime.Token;
import uem.antlr.IlpParser;
import uem.antlr.IlpParser.IntLiteralContext;
import uem.ast.expr.Expression;
import uem.ast.expr.NumberLiteral;
import uem.ast.expr.SumExpression;
import uem.ast.stmt.DeclVar;
import uem.ast.stmt.IlpFile;
import uem.ast.stmt.Statement;
import uem.ast.type.NumberType;
import uem.ast.type.StringType;
import uem.ast.type.Type;

public class AstMap {


    public final Point getEndPoint(Token token) {
        return new Point(token.getLine(),
                (token.getType() == Token.EOF ? 0 : token.getText().length())
        );
    }

    public final Point getStartPoint(Token token) {
        return new Point(token.getLine(),
                token.getCharPositionInLine());
    }


    public IlpFile getAst(IlpParser.IlpFileContext ilpFileCtx) {
        ilpFileCtx.line().forEach(el -> {
            this.getAst(
                    el.statement(),
                    new Position(
                            this.getStartPoint(el.getStart()),
                            this.getEndPoint(el.getStop())
                    )
            );
        });
        System.exit(1);
        return null;
    }

    public final IlpParser.ListSpecVarsContext getAst(IlpParser.ListSpecVarsContext listspec, Position pos) {

    }


    public final Statement getAst(IlpParser.StatementContext ctxStmt, Position pos) {
        String canonicalStmt = ctxStmt.getClass().getCanonicalName();
        if(canonicalStmt.equals(IlpParser.AssignmentStatementContext.class.getCanonicalName())){
            //((IlpParser.AssignmentStatementContext) ctxStmt).declVar().T_VAR().getText();
            ((IlpParser.AssignmentStatementContext) ctxStmt).declVar().listSpecVars();
        }

        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }

    /**
     * Map types
     *
     * @param typeCtx
     * @return
     */
    public final Type getAst(IlpParser.LstTypeContext typeCtx) {
        String canonicalType = typeCtx.getClass().getCanonicalName();
        System.out.println(canonicalType);
        if (canonicalType.equals(IntLiteralContext.class.getCanonicalName())) {
            return new NumberType();
        }

        if (canonicalType.equals(IlpParser.StringLiteralContext.class.getCanonicalName())) {
            return new StringType();
        }

        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }

    /**
     * Map expressions ctx
     *
     * @param exprCtx
     * @return
     */
    public final Expression getAst(IlpParser.ExpressionContext exprCtx) {
        String canonicalExprCtx = exprCtx.getClass().getCanonicalName();

        //Block
        if (canonicalExprCtx.equals(IlpParser.ParenExpressionContext.class.getCanonicalName())) {
            return this.getAst(exprCtx);
        }

        //Binarios
        if (canonicalExprCtx.equals(IlpParser.BinaryOperationContext.class.getCanonicalName())) {
            return this.getAst((IlpParser.BinaryOperationContext) exprCtx);
        }

        //Literais
        if (canonicalExprCtx.equals(IlpParser.LiteralReferenceContext.class.getCanonicalName())) {
            return this.getAst((IlpParser.LiteralReferenceContext) exprCtx);
        }

        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }

    /**
     * Map expressions bin
     *
     * @param binExprCtx
     * @return
     */
    public final Expression getAst(IlpParser.BinaryOperationContext binExprCtx) {
        String operator = binExprCtx.operator.getText();

        if (operator.equals("+")) {
            return (Expression) new SumExpression(
                    this.getAst((IlpParser.ExpressionContext) binExprCtx.left),
                    this.getAst((IlpParser.ExpressionContext) binExprCtx.right)
            );
        }

        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }

    public final Expression getAst(IlpParser.LiteralReferenceContext literalCtx) {
        System.out.println(literalCtx.getText());
        System.exit(0);

        if (literalCtx.equals(IlpParser.ParenExpressionContext.class.getCanonicalName())) {
            return null;
        }

        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }


    // Leafs
    public final Expression getAst(NumberLiteral numberLiteral) {
        return numberLiteral;
    }


}
