// Generated from GraceParser.g4 by ANTLR 4.5.3
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
public class GraceParser extends Parser {
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
		AND=46, PLUS_INC=47, MINUS_DEC=48, ID=49, COMMENT=50, WS=51, NUMBERLITERAL=52, 
		STRINGLITERAL=53;
	public static final int
		RULE_graceFile = 0, RULE_line = 1, RULE_lstOP = 2, RULE_lstType = 3, RULE_literal = 4, 
		RULE_command = 5, RULE_statement = 6, RULE_cmdSimple = 7, RULE_cmdAtrib = 8, 
		RULE_atrib = 9, RULE_block = 10, RULE_expression = 11, RULE_cmdIf = 12, 
		RULE_cmdWhile = 13, RULE_forInit = 14, RULE_forItera = 15, RULE_cmdFor = 16, 
		RULE_cmdStop = 17, RULE_cmdSkip = 18, RULE_cmdReturn = 19, RULE_cmdCallProc = 20, 
		RULE_cmdRead = 21, RULE_cmdWrite = 22, RULE_variable = 23, RULE_specVarSimple = 24, 
		RULE_specVarSimpleIni = 25, RULE_specVarArr = 26, RULE_lstArrIni = 27, 
		RULE_specVarArrIni = 28, RULE_specVar = 29, RULE_listSpecVars = 30, RULE_declVar = 31;
	public static final String[] ruleNames = {
		"graceFile", "line", "lstOP", "lstType", "literal", "command", "statement", 
		"cmdSimple", "cmdAtrib", "atrib", "block", "expression", "cmdIf", "cmdWhile", 
		"forInit", "forItera", "cmdFor", "cmdStop", "cmdSkip", "cmdReturn", "cmdCallProc", 
		"cmdRead", "cmdWrite", "variable", "specVarSimple", "specVarSimpleIni", 
		"specVarArr", "lstArrIni", "specVarArrIni", "specVar", "listSpecVars", 
		"declVar"
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
		"PLUS_INC", "MINUS_DEC", "ID", "COMMENT", "WS", "NUMBERLITERAL", "STRINGLITERAL"
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
	public String getGrammarFileName() { return "GraceParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraceParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GraceFileContext extends ParserRuleContext {
		public LineContext lines;
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public GraceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterGraceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitGraceFile(this);
		}
	}

