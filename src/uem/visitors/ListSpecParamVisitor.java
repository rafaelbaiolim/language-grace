package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.VarStatement;
import uem.ast.stmt.SpecParam;
import uem.ast.stmt.SpecParamArr;
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
                    VarStatement parametro;
                    if (p instanceof SpecParam) {
                        parametro = (SpecParam) p;
                    } else {
                        parametro = (SpecParamArr) p;
                    }
                    parametro.setType(type);

                    if (parametro != null) {
                        lstStmtSpecParam.add(parametro);
                    }
                });
            });
        }
        return lstStmtSpecParam;
    }


}
