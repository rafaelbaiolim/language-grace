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

        return new StringType();
    }

    public Type visitBool(GraceParser.BoolContext boolCtx) {
        return new BooleanType();
    }

}
