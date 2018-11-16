package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;

import java.util.LinkedList;
import java.util.List;

public class ListSpecParamVisitor extends GraceParserBaseVisitor<List<Statement>> {

    public LinkedList<Statement> visitLstParam(GraceParser.LstParamContext listSpecParamsCtx) {
        LinkedList<Statement> lstStmtSpecParam = new LinkedList<>();
        listSpecParamsCtx.specParam().forEach(specParam -> {
            specParam.param().forEach(param -> {
                lstStmtSpecParam.add(new SpecParamVisitor().visit(param));
            });

        });

        return lstStmtSpecParam;
    }


}
