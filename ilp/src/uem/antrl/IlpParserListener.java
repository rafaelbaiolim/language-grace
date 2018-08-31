// Generated from IlpParser.g4 by ANTLR 4.5.3
package uem.antrl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IlpParser}.
 */
public interface IlpParserListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link IlpParser#lstTipo}.
	 * @param ctx the parse tree
	 */
	void enterLstTipo(IlpParser.LstTipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#lstTipo}.
	 * @param ctx the parse tree
	 */
	void exitLstTipo(IlpParser.LstTipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IlpParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(IlpParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(IlpParser.LiteralContext ctx);
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
}