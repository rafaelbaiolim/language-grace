package uem.ast;

import org.antlr.v4.runtime.Token;
import uem.antlr.IlpParser.*;
import uem.ast.expr.*;
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


    public IlpFile getAst(IlpFileContext ilpFileCtx) {
        ilpFileCtx.line().forEach(el -> {
            Expression ast = this.getAst(
                    el.statement(),
                    new Position(
                            this.getStartPoint(el.getStart()),
                            this.getEndPoint(el.getStop())
                    )
            );
        });
        return null;
    }

    public final Expression getAst(DeclVarStatementContext declVarStmtCtx,Position pos) {
        declVarStmtCtx.getClass().getCanonicalName();
        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }

        /**
         * @Todo.: Tratar os outros tipos de assign aqui
         * @param specVarSimple
         * @return
         */
    public final Expression getAst(SpecVarSimpleContext specVarSimple) {
        DirectAssignContext specVarSimple1 = (DirectAssignContext) specVarSimple;
        return this.getAst(((DirectAssignContext) specVarSimple).expression());

//        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }

    public final Expression getAst(SpecVarContext listspec) {
        String canonicalListDecl = listspec.getClass().getCanonicalName();
        if (canonicalListDecl.equals(DirectSpecVarContext.class.getCanonicalName())) {
            return this.getAst(((DirectSpecVarContext) listspec).specVarSimple());
        }
        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }

    /**
     * Map Decl Var List
     *
     * @param listspec
     * @return
     */
    public final Expression getAst(ListSpecVarsContext listspec) {
        String canonicalListDecl = listspec.getClass().getCanonicalName();

        if (canonicalListDecl.equals(DirectListSpecVarContext.class.getCanonicalName())) {
            DirectListSpecVarContext directList = (DirectListSpecVarContext) listspec;
            String directListCanonicalName = directList.specVar().getClass().getCanonicalName();

            if (directListCanonicalName.equals(DirectSpecVarContext.class.getCanonicalName())) {
                return this.getAst(directList.specVar());
            }
        }
        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }


    public final Expression getAst(StatementContext ctxStmt, Position pos) {
        String canonicalStmt = ctxStmt.getClass().getCanonicalName();
        //DeclVar
        if (canonicalStmt.equals(DeclVarStatementContext.class.getCanonicalName())) {
            ListSpecVarsContext listSpecVarsContext = ((DeclVarStatementContext) ctxStmt).declVar().listSpecVars();
            return this.getAst(listSpecVarsContext);

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
                    this.getAst(binExprCtx.left),
                    this.getAst(binExprCtx.right)
            );
        }
        if (operator.equals("-")) {
            return (Expression) new SubtractionExpression(
                    this.getAst(binExprCtx.left),
                    this.getAst(binExprCtx.right)
            );
        }
        if (operator.equals("*")) {
            return (Expression) new MultiplicationExpression(
                    this.getAst(binExprCtx.left),
                    this.getAst(binExprCtx.right)
            );
        }
        if (operator.equals("/")) {
            return (Expression) new DivisionExpression(
                    this.getAst(binExprCtx.left),
                    this.getAst(binExprCtx.right)
            );
        }

        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }

    public final Expression getAst(LiteralReferenceContext literalCtx) {
        LiteralContext literal = literalCtx.literal();
        String canonicalLiteralCtx = literal.getClass().getCanonicalName();

        if (canonicalLiteralCtx.equals(IntLiteralContext.class.getCanonicalName())) {
            return new NumberLiteral(literal.getText());
        }
        if (canonicalLiteralCtx.equals(StringLiteralContext.class.getCanonicalName())) {
            return new StringLiteral(literal.getText());
        }

        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }


}
