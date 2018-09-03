// Generated from IlpParser.g4 by ANTLR 4.5.3
package uem.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IlpParser}.
 */
public interface IlpParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IlpParser#ilpFile}.
	 * @param ctx the parse tree
	 */
	void enterIlpFile(IlpParser.IlpFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#ilpFile}.
	 * @param ctx the parse tree
	 */
	void exitIlpFile(IlpParser.IlpFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(IlpParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(IlpParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(IlpParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(IlpParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#cmdSimple}.
	 * @param ctx the parse tree
	 */
	void enterCmdSimple(IlpParser.CmdSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#cmdSimple}.
	 * @param ctx the parse tree
	 */
	void exitCmdSimple(IlpParser.CmdSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtrib(IlpParser.CmdAtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtrib(IlpParser.CmdAtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(IlpParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(IlpParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(IlpParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(IlpParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(IlpParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(IlpParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(IlpParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(IlpParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(IlpParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(IlpParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(IlpParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(IlpParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#forItera}.
	 * @param ctx the parse tree
	 */
	void enterForItera(IlpParser.ForIteraContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#forItera}.
	 * @param ctx the parse tree
	 */
	void exitForItera(IlpParser.ForIteraContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#cmdFor}.
	 * @param ctx the parse tree
	 */
	void enterCmdFor(IlpParser.CmdForContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#cmdFor}.
	 * @param ctx the parse tree
	 */
	void exitCmdFor(IlpParser.CmdForContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#cmdStop}.
	 * @param ctx the parse tree
	 */
	void enterCmdStop(IlpParser.CmdStopContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#cmdStop}.
	 * @param ctx the parse tree
	 */
	void exitCmdStop(IlpParser.CmdStopContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#cmdSkip}.
	 * @param ctx the parse tree
	 */
	void enterCmdSkip(IlpParser.CmdSkipContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#cmdSkip}.
	 * @param ctx the parse tree
	 */
	void exitCmdSkip(IlpParser.CmdSkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#cmdReturn}.
	 * @param ctx the parse tree
	 */
	void enterCmdReturn(IlpParser.CmdReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#cmdReturn}.
	 * @param ctx the parse tree
	 */
	void exitCmdReturn(IlpParser.CmdReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#cmdCallProc}.
	 * @param ctx the parse tree
	 */
	void enterCmdCallProc(IlpParser.CmdCallProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#cmdCallProc}.
	 * @param ctx the parse tree
	 */
	void exitCmdCallProc(IlpParser.CmdCallProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#lstOP}.
	 * @param ctx the parse tree
	 */
	void enterLstOP(IlpParser.LstOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#lstOP}.
	 * @param ctx the parse tree
	 */
	void exitLstOP(IlpParser.LstOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link IlpParser#lstType}.
	 * @param ctx the parse tree
	 */
	void enterInteger(IlpParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link IlpParser#lstType}.
	 * @param ctx the parse tree
	 */
	void exitInteger(IlpParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link IlpParser#lstType}.
	 * @param ctx the parse tree
	 */
	void enterString(IlpParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link IlpParser#lstType}.
	 * @param ctx the parse tree
	 */
	void exitString(IlpParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link IlpParser#lstType}.
	 * @param ctx the parse tree
	 */
	void enterBool(IlpParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link IlpParser#lstType}.
	 * @param ctx the parse tree
	 */
	void exitBool(IlpParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link IlpParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(IlpParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link IlpParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(IlpParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link IlpParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(IlpParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link IlpParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(IlpParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueLiteral}
	 * labeled alternative in {@link IlpParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteral(IlpParser.TrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueLiteral}
	 * labeled alternative in {@link IlpParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteral(IlpParser.TrueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseLiteral}
	 * labeled alternative in {@link IlpParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteral(IlpParser.FalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseLiteral}
	 * labeled alternative in {@link IlpParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteral(IlpParser.FalseLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#specVarSimple}.
	 * @param ctx the parse tree
	 */
	void enterSpecVarSimple(IlpParser.SpecVarSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#specVarSimple}.
	 * @param ctx the parse tree
	 */
	void exitSpecVarSimple(IlpParser.SpecVarSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#specVarSimpleIni}.
	 * @param ctx the parse tree
	 */
	void enterSpecVarSimpleIni(IlpParser.SpecVarSimpleIniContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#specVarSimpleIni}.
	 * @param ctx the parse tree
	 */
	void exitSpecVarSimpleIni(IlpParser.SpecVarSimpleIniContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#specVarArr}.
	 * @param ctx the parse tree
	 */
	void enterSpecVarArr(IlpParser.SpecVarArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#specVarArr}.
	 * @param ctx the parse tree
	 */
	void exitSpecVarArr(IlpParser.SpecVarArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#lstArrIni}.
	 * @param ctx the parse tree
	 */
	void enterLstArrIni(IlpParser.LstArrIniContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#lstArrIni}.
	 * @param ctx the parse tree
	 */
	void exitLstArrIni(IlpParser.LstArrIniContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#specVarArrIni}.
	 * @param ctx the parse tree
	 */
	void enterSpecVarArrIni(IlpParser.SpecVarArrIniContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#specVarArrIni}.
	 * @param ctx the parse tree
	 */
	void exitSpecVarArrIni(IlpParser.SpecVarArrIniContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#specVar}.
	 * @param ctx the parse tree
	 */
	void enterSpecVar(IlpParser.SpecVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#specVar}.
	 * @param ctx the parse tree
	 */
	void exitSpecVar(IlpParser.SpecVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#listSpecVars}.
	 * @param ctx the parse tree
	 */
	void enterListSpecVars(IlpParser.ListSpecVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#listSpecVars}.
	 * @param ctx the parse tree
	 */
	void exitListSpecVars(IlpParser.ListSpecVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#declVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclVar(IlpParser.DeclVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#declVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclVar(IlpParser.DeclVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(IlpParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(IlpParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(IlpParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(IlpParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(IlpParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(IlpParser.VariableContext ctx);
}