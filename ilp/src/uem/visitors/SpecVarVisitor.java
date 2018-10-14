package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.SpecVar;
import uem.ast.stmt.Statement;

public class SpecVarVisitor extends GraceParserBaseVisitor<Statement> {


    public Statement visit(GraceParser.DirectSpecVarContext listSpecVarsCtxt) {
        return null;
    }

    public Statement visit(GraceParser.DirectSpecVarSimpleIniContext directSpecVarSimpleIniContext) {
        GraceParser.SpecVarSimpleIniContext specVarSimpleIni = directSpecVarSimpleIniContext.specVarSimpleIni();
        return new SpecVar(specVarSimpleIni.ID().getText(),
                new ExpressionVisitor().visit(specVarSimpleIni.expression())
        );

    }

    public Statement visit(GraceParser.DirectSpecVarArrContext listSpecVarsCtxt) {
        return null;
    }

    public Statement visit(GraceParser.DirectSpecVarArrIniContext listSpecVarsCtxt) {
        return null;
    }


}
