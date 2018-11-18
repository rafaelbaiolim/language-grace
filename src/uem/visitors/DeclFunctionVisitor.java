package uem.visitors;

import org.antlr.symtab.ParameterSymbol;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;
import uem.ast.stmt.sub.DeclFunction;
import uem.ast.type.Type;

import java.util.LinkedList;

public class DeclFunctionVisitor extends GraceParserBaseVisitor<DeclFunction> {

    public DeclFunction visitDecFunc(GraceParser.DecFuncContext ctx) {

        //tipo
        Type type = new ListTypeVisitor().visit(ctx.lstType());

        //stmt
        DeclFunction declFunction = new DeclFunction(
                ctx.ID().getText(),
                new BlockVisitor().visit(ctx.block()));

        declFunction.setReturnType(type);
        LinkedList<Statement> params = new ListSpecParamVisitor().visitLstParam(ctx.lstParam());

        //define parametros para o escopo
        params.forEach(param -> {
            ParameterSymbol p = new ParameterSymbol(param.getVarName());
            ctx.scope.define(p);
        });
        declFunction.setParams(params);
        return declFunction;
    }


}
