package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.DeclVar;
import uem.ast.stmt.Statement;
import uem.ast.type.Type;

import java.util.List;

/**
 * Todo: Implementar e colocar em CMDVisitor
 */
public class CmSimpleVisitor extends GraceParserBaseVisitor<DeclVar> {

    public DeclVar visitDeclVar(GraceParser.DeclVarContext ctx) {
        return null;
    }


}
