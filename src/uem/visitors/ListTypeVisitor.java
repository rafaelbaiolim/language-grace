package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.type.BooleanType;
import uem.ast.type.IntegerType;
import uem.ast.type.StringType;
import uem.ast.type.Type;

public class ListTypeVisitor extends GraceParserBaseVisitor<Type> {

    public Type visitInteger(GraceParser.IntegerContext intCtx) {

        return new IntegerType();
    }

    public Type visitString(GraceParser.StringContext stringCtx) {
        String currentLit = stringCtx.stringLit().getClass().getSimpleName();
        StringType stringType = new StringType();

        if (currentLit.equals(GraceParser.InitArrAlocContext.class.getSimpleName())) {
            GraceParser.InitArrAlocContext arrStrCtx = ((GraceParser.InitArrAlocContext) stringCtx.stringLit());
            int currentSize = Integer.parseInt(arrStrCtx.NUMBERLITERAL().get(0).getText());
            stringType.setSize(currentSize);
        }

        return stringType;
    }

    public Type visitBool(GraceParser.BoolContext boolCtx) {
        return new BooleanType();
    }

}
