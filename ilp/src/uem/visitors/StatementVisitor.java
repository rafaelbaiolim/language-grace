package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.DeclVar;
import uem.ast.stmt.Statement;

public class StatementVisitor extends GraceParserBaseVisitor<Statement> {
    public Statement visitDeclVar(GraceParser.DeclVarContext declVarCtx) {
        GraceParser.ListSpecVarsContext listSpecVarsContext = declVarCtx.listSpecVars();
        GraceParser.LstTypeContext listTypeCtx = declVarCtx.lstType();

        ListSpecVarVisitor listExprVisit = new ListSpecVarVisitor();
        ListTypeVisitor listTypeVisitor = new ListTypeVisitor();

        return new DeclVar(
                listExprVisit.visit(listSpecVarsContext),
                listTypeVisitor.visit(listTypeCtx)
        );

    }
}
