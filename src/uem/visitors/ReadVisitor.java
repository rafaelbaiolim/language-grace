package uem.visitors;

import uem.antlr.GraceParser;
import uem.antlr.GraceParserBaseVisitor;
import uem.ast.stmt.cmd.ReadCmd;
import uem.ast.expr.VarReference;

public class ReadVisitor extends GraceParserBaseVisitor<ReadCmd> {

    public ReadCmd visitCmdRead(GraceParser.CmdReadContext ctx) {
        ReadCmd ReadCmd = new ReadCmd(new VarReference(ctx.variable().getText()));
        return ReadCmd;
    }

}