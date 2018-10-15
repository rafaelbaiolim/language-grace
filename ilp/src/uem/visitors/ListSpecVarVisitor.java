package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;

import java.util.LinkedList;
import java.util.List;

public class ListSpecVarVisitor extends GraceParserBaseVisitor<List<Statement>> {

    public LinkedList<Statement> visitListSpecVars(GraceParser.ListSpecVarsContext listSpecVarsCtx) {
        LinkedList<Statement> lstStmtSpecVar = new LinkedList<>();

        listSpecVarsCtx.specVar().forEach(specVar -> {
            lstStmtSpecVar.add(new SpecVarVisitor().visit(specVar));
        });
        return lstStmtSpecVar;
    }


}
