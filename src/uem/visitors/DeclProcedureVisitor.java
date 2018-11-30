package uem.visitors;

import org.antlr.symtab.ParameterSymbol;
import uem.IR.LLVMEmitter;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.Statement;
import uem.ast.stmt.sub.DeclProcedure;

import java.util.LinkedList;

import static org.bytedeco.javacpp.LLVM.*;

public class DeclProcedureVisitor extends GraceParserBaseVisitor<DeclProcedure> {

    public DeclProcedure visitDecProc(GraceParser.DecProcContext ctx) {
        //Declaração da função
        DeclProcedure declProcedure = new DeclProcedure(
                ctx.ID().getText());

        //tipo
        LinkedList<Statement> params = new ListSpecParamVisitor().visitLstParam(ctx.lstParam());

        //define parametros para o escopo
        params.forEach(param -> {
            ParameterSymbol p = new ParameterSymbol(param.getVarName());
            ctx.scope.define(p);
        });
        declProcedure.setParams(params);

        //stmt
        declProcedure.getLLVMValue();

        declProcedure.setBody(new BlockVisitor().visit(ctx.block()));

        //TODO: Verificar se vai ser possível validar no semantico
        LLVMBuildRetVoid(LLVMEmitter.getInstance().builder);

        return declProcedure;
    }


}