	public final GraceFileContext graceFile() throws RecognitionException {
		GraceFileContext _localctx = new GraceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_graceFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				((GraceFileContext)_localctx).lines = line();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_VAR || _la==ID );
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			statement();
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
		public TerminalNode T_EQUAL() { return getToken(GraceParser.T_EQUAL, 0); }
		public TerminalNode T_PLUS() { return getToken(GraceParser.T_PLUS, 0); }
		public TerminalNode T_MINUS() { return getToken(GraceParser.T_MINUS, 0); }
		public TerminalNode T_ASTERISK() { return getToken(GraceParser.T_ASTERISK, 0); }
		public TerminalNode T_PERCENT() { return getToken(GraceParser.T_PERCENT, 0); }
		public TerminalNode T_SLASH() { return getToken(GraceParser.T_SLASH, 0); }
		public LstOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lstOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterLstOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitLstOP(this);
		}
	}

	public final LstOPContext lstOP() throws RecognitionException {
		LstOPContext _localctx = new LstOPContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lstOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
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

	public static class LstTypeContext extends ParserRuleContext {
		public LstTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lstType; }
	 
		public LstTypeContext() { }
		public void copyFrom(LstTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringContext extends LstTypeContext {
		public TerminalNode T_STRING() { return getToken(GraceParser.T_STRING, 0); }
		public StringContext(LstTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitString(this);
		}
	}
	public static class BoolContext extends LstTypeContext {
		public TerminalNode T_BOOL() { return getToken(GraceParser.T_BOOL, 0); }
		public BoolContext(LstTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitBool(this);
		}
	}
	public static class IntegerContext extends LstTypeContext {
		public TerminalNode T_INT() { return getToken(GraceParser.T_INT, 0); }
		public IntegerContext(LstTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitInteger(this);
		}
	}

	public final LstTypeContext lstType() throws RecognitionException {
		LstTypeContext _localctx = new LstTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lstType);
		try {
			setState(76);
			switch (_input.LA(1)) {
			case T_INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(T_INT);
				}
				break;
			case T_STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T_STRING);
				}
				break;
			case T_BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(T_BOOL);
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FalseLiteralContext extends LiteralContext {
		public TerminalNode T_TRUE() { return getToken(GraceParser.T_TRUE, 0); }
		public FalseLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterFalseLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitFalseLiteral(this);
		}
	}
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRINGLITERAL() { return getToken(GraceParser.STRINGLITERAL, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitStringLiteral(this);
		}
	}
	public static class IntLiteralContext extends LiteralContext {
		public TerminalNode NUMBERLITERAL() { return getToken(GraceParser.NUMBERLITERAL, 0); }
		public IntLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitIntLiteral(this);
		}
	}
	public static class TrueLiteralContext extends LiteralContext {
		public TerminalNode T_FALSE() { return getToken(GraceParser.T_FALSE, 0); }
		public TrueLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterTrueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitTrueLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_literal);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case NUMBERLITERAL:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(NUMBERLITERAL);
				}
				break;
			case STRINGLITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(STRINGLITERAL);
				}
				break;
			case T_FALSE:
				_localctx = new TrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(T_FALSE);
				}
				break;
			case T_TRUE:
				_localctx = new FalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				match(T_TRUE);
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
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentStatementContext extends StatementContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitAssignmentStatement(this);
		}
	}
	public static class DeclVarStatementContext extends StatementContext {
		public DeclVarContext declVar() {
			return getRuleContext(DeclVarContext.class,0);
		}
		public DeclVarStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDeclVarStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDeclVarStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(88);
			switch (_input.LA(1)) {
			case T_VAR:
				_localctx = new DeclVarStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				declVar();
				}
				break;
			case ID:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				atrib();
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

	public static class CmdSimpleContext extends ParserRuleContext {
		public CmdAtribContext cmdAtrib() {
			return getRuleContext(CmdAtribContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdForContext cmdFor() {
			return getRuleContext(CmdForContext.class,0);
		}
		public CmdStopContext cmdStop() {
			return getRuleContext(CmdStopContext.class,0);
		}
		public CmdSkipContext cmdSkip() {
			return getRuleContext(CmdSkipContext.class,0);
		}
		public CmdReturnContext cmdReturn() {
			return getRuleContext(CmdReturnContext.class,0);
		}
		public CmdCallProcContext cmdCallProc() {
			return getRuleContext(CmdCallProcContext.class,0);
		}
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public CmdSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdSimple(this);
		}
	}

	public final CmdSimpleContext cmdSimple() throws RecognitionException {
		CmdSimpleContext _localctx = new CmdSimpleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdSimple);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				cmdAtrib();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				cmdIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				cmdWhile();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				cmdFor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				cmdStop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				cmdSkip();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				cmdReturn();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				cmdCallProc();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
				cmdRead();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(99);
				cmdWrite();
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
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdAtrib(this);
		}
	}

	public final CmdAtribContext cmdAtrib() throws RecognitionException {
		CmdAtribContext _localctx = new CmdAtribContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdAtrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			atrib();
			setState(103);
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
		public Token ID;
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(GraceParser.T_EQUAL, 0); }
		public TerminalNode T_INCREMENT() { return getToken(GraceParser.T_INCREMENT, 0); }
		public TerminalNode T_DECREMENT() { return getToken(GraceParser.T_DECREMENT, 0); }
		public TerminalNode T_INC_MULT() { return getToken(GraceParser.T_INC_MULT, 0); }
		public TerminalNode T_INC_DIV() { return getToken(GraceParser.T_INC_DIV, 0); }
		public TerminalNode T_INC_MOD() { return getToken(GraceParser.T_INC_MOD, 0); }
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitAtrib(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			((AtribContext)_localctx).ID = match(ID);
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_EQUAL) | (1L << T_INCREMENT) | (1L << T_DECREMENT) | (1L << T_INC_MULT) | (1L << T_INC_DIV) | (1L << T_INC_MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(107);
			expression(0);

			            if( !((BlockContext)getInvokingContext(10)).symbols.contains((((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null)) ){
			                System.err.println( "Undefined var: " + (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null) );
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

	public static class BlockContext extends ParserRuleContext {
		public List<String> symbols =  new ArrayList<>();
		public List<DeclVarContext> declVar() {
			return getRuleContexts(DeclVarContext.class);
		}
		public DeclVarContext declVar(int i) {
			return getRuleContext(DeclVarContext.class,i);
		}
		public List<CmdSimpleContext> cmdSimple() {
			return getRuleContexts(CmdSimpleContext.class);
		}
		public CmdSimpleContext cmdSimple(int i) {
			return getRuleContext(CmdSimpleContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T_LEFT_CURLY_BRACE);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_VAR) {
				{
				{
				setState(111);
				declVar();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ELSE) | (1L << T_FOR) | (1L << T_IF) | (1L << T_READ) | (1L << T_RETURN) | (1L << T_SKIP) | (1L << T_STOP) | (1L << T_WHILE) | (1L << T_WRITE) | (1L << T_COMMA) | (1L << ID))) != 0)) {
				{
				{
				setState(117);
				cmdSimple();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(T_RIGHT_CURLY_BRACE);
			System.out.println("symbols=" + _localctx.symbols);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IncrementOperationContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncrementOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterIncrementOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitIncrementOperation(this);
		}
	}
	public static class MinusExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitMinusExpression(this);
		}
	}
	public static class DifferenceExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DifferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDifferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDifferenceExpression(this);
		}
	}
	public static class TernaryOperationContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterTernaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitTernaryOperation(this);
		}
	}
	public static class LiteralReferenceContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterLiteralReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitLiteralReference(this);
		}
	}
	public static class CompareOperationContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompareOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCompareOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCompareOperation(this);
		}
	}
	public static class ParenExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitParenExpression(this);
		}
	}
	public static class BinaryOperationContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterBinaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitBinaryOperation(this);
		}
	}
	public static class VarReferenceContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public VarReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterVarReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitVarReference(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			switch (_input.LA(1)) {
			case T_MINUS:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(127);
				match(T_MINUS);
				setState(128);
				expression(5);
				}
				break;
			case NEG_UN:
				{
				_localctx = new DifferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(NEG_UN);
				setState(130);
				expression(4);
				}
				break;
			case T_LEFT_PAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(T_LEFT_PAREN);
				setState(132);
				expression(0);
				setState(133);
				match(T_RIGHT_PAREN);
				}
				break;
			case ID:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(ID);
				}
				break;
			case T_FALSE:
			case T_TRUE:
			case NUMBERLITERAL:
			case STRINGLITERAL:
				{
				_localctx = new LiteralReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new TernaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(139);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(140);
						((TernaryOperationContext)_localctx).operator = match(T_TERN);
						setState(141);
						((TernaryOperationContext)_localctx).right = expression(0);
						setState(142);
						((TernaryOperationContext)_localctx).operator = match(T_COLON);
						setState(143);
						((TernaryOperationContext)_localctx).right = expression(10);
						}
						break;
					case 2:
						{
						_localctx = new CompareOperationContext(new ExpressionContext(_parentctx, _parentState));
						((CompareOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(146);
						((CompareOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_COMP) | (1L << T_DIFFERENT) | (1L << T_GREATER) | (1L << T_GREATER_OR_EQUAL) | (1L << T_LOWER) | (1L << T_LOWER_OR_EQUAL) | (1L << OR) | (1L << AND))) != 0)) ) {
							((CompareOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(147);
						((CompareOperationContext)_localctx).right = expression(9);
						}
						break;
					case 3:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(149);
						((BinaryOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_PLUS) | (1L << T_MINUS) | (1L << T_ASTERISK) | (1L << T_SLASH) | (1L << T_PERCENT))) != 0)) ) {
							((BinaryOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(150);
						((BinaryOperationContext)_localctx).right = expression(8);
						}
						break;
					case 4:
						{
						_localctx = new IncrementOperationContext(new ExpressionContext(_parentctx, _parentState));
						((IncrementOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(152);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_PLUS) | (1L << T_MINUS) | (1L << PLUS_INC) | (1L << MINUS_DEC))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public TerminalNode T_IF() { return getToken(GraceParser.T_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode T_ELSE() { return getToken(GraceParser.T_ELSE, 0); }
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdIf);
		try {
			setState(166);
			switch (_input.LA(1)) {
			case T_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(T_IF);
				setState(159);
				match(T_LEFT_PAREN);
				setState(160);
				expression(0);
				setState(161);
				match(T_RIGHT_PAREN);
				setState(162);
				command();
				}
				break;
			case T_ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(T_ELSE);
				setState(165);
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
		public TerminalNode T_WHILE() { return getToken(GraceParser.T_WHILE, 0); }
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
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmdWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T_WHILE);
			setState(169);
			match(T_LEFT_PAREN);
			setState(170);
			expression(0);
			setState(171);
			match(T_RIGHT_PAREN);
			setState(172);
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
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterForItera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitForItera(this);
		}
	}

	public final ForIteraContext forItera() throws RecognitionException {
		ForIteraContext _localctx = new ForIteraContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forItera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
		public TerminalNode T_FOR() { return getToken(GraceParser.T_FOR, 0); }
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
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdFor(this);
		}
	}

	public final CmdForContext cmdFor() throws RecognitionException {
		CmdForContext _localctx = new CmdForContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmdFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T_FOR);
			setState(179);
			match(T_LEFT_PAREN);
			setState(180);
			forInit();
			setState(181);
			match(T_SEMICOLON);
			setState(182);
			expression(0);
			setState(183);
			match(T_SEMICOLON);
			setState(184);
			forItera();
			setState(185);
			match(T_RIGHT_PAREN);
			setState(186);
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
		public TerminalNode T_STOP() { return getToken(GraceParser.T_STOP, 0); }
		public CmdStopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdStop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdStop(this);
		}
	}

	public final CmdStopContext cmdStop() throws RecognitionException {
		CmdStopContext _localctx = new CmdStopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdStop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T_STOP);
			setState(189);
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
		public TerminalNode T_SKIP() { return getToken(GraceParser.T_SKIP, 0); }
		public CmdSkipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSkip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdSkip(this);
		}
	}

	public final CmdSkipContext cmdSkip() throws RecognitionException {
		CmdSkipContext _localctx = new CmdSkipContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdSkip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T_SKIP);
			setState(192);
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
		public TerminalNode T_RETURN() { return getToken(GraceParser.T_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CmdReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdReturn(this);
		}
	}

	public final CmdReturnContext cmdReturn() throws RecognitionException {
		CmdReturnContext _localctx = new CmdReturnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T_RETURN);
			setState(195);
			expression(0);
			setState(196);
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
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CmdCallProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCallProc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdCallProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdCallProc(this);
		}
	}

	public final CmdCallProcContext cmdCallProc() throws RecognitionException {
		CmdCallProcContext _localctx = new CmdCallProcContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdCallProc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ID);
			setState(199);
			match(T_LEFT_PAREN);
			setState(200);
			expression(0);
			setState(201);
			match(T_RIGHT_PAREN);
			setState(202);
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
		public TerminalNode T_READ() { return getToken(GraceParser.T_READ, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(GraceParser.STRINGLITERAL, 0); }
		public TerminalNode NUMBERLITERAL() { return getToken(GraceParser.NUMBERLITERAL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdRead(this);
		}
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T_READ);
			setState(208);
			switch (_input.LA(1)) {
			case STRINGLITERAL:
				{
				setState(205);
				match(STRINGLITERAL);
				}
				break;
			case NUMBERLITERAL:
				{
				setState(206);
				match(NUMBERLITERAL);
				}
				break;
			case ID:
				{
				setState(207);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(210);
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

	public static class CmdWriteContext extends ParserRuleContext {
		public TerminalNode T_WRITE() { return getToken(GraceParser.T_WRITE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterCmdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitCmdWrite(this);
		}
	}

	public final CmdWriteContext cmdWrite() throws RecognitionException {
		CmdWriteContext _localctx = new CmdWriteContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmdWrite);
		try {
			setState(218);
			switch (_input.LA(1)) {
			case T_WRITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(T_WRITE);
				setState(213);
				expression(0);
				setState(214);
				match(T_SEMICOLON);
				}
				break;
			case T_COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(T_COMMA);
				setState(217);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(ID);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_LEFT_SQUARE) {
				{
				{
				setState(221);
				match(T_LEFT_SQUARE);
				setState(222);
				expression(0);
				setState(223);
				match(T_RIGHT_SQUARE);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		public Token ID;
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public SpecVarSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVarSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterSpecVarSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitSpecVarSimple(this);
		}
	}

	public final SpecVarSimpleContext specVarSimple() throws RecognitionException {
		SpecVarSimpleContext _localctx = new SpecVarSimpleContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_specVarSimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			((SpecVarSimpleContext)_localctx).ID = match(ID);
			((BlockContext)getInvokingContext(10)).symbols.add((((SpecVarSimpleContext)_localctx).ID!=null?((SpecVarSimpleContext)_localctx).ID.getText():null));
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
		public Token ID;
		public TerminalNode ID() { return getToken(GraceParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SpecVarSimpleIniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVarSimpleIni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterSpecVarSimpleIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitSpecVarSimpleIni(this);
		}
	}

	public final SpecVarSimpleIniContext specVarSimpleIni() throws RecognitionException {
		SpecVarSimpleIniContext _localctx = new SpecVarSimpleIniContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_specVarSimpleIni);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			((SpecVarSimpleIniContext)_localctx).ID = match(ID);
			setState(234);
			match(T_EQUAL);
			setState(235);
			expression(0);
			((BlockContext)getInvokingContext(10)).symbols.add((((SpecVarSimpleIniContext)_localctx).ID!=null?((SpecVarSimpleIniContext)_localctx).ID.getText():null));
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
		public TerminalNode NUMBERLITERAL() { return getToken(GraceParser.NUMBERLITERAL, 0); }
		public SpecVarArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVarArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterSpecVarArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitSpecVarArr(this);
		}
	}

	public final SpecVarArrContext specVarArr() throws RecognitionException {
		SpecVarArrContext _localctx = new SpecVarArrContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_specVarArr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			specVarSimple();
			setState(239);
			match(T_LEFT_SQUARE);
			setState(240);
			match(NUMBERLITERAL);
			setState(241);
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
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterLstArrIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitLstArrIni(this);
		}
	}

	public final LstArrIniContext lstArrIni() throws RecognitionException {
		LstArrIniContext _localctx = new LstArrIniContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_lstArrIni);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			literal();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(244);
				match(T_COMMA);
				setState(245);
				literal();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterSpecVarArrIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitSpecVarArrIni(this);
		}
	}

	public final SpecVarArrIniContext specVarArrIni() throws RecognitionException {
		SpecVarArrIniContext _localctx = new SpecVarArrIniContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_specVarArrIni);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			specVarArr();
			setState(252);
			match(T_EQUAL);
			setState(253);
			match(T_LEFT_CURLY_BRACE);
			setState(254);
			lstArrIni();
			setState(255);
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
		public SpecVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVar; }
	 
		public SpecVarContext() { }
		public void copyFrom(SpecVarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DirectSpecVarArrContext extends SpecVarContext {
		public SpecVarArrContext specVarArr() {
			return getRuleContext(SpecVarArrContext.class,0);
		}
		public DirectSpecVarArrContext(SpecVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDirectSpecVarArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDirectSpecVarArr(this);
		}
	}
	public static class DirectSpecVarSimpleIniContext extends SpecVarContext {
		public SpecVarSimpleIniContext specVarSimpleIni() {
			return getRuleContext(SpecVarSimpleIniContext.class,0);
		}
		public DirectSpecVarSimpleIniContext(SpecVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDirectSpecVarSimpleIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDirectSpecVarSimpleIni(this);
		}
	}
	public static class DirectSpecVarArrIniContext extends SpecVarContext {
		public SpecVarArrIniContext specVarArrIni() {
			return getRuleContext(SpecVarArrIniContext.class,0);
		}
		public DirectSpecVarArrIniContext(SpecVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDirectSpecVarArrIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDirectSpecVarArrIni(this);
		}
	}
	public static class DirectSpecVarContext extends SpecVarContext {
		public SpecVarSimpleContext specVarSimple() {
			return getRuleContext(SpecVarSimpleContext.class,0);
		}
		public DirectSpecVarContext(SpecVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDirectSpecVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDirectSpecVar(this);
		}
	}

	public final SpecVarContext specVar() throws RecognitionException {
		SpecVarContext _localctx = new SpecVarContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_specVar);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new DirectSpecVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				specVarSimple();
				}
				break;
			case 2:
				_localctx = new DirectSpecVarSimpleIniContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				specVarSimpleIni();
				}
				break;
			case 3:
				_localctx = new DirectSpecVarArrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				specVarArr();
				}
				break;
			case 4:
				_localctx = new DirectSpecVarArrIniContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
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
		public List<SpecVarContext> specVar() {
			return getRuleContexts(SpecVarContext.class);
		}
		public SpecVarContext specVar(int i) {
			return getRuleContext(SpecVarContext.class,i);
		}
		public ListSpecVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listSpecVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterListSpecVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitListSpecVars(this);
		}
	}

	public final ListSpecVarsContext listSpecVars() throws RecognitionException {
		ListSpecVarsContext _localctx = new ListSpecVarsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_listSpecVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			specVar();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(264);
				match(T_COMMA);
				setState(265);
				specVar();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DeclVarContext extends ParserRuleContext {
		public TerminalNode T_VAR() { return getToken(GraceParser.T_VAR, 0); }
		public ListSpecVarsContext listSpecVars() {
			return getRuleContext(ListSpecVarsContext.class,0);
		}
		public LstTypeContext lstType() {
			return getRuleContext(LstTypeContext.class,0);
		}
		public DeclVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).enterDeclVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceParserListener ) ((GraceParserListener)listener).exitDeclVar(this);
		}
	}

	public final DeclVarContext declVar() throws RecognitionException {
		DeclVarContext _localctx = new DeclVarContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T_VAR);
			setState(272);
			listSpecVars();
			setState(273);
			match(T_COLON);
			setState(274);
			lstType();
			setState(275);
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
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u0118\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\6\2D\n\2\r\2\16\2E\3\3\3\3\3\4\3\4\3\5\3\5\3\5\5\5O\n\5\3\6\3"+
		"\6\3\6\3\6\5\6U\n\6\3\7\3\7\3\b\3\b\5\b[\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\tg\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7"+
		"\fs\n\f\f\f\16\fv\13\f\3\f\7\fy\n\f\f\f\16\f|\13\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u009c\n\r\f\r\16\r\u009f\13\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a9\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00d3\n\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00dd\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u00e4\n\31\f\31\16\31\u00e7\13\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u00f9\n\35\f\35"+
		"\16\35\u00fc\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5"+
		"\37\u0108\n\37\3 \3 \3 \7 \u010d\n \f \16 \u0110\13 \3!\3!\3!\3!\3!\3"+
		"!\3!\2\3\30\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@\2\7\4\2\33\37!!\4\2!!%)\6\2  \"$*+/\60\3\2\33\37\4\2\33\34\61"+
		"\62\u011b\2C\3\2\2\2\4G\3\2\2\2\6I\3\2\2\2\bN\3\2\2\2\nT\3\2\2\2\fV\3"+
		"\2\2\2\16Z\3\2\2\2\20f\3\2\2\2\22h\3\2\2\2\24k\3\2\2\2\26p\3\2\2\2\30"+
		"\u008b\3\2\2\2\32\u00a8\3\2\2\2\34\u00aa\3\2\2\2\36\u00b0\3\2\2\2 \u00b2"+
		"\3\2\2\2\"\u00b4\3\2\2\2$\u00be\3\2\2\2&\u00c1\3\2\2\2(\u00c4\3\2\2\2"+
		"*\u00c8\3\2\2\2,\u00ce\3\2\2\2.\u00dc\3\2\2\2\60\u00de\3\2\2\2\62\u00e8"+
		"\3\2\2\2\64\u00eb\3\2\2\2\66\u00f0\3\2\2\28\u00f5\3\2\2\2:\u00fd\3\2\2"+
		"\2<\u0107\3\2\2\2>\u0109\3\2\2\2@\u0111\3\2\2\2BD\5\4\3\2CB\3\2\2\2DE"+
		"\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2GH\5\16\b\2H\5\3\2\2\2IJ\t\2\2"+
		"\2J\7\3\2\2\2KO\7\t\2\2LO\7\16\2\2MO\7\6\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2"+
		"\2\2O\t\3\2\2\2PU\7\66\2\2QU\7\67\2\2RU\7\4\2\2SU\7\5\2\2TP\3\2\2\2TQ"+
		"\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\13\3\2\2\2VW\5\20\t\2W\r\3\2\2\2X[\5@!\2"+
		"Y[\5\24\13\2ZX\3\2\2\2ZY\3\2\2\2[\17\3\2\2\2\\g\5\22\n\2]g\5\32\16\2^"+
		"g\5\34\17\2_g\5\"\22\2`g\5$\23\2ag\5&\24\2bg\5(\25\2cg\5*\26\2dg\5,\27"+
		"\2eg\5.\30\2f\\\3\2\2\2f]\3\2\2\2f^\3\2\2\2f_\3\2\2\2f`\3\2\2\2fa\3\2"+
		"\2\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\21\3\2\2\2hi\5\24\13\2i"+
		"j\7\31\2\2j\23\3\2\2\2kl\7\63\2\2lm\t\3\2\2mn\5\30\r\2no\b\13\1\2o\25"+
		"\3\2\2\2pt\7\26\2\2qs\5@!\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uz"+
		"\3\2\2\2vt\3\2\2\2wy\5\20\t\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2"+
		"{}\3\2\2\2|z\3\2\2\2}~\7\27\2\2~\177\b\f\1\2\177\27\3\2\2\2\u0080\u0081"+
		"\b\r\1\2\u0081\u0082\7\34\2\2\u0082\u008c\5\30\r\7\u0083\u0084\7.\2\2"+
		"\u0084\u008c\5\30\r\6\u0085\u0086\7\22\2\2\u0086\u0087\5\30\r\2\u0087"+
		"\u0088\7\23\2\2\u0088\u008c\3\2\2\2\u0089\u008c\7\63\2\2\u008a\u008c\5"+
		"\n\6\2\u008b\u0080\3\2\2\2\u008b\u0083\3\2\2\2\u008b\u0085\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u009d\3\2\2\2\u008d\u008e\f\13"+
		"\2\2\u008e\u008f\7-\2\2\u008f\u0090\5\30\r\2\u0090\u0091\7\32\2\2\u0091"+
		"\u0092\5\30\r\f\u0092\u009c\3\2\2\2\u0093\u0094\f\n\2\2\u0094\u0095\t"+
		"\4\2\2\u0095\u009c\5\30\r\13\u0096\u0097\f\t\2\2\u0097\u0098\t\5\2\2\u0098"+
		"\u009c\5\30\r\n\u0099\u009a\f\b\2\2\u009a\u009c\t\6\2\2\u009b\u008d\3"+
		"\2\2\2\u009b\u0093\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\31\3\2\2"+
		"\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\b\2\2\u00a1\u00a2\7\22\2\2\u00a2"+
		"\u00a3\5\30\r\2\u00a3\u00a4\7\23\2\2\u00a4\u00a5\5\f\7\2\u00a5\u00a9\3"+
		"\2\2\2\u00a6\u00a7\7\3\2\2\u00a7\u00a9\5\f\7\2\u00a8\u00a0\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\33\3\2\2\2\u00aa\u00ab\7\20\2\2\u00ab\u00ac\7\22"+
		"\2\2\u00ac\u00ad\5\30\r\2\u00ad\u00ae\7\23\2\2\u00ae\u00af\5\f\7\2\u00af"+
		"\35\3\2\2\2\u00b0\u00b1\5\22\n\2\u00b1\37\3\2\2\2\u00b2\u00b3\5\22\n\2"+
		"\u00b3!\3\2\2\2\u00b4\u00b5\7\7\2\2\u00b5\u00b6\7\22\2\2\u00b6\u00b7\5"+
		"\36\20\2\u00b7\u00b8\7\31\2\2\u00b8\u00b9\5\30\r\2\u00b9\u00ba\7\31\2"+
		"\2\u00ba\u00bb\5 \21\2\u00bb\u00bc\7\23\2\2\u00bc\u00bd\5\f\7\2\u00bd"+
		"#\3\2\2\2\u00be\u00bf\7\r\2\2\u00bf\u00c0\7\31\2\2\u00c0%\3\2\2\2\u00c1"+
		"\u00c2\7\f\2\2\u00c2\u00c3\7\31\2\2\u00c3\'\3\2\2\2\u00c4\u00c5\7\13\2"+
		"\2\u00c5\u00c6\5\30\r\2\u00c6\u00c7\7\31\2\2\u00c7)\3\2\2\2\u00c8\u00c9"+
		"\7\63\2\2\u00c9\u00ca\7\22\2\2\u00ca\u00cb\5\30\r\2\u00cb\u00cc\7\23\2"+
		"\2\u00cc\u00cd\7\31\2\2\u00cd+\3\2\2\2\u00ce\u00d2\7\n\2\2\u00cf\u00d3"+
		"\7\67\2\2\u00d0\u00d3\7\66\2\2\u00d1\u00d3\5\60\31\2\u00d2\u00cf\3\2\2"+
		"\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5"+
		"\7\31\2\2\u00d5-\3\2\2\2\u00d6\u00d7\7\21\2\2\u00d7\u00d8\5\30\r\2\u00d8"+
		"\u00d9\7\31\2\2\u00d9\u00dd\3\2\2\2\u00da\u00db\7\30\2\2\u00db\u00dd\5"+
		"\30\r\2\u00dc\u00d6\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd/\3\2\2\2\u00de\u00e5"+
		"\7\63\2\2\u00df\u00e0\7\24\2\2\u00e0\u00e1\5\30\r\2\u00e1\u00e2\7\25\2"+
		"\2\u00e2\u00e4\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\61\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00e9\7\63\2\2\u00e9\u00ea\b\32\1\2\u00ea\63\3\2\2\2\u00eb\u00ec\7\63"+
		"\2\2\u00ec\u00ed\7!\2\2\u00ed\u00ee\5\30\r\2\u00ee\u00ef\b\33\1\2\u00ef"+
		"\65\3\2\2\2\u00f0\u00f1\5\62\32\2\u00f1\u00f2\7\24\2\2\u00f2\u00f3\7\66"+
		"\2\2\u00f3\u00f4\7\25\2\2\u00f4\67\3\2\2\2\u00f5\u00fa\5\n\6\2\u00f6\u00f7"+
		"\7\30\2\2\u00f7\u00f9\5\n\6\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2"+
		"\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb9\3\2\2\2\u00fc\u00fa\3"+
		"\2\2\2\u00fd\u00fe\5\66\34\2\u00fe\u00ff\7!\2\2\u00ff\u0100\7\26\2\2\u0100"+
		"\u0101\58\35\2\u0101\u0102\7\27\2\2\u0102;\3\2\2\2\u0103\u0108\5\62\32"+
		"\2\u0104\u0108\5\64\33\2\u0105\u0108\5\66\34\2\u0106\u0108\5:\36\2\u0107"+
		"\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2"+
		"\2\2\u0108=\3\2\2\2\u0109\u010e\5<\37\2\u010a\u010b\7\30\2\2\u010b\u010d"+
		"\5<\37\2\u010c\u010a\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f?\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\17\2\2"+
		"\u0112\u0113\5> \2\u0113\u0114\7\32\2\2\u0114\u0115\5\b\5\2\u0115\u0116"+
		"\7\31\2\2\u0116A\3\2\2\2\23ENTZftz\u008b\u009b\u009d\u00a8\u00d2\u00dc"+
		"\u00e5\u00fa\u0107\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}