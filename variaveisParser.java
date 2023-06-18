// Generated from variaveis.g4 by ANTLR 4.13.0
 import java.util.*; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class variaveisParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ID=9, 
		NUM=10, OPREL=11, OPARIT=12, PV=13, AC=14, FC=15, AP=16, FP=17, Op_atrib=18, 
		WS=19;
	public static final int
		RULE_inicio = 0, RULE_declvar = 1, RULE_tipo = 2, RULE_cmd = 3, RULE_cond_if = 4, 
		RULE_comp = 5, RULE_sr = 6, RULE_escrever = 7, RULE_atrib = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "declvar", "tipo", "cmd", "cond_if", "comp", "sr", "escrever", 
			"atrib"
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

	@Override
	public String getGrammarFileName() { return "variaveis.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Variavel x = new Variavel();
		ControleVariavel cv = new ControleVariavel();
		String saida="";
		int escopo;
		int tipo;
		String nome;
		String t="    ";

	public variaveisParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public List<DeclvarContext> declvar() {
			return getRuleContexts(DeclvarContext.class);
		}
		public DeclvarContext declvar(int i) {
			return getRuleContext(DeclvarContext.class,i);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			escopo = 0; saida+="public class Saida{\n"+t;
			setState(19);
			declvar();
			setState(20);
			match(T__0);
			escopo = 1; saida+="\n"+t+"public static void main(String args[]){\n"+t+t;
			setState(22);
			declvar();
			setState(23);
			cmd();
			setState(24);
			match(T__1);
			saida+="\n"+t+"}\n}";System.out.println(saida);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclvarContext extends ParserRuleContext {
		public Token ID;
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(variaveisParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(variaveisParser.ID, i);
		}
		public List<TerminalNode> PV() { return getTokens(variaveisParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(variaveisParser.PV, i);
		}
		public DeclvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).enterDeclvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).exitDeclvar(this);
		}
	}

	public final DeclvarContext declvar() throws RecognitionException {
		DeclvarContext _localctx = new DeclvarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declvar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				{
				setState(27);
				tipo();
				setState(28);
				((DeclvarContext)_localctx).ID = match(ID);
				x = new Variavel((((DeclvarContext)_localctx).ID!=null?((DeclvarContext)_localctx).ID.getText():null), tipo, escopo);
									boolean ret = cv.adiciona(x);
									if(!ret){
										System.out.println("Variavel "+(((DeclvarContext)_localctx).ID!=null?((DeclvarContext)_localctx).ID.getText():null)+" ja foi declarada!!!");
										System.exit(0);
									} 
								   
				setState(30);
				match(PV);
				saida+=(((DeclvarContext)_localctx).ID!=null?((DeclvarContext)_localctx).ID.getText():null)+";\n"+t+t;
				}
				}
				setState(37);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(38);
				match(T__2);
				tipo = 0; saida+="int ";
				}
				break;
			case T__3:
				{
				setState(40);
				match(T__3);
				tipo = 1; saida+="char ";
				}
				break;
			case T__4:
				{
				setState(42);
				match(T__4);
				tipo = 2; saida+="double ";
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public List<Cond_ifContext> cond_if() {
			return getRuleContexts(Cond_ifContext.class);
		}
		public Cond_ifContext cond_if(int i) {
			return getRuleContext(Cond_ifContext.class,i);
		}
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public List<EscreverContext> escrever() {
			return getRuleContexts(EscreverContext.class);
		}
		public EscreverContext escrever(int i) {
			return getRuleContext(EscreverContext.class,i);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 832L) != 0)) {
				{
				setState(49);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(46);
					cond_if();
					}
					break;
				case ID:
					{
					setState(47);
					atrib();
					}
					break;
				case T__7:
					{
					setState(48);
					escrever();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(53);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Cond_ifContext extends ParserRuleContext {
		public CompContext comp;
		public TerminalNode AP() { return getToken(variaveisParser.AP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode FP() { return getToken(variaveisParser.FP, 0); }
		public List<TerminalNode> AC() { return getTokens(variaveisParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(variaveisParser.AC, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> FC() { return getTokens(variaveisParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(variaveisParser.FC, i);
		}
		public Cond_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).enterCond_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).exitCond_if(this);
		}
	}

	public final Cond_ifContext cond_if() throws RecognitionException {
		Cond_ifContext _localctx = new Cond_ifContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cond_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			saida+="\n"+t+t;
			setState(55);
			match(T__5);
			saida+="if"; 
			setState(57);
			match(AP);
			saida+="("; 
			setState(59);
			((Cond_ifContext)_localctx).comp = comp();
			saida+=(((Cond_ifContext)_localctx).comp!=null?_input.getText(((Cond_ifContext)_localctx).comp.start,((Cond_ifContext)_localctx).comp.stop):null);
			setState(61);
			match(FP);
			saida+=")";
			setState(63);
			match(AC);
			saida+="{\n"+t+t+t; 
			setState(65);
			cmd();
			setState(66);
			match(FC);
			saida+="\n"+t+t+"}"; 
			saida+="\n"+t+t;
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(69);
				match(T__6);
				saida+="else"; 
				setState(71);
				match(AC);
				saida+="{\n"+t+t+t; 
				setState(73);
				cmd();
				setState(74);
				match(FC);
				saida+="\n"+t+t+"}"; 
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompContext extends ParserRuleContext {
		public TerminalNode OPREL() { return getToken(variaveisParser.OPREL, 0); }
		public List<TerminalNode> ID() { return getTokens(variaveisParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(variaveisParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(variaveisParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(variaveisParser.NUM, i);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).exitComp(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(80);
			match(OPREL);
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(variaveisParser.ID, 0); }
		public TerminalNode NUM() { return getToken(variaveisParser.NUM, 0); }
		public SrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).enterSr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).exitSr(this);
		}
	}

	public final SrContext sr() throws RecognitionException {
		SrContext _localctx = new SrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EscreverContext extends ParserRuleContext {
		public SrContext sr;
		public TerminalNode AP() { return getToken(variaveisParser.AP, 0); }
		public SrContext sr() {
			return getRuleContext(SrContext.class,0);
		}
		public TerminalNode FP() { return getToken(variaveisParser.FP, 0); }
		public TerminalNode PV() { return getToken(variaveisParser.PV, 0); }
		public EscreverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrever; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).enterEscrever(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).exitEscrever(this);
		}
	}

	public final EscreverContext escrever() throws RecognitionException {
		EscreverContext _localctx = new EscreverContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_escrever);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__7);
			saida+="System.out.println";
			setState(87);
			match(AP);
			saida+="(";
			setState(89);
			((EscreverContext)_localctx).sr = sr();
			saida+=(((EscreverContext)_localctx).sr!=null?_input.getText(((EscreverContext)_localctx).sr.start,((EscreverContext)_localctx).sr.stop):null);
			setState(91);
			match(FP);
			saida+=")";
			setState(93);
			match(PV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(variaveisParser.ID, 0); }
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variaveisListener ) ((variaveisListener)listener).exitAtrib(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ID);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0013b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\"\b\u0001"+
		"\n\u0001\f\u0001%\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u00032\b\u0003\n\u0003\f\u00035\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004N\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0001"+
		"\u0001\u0000\t\n_\u0000\u0012\u0001\u0000\u0000\u0000\u0002#\u0001\u0000"+
		"\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000"+
		"\b6\u0001\u0000\u0000\u0000\nO\u0001\u0000\u0000\u0000\fS\u0001\u0000"+
		"\u0000\u0000\u000eU\u0001\u0000\u0000\u0000\u0010_\u0001\u0000\u0000\u0000"+
		"\u0012\u0013\u0006\u0000\uffff\uffff\u0000\u0013\u0014\u0003\u0002\u0001"+
		"\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u0016\u0006\u0000\uffff"+
		"\uffff\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0018\u0003\u0006"+
		"\u0003\u0000\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u001a\u0006\u0000"+
		"\uffff\uffff\u0000\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001c\u0003"+
		"\u0004\u0002\u0000\u001c\u001d\u0005\t\u0000\u0000\u001d\u001e\u0006\u0001"+
		"\uffff\uffff\u0000\u001e\u001f\u0005\r\u0000\u0000\u001f \u0006\u0001"+
		"\uffff\uffff\u0000 \"\u0001\u0000\u0000\u0000!\u001b\u0001\u0000\u0000"+
		"\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000"+
		"\u0000\u0000$\u0003\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000"+
		"&\'\u0005\u0003\u0000\u0000\'-\u0006\u0002\uffff\uffff\u0000()\u0005\u0004"+
		"\u0000\u0000)-\u0006\u0002\uffff\uffff\u0000*+\u0005\u0005\u0000\u0000"+
		"+-\u0006\u0002\uffff\uffff\u0000,&\u0001\u0000\u0000\u0000,(\u0001\u0000"+
		"\u0000\u0000,*\u0001\u0000\u0000\u0000-\u0005\u0001\u0000\u0000\u0000"+
		".2\u0003\b\u0004\u0000/2\u0003\u0010\b\u000002\u0003\u000e\u0007\u0000"+
		"1.\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000010\u0001\u0000\u0000"+
		"\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u00004\u0007\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"67\u0006\u0004\uffff\uffff\u000078\u0005\u0006\u0000\u000089\u0006\u0004"+
		"\uffff\uffff\u00009:\u0005\u0010\u0000\u0000:;\u0006\u0004\uffff\uffff"+
		"\u0000;<\u0003\n\u0005\u0000<=\u0006\u0004\uffff\uffff\u0000=>\u0005\u0011"+
		"\u0000\u0000>?\u0006\u0004\uffff\uffff\u0000?@\u0005\u000e\u0000\u0000"+
		"@A\u0006\u0004\uffff\uffff\u0000AB\u0003\u0006\u0003\u0000BC\u0005\u000f"+
		"\u0000\u0000CD\u0006\u0004\uffff\uffff\u0000DM\u0006\u0004\uffff\uffff"+
		"\u0000EF\u0005\u0007\u0000\u0000FG\u0006\u0004\uffff\uffff\u0000GH\u0005"+
		"\u000e\u0000\u0000HI\u0006\u0004\uffff\uffff\u0000IJ\u0003\u0006\u0003"+
		"\u0000JK\u0005\u000f\u0000\u0000KL\u0006\u0004\uffff\uffff\u0000LN\u0001"+
		"\u0000\u0000\u0000ME\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"N\t\u0001\u0000\u0000\u0000OP\u0007\u0000\u0000\u0000PQ\u0005\u000b\u0000"+
		"\u0000QR\u0007\u0000\u0000\u0000R\u000b\u0001\u0000\u0000\u0000ST\u0007"+
		"\u0000\u0000\u0000T\r\u0001\u0000\u0000\u0000UV\u0005\b\u0000\u0000VW"+
		"\u0006\u0007\uffff\uffff\u0000WX\u0005\u0010\u0000\u0000XY\u0006\u0007"+
		"\uffff\uffff\u0000YZ\u0003\f\u0006\u0000Z[\u0006\u0007\uffff\uffff\u0000"+
		"[\\\u0005\u0011\u0000\u0000\\]\u0006\u0007\uffff\uffff\u0000]^\u0005\r"+
		"\u0000\u0000^\u000f\u0001\u0000\u0000\u0000_`\u0005\t\u0000\u0000`\u0011"+
		"\u0001\u0000\u0000\u0000\u0005#,13M";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}