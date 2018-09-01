// Generated from IlpParser.g4 by ANTLR 4.5.3
package uem.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IlpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_ELSE=1, T_FALSE=2, T_TRUE=3, T_BOOL=4, T_FOR=5, T_IF=6, T_INT=7, T_READ=8, 
		T_RETURN=9, T_SKIP=10, T_STOP=11, T_STRING=12, T_VAR=13, T_WHILE=14, T_WRITE=15, 
		T_LEFT_PAREN=16, T_RIGHT_PAREN=17, T_LEFT_SQUARE=18, T_RIGHT_SQUARE=19, 
		T_LEFT_CURLY_BRACE=20, T_RIGHT_CURLY_BRACE=21, T_COMMA=22, T_SEMICOLON=23, 
		T_COLON=24, T_PLUS=25, T_MINUS=26, T_ASTERISK=27, T_SLASH=28, T_PERCENT=29, 
		T_COMP=30, T_EQUAL=31, T_DIFFERENT=32, T_GREATER=33, T_GREATER_OR_EQUAL=34, 
		T_INCREMENT=35, T_DECREMENT=36, T_INC_MULT=37, T_INC_DIV=38, T_INC_MOD=39, 
		T_LOWER=40, T_LOWER_OR_EQUAL=41, T_DOT=42, T_TERN=43, NEG_UN=44, OR=45, 
		AND=46, PLUS_INC=47, MINUS_DEC=48, ID=49, COMMENT=50, WS=51, NUMBER_LITERAL=52, 
		STRING_LITERAL=53;
	public static final int
		RULE_ilpFile = 0, RULE_line = 1, RULE_stmt = 2, RULE_command = 3, RULE_cmdSimple = 4, 
		RULE_cmdAtrib = 5, RULE_atrib = 6, RULE_blocK = 7, RULE_expression = 8, 
		RULE_cmdIf = 9, RULE_cmdWhile = 10, RULE_forInit = 11, RULE_forItera = 12, 
		RULE_cmdFor = 13, RULE_cmdStop = 14, RULE_cmdSkip = 15, RULE_cmdReturn = 16, 
		RULE_cmdCallProc = 17, RULE_lstOP = 18, RULE_lstTipo = 19, RULE_literal = 20, 
		RULE_specVarSimple = 21, RULE_specVarSimpleIni = 22, RULE_specVarArr = 23, 
		RULE_lstArrIni = 24, RULE_specVarArrIni = 25, RULE_specVar = 26, RULE_listSpecVars = 27, 
		RULE_declVar = 28, RULE_cmdRead = 29;
	public static final String[] ruleNames = {
		"ilpFile", "line", "stmt", "command", "cmdSimple", "cmdAtrib", "atrib", 
		"blocK", "expression", "cmdIf", "cmdWhile", "forInit", "forItera", "cmdFor", 
		"cmdStop", "cmdSkip", "cmdReturn", "cmdCallProc", "lstOP", "lstTipo", 
		"literal", "specVarSimple", "specVarSimpleIni", "specVarArr", "lstArrIni", 
		"specVarArrIni", "specVar", "listSpecVars", "declVar", "cmdRead"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'else'", "'false'", "'true'", "'bool'", "'for'", "'if'", "'int'", 
		"'read'", "'return'", "'skip'", "'stop'", "'string'", "'var'", "'while'", 
		"'write'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "';'", "':'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'='", "'!='", "'>'", "'>='", 
		"'+='", "'-='", "'*='", "'/='", "'%='", "'<'", "'<='", "'.'", "'?'", "'!'", 
		"'||'", "'&&'", "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "T_ELSE", "T_FALSE", "T_TRUE", "T_BOOL", "T_FOR", "T_IF", "T_INT", 
		"T_READ", "T_RETURN", "T_SKIP", "T_STOP", "T_STRING", "T_VAR", "T_WHILE", 
		"T_WRITE", "T_LEFT_PAREN", "T_RIGHT_PAREN", "T_LEFT_SQUARE", "T_RIGHT_SQUARE", 
		"T_LEFT_CURLY_BRACE", "T_RIGHT_CURLY_BRACE", "T_COMMA", "T_SEMICOLON", 
		"T_COLON", "T_PLUS", "T_MINUS", "T_ASTERISK", "T_SLASH", "T_PERCENT", 
		"T_COMP", "T_EQUAL", "T_DIFFERENT", "T_GREATER", "T_GREATER_OR_EQUAL", 
		"T_INCREMENT", "T_DECREMENT", "T_INC_MULT", "T_INC_DIV", "T_INC_MOD", 
		"T_LOWER", "T_LOWER_OR_EQUAL", "T_DOT", "T_TERN", "NEG_UN", "OR", "AND", 
		"PLUS_INC", "MINUS_DEC", "ID", "COMMENT", "WS", "NUMBER_LITERAL", "STRING_LITERAL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "IlpParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IlpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IlpFileContext extends ParserRuleContext {
		public LineContext lines;
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public IlpFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ilpFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterIlpFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitIlpFile(this);
		}
	}

	public final IlpFileContext ilpFile() throws RecognitionException {
		IlpFileContext _localctx = new IlpFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ilpFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				((IlpFileContext)_localctx).lines = line();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_VAR) | (1L << T_LEFT_PAREN) | (1L << T_PLUS) | (1L << T_MINUS) | (1L << NEG_UN) | (1L << PLUS_INC) | (1L << MINUS_DEC) | (1L << ID) | (1L << NUMBER_LITERAL) | (1L << STRING_LITERAL))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode WS() { return getToken(IlpParser.WS, 0); }
		public TerminalNode EOF() { return getToken(IlpParser.EOF, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			stmt();
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==WS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public DeclVarContext declVar() {
			return getRuleContext(DeclVarContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(70);
			switch (_input.LA(1)) {
			case T_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				declVar();
				}
				break;
			case T_LEFT_PAREN:
			case T_PLUS:
			case T_MINUS:
			case NEG_UN:
			case PLUS_INC:
			case MINUS_DEC:
			case ID:
			case NUMBER_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public CmdSimpleContext cmdSimple() {
			return getRuleContext(CmdSimpleContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			cmdSimple();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdSimpleContext extends ParserRuleContext {
		public CmdAtribContext cmdAtrib() {
			return getRuleContext(CmdAtribContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterCmdSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitCmdSimple(this);
		}
	}

	public final CmdSimpleContext cmdSimple() throws RecognitionException {
		CmdSimpleContext _localctx = new CmdSimpleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmdSimple);
		try {
			setState(76);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				cmdAtrib();
				}
				break;
			case T_ELSE:
			case T_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				cmdIf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdAtribContext extends ParserRuleContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public CmdAtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterCmdAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitCmdAtrib(this);
		}
	}

	public final CmdAtribContext cmdAtrib() throws RecognitionException {
		CmdAtribContext _localctx = new CmdAtribContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdAtrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			atrib();
			setState(79);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IlpParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(IlpParser.T_EQUAL, 0); }
		public TerminalNode T_INCREMENT() { return getToken(IlpParser.T_INCREMENT, 0); }
		public TerminalNode T_DECREMENT() { return getToken(IlpParser.T_DECREMENT, 0); }
		public TerminalNode T_INC_MULT() { return getToken(IlpParser.T_INC_MULT, 0); }
		public TerminalNode T_INC_DIV() { return getToken(IlpParser.T_INC_DIV, 0); }
		public TerminalNode T_INC_MOD() { return getToken(IlpParser.T_INC_MOD, 0); }
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitAtrib(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ID);
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_EQUAL) | (1L << T_INCREMENT) | (1L << T_DECREMENT) | (1L << T_INC_MULT) | (1L << T_INC_DIV) | (1L << T_INC_MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(83);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocKContext extends ParserRuleContext {
		public DeclVarContext declVar() {
			return getRuleContext(DeclVarContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public BlocKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterBlocK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitBlocK(this);
		}
	}

	public final BlocKContext blocK() throws RecognitionException {
		BlocKContext _localctx = new BlocKContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_blocK);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T_LEFT_CURLY_BRACE);
				setState(86);
				declVar();
				setState(87);
				match(T_RIGHT_CURLY_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T_LEFT_CURLY_BRACE);
				setState(90);
				command();
				setState(91);
				match(T_RIGHT_CURLY_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(IlpParser.ID, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(IlpParser.NUMBER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(IlpParser.STRING_LITERAL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(96);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_PLUS) | (1L << T_MINUS) | (1L << PLUS_INC) | (1L << MINUS_DEC))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(97);
				expression(7);
				}
				break;
			case 2:
				{
				setState(98);
				match(T_MINUS);
				setState(99);
				expression(6);
				}
				break;
			case 3:
				{
				setState(100);
				match(NEG_UN);
				setState(101);
				expression(5);
				}
				break;
			case 4:
				{
				setState(102);
				match(T_LEFT_PAREN);
				setState(103);
				expression(0);
				setState(104);
				match(T_RIGHT_PAREN);
				}
				break;
			case 5:
				{
				setState(106);
				match(ID);
				}
				break;
			case 6:
				{
				setState(107);
				match(NUMBER_LITERAL);
				}
				break;
			case 7:
				{
				setState(108);
				match(STRING_LITERAL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(112);
						((ExpressionContext)_localctx).operator = match(T_TERN);
						setState(113);
						((ExpressionContext)_localctx).right = expression(0);
						setState(114);
						((ExpressionContext)_localctx).operator = match(T_COLON);
						setState(115);
						((ExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(118);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_COMP) | (1L << T_DIFFERENT) | (1L << T_GREATER) | (1L << T_GREATER_OR_EQUAL) | (1L << T_LOWER) | (1L << T_LOWER_OR_EQUAL) | (1L << OR) | (1L << AND))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(119);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(121);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_PLUS) | (1L << T_MINUS) | (1L << T_ASTERISK) | (1L << T_SLASH) | (1L << T_PERCENT))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(122);
						expression(9);
						}
						break;
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(IlpParser.T_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode T_ELSE() { return getToken(IlpParser.T_ELSE, 0); }
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdIf);
		try {
			setState(136);
			switch (_input.LA(1)) {
			case T_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T_IF);
				setState(129);
				match(T_LEFT_PAREN);
				setState(130);
				expression(0);
				setState(131);
				match(T_RIGHT_PAREN);
				setState(132);
				command();
				}
				break;
			case T_ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T_ELSE);
				setState(135);
				command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode T_WHILE() { return getToken(IlpParser.T_WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T_WHILE);
			setState(139);
			match(T_LEFT_PAREN);
			setState(140);
			expression(0);
			setState(141);
			match(T_RIGHT_PAREN);
			setState(142);
			command();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public CmdAtribContext cmdAtrib() {
			return getRuleContext(CmdAtribContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			cmdAtrib();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForIteraContext extends ParserRuleContext {
		public CmdAtribContext cmdAtrib() {
			return getRuleContext(CmdAtribContext.class,0);
		}
		public ForIteraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forItera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterForItera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitForItera(this);
		}
	}

	public final ForIteraContext forItera() throws RecognitionException {
		ForIteraContext _localctx = new ForIteraContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forItera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			cmdAtrib();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdForContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(IlpParser.T_FOR, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForIteraContext forItera() {
			return getRuleContext(ForIteraContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CmdForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterCmdFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitCmdFor(this);
		}
	}

	public final CmdForContext cmdFor() throws RecognitionException {
		CmdForContext _localctx = new CmdForContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmdFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T_FOR);
			setState(149);
			match(T_LEFT_PAREN);
			setState(150);
			forInit();
			setState(151);
			match(T_SEMICOLON);
			setState(152);
			expression(0);
			setState(153);
			match(T_SEMICOLON);
			setState(154);
			forItera();
			setState(155);
			match(T_RIGHT_PAREN);
			setState(156);
			command();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdStopContext extends ParserRuleContext {
		public TerminalNode T_STOP() { return getToken(IlpParser.T_STOP, 0); }
		public CmdStopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdStop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterCmdStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitCmdStop(this);
		}
	}

	public final CmdStopContext cmdStop() throws RecognitionException {
		CmdStopContext _localctx = new CmdStopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmdStop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T_STOP);
			setState(159);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdSkipContext extends ParserRuleContext {
		public TerminalNode T_SKIP() { return getToken(IlpParser.T_SKIP, 0); }
		public CmdSkipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSkip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterCmdSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitCmdSkip(this);
		}
	}

	public final CmdSkipContext cmdSkip() throws RecognitionException {
		CmdSkipContext _localctx = new CmdSkipContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdSkip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T_SKIP);
			setState(162);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdReturnContext extends ParserRuleContext {
		public TerminalNode T_RETURN() { return getToken(IlpParser.T_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CmdReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterCmdReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitCmdReturn(this);
		}
	}

	public final CmdReturnContext cmdReturn() throws RecognitionException {
		CmdReturnContext _localctx = new CmdReturnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmdReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T_RETURN);
			setState(165);
			expression(0);
			setState(166);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCallProcContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IlpParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CmdCallProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCallProc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterCmdCallProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitCmdCallProc(this);
		}
	}

	public final CmdCallProcContext cmdCallProc() throws RecognitionException {
		CmdCallProcContext _localctx = new CmdCallProcContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdCallProc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(169);
			match(T_LEFT_PAREN);
			setState(170);
			expression(0);
			setState(171);
			match(T_RIGHT_PAREN);
			setState(172);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LstOPContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(IlpParser.T_EQUAL, 0); }
		public TerminalNode T_PLUS() { return getToken(IlpParser.T_PLUS, 0); }
		public TerminalNode T_MINUS() { return getToken(IlpParser.T_MINUS, 0); }
		public TerminalNode T_ASTERISK() { return getToken(IlpParser.T_ASTERISK, 0); }
		public TerminalNode T_PERCENT() { return getToken(IlpParser.T_PERCENT, 0); }
		public TerminalNode T_SLASH() { return getToken(IlpParser.T_SLASH, 0); }
		public LstOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lstOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterLstOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitLstOP(this);
		}
	}

	public final LstOPContext lstOP() throws RecognitionException {
		LstOPContext _localctx = new LstOPContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lstOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_PLUS) | (1L << T_MINUS) | (1L << T_ASTERISK) | (1L << T_SLASH) | (1L << T_PERCENT) | (1L << T_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LstTipoContext extends ParserRuleContext {
		public TerminalNode T_INT() { return getToken(IlpParser.T_INT, 0); }
		public TerminalNode T_STRING() { return getToken(IlpParser.T_STRING, 0); }
		public TerminalNode T_BOOL() { return getToken(IlpParser.T_BOOL, 0); }
		public LstTipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lstTipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterLstTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitLstTipo(this);
		}
	}

	public final LstTipoContext lstTipo() throws RecognitionException {
		LstTipoContext _localctx = new LstTipoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lstTipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_BOOL) | (1L << T_INT) | (1L << T_STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER_LITERAL() { return getToken(IlpParser.NUMBER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(IlpParser.STRING_LITERAL, 0); }
		public TerminalNode T_FALSE() { return getToken(IlpParser.T_FALSE, 0); }
		public TerminalNode T_TRUE() { return getToken(IlpParser.T_TRUE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FALSE) | (1L << T_TRUE) | (1L << NUMBER_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecVarSimpleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IlpParser.ID, 0); }
		public TerminalNode T_EQUAL() { return getToken(IlpParser.T_EQUAL, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SpecVarSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVarSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterSpecVarSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitSpecVarSimple(this);
		}
	}

	public final SpecVarSimpleContext specVarSimple() throws RecognitionException {
		SpecVarSimpleContext _localctx = new SpecVarSimpleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_specVarSimple);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(ID);
				setState(182);
				match(T_EQUAL);
				setState(183);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecVarSimpleIniContext extends ParserRuleContext {
		public List<SpecVarSimpleContext> specVarSimple() {
			return getRuleContexts(SpecVarSimpleContext.class);
		}
		public SpecVarSimpleContext specVarSimple(int i) {
			return getRuleContext(SpecVarSimpleContext.class,i);
		}
		public LstOPContext lstOP() {
			return getRuleContext(LstOPContext.class,0);
		}
		public SpecVarSimpleIniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVarSimpleIni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterSpecVarSimpleIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitSpecVarSimpleIni(this);
		}
	}

	public final SpecVarSimpleIniContext specVarSimpleIni() throws RecognitionException {
		SpecVarSimpleIniContext _localctx = new SpecVarSimpleIniContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_specVarSimpleIni);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			specVarSimple();
			setState(187);
			lstOP();
			setState(188);
			specVarSimple();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecVarArrContext extends ParserRuleContext {
		public SpecVarSimpleContext specVarSimple() {
			return getRuleContext(SpecVarSimpleContext.class,0);
		}
		public TerminalNode NUMBER_LITERAL() { return getToken(IlpParser.NUMBER_LITERAL, 0); }
		public SpecVarArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVarArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterSpecVarArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitSpecVarArr(this);
		}
	}

	public final SpecVarArrContext specVarArr() throws RecognitionException {
		SpecVarArrContext _localctx = new SpecVarArrContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_specVarArr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			specVarSimple();
			setState(191);
			match(T_LEFT_SQUARE);
			setState(192);
			match(NUMBER_LITERAL);
			setState(193);
			match(T_RIGHT_SQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LstArrIniContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public LstArrIniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lstArrIni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterLstArrIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitLstArrIni(this);
		}
	}

	public final LstArrIniContext lstArrIni() throws RecognitionException {
		LstArrIniContext _localctx = new LstArrIniContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lstArrIni);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				literal();
				setState(197);
				match(T_COMMA);
				setState(198);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecVarArrIniContext extends ParserRuleContext {
		public SpecVarArrContext specVarArr() {
			return getRuleContext(SpecVarArrContext.class,0);
		}
		public LstArrIniContext lstArrIni() {
			return getRuleContext(LstArrIniContext.class,0);
		}
		public SpecVarArrIniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVarArrIni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterSpecVarArrIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitSpecVarArrIni(this);
		}
	}

	public final SpecVarArrIniContext specVarArrIni() throws RecognitionException {
		SpecVarArrIniContext _localctx = new SpecVarArrIniContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_specVarArrIni);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			specVarArr();
			setState(203);
			match(T_EQUAL);
			setState(204);
			match(T_LEFT_CURLY_BRACE);
			setState(205);
			lstArrIni();
			setState(206);
			match(T_RIGHT_CURLY_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecVarContext extends ParserRuleContext {
		public SpecVarSimpleContext specVarSimple() {
			return getRuleContext(SpecVarSimpleContext.class,0);
		}
		public SpecVarSimpleIniContext specVarSimpleIni() {
			return getRuleContext(SpecVarSimpleIniContext.class,0);
		}
		public SpecVarArrContext specVarArr() {
			return getRuleContext(SpecVarArrContext.class,0);
		}
		public SpecVarArrIniContext specVarArrIni() {
			return getRuleContext(SpecVarArrIniContext.class,0);
		}
		public SpecVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterSpecVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitSpecVar(this);
		}
	}

	public final SpecVarContext specVar() throws RecognitionException {
		SpecVarContext _localctx = new SpecVarContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_specVar);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				specVarSimple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				specVarSimpleIni();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				specVarArr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				specVarArrIni();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListSpecVarsContext extends ParserRuleContext {
		public SpecVarContext specVar() {
			return getRuleContext(SpecVarContext.class,0);
		}
		public ListSpecVarsContext listSpecVars() {
			return getRuleContext(ListSpecVarsContext.class,0);
		}
		public ListSpecVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listSpecVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterListSpecVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitListSpecVars(this);
		}
	}

	public final ListSpecVarsContext listSpecVars() throws RecognitionException {
		ListSpecVarsContext _localctx = new ListSpecVarsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listSpecVars);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				specVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				specVar();
				setState(216);
				match(T_COMMA);
				setState(217);
				listSpecVars();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclVarContext extends ParserRuleContext {
		public TerminalNode T_VAR() { return getToken(IlpParser.T_VAR, 0); }
		public ListSpecVarsContext listSpecVars() {
			return getRuleContext(ListSpecVarsContext.class,0);
		}
		public LstTipoContext lstTipo() {
			return getRuleContext(LstTipoContext.class,0);
		}
		public DeclVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterDeclVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitDeclVar(this);
		}
	}

	public final DeclVarContext declVar() throws RecognitionException {
		DeclVarContext _localctx = new DeclVarContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T_VAR);
			setState(222);
			listSpecVars();
			setState(223);
			match(T_COLON);
			setState(224);
			lstTipo();
			setState(225);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdReadContext extends ParserRuleContext {
		public TerminalNode T_READ() { return getToken(IlpParser.T_READ, 0); }
		public DeclVarContext declVar() {
			return getRuleContext(DeclVarContext.class,0);
		}
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IlpParserListener ) ((IlpParserListener)listener).exitCmdRead(this);
		}
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T_READ);
			setState(228);
			declVar();
			setState(229);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u00ea\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\6\2@"+
		"\n\2\r\2\16\2A\3\3\3\3\3\3\3\4\3\4\5\4I\n\4\3\5\3\5\3\6\3\6\5\6O\n\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n~\n\n\f\n\16\n\u0081\13"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008b\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\5\27\u00bb\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u00cb\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\5\34\u00d7\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u00de\n\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\2\3\22 \2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\n\3\3\65\65"+
		"\4\2!!%)\4\2\33\34\61\62\6\2  \"$*+/\60\3\2\33\37\4\2\33\37!!\5\2\6\6"+
		"\t\t\16\16\4\2\4\5\66\67\u00df\2?\3\2\2\2\4C\3\2\2\2\6H\3\2\2\2\bJ\3\2"+
		"\2\2\nN\3\2\2\2\fP\3\2\2\2\16S\3\2\2\2\20_\3\2\2\2\22o\3\2\2\2\24\u008a"+
		"\3\2\2\2\26\u008c\3\2\2\2\30\u0092\3\2\2\2\32\u0094\3\2\2\2\34\u0096\3"+
		"\2\2\2\36\u00a0\3\2\2\2 \u00a3\3\2\2\2\"\u00a6\3\2\2\2$\u00aa\3\2\2\2"+
		"&\u00b0\3\2\2\2(\u00b2\3\2\2\2*\u00b4\3\2\2\2,\u00ba\3\2\2\2.\u00bc\3"+
		"\2\2\2\60\u00c0\3\2\2\2\62\u00ca\3\2\2\2\64\u00cc\3\2\2\2\66\u00d6\3\2"+
		"\2\28\u00dd\3\2\2\2:\u00df\3\2\2\2<\u00e5\3\2\2\2>@\5\4\3\2?>\3\2\2\2"+
		"@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CD\5\6\4\2DE\t\2\2\2E\5\3\2\2"+
		"\2FI\5:\36\2GI\5\22\n\2HF\3\2\2\2HG\3\2\2\2I\7\3\2\2\2JK\5\n\6\2K\t\3"+
		"\2\2\2LO\5\f\7\2MO\5\24\13\2NL\3\2\2\2NM\3\2\2\2O\13\3\2\2\2PQ\5\16\b"+
		"\2QR\7\31\2\2R\r\3\2\2\2ST\7\63\2\2TU\t\3\2\2UV\5\22\n\2V\17\3\2\2\2W"+
		"X\7\26\2\2XY\5:\36\2YZ\7\27\2\2Z`\3\2\2\2[\\\7\26\2\2\\]\5\b\5\2]^\7\27"+
		"\2\2^`\3\2\2\2_W\3\2\2\2_[\3\2\2\2`\21\3\2\2\2ab\b\n\1\2bc\t\4\2\2cp\5"+
		"\22\n\tde\7\34\2\2ep\5\22\n\bfg\7.\2\2gp\5\22\n\7hi\7\22\2\2ij\5\22\n"+
		"\2jk\7\23\2\2kp\3\2\2\2lp\7\63\2\2mp\7\66\2\2np\7\67\2\2oa\3\2\2\2od\3"+
		"\2\2\2of\3\2\2\2oh\3\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\177\3\2\2\2"+
		"qr\f\f\2\2rs\7-\2\2st\5\22\n\2tu\7\32\2\2uv\5\22\n\rv~\3\2\2\2wx\f\13"+
		"\2\2xy\t\5\2\2y~\5\22\n\fz{\f\n\2\2{|\t\6\2\2|~\5\22\n\13}q\3\2\2\2}w"+
		"\3\2\2\2}z\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\23\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\b\2\2\u0083\u0084\7\22\2\2"+
		"\u0084\u0085\5\22\n\2\u0085\u0086\7\23\2\2\u0086\u0087\5\b\5\2\u0087\u008b"+
		"\3\2\2\2\u0088\u0089\7\3\2\2\u0089\u008b\5\b\5\2\u008a\u0082\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\25\3\2\2\2\u008c\u008d\7\20\2\2\u008d\u008e\7\22"+
		"\2\2\u008e\u008f\5\22\n\2\u008f\u0090\7\23\2\2\u0090\u0091\5\b\5\2\u0091"+
		"\27\3\2\2\2\u0092\u0093\5\f\7\2\u0093\31\3\2\2\2\u0094\u0095\5\f\7\2\u0095"+
		"\33\3\2\2\2\u0096\u0097\7\7\2\2\u0097\u0098\7\22\2\2\u0098\u0099\5\30"+
		"\r\2\u0099\u009a\7\31\2\2\u009a\u009b\5\22\n\2\u009b\u009c\7\31\2\2\u009c"+
		"\u009d\5\32\16\2\u009d\u009e\7\23\2\2\u009e\u009f\5\b\5\2\u009f\35\3\2"+
		"\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00a2\7\31\2\2\u00a2\37\3\2\2\2\u00a3\u00a4"+
		"\7\f\2\2\u00a4\u00a5\7\31\2\2\u00a5!\3\2\2\2\u00a6\u00a7\7\13\2\2\u00a7"+
		"\u00a8\5\22\n\2\u00a8\u00a9\7\31\2\2\u00a9#\3\2\2\2\u00aa\u00ab\7\63\2"+
		"\2\u00ab\u00ac\7\22\2\2\u00ac\u00ad\5\22\n\2\u00ad\u00ae\7\23\2\2\u00ae"+
		"\u00af\7\31\2\2\u00af%\3\2\2\2\u00b0\u00b1\t\7\2\2\u00b1\'\3\2\2\2\u00b2"+
		"\u00b3\t\b\2\2\u00b3)\3\2\2\2\u00b4\u00b5\t\t\2\2\u00b5+\3\2\2\2\u00b6"+
		"\u00bb\7\63\2\2\u00b7\u00b8\7\63\2\2\u00b8\u00b9\7!\2\2\u00b9\u00bb\5"+
		"*\26\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb-\3\2\2\2\u00bc\u00bd"+
		"\5,\27\2\u00bd\u00be\5&\24\2\u00be\u00bf\5,\27\2\u00bf/\3\2\2\2\u00c0"+
		"\u00c1\5,\27\2\u00c1\u00c2\7\24\2\2\u00c2\u00c3\7\66\2\2\u00c3\u00c4\7"+
		"\25\2\2\u00c4\61\3\2\2\2\u00c5\u00cb\5*\26\2\u00c6\u00c7\5*\26\2\u00c7"+
		"\u00c8\7\30\2\2\u00c8\u00c9\5*\26\2\u00c9\u00cb\3\2\2\2\u00ca\u00c5\3"+
		"\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\63\3\2\2\2\u00cc\u00cd\5\60\31\2\u00cd"+
		"\u00ce\7!\2\2\u00ce\u00cf\7\26\2\2\u00cf\u00d0\5\62\32\2\u00d0\u00d1\7"+
		"\27\2\2\u00d1\65\3\2\2\2\u00d2\u00d7\5,\27\2\u00d3\u00d7\5.\30\2\u00d4"+
		"\u00d7\5\60\31\2\u00d5\u00d7\5\64\33\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\67\3\2\2\2\u00d8"+
		"\u00de\5\66\34\2\u00d9\u00da\5\66\34\2\u00da\u00db\7\30\2\2\u00db\u00dc"+
		"\58\35\2\u00dc\u00de\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de"+
		"9\3\2\2\2\u00df\u00e0\7\17\2\2\u00e0\u00e1\58\35\2\u00e1\u00e2\7\32\2"+
		"\2\u00e2\u00e3\5(\25\2\u00e3\u00e4\7\31\2\2\u00e4;\3\2\2\2\u00e5\u00e6"+
		"\7\n\2\2\u00e6\u00e7\5:\36\2\u00e7\u00e8\7\31\2\2\u00e8=\3\2\2\2\16AH"+
		"N_o}\177\u008a\u00ba\u00ca\u00d6\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}