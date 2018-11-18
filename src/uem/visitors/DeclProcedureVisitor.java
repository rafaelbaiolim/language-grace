package uem.visitors;

import org.antlr.symtab.ParameterSymbol;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;
import uem.ast.stmt.sub.DeclProcedure;

import java.util.LinkedList;

public class DeclProcedureVisitor extends GraceParserBaseVisitor<DeclProcedure> {

    public DeclProcedure visitDecProc(GraceParser.DecProcContext ctx) {
        //stmt
        DeclProcedure declProcedure = new DeclProcedure(
                ctx.ID().getText(),
                new BlockVisitor().visit(ctx.block()));
        LinkedList<Statement> params = new ListSpecParamVisitor().visitLstParam(ctx.lstParam());

        //define parametros para o escopo
        params.forEach(param -> {
            ParameterSymbol p = new ParameterSymbol(param.getVarName());
            ctx.scope.define(p);
        });
        declProcedure.setParams(new ListSpecParamVisitor().visitLstParam(ctx.lstParam()));
        declProcedure.setParams(params);
        return declProcedure;
    }


}
