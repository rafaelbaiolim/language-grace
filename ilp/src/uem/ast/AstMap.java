package uem.ast;

import org.antlr.v4.runtime.Token;
import uem.antlr.IlpParser;
import uem.antlr.IlpParser.IntLiteralContext;
import uem.ast.type.NumberType;
import uem.ast.type.Type;

public class AstMap {

    public final Point getEndPoint(Token token) {
        return new Point(token.getLine(), token.getCharPositionInLine() + token.getText().length());
    }

    public final Point getStartPoint(Token token) {
        return new Point(token.getLine(), token.getCharPositionInLine());
    }

    public final Type getAst(IlpParser.LstTypeContext typeCtx, boolean pos) {
        String canonicalType = typeCtx.getClass().getCanonicalName();
        if (canonicalType.equals(IntLiteralContext.class.getCanonicalName())) {
            return new NumberType();
        }

        throw new UnsupportedOperationException(this.getClass().getCanonicalName());
    }


}
