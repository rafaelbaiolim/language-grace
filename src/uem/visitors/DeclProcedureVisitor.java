package uem.visitors;

import org.antlr.symtab.ParameterSymbol;
import uem.IR.LLVMEmitter;
import uem.IR.LLVMPresets;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.VarStatement;
import uem.ast.stmt.Statement;
import uem.ast.stmt.sub.DeclProcedure;
import uem.listners.FrontEnd;

import java.util.LinkedList;

import static org.bytedeco.javacpp.LLVM.LLVMBuildRetVoid;

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
            p.setType(((VarStatement) param).getType());
            FrontEnd.currentScope.define(p);
        });
        declProcedure.setParams(params);

        //stmt
        declProcedure.getLLVMValue();

        declProcedure.setBody(new BlockVisitor().visit(ctx.block()));

        //TODO: Verificar se vai ser possível validar no semantico
        LLVMBuildRetVoid(LLVMEmitter.getInstance().builder);
        LLVMEmitter.getInstance().popScope();               //sai do escopo da função
        LLVMPresets.getInstance().finalizeFunctionScope();  //volta para o bloco anterior
        return declProcedure;
    }


}
