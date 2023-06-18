// Generated from variaveis.g4 by ANTLR 4.13.0
 import java.util.*; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class variaveisLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ID=9, 
		NUM=10, OPREL=11, OPARIT=12, PV=13, AC=14, FC=15, AP=16, FP=17, Op_atrib=18, 
		WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ID", 
			"NUM", "OPREL", "OPARIT", "PV", "AC", "FC", "AP", "FP", "Op_atrib", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fim'", "'int'", "'char'", "'double'", "'se'", "'senao'", 
			"'imprima'", null, null, null, null, "';'", "'{'", "'}'", "'('", "')'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ID", "NUM", "OPREL", 
			"OPARIT", "PV", "AC", "FC", "AP", "FP", "Op_atrib", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


		Variavel x = new Variavel();
		ControleVariavel cv = new ControleVariavel();
		String saida="";
		int escopo;
		int tipo;
		String nome;
		String t="    ";


	public variaveisLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "variaveis.g4"; }

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
		"\u0004\u0000\u0013}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\bU\b\b\u000b"+
		"\b\f\bV\u0001\t\u0004\tZ\b\t\u000b\t\f\t[\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\ng\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0004\u0012x\b\u0012\u000b\u0012\f\u0012y\u0001\u0012\u0001\u0012\u0000"+
		"\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0005"+
		"\u0002\u0000AZaz\u0001\u000009\u0002\u0000<<>>\u0003\u0000*+--//\u0003"+
		"\u0000\t\n\r\r  \u0083\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003"+
		".\u0001\u0000\u0000\u0000\u00052\u0001\u0000\u0000\u0000\u00076\u0001"+
		"\u0000\u0000\u0000\t;\u0001\u0000\u0000\u0000\u000bB\u0001\u0000\u0000"+
		"\u0000\rE\u0001\u0000\u0000\u0000\u000fK\u0001\u0000\u0000\u0000\u0011"+
		"T\u0001\u0000\u0000\u0000\u0013Y\u0001\u0000\u0000\u0000\u0015f\u0001"+
		"\u0000\u0000\u0000\u0017h\u0001\u0000\u0000\u0000\u0019j\u0001\u0000\u0000"+
		"\u0000\u001bl\u0001\u0000\u0000\u0000\u001dn\u0001\u0000\u0000\u0000\u001f"+
		"p\u0001\u0000\u0000\u0000!r\u0001\u0000\u0000\u0000#t\u0001\u0000\u0000"+
		"\u0000%w\u0001\u0000\u0000\u0000\'(\u0005i\u0000\u0000()\u0005n\u0000"+
		"\u0000)*\u0005i\u0000\u0000*+\u0005c\u0000\u0000+,\u0005i\u0000\u0000"+
		",-\u0005o\u0000\u0000-\u0002\u0001\u0000\u0000\u0000./\u0005f\u0000\u0000"+
		"/0\u0005i\u0000\u000001\u0005m\u0000\u00001\u0004\u0001\u0000\u0000\u0000"+
		"23\u0005i\u0000\u000034\u0005n\u0000\u000045\u0005t\u0000\u00005\u0006"+
		"\u0001\u0000\u0000\u000067\u0005c\u0000\u000078\u0005h\u0000\u000089\u0005"+
		"a\u0000\u00009:\u0005r\u0000\u0000:\b\u0001\u0000\u0000\u0000;<\u0005"+
		"d\u0000\u0000<=\u0005o\u0000\u0000=>\u0005u\u0000\u0000>?\u0005b\u0000"+
		"\u0000?@\u0005l\u0000\u0000@A\u0005e\u0000\u0000A\n\u0001\u0000\u0000"+
		"\u0000BC\u0005s\u0000\u0000CD\u0005e\u0000\u0000D\f\u0001\u0000\u0000"+
		"\u0000EF\u0005s\u0000\u0000FG\u0005e\u0000\u0000GH\u0005n\u0000\u0000"+
		"HI\u0005a\u0000\u0000IJ\u0005o\u0000\u0000J\u000e\u0001\u0000\u0000\u0000"+
		"KL\u0005i\u0000\u0000LM\u0005m\u0000\u0000MN\u0005p\u0000\u0000NO\u0005"+
		"r\u0000\u0000OP\u0005i\u0000\u0000PQ\u0005m\u0000\u0000QR\u0005a\u0000"+
		"\u0000R\u0010\u0001\u0000\u0000\u0000SU\u0007\u0000\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000W\u0012\u0001\u0000\u0000\u0000XZ\u0007\u0001"+
		"\u0000\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0014\u0001\u0000\u0000"+
		"\u0000]g\u0007\u0002\u0000\u0000^_\u0005>\u0000\u0000_g\u0005=\u0000\u0000"+
		"`a\u0005<\u0000\u0000ag\u0005=\u0000\u0000bc\u0005=\u0000\u0000cg\u0005"+
		"=\u0000\u0000de\u0005!\u0000\u0000eg\u0005=\u0000\u0000f]\u0001\u0000"+
		"\u0000\u0000f^\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000fb\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000g\u0016\u0001\u0000\u0000"+
		"\u0000hi\u0007\u0003\u0000\u0000i\u0018\u0001\u0000\u0000\u0000jk\u0005"+
		";\u0000\u0000k\u001a\u0001\u0000\u0000\u0000lm\u0005{\u0000\u0000m\u001c"+
		"\u0001\u0000\u0000\u0000no\u0005}\u0000\u0000o\u001e\u0001\u0000\u0000"+
		"\u0000pq\u0005(\u0000\u0000q \u0001\u0000\u0000\u0000rs\u0005)\u0000\u0000"+
		"s\"\u0001\u0000\u0000\u0000tu\u0005=\u0000\u0000u$\u0001\u0000\u0000\u0000"+
		"vx\u0007\u0004\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{|\u0006\u0012\u0000\u0000|&\u0001\u0000\u0000\u0000\u0005"+
		"\u0000V[fy\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}