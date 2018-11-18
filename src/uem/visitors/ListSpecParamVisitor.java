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
                Statement p = new SpecParamVisitor().visit(param);
                //TODO: NOME DE PARAM COMO ARR AINDA NÂO IMPLEMENTADO
                if (p != null) {
                    lstStmtSpecParam.add(p);
                }
            });

        });

        return lstStmtSpecParam;
    }


}
