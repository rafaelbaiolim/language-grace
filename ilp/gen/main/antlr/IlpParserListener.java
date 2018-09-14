// Generated from /home/rafaellb/Documents/uem/ilp2018/compilador/ilp/src/main/antlr/IlpParser.g4 by ANTLR 4.7
package main.antlr;
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
	 * Enter a parse tree produced by the {@code declVarStatement}
	 * labeled alternative in {@link IlpParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclVarStatement(IlpParser.DeclVarStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declVarStatement}
	 * labeled alternative in {@link IlpParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclVarStatement(IlpParser.DeclVarStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link IlpParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(IlpParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link IlpParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(IlpParser.AssignmentStatementContext ctx);
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
	 * Enter a parse tree produced by the {@code incrementOperation}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIncrementOperation(IlpParser.IncrementOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrementOperation}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIncrementOperation(IlpParser.IncrementOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(IlpParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(IlpParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code differenceExpression}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDifferenceExpression(IlpParser.DifferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code differenceExpression}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDifferenceExpression(IlpParser.DifferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryOperation}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryOperation(IlpParser.TernaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryOperation}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryOperation(IlpParser.TernaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalReference}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralReference(IlpParser.LiteralReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalReference}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralReference(IlpParser.LiteralReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareOperation}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareOperation(IlpParser.CompareOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareOperation}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareOperation(IlpParser.CompareOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(IlpParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(IlpParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(IlpParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(IlpParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varReference}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarReference(IlpParser.VarReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varReference}
	 * labeled alternative in {@link IlpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarReference(IlpParser.VarReferenceContext ctx);
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
	/**
	 * Enter a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link IlpParser#specVarSimple}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(IlpParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link IlpParser#specVarSimple}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(IlpParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directAssign}
	 * labeled alternative in {@link IlpParser#specVarSimple}.
	 * @param ctx the parse tree
	 */
	void enterDirectAssign(IlpParser.DirectAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directAssign}
	 * labeled alternative in {@link IlpParser#specVarSimple}.
	 * @param ctx the parse tree
	 */
	void exitDirectAssign(IlpParser.DirectAssignContext ctx);
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
	 * Enter a parse tree produced by the {@code directSpecVar}
	 * labeled alternative in {@link IlpParser#specVar}.
	 * @param ctx the parse tree
	 */
	void enterDirectSpecVar(IlpParser.DirectSpecVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directSpecVar}
	 * labeled alternative in {@link IlpParser#specVar}.
	 * @param ctx the parse tree
	 */
	void exitDirectSpecVar(IlpParser.DirectSpecVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directSpecVarSimpleIni}
	 * labeled alternative in {@link IlpParser#specVar}.
	 * @param ctx the parse tree
	 */
	void enterDirectSpecVarSimpleIni(IlpParser.DirectSpecVarSimpleIniContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directSpecVarSimpleIni}
	 * labeled alternative in {@link IlpParser#specVar}.
	 * @param ctx the parse tree
	 */
	void exitDirectSpecVarSimpleIni(IlpParser.DirectSpecVarSimpleIniContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directSpecVarArr}
	 * labeled alternative in {@link IlpParser#specVar}.
	 * @param ctx the parse tree
	 */
	void enterDirectSpecVarArr(IlpParser.DirectSpecVarArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directSpecVarArr}
	 * labeled alternative in {@link IlpParser#specVar}.
	 * @param ctx the parse tree
	 */
	void exitDirectSpecVarArr(IlpParser.DirectSpecVarArrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directSpecVarArrIni}
	 * labeled alternative in {@link IlpParser#specVar}.
	 * @param ctx the parse tree
	 */
	void enterDirectSpecVarArrIni(IlpParser.DirectSpecVarArrIniContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directSpecVarArrIni}
	 * labeled alternative in {@link IlpParser#specVar}.
	 * @param ctx the parse tree
	 */
	void exitDirectSpecVarArrIni(IlpParser.DirectSpecVarArrIniContext ctx);
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
}