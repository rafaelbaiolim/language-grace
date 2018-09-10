package uem.ast;

import org.antlr.v4.runtime.Token;
import uem.antlr.IlpParser;
import uem.antlr.IlpParser.IntLiteralContext;
import uem.ast.expr.Expression;
import uem.ast.expr.NumberLiteral;
import uem.ast.expr.SumExpression;
import uem.ast.stmt.IlpFile;
import uem.ast.stmt.Statement;
import uem.ast.type.NumberType;
import uem.ast.type.StringType;
import uem.ast.type.Type;

import static uem.antlr.IlpParser.*;

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


    public IlpFile getAst(IlpFileContext ilpFileCtx) {
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


    public final SpecVarContext getAst(SpecVarContext listspec, Position pos) {
        String canonicalListDecl = listspec.getClass().getCanonicalName();
        if (canonicalListDecl.equals(DirectSpecVarContext.class.getCanonicalName())) {

        }
        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }


    /**
     * Map Decl Var List
     *
     * @param listspec
     * @return
     */
    public final ListSpecVarsContext getAst(ListSpecVarsContext listspec) {
        String canonicalListDecl = listspec.getClass().getCanonicalName();

        if (canonicalListDecl.equals(DirectSpecVarContext.class.getCanonicalName())) {

        }
        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }


    public final Statement getAst(StatementContext ctxStmt, Position pos) {
        String canonicalStmt = ctxStmt.getClass().getCanonicalName();

        //DeclVar
        if (canonicalStmt.equals(DeclVarContext.class.getCanonicalName())) {

        }

        //Assign
        if (canonicalStmt.equals(AssignmentStatementContext.class.getCanonicalName())) {
            //   IlpParser.DeclVarContext dclVar = ((IlpParser.AssignmentStatementContext) ctxStmt).declVar();
//            return new DeclVar(
//                    dclVar.T_VAR().getText(), //token name value
//            );

            // IlpParser.ListSpecVarsContext lstSpec = dclVar.listSpecVars();
            //this.getAst(lstSpec);

        }

        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }

    /**
     * Map types
     *
     * @param typeCtx
     * @return
     */
    public final Type getAst(LstTypeContext typeCtx) {
        String canonicalType = typeCtx.getClass().getCanonicalName();
        System.out.println(canonicalType);
        if (canonicalType.equals(IntLiteralContext.class.getCanonicalName())) {
            return new NumberType();
        }

        if (canonicalType.equals(StringLiteralContext.class.getCanonicalName())) {
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
    public final Expression getAst(ExpressionContext exprCtx) {
        String canonicalExprCtx = exprCtx.getClass().getCanonicalName();

        //Block
        if (canonicalExprCtx.equals(ParenExpressionContext.class.getCanonicalName())) {
            return this.getAst(exprCtx);
        }

        //Binarios
        if (canonicalExprCtx.equals(BinaryOperationContext.class.getCanonicalName())) {
            return this.getAst((BinaryOperationContext) exprCtx);
        }

        //Literais
        if (canonicalExprCtx.equals(LiteralReferenceContext.class.getCanonicalName())) {
            return this.getAst((LiteralReferenceContext) exprCtx);
        }

        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }

    /**
     * Map expressions bin
     *
     * @param binExprCtx
     * @return
     */
    public final Expression getAst(BinaryOperationContext binExprCtx) {
        String operator = binExprCtx.operator.getText();

        if (operator.equals("+")) {
            return (Expression) new SumExpression(
                    this.getAst((ExpressionContext) binExprCtx.left),
                    this.getAst((ExpressionContext) binExprCtx.right)
            );
        }

        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }

    public final Expression getAst(LiteralReferenceContext literalCtx) {
        System.out.println(literalCtx.getText());
        System.exit(0);

        if (literalCtx.equals(ParenExpressionContext.class.getCanonicalName())) {
            return null;
        }

        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }


    // Leafs
    public final Expression getAst(NumberLiteral numberLiteral) {
        return numberLiteral;
    }


}
