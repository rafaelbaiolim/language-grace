package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.SpecVar;
import uem.ast.stmt.Statement;

public class SpecParamVisitor extends GraceParserBaseVisitor<Statement> {
    /**
     * Consideramos um Parametro como uma Variável
     *
     * @param ctxParam
     * @return
     */
    public Statement visitIdParam(GraceParser.IdParamContext ctxParam) {

        SpecVar spcVar = new SpecVar(ctxParam.ID().getText());
        spcVar.setSymbol(ctxParam.ID().getSymbol());
        return spcVar;
    }

    /**
     * Arr Param
     */


}
