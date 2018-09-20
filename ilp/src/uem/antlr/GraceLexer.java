// Generated from GraceLexer.g4 by ANTLR 4.5.3
package uem.antlr;
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T_ELSE", "T_FALSE", "T_TRUE", "T_BOOL", "T_FOR", "T_IF", "T_INT", "T_READ", 
		"T_RETURN", "T_SKIP", "T_STOP", "T_STRING", "T_VAR", "T_WHILE", "T_WRITE", 
		"T_LEFT_PAREN", "T_RIGHT_PAREN", "T_LEFT_SQUARE", "T_RIGHT_SQUARE", "T_LEFT_CURLY_BRACE", 
		"T_RIGHT_CURLY_BRACE", "T_COMMA", "T_SEMICOLON", "T_COLON", "T_PLUS", 
		"T_MINUS", "T_ASTERISK", "T_SLASH", "T_PERCENT", "T_COMP", "T_EQUAL", 
		"T_DIFFERENT", "T_GREATER", "T_GREATER_OR_EQUAL", "T_INCREMENT", "T_DECREMENT", 
		"T_INC_MULT", "T_INC_DIV", "T_INC_MOD", "T_LOWER", "T_LOWER_OR_EQUAL", 
		"T_DOT", "T_TERN", "NEG_UN", "OR", "AND", "PLUS_INC", "MINUS_DEC", "ID", 
		"COMMENT", "WS", "NUMBERLITERAL", "STRINGLITERAL", "EncodingPrefix", "SCharSequence", 
		"SChar", "EscapeSequence"
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
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\67\u0154\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\""+
		"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3"+
		"*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\62\7\62\u0113\n\62\f\62\16\62\u0116\13\62\3\62\3\62\7\62\u011a\n"+
		"\62\f\62\16\62\u011d\13\62\3\63\3\63\3\63\3\63\7\63\u0123\n\63\f\63\16"+
		"\63\u0126\13\63\3\63\3\63\3\64\6\64\u012b\n\64\r\64\16\64\u012c\3\64\3"+
		"\64\3\65\6\65\u0132\n\65\r\65\16\65\u0133\3\66\5\66\u0137\n\66\3\66\3"+
		"\66\5\66\u013b\n\66\3\66\3\66\3\67\3\67\3\67\5\67\u0142\n\67\38\68\u0145"+
		"\n8\r8\168\u0146\39\39\39\39\39\39\39\59\u0150\n9\3:\3:\3:\2\2;\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m\2o\2q"+
		"\2s\2\3\2\13\3\2aa\3\2c|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\""+
		"\"\3\2\62;\5\2NNWWww\6\2\f\f\17\17$$^^\f\2$$))AA^^cdhhppttvvxx\u015b\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3u\3\2\2\2"+
		"\5z\3\2\2\2\7\u0080\3\2\2\2\t\u0085\3\2\2\2\13\u008a\3\2\2\2\r\u008e\3"+
		"\2\2\2\17\u0091\3\2\2\2\21\u0095\3\2\2\2\23\u009a\3\2\2\2\25\u00a1\3\2"+
		"\2\2\27\u00a6\3\2\2\2\31\u00ab\3\2\2\2\33\u00b2\3\2\2\2\35\u00b6\3\2\2"+
		"\2\37\u00bc\3\2\2\2!\u00c2\3\2\2\2#\u00c4\3\2\2\2%\u00c6\3\2\2\2\'\u00c8"+
		"\3\2\2\2)\u00ca\3\2\2\2+\u00cc\3\2\2\2-\u00ce\3\2\2\2/\u00d0\3\2\2\2\61"+
		"\u00d2\3\2\2\2\63\u00d4\3\2\2\2\65\u00d6\3\2\2\2\67\u00d8\3\2\2\29\u00da"+
		"\3\2\2\2;\u00dc\3\2\2\2=\u00de\3\2\2\2?\u00e1\3\2\2\2A\u00e3\3\2\2\2C"+
		"\u00e6\3\2\2\2E\u00e8\3\2\2\2G\u00eb\3\2\2\2I\u00ee\3\2\2\2K\u00f1\3\2"+
		"\2\2M\u00f4\3\2\2\2O\u00f7\3\2\2\2Q\u00fa\3\2\2\2S\u00fc\3\2\2\2U\u00ff"+
		"\3\2\2\2W\u0101\3\2\2\2Y\u0103\3\2\2\2[\u0105\3\2\2\2]\u0108\3\2\2\2_"+
		"\u010b\3\2\2\2a\u010e\3\2\2\2c\u0114\3\2\2\2e\u011e\3\2\2\2g\u012a\3\2"+
		"\2\2i\u0131\3\2\2\2k\u0136\3\2\2\2m\u0141\3\2\2\2o\u0144\3\2\2\2q\u014f"+
		"\3\2\2\2s\u0151\3\2\2\2uv\7g\2\2vw\7n\2\2wx\7u\2\2xy\7g\2\2y\4\3\2\2\2"+
		"z{\7h\2\2{|\7c\2\2|}\7n\2\2}~\7u\2\2~\177\7g\2\2\177\6\3\2\2\2\u0080\u0081"+
		"\7v\2\2\u0081\u0082\7t\2\2\u0082\u0083\7w\2\2\u0083\u0084\7g\2\2\u0084"+
		"\b\3\2\2\2\u0085\u0086\7d\2\2\u0086\u0087\7q\2\2\u0087\u0088\7q\2\2\u0088"+
		"\u0089\7n\2\2\u0089\n\3\2\2\2\u008a\u008b\7h\2\2\u008b\u008c\7q\2\2\u008c"+
		"\u008d\7t\2\2\u008d\f\3\2\2\2\u008e\u008f\7k\2\2\u008f\u0090\7h\2\2\u0090"+
		"\16\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093\u0094\7v\2\2\u0094"+
		"\20\3\2\2\2\u0095\u0096\7t\2\2\u0096\u0097\7g\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7f\2\2\u0099\22\3\2\2\2\u009a\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c"+
		"\u009d\7v\2\2\u009d\u009e\7w\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7p\2\2"+
		"\u00a0\24\3\2\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7m\2\2\u00a3\u00a4\7"+
		"k\2\2\u00a4\u00a5\7r\2\2\u00a5\26\3\2\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8"+
		"\7v\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7r\2\2\u00aa\30\3\2\2\2\u00ab\u00ac"+
		"\7u\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7k\2\2\u00af"+
		"\u00b0\7p\2\2\u00b0\u00b1\7i\2\2\u00b1\32\3\2\2\2\u00b2\u00b3\7x\2\2\u00b3"+
		"\u00b4\7c\2\2\u00b4\u00b5\7t\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\7y\2\2\u00b7"+
		"\u00b8\7j\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7g\2\2"+
		"\u00bb\36\3\2\2\2\u00bc\u00bd\7y\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7"+
		"k\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7g\2\2\u00c1 \3\2\2\2\u00c2\u00c3"+
		"\7*\2\2\u00c3\"\3\2\2\2\u00c4\u00c5\7+\2\2\u00c5$\3\2\2\2\u00c6\u00c7"+
		"\7]\2\2\u00c7&\3\2\2\2\u00c8\u00c9\7_\2\2\u00c9(\3\2\2\2\u00ca\u00cb\7"+
		"}\2\2\u00cb*\3\2\2\2\u00cc\u00cd\7\177\2\2\u00cd,\3\2\2\2\u00ce\u00cf"+
		"\7.\2\2\u00cf.\3\2\2\2\u00d0\u00d1\7=\2\2\u00d1\60\3\2\2\2\u00d2\u00d3"+
		"\7<\2\2\u00d3\62\3\2\2\2\u00d4\u00d5\7-\2\2\u00d5\64\3\2\2\2\u00d6\u00d7"+
		"\7/\2\2\u00d7\66\3\2\2\2\u00d8\u00d9\7,\2\2\u00d98\3\2\2\2\u00da\u00db"+
		"\7\61\2\2\u00db:\3\2\2\2\u00dc\u00dd\7\'\2\2\u00dd<\3\2\2\2\u00de\u00df"+
		"\7?\2\2\u00df\u00e0\7?\2\2\u00e0>\3\2\2\2\u00e1\u00e2\7?\2\2\u00e2@\3"+
		"\2\2\2\u00e3\u00e4\7#\2\2\u00e4\u00e5\7?\2\2\u00e5B\3\2\2\2\u00e6\u00e7"+
		"\7@\2\2\u00e7D\3\2\2\2\u00e8\u00e9\7@\2\2\u00e9\u00ea\7?\2\2\u00eaF\3"+
		"\2\2\2\u00eb\u00ec\7-\2\2\u00ec\u00ed\7?\2\2\u00edH\3\2\2\2\u00ee\u00ef"+
		"\7/\2\2\u00ef\u00f0\7?\2\2\u00f0J\3\2\2\2\u00f1\u00f2\7,\2\2\u00f2\u00f3"+
		"\7?\2\2\u00f3L\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6\7?\2\2\u00f6N"+
		"\3\2\2\2\u00f7\u00f8\7\'\2\2\u00f8\u00f9\7?\2\2\u00f9P\3\2\2\2\u00fa\u00fb"+
		"\7>\2\2\u00fbR\3\2\2\2\u00fc\u00fd\7>\2\2\u00fd\u00fe\7?\2\2\u00feT\3"+
		"\2\2\2\u00ff\u0100\7\60\2\2\u0100V\3\2\2\2\u0101\u0102\7A\2\2\u0102X\3"+
		"\2\2\2\u0103\u0104\7#\2\2\u0104Z\3\2\2\2\u0105\u0106\7~\2\2\u0106\u0107"+
		"\7~\2\2\u0107\\\3\2\2\2\u0108\u0109\7(\2\2\u0109\u010a\7(\2\2\u010a^\3"+
		"\2\2\2\u010b\u010c\7-\2\2\u010c\u010d\7-\2\2\u010d`\3\2\2\2\u010e\u010f"+
		"\7/\2\2\u010f\u0110\7/\2\2\u0110b\3\2\2\2\u0111\u0113\t\2\2\2\u0112\u0111"+
		"\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u011b\t\3\2\2\u0118\u011a\t\4"+
		"\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011cd\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7\61\2\2"+
		"\u011f\u0120\7\61\2\2\u0120\u0124\3\2\2\2\u0121\u0123\n\5\2\2\u0122\u0121"+
		"\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\b\63\2\2\u0128f\3\2\2\2"+
		"\u0129\u012b\t\6\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b\64\2\2"+
		"\u012fh\3\2\2\2\u0130\u0132\t\7\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3"+
		"\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134j\3\2\2\2\u0135\u0137"+
		"\5m\67\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013a\7$\2\2\u0139\u013b\5o8\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2"+
		"\2\u013b\u013c\3\2\2\2\u013c\u013d\7$\2\2\u013dl\3\2\2\2\u013e\u013f\7"+
		"w\2\2\u013f\u0142\7:\2\2\u0140\u0142\t\b\2\2\u0141\u013e\3\2\2\2\u0141"+
		"\u0140\3\2\2\2\u0142n\3\2\2\2\u0143\u0145\5q9\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147p\3\2\2\2"+
		"\u0148\u0150\n\t\2\2\u0149\u0150\5s:\2\u014a\u014b\7^\2\2\u014b\u0150"+
		"\7\f\2\2\u014c\u014d\7^\2\2\u014d\u014e\7\17\2\2\u014e\u0150\7\f\2\2\u014f"+
		"\u0148\3\2\2\2\u014f\u0149\3\2\2\2\u014f\u014a\3\2\2\2\u014f\u014c\3\2"+
		"\2\2\u0150r\3\2\2\2\u0151\u0152\7^\2\2\u0152\u0153\t\n\2\2\u0153t\3\2"+
		"\2\2\r\2\u0114\u011b\u0124\u012c\u0133\u0136\u013a\u0141\u0146\u014f\3"+
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