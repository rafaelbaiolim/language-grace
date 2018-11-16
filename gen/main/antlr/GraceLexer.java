// Generated from /home/rafaellb/Documents/uem/ilp2018/compilador2018/src/main/antlr/GraceLexer.g4 by ANTLR 4.7
package main.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraceLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_DEF=1, T_ELSE=2, T_FALSE=3, T_TRUE=4, T_BOOL=5, T_FOR=6, T_IF=7, T_INT=8, 
		T_READ=9, T_RETURN=10, T_SKIP=11, T_STOP=12, T_STRING=13, T_VAR=14, T_WHILE=15, 
		T_WRITE=16, T_LEFT_PAREN=17, T_RIGHT_PAREN=18, T_LEFT_SQUARE=19, T_RIGHT_SQUARE=20, 
		T_LEFT_CURLY_BRACE=21, T_RIGHT_CURLY_BRACE=22, T_COMMA=23, T_SEMICOLON=24, 
		T_COLON=25, T_PLUS=26, T_MINUS=27, T_ASTERISK=28, T_SLASH=29, T_PERCENT=30, 
		T_COMP=31, T_EQUAL=32, T_DIFFERENT=33, T_GREATER=34, T_GREATER_OR_EQUAL=35, 
		T_INCREMENT=36, T_DECREMENT=37, T_INC_MULT=38, T_INC_DIV=39, T_INC_MOD=40, 
		T_LOWER=41, T_LOWER_OR_EQUAL=42, T_DOT=43, T_TERN=44, NEG_UN=45, OR=46, 
		AND=47, PLUS_INC=48, MINUS_DEC=49, ID=50, COMMENT=51, WS=52, NUMBERLITERAL=53, 
		STRINGLITERAL=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T_DEF", "T_ELSE", "T_FALSE", "T_TRUE", "T_BOOL", "T_FOR", "T_IF", "T_INT", 
		"T_READ", "T_RETURN", "T_SKIP", "T_STOP", "T_STRING", "T_VAR", "T_WHILE", 
		"T_WRITE", "T_LEFT_PAREN", "T_RIGHT_PAREN", "T_LEFT_SQUARE", "T_RIGHT_SQUARE", 
		"T_LEFT_CURLY_BRACE", "T_RIGHT_CURLY_BRACE", "T_COMMA", "T_SEMICOLON", 
		"T_COLON", "T_PLUS", "T_MINUS", "T_ASTERISK", "T_SLASH", "T_PERCENT", 
		"T_COMP", "T_EQUAL", "T_DIFFERENT", "T_GREATER", "T_GREATER_OR_EQUAL", 
		"T_INCREMENT", "T_DECREMENT", "T_INC_MULT", "T_INC_DIV", "T_INC_MOD", 
		"T_LOWER", "T_LOWER_OR_EQUAL", "T_DOT", "T_TERN", "NEG_UN", "OR", "AND", 
		"PLUS_INC", "MINUS_DEC", "ID", "COMMENT", "WS", "NUMBERLITERAL", "STRINGLITERAL", 
		"EncodingPrefix", "SCharSequence", "SChar", "EscapeSequence"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'def'", "'else'", "'false'", "'true'", "'bool'", "'for'", "'if'", 
		"'int'", "'read'", "'return'", "'skip'", "'stop'", "'string'", "'var'", 
		"'while'", "'write'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", 
		"';'", "':'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'='", "'!='", 
		"'>'", "'>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'<'", "'<='", 
		"'.'", "'?'", "'!'", "'||'", "'&&'", "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "T_DEF", "T_ELSE", "T_FALSE", "T_TRUE", "T_BOOL", "T_FOR", "T_IF", 
		"T_INT", "T_READ", "T_RETURN", "T_SKIP", "T_STOP", "T_STRING", "T_VAR", 
		"T_WHILE", "T_WRITE", "T_LEFT_PAREN", "T_RIGHT_PAREN", "T_LEFT_SQUARE", 
		"T_RIGHT_SQUARE", "T_LEFT_CURLY_BRACE", "T_RIGHT_CURLY_BRACE", "T_COMMA", 
		"T_SEMICOLON", "T_COLON", "T_PLUS", "T_MINUS", "T_ASTERISK", "T_SLASH", 
		"T_PERCENT", "T_COMP", "T_EQUAL", "T_DIFFERENT", "T_GREATER", "T_GREATER_OR_EQUAL", 
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


	public GraceLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GraceLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u015a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3("+
		"\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\7\63\u0119\n\63\f\63\16\63\u011c"+
		"\13\63\3\63\3\63\7\63\u0120\n\63\f\63\16\63\u0123\13\63\3\64\3\64\3\64"+
		"\3\64\7\64\u0129\n\64\f\64\16\64\u012c\13\64\3\64\3\64\3\65\6\65\u0131"+
		"\n\65\r\65\16\65\u0132\3\65\3\65\3\66\6\66\u0138\n\66\r\66\16\66\u0139"+
		"\3\67\5\67\u013d\n\67\3\67\3\67\5\67\u0141\n\67\3\67\3\67\38\38\38\58"+
		"\u0148\n8\39\69\u014b\n9\r9\169\u014c\3:\3:\3:\3:\3:\3:\3:\5:\u0156\n"+
		":\3;\3;\3;\2\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o\2q\2s\2u\2\3\2\13\3\2aa\3\2c|\6\2\62;C\\aac|\4\2\f\f\17"+
		"\17\5\2\13\f\17\17\"\"\3\2\62;\5\2NNWWww\6\2\f\f\17\17$$^^\f\2$$))AA^"+
		"^cdhhppttvvxx\2\u0161\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\3w\3\2\2\2\5{\3\2\2\2\7\u0080\3\2\2\2\t\u0086"+
		"\3\2\2\2\13\u008b\3\2\2\2\r\u0090\3\2\2\2\17\u0094\3\2\2\2\21\u0097\3"+
		"\2\2\2\23\u009b\3\2\2\2\25\u00a0\3\2\2\2\27\u00a7\3\2\2\2\31\u00ac\3\2"+
		"\2\2\33\u00b1\3\2\2\2\35\u00b8\3\2\2\2\37\u00bc\3\2\2\2!\u00c2\3\2\2\2"+
		"#\u00c8\3\2\2\2%\u00ca\3\2\2\2\'\u00cc\3\2\2\2)\u00ce\3\2\2\2+\u00d0\3"+
		"\2\2\2-\u00d2\3\2\2\2/\u00d4\3\2\2\2\61\u00d6\3\2\2\2\63\u00d8\3\2\2\2"+
		"\65\u00da\3\2\2\2\67\u00dc\3\2\2\29\u00de\3\2\2\2;\u00e0\3\2\2\2=\u00e2"+
		"\3\2\2\2?\u00e4\3\2\2\2A\u00e7\3\2\2\2C\u00e9\3\2\2\2E\u00ec\3\2\2\2G"+
		"\u00ee\3\2\2\2I\u00f1\3\2\2\2K\u00f4\3\2\2\2M\u00f7\3\2\2\2O\u00fa\3\2"+
		"\2\2Q\u00fd\3\2\2\2S\u0100\3\2\2\2U\u0102\3\2\2\2W\u0105\3\2\2\2Y\u0107"+
		"\3\2\2\2[\u0109\3\2\2\2]\u010b\3\2\2\2_\u010e\3\2\2\2a\u0111\3\2\2\2c"+
		"\u0114\3\2\2\2e\u011a\3\2\2\2g\u0124\3\2\2\2i\u0130\3\2\2\2k\u0137\3\2"+
		"\2\2m\u013c\3\2\2\2o\u0147\3\2\2\2q\u014a\3\2\2\2s\u0155\3\2\2\2u\u0157"+
		"\3\2\2\2wx\7f\2\2xy\7g\2\2yz\7h\2\2z\4\3\2\2\2{|\7g\2\2|}\7n\2\2}~\7u"+
		"\2\2~\177\7g\2\2\177\6\3\2\2\2\u0080\u0081\7h\2\2\u0081\u0082\7c\2\2\u0082"+
		"\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084\u0085\7g\2\2\u0085\b\3\2\2\2\u0086"+
		"\u0087\7v\2\2\u0087\u0088\7t\2\2\u0088\u0089\7w\2\2\u0089\u008a\7g\2\2"+
		"\u008a\n\3\2\2\2\u008b\u008c\7d\2\2\u008c\u008d\7q\2\2\u008d\u008e\7q"+
		"\2\2\u008e\u008f\7n\2\2\u008f\f\3\2\2\2\u0090\u0091\7h\2\2\u0091\u0092"+
		"\7q\2\2\u0092\u0093\7t\2\2\u0093\16\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096"+
		"\7h\2\2\u0096\20\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a"+
		"\7v\2\2\u009a\22\3\2\2\2\u009b\u009c\7t\2\2\u009c\u009d\7g\2\2\u009d\u009e"+
		"\7c\2\2\u009e\u009f\7f\2\2\u009f\24\3\2\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2"+
		"\7g\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7t\2\2\u00a5"+
		"\u00a6\7p\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7m\2\2\u00a9"+
		"\u00aa\7k\2\2\u00aa\u00ab\7r\2\2\u00ab\30\3\2\2\2\u00ac\u00ad\7u\2\2\u00ad"+
		"\u00ae\7v\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7r\2\2\u00b0\32\3\2\2\2\u00b1"+
		"\u00b2\7u\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7k\2\2"+
		"\u00b5\u00b6\7p\2\2\u00b6\u00b7\7i\2\2\u00b7\34\3\2\2\2\u00b8\u00b9\7"+
		"x\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7t\2\2\u00bb\36\3\2\2\2\u00bc\u00bd"+
		"\7y\2\2\u00bd\u00be\7j\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7n\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1 \3\2\2\2\u00c2\u00c3\7y\2\2\u00c3\u00c4\7t\2\2\u00c4"+
		"\u00c5\7k\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7g\2\2\u00c7\"\3\2\2\2\u00c8"+
		"\u00c9\7*\2\2\u00c9$\3\2\2\2\u00ca\u00cb\7+\2\2\u00cb&\3\2\2\2\u00cc\u00cd"+
		"\7]\2\2\u00cd(\3\2\2\2\u00ce\u00cf\7_\2\2\u00cf*\3\2\2\2\u00d0\u00d1\7"+
		"}\2\2\u00d1,\3\2\2\2\u00d2\u00d3\7\177\2\2\u00d3.\3\2\2\2\u00d4\u00d5"+
		"\7.\2\2\u00d5\60\3\2\2\2\u00d6\u00d7\7=\2\2\u00d7\62\3\2\2\2\u00d8\u00d9"+
		"\7<\2\2\u00d9\64\3\2\2\2\u00da\u00db\7-\2\2\u00db\66\3\2\2\2\u00dc\u00dd"+
		"\7/\2\2\u00dd8\3\2\2\2\u00de\u00df\7,\2\2\u00df:\3\2\2\2\u00e0\u00e1\7"+
		"\61\2\2\u00e1<\3\2\2\2\u00e2\u00e3\7\'\2\2\u00e3>\3\2\2\2\u00e4\u00e5"+
		"\7?\2\2\u00e5\u00e6\7?\2\2\u00e6@\3\2\2\2\u00e7\u00e8\7?\2\2\u00e8B\3"+
		"\2\2\2\u00e9\u00ea\7#\2\2\u00ea\u00eb\7?\2\2\u00ebD\3\2\2\2\u00ec\u00ed"+
		"\7@\2\2\u00edF\3\2\2\2\u00ee\u00ef\7@\2\2\u00ef\u00f0\7?\2\2\u00f0H\3"+
		"\2\2\2\u00f1\u00f2\7-\2\2\u00f2\u00f3\7?\2\2\u00f3J\3\2\2\2\u00f4\u00f5"+
		"\7/\2\2\u00f5\u00f6\7?\2\2\u00f6L\3\2\2\2\u00f7\u00f8\7,\2\2\u00f8\u00f9"+
		"\7?\2\2\u00f9N\3\2\2\2\u00fa\u00fb\7\61\2\2\u00fb\u00fc\7?\2\2\u00fcP"+
		"\3\2\2\2\u00fd\u00fe\7\'\2\2\u00fe\u00ff\7?\2\2\u00ffR\3\2\2\2\u0100\u0101"+
		"\7>\2\2\u0101T\3\2\2\2\u0102\u0103\7>\2\2\u0103\u0104\7?\2\2\u0104V\3"+
		"\2\2\2\u0105\u0106\7\60\2\2\u0106X\3\2\2\2\u0107\u0108\7A\2\2\u0108Z\3"+
		"\2\2\2\u0109\u010a\7#\2\2\u010a\\\3\2\2\2\u010b\u010c\7~\2\2\u010c\u010d"+
		"\7~\2\2\u010d^\3\2\2\2\u010e\u010f\7(\2\2\u010f\u0110\7(\2\2\u0110`\3"+
		"\2\2\2\u0111\u0112\7-\2\2\u0112\u0113\7-\2\2\u0113b\3\2\2\2\u0114\u0115"+
		"\7/\2\2\u0115\u0116\7/\2\2\u0116d\3\2\2\2\u0117\u0119\t\2\2\2\u0118\u0117"+
		"\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0121\t\3\2\2\u011e\u0120\t\4"+
		"\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122f\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\61\2\2"+
		"\u0125\u0126\7\61\2\2\u0126\u012a\3\2\2\2\u0127\u0129\n\5\2\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\b\64\2\2\u012eh\3\2\2\2"+
		"\u012f\u0131\t\6\2\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\b\65\2\2"+
		"\u0135j\3\2\2\2\u0136\u0138\t\7\2\2\u0137\u0136\3\2\2\2\u0138\u0139\3"+
		"\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013al\3\2\2\2\u013b\u013d"+
		"\5o8\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0140\7$\2\2\u013f\u0141\5q9\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2"+
		"\2\u0141\u0142\3\2\2\2\u0142\u0143\7$\2\2\u0143n\3\2\2\2\u0144\u0145\7"+
		"w\2\2\u0145\u0148\7:\2\2\u0146\u0148\t\b\2\2\u0147\u0144\3\2\2\2\u0147"+
		"\u0146\3\2\2\2\u0148p\3\2\2\2\u0149\u014b\5s:\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014dr\3\2\2\2"+
		"\u014e\u0156\n\t\2\2\u014f\u0156\5u;\2\u0150\u0151\7^\2\2\u0151\u0156"+
		"\7\f\2\2\u0152\u0153\7^\2\2\u0153\u0154\7\17\2\2\u0154\u0156\7\f\2\2\u0155"+
		"\u014e\3\2\2\2\u0155\u014f\3\2\2\2\u0155\u0150\3\2\2\2\u0155\u0152\3\2"+
		"\2\2\u0156t\3\2\2\2\u0157\u0158\7^\2\2\u0158\u0159\t\n\2\2\u0159v\3\2"+
		"\2\2\r\2\u011a\u0121\u012a\u0132\u0139\u013c\u0140\u0147\u014c\u0155\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}