// Generated from Ilp.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IlpParser}.
 */
public interface IlpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IlpParser#writeExpression}.
	 * @param ctx the parse tree
	 */
	void enterWriteExpression(IlpParser.WriteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IlpParser#writeExpression}.
	 * @param ctx the parse tree
	 */
	void exitWriteExpression(IlpParser.WriteExpressionContext ctx);
}