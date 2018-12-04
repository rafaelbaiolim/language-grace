package uem.visitors;

import org.antlr.symtab.ArrayType;
import org.antlr.symtab.VariableSymbol;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.VarStatement;
import uem.ast.stmt.*;
import uem.ast.type.Type;
import uem.listners.FrontEnd;
import uem.semantic.CheckSymbols;

import java.util.List;

public class DeclVarVisitor extends GraceParserBaseVisitor<DeclVar> {

    public DeclVar visitDeclVar(GraceParser.DeclVarContext ctx) {

        GraceParser.ListSpecVarsContext listSpecVarsContext = ctx.listSpecVars();
        //lista de vars
        List<Statement> lst = new ListSpecVarVisitor().visit(listSpecVarsContext);

        //tipo
        Type type = new ListTypeVisitor().visit(ctx.lstType());
        for (Statement stmt : lst) {
            VariableSymbol v = new VariableSymbol(stmt.getVarName());
            this.setTypeCurrentStmt(stmt, type, v);
        }
        DeclVar declVar = new DeclVar(lst, type);
        return declVar;
    }


    private void setTypeCurrentStmt(Statement stmt,
                                    Type type, VariableSymbol v) {
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
            currentStmt = (SpecVarArr) stmt;
            ArrayType arrType = new ArrayType(type,
                    ((SpecVarArr) currentStmt).getLength());
            v.setType(arrType);
        }
        
        try {
            FrontEnd.currentScope.define(v);
        } catch (java.lang.IllegalArgumentException ex) {
            CheckSymbols.error(currentStmt.getSymbol(), "duplicate symbol `x`");
        }

        currentStmt.getLLVMValue(type);
    }

}
