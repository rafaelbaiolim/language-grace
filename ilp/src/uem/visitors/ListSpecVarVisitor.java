package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;

import java.util.LinkedList;

public class ListSpecVarVisitor extends GraceParserBaseVisitor<LinkedList> {

    public LinkedList<Statement> visitListSpecVars(GraceParser.ListSpecVarsContext listSpecVarsCtxt) {
        LinkedList<Statement> lstStmtSpecVar = new LinkedList<>();
        listSpecVarsCtxt.specVar().forEach(specVar -> {
            lstStmtSpecVar.add(new SpecVarVisitor().visit(specVar));
        });
        return lstStmtSpecVar;
    }


}
