package uem.visitors;

import org.antlr.symtab.ArrayType;
import org.antlr.symtab.VariableSymbol;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.VarStatement;
import uem.ast.stmt.*;
import uem.ast.type.StringType;
import uem.ast.type.Type;
import uem.listners.FrontEnd;
import uem.semantic.CheckSymbols;

import java.util.List;

public class DeclVarVisitor extends GraceParserBaseVisitor<DeclVar> {
    protected List<Statement> lst;

    public DeclVar visitDeclVar(GraceParser.DeclVarContext ctx) {

        GraceParser.ListSpecVarsContext listSpecVarsContext = ctx.listSpecVars();
        //lista de vars
        this.lst = new ListSpecVarVisitor().visit(listSpecVarsContext);

        //tipo
        Type type = new ListTypeVisitor().visit(ctx.lstType());
        int i = 0;
        for (Statement stmt : this.lst) {
            VariableSymbol v = new VariableSymbol(stmt.getVarName());
            this.setTypeCurrentStmt(stmt, type, v, i);
            i++;
        }
        DeclVar declVar = new DeclVar(this.lst, type);
        return declVar;
    }


    private void setTypeCurrentStmt(Statement stmt,
                                    Type type, VariableSymbol v, int i) {
        VarStatement currentStmt;
        if (stmt instanceof SpecVar) {
            currentStmt = (SpecVar) stmt;
            v.setType(type);
        } else if (stmt instanceof SpecVarArrIni) {
            currentStmt = (SpecVarArrIni) stmt;
            ArrayType arrType = new ArrayType(type,
                    ((SpecVarArrIni) currentStmt).getLength());
            v.setType(arrType);
        } else {
            SpecVarArr arrStmt = (SpecVarArr) stmt;
            /**
             * Tratamento para atribuição de array de string
             */
            if (type instanceof StringType) {
                currentStmt = new SpecVar(arrStmt.getVarName());
                this.lst.set(i, currentStmt);
                ((StringType) type).setSize(arrStmt.getLength());
                v.setType(type);
            } else {
                currentStmt = arrStmt;
                ArrayType arrType = new ArrayType(type, arrStmt.getLength());
                v.setType(arrType);
            }
        }

        try {
            FrontEnd.currentScope.define(v);
        } catch (java.lang.IllegalArgumentException ex) {
            CheckSymbols.error(currentStmt.getSymbol(), "duplicate symbol `x`");
        }

        currentStmt.getLLVMValue(type);
    }

}
