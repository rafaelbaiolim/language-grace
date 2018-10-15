package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.SpecVar;
import uem.ast.stmt.Statement;

public class SpecVarVisitor extends GraceParserBaseVisitor<Statement> {

    public Statement visitDirectSpecVarSimpleIni(GraceParser.DirectSpecVarSimpleIniContext directSpecVarSimpleIniContext) {
        GraceParser.SpecVarSimpleIniContext specVarSimpleIni = directSpecVarSimpleIniContext.specVarSimpleIni();
        return new SpecVar(specVarSimpleIni.ID().getText(),
                new ExpressionVisitor().visit(specVarSimpleIni.expression())
        );

    }


}
