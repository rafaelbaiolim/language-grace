package uem.ast;

import org.antlr.v4.runtime.Token;
import uem.antlr.IlpParser;
import uem.ast.type.Type;

public class AstMap {

    public final Point getEndPoint(Token token) {
        return new Point(token.getLine(), token.getCharPositionInLine() + token.getText().length());
    }

    public final Point getStartPoint(Token token) {
        return new Point(token.getLine(), token.getCharPositionInLine());
    }

    public final Type getAst(IlpParser.LstTypeContext typeCtx, boolean pos) {
        switch (typeCtx.getClass().getCanonicalName()) {
            default:
                return null;
        }
    }


}
