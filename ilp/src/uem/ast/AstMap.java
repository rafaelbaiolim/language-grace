package uem.ast;

import org.antlr.v4.runtime.Token;
import uem.antlr.IlpParser.*;
import uem.ast.expr.*;
import uem.ast.stmt.*;
import uem.ast.type.BooleanType;
import uem.ast.type.NumberType;
import uem.ast.type.StringType;
import uem.ast.type.Type;

import java.util.LinkedList;

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
        LinkedList<Statement> linked = new LinkedList<>();
        ilpFileCtx.line().forEach(el -> {
            Statement ast = this.getAst(
                    el.statement(),
                    new Position(
                            this.getStartPoint(el.getStart()),
                            this.getEndPoint(el.getStop())
                    )
            );
            linked.add(ast);
        });
        return new IlpFile(linked);
    }

    public final Expression getAst(DeclVarStatementContext declVarStmtCtx, Position pos) {
        declVarStmtCtx.getClass().getCanonicalName();
        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }

    /**
     * specVarSimple
     *
     * @param specVarSimple
     * @return
     */
    public final Statement getAst(SpecVarSimpleContext specVarSimple) {
        return new SpecVar(specVarSimple.ID().getText());
    }

    /**
     * specVarSimpleIni
     *
     * @param specVarSimpleIni
     * @return
     */
    public final Statement getAst(SpecVarSimpleIniContext specVarSimpleIni) {
        return new SpecVar(specVarSimpleIni.ID().getText(),
                this.getAst(specVarSimpleIni.expression()));
    }

    /**
     * @param listspec
     * @return
     */
    public final Statement getAst(SpecVarContext listspec) {
        String canonicalListDecl = listspec.getClass().getCanonicalName();

        if (canonicalListDecl.equals(DirectSpecVarContext.class.getCanonicalName())) {
            return this.getAst(((DirectSpecVarContext) listspec).specVarSimple());
        }

        if (canonicalListDecl.equals(DirectSpecVarSimpleIniContext.class.getCanonicalName())) {
            return this.getAst(((DirectSpecVarSimpleIniContext) listspec).specVarSimpleIni());
        }
        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }

    /**
     * Map Decl Var List
     *
     * @param listspec
     * @return
     */
    public final LinkedList getAst(ListSpecVarsContext listspec) {
        String canonicalListDecl = listspec.getClass().getCanonicalName();

        if (canonicalListDecl.equals(ListSpecVarsContext.class.getCanonicalName())) {
            LinkedList<Statement> lstStmtSpecVar = new LinkedList<>();
            listspec.specVar().forEach(specVar -> {
                lstStmtSpecVar.add(this.getAst(specVar));
            });
            return lstStmtSpecVar;
        }

        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }


    public final Statement getAst(StatementContext ctxStmt, Position pos) {
        String canonicalStmt = ctxStmt.getClass().getCanonicalName();

        //DeclVar
        if (canonicalStmt.equals(DeclVarStatementContext.class.getCanonicalName())) {
            DeclVarContext declVarContext = ((DeclVarStatementContext) ctxStmt).declVar();
            ListSpecVarsContext listSpecVarsContext = declVarContext.listSpecVars();

            //list,type
            return new DeclVar(
                    this.getAst(listSpecVarsContext),
                    this.getAst(declVarContext.lstType()));
        }


        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }

    /**
     * Map types
     * @TODO.: Verificar atribuição de tipos em particular para bool
     * @param typeCtx
     * @return
     */
    public final Type getAst(LstTypeContext typeCtx) {
        String canonicalType = typeCtx.getClass().getCanonicalName();
        if (
                canonicalType.equals(IntLiteralContext.class.getCanonicalName()) ||
                        canonicalType.equals(IntegerContext.class.getCanonicalName())
        ) {
            return new NumberType();
        }

        if (canonicalType.equals(StringLiteralContext.class.getCanonicalName()) ||
                canonicalType.equals(StringContext.class.getCanonicalName())
        ) {
            return new StringType();
        }

        if (canonicalType.equals(TrueLiteralContext.class.getCanonicalName()) ||
                canonicalType.equals(FalseLiteralContext.class.getCanonicalName()) ||
                canonicalType.equals(BoolContext.class.getCanonicalName())
        ) {
            return new BooleanType();
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

        //VarReference
        if (canonicalExprCtx.equals(VarReferenceContext.class.getCanonicalName())) {
            VarReferenceContext asVarRefCtx = (VarReferenceContext) exprCtx;
            return new VarReference(asVarRefCtx.ID().getText());
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
            return new SumExpression(
                    this.getAst(binExprCtx.left),
                    this.getAst(binExprCtx.right)
            );
        }
        if (operator.equals("-")) {
            return new SubtractionExpression(
                    this.getAst(binExprCtx.left),
                    this.getAst(binExprCtx.right)
            );
        }
        if (operator.equals("*")) {
            return new MultiplicationExpression(
                    this.getAst(binExprCtx.left),
                    this.getAst(binExprCtx.right)
            );
        }
        if (operator.equals("/")) {
            return new DivisionExpression(
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

        if (canonicalLiteralCtx.equals(BoolLiteral.class.getCanonicalName()) ||
                canonicalLiteralCtx.equals(TrueLiteralContext.class.getCanonicalName()) ||
                canonicalLiteralCtx.equals(FalseLiteralContext.class.getCanonicalName())
        ) {
            return new BoolLiteral(literal.getText());
        }

        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }


}
