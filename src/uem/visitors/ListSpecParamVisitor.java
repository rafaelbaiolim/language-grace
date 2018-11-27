package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.SpecParam;
import uem.ast.stmt.Statement;
import uem.ast.type.Type;

import java.util.LinkedList;
import java.util.List;

public class ListSpecParamVisitor extends GraceParserBaseVisitor<List<Statement>> {

    public LinkedList<Statement> visitLstParam(GraceParser.LstParamContext listSpecParamsCtx) {
        LinkedList<Statement> lstStmtSpecParam = new LinkedList<>();
        if (listSpecParamsCtx != null) {
            listSpecParamsCtx.specParam().forEach(specParam -> {
                Type type = new ListTypeVisitor().visit(specParam.lstType());
                specParam.param().forEach(param -> {
                    Statement p = new SpecParamVisitor().visit(param);
                    SpecParam parametro = (SpecParam) p;
                    parametro.setType(type);
                    //TODO: NOME DE PARAM COMO ARR AINDA NÂO IMPLEMENTADO
                    if (parametro != null) {
                        lstStmtSpecParam.add(parametro);
                    }
                });
            });
        }
        return lstStmtSpecParam;
    }


}
