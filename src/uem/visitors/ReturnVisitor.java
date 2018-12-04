package uem.visitors;

import org.antlr.symtab.FunctionSymbol;
import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.expr.Expression;
import uem.ast.stmt.Return;
import uem.ast.stmt.Statement;
import uem.listners.FrontEnd;
import uem.semantic.CheckSymbols;

import java.util.LinkedList;

public class ReturnVisitor extends GraceParserBaseVisitor<Statement> {
    public Statement visitCmReturn(GraceParser.CmReturnContext ctx) {
        LinkedList<Expression> exprL = new LinkedList<Expression>();
        ctx.cmdReturn().expression().forEach(expr -> {
            exprL.add(new ExpressionVisitor().visit(expr));
        });

        /**
         * Procura o primeiro escopo de função e verifica o tipo de retorno
         */
        FunctionSymbol funScope = FrontEnd.getFunctionWithin();
        if(funScope != null){
            if(funScope.isProcedure()){
                if(exprL.size() > 0){ // é procedure e ta retornando elementos
                    CheckSymbols.error(ctx.start,"error: Procedure should not return value(s).");
                }
            }
        }

        return new Return(exprL);
    }
}
