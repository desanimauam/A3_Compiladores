// Generated from jiboia.g4 by ANTLR 4.13.0
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
public class jiboiaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		WS=32, Soma=33, Subtracao=34, Multiplicacao=35, Divisao=36, Modulo=37, 
		NUMERO=38, TEXTO=39, ID=40, AP=41, FP=42;
	public static final int
		RULE_programa = 0, RULE_tipo = 1, RULE_infVariavel = 2, RULE_decVariavel = 3, 
		RULE_chamadaFuncao = 4, RULE_comPor = 5, RULE_inicioPor = 6, RULE_atualizaPor = 7, 
		RULE_comando = 8, RULE_atribuicao = 9, RULE_atribuicaoComposta = 10, RULE_comandoSe = 11, 
		RULE_comandoSenao = 12, RULE_comandoSenaoSe = 13, RULE_comandoEnquanto = 14, 
		RULE_bloco = 15, RULE_condicao = 16, RULE_atribuicaoBooleana = 17, RULE_operadorRelacional = 18, 
		RULE_expressao = 19, RULE_expressaoRelacional = 20, RULE_expressaoAritmetica = 21, 
		RULE_expressaoLogica = 22, RULE_operadorLogico = 23, RULE_termo = 24, 
		RULE_decVariavelBooleana = 25, RULE_fator = 26, RULE_variavel = 27, RULE_imprimivel = 28, 
		RULE_comandoImprimir = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "tipo", "infVariavel", "decVariavel", "chamadaFuncao", "comPor", 
			"inicioPor", "atualizaPor", "comando", "atribuicao", "atribuicaoComposta", 
			"comandoSe", "comandoSenao", "comandoSenaoSe", "comandoEnquanto", "bloco", 
			"condicao", "atribuicaoBooleana", "operadorRelacional", "expressao", 
			"expressaoRelacional", "expressaoAritmetica", "expressaoLogica", "operadorLogico", 
			"termo", "decVariavelBooleana", "fator", "variavel", "imprimivel", "comandoImprimir"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inteiro'", "'duplo'", "'texto'", "'booleano'", "'='", "'.'", 
			"','", "'por'", "';'", "':'", "'+='", "'-='", "'*='", "'/='", "'%='", 
			"'se'", "'senao'", "'senaose'", "'enquanto'", "'=='", "'!='", "'<'", 
			"'>'", "'<='", "'>='", "'e'", "'ou'", "'!'", "'verdadeiro'", "'falso'", 
			"'imprima'", null, "'+'", "'-'", "'*'", "'/'", "'%'", null, null, null, 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "Soma", "Subtracao", 
			"Multiplicacao", "Divisao", "Modulo", "NUMERO", "TEXTO", "ID", "AP", 
			"FP"
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
	public String getGrammarFileName() { return "jiboia.g4"; }

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

	public jiboiaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(jiboiaParser.EOF, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<ComandoSeContext> comandoSe() {
			return getRuleContexts(ComandoSeContext.class);
		}
		public ComandoSeContext comandoSe(int i) {
			return getRuleContext(ComandoSeContext.class,i);
		}
		public List<ComandoEnquantoContext> comandoEnquanto() {
			return getRuleContexts(ComandoEnquantoContext.class);
		}
		public ComandoEnquantoContext comandoEnquanto(int i) {
			return getRuleContext(ComandoEnquantoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			saida+="public class Saida{\n"+t+"\n"+t+"public static void main(String args[]){\n";
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1101659701534L) != 0)) {
				{
				setState(64);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(61);
					comando();
					}
					break;
				case 2:
					{
					setState(62);
					comandoSe();
					}
					break;
				case 3:
					{
					setState(63);
					comandoEnquanto();
					}
					break;
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(EOF);
			saida+="\n"+t+"}\n}";  System.out.println(saida);
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
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
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
	public static class InfVariavelContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public InfVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterInfVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitInfVariavel(this);
		}
	}

	public final InfVariavelContext infVariavel() throws RecognitionException {
		InfVariavelContext _localctx = new InfVariavelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_infVariavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(74);
				match(T__4);
				setState(75);
				expressao();
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
	public static class DecVariavelContext extends ParserRuleContext {
		public TipoContext tipo;
		public Token ID;
		public InfVariavelContext infVariavel;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(jiboiaParser.ID, 0); }
		public InfVariavelContext infVariavel() {
			return getRuleContext(InfVariavelContext.class,0);
		}
		public DecVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterDecVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitDecVariavel(this);
		}
	}

	public final DecVariavelContext decVariavel() throws RecognitionException {
		DecVariavelContext _localctx = new DecVariavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decVariavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((DecVariavelContext)_localctx).tipo = tipo();
			setState(79);
			((DecVariavelContext)_localctx).ID = match(ID);
			setState(80);
			((DecVariavelContext)_localctx).infVariavel = infVariavel();
			saida+= ""+t+t + (((DecVariavelContext)_localctx).tipo!=null?_input.getText(((DecVariavelContext)_localctx).tipo.start,((DecVariavelContext)_localctx).tipo.stop):null) + " " + (((DecVariavelContext)_localctx).ID!=null?((DecVariavelContext)_localctx).ID.getText():null) + (((DecVariavelContext)_localctx).infVariavel!=null?_input.getText(((DecVariavelContext)_localctx).infVariavel.start,((DecVariavelContext)_localctx).infVariavel.stop):null) + ";\n";
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
	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(jiboiaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(jiboiaParser.ID, i);
		}
		public TerminalNode AP() { return getToken(jiboiaParser.AP, 0); }
		public TerminalNode FP() { return getToken(jiboiaParser.FP, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitChamadaFuncao(this);
		}
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(ID);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(84);
				match(T__5);
				setState(85);
				match(ID);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(AP);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4124779216896L) != 0)) {
				{
				setState(92);
				expressao();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(93);
					match(T__6);
					setState(94);
					expressao();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(102);
			match(FP);
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
	public static class ComPorContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(jiboiaParser.AP, 0); }
		public InicioPorContext inicioPor() {
			return getRuleContext(InicioPorContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public AtualizaPorContext atualizaPor() {
			return getRuleContext(AtualizaPorContext.class,0);
		}
		public TerminalNode FP() { return getToken(jiboiaParser.FP, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ComPorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comPor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterComPor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitComPor(this);
		}
	}

	public final ComPorContext comPor() throws RecognitionException {
		ComPorContext _localctx = new ComPorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comPor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__7);
			setState(105);
			match(AP);
			setState(106);
			inicioPor();
			setState(107);
			match(T__8);
			setState(108);
			condicao();
			setState(109);
			match(T__8);
			setState(110);
			atualizaPor();
			setState(111);
			match(FP);
			setState(112);
			match(T__9);
			setState(113);
			bloco();
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
	public static class InicioPorContext extends ParserRuleContext {
		public DecVariavelContext decVariavel() {
			return getRuleContext(DecVariavelContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public InicioPorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicioPor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterInicioPor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitInicioPor(this);
		}
	}

	public final InicioPorContext inicioPor() throws RecognitionException {
		InicioPorContext _localctx = new InicioPorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inicioPor);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				decVariavel();
				}
				break;
			case T__28:
			case T__29:
			case NUMERO:
			case TEXTO:
			case ID:
			case AP:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtualizaPorContext extends ParserRuleContext {
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public AtualizaPorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atualizaPor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterAtualizaPor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitAtualizaPor(this);
		}
	}

	public final AtualizaPorContext atualizaPor() throws RecognitionException {
		AtualizaPorContext _localctx = new AtualizaPorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atualizaPor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			atribuicao();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(120);
				match(T__6);
				setState(121);
				atribuicao();
				}
				}
				setState(126);
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
	public static class ComandoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public DecVariavelContext decVariavel() {
			return getRuleContext(DecVariavelContext.class,0);
		}
		public ComandoImprimirContext comandoImprimir() {
			return getRuleContext(ComandoImprimirContext.class,0);
		}
		public ComPorContext comPor() {
			return getRuleContext(ComPorContext.class,0);
		}
		public ComandoSeContext comandoSe() {
			return getRuleContext(ComandoSeContext.class,0);
		}
		public ComandoEnquantoContext comandoEnquanto() {
			return getRuleContext(ComandoEnquantoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comando);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				chamadaFuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				decVariavel();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				comandoImprimir();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				comPor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				comandoSe();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
				comandoEnquanto();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public AtribuicaoCompostaContext atribuicaoComposta() {
			return getRuleContext(AtribuicaoCompostaContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			variavel();
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				{
				setState(137);
				atribuicaoComposta();
				}
				break;
			case T__4:
				{
				setState(138);
				match(T__4);
				setState(139);
				expressao();
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
	public static class AtribuicaoCompostaContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoCompostaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoComposta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterAtribuicaoComposta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitAtribuicaoComposta(this);
		}
	}

	public final AtribuicaoCompostaContext atribuicaoComposta() throws RecognitionException {
		AtribuicaoCompostaContext _localctx = new AtribuicaoCompostaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atribuicaoComposta);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__10);
				setState(143);
				expressao();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(T__11);
				setState(145);
				expressao();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(T__12);
				setState(147);
				expressao();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(T__13);
				setState(149);
				expressao();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(T__14);
				setState(151);
				expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoSeContext extends ParserRuleContext {
		public CondicaoContext condicao;
		public BlocoContext bloco;
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public List<ComandoSenaoSeContext> comandoSenaoSe() {
			return getRuleContexts(ComandoSenaoSeContext.class);
		}
		public ComandoSenaoSeContext comandoSenaoSe(int i) {
			return getRuleContext(ComandoSenaoSeContext.class,i);
		}
		public ComandoSenaoContext comandoSenao() {
			return getRuleContext(ComandoSenaoContext.class,0);
		}
		public ComandoSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterComandoSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitComandoSe(this);
		}
	}

	public final ComandoSeContext comandoSe() throws RecognitionException {
		ComandoSeContext _localctx = new ComandoSeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comandoSe);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__15);
			saida+="\n" + t+t + "if (";
			setState(156);
			((ComandoSeContext)_localctx).condicao = condicao();
			saida+=(((ComandoSeContext)_localctx).condicao!=null?_input.getText(((ComandoSeContext)_localctx).condicao.start,((ComandoSeContext)_localctx).condicao.stop):null) + "){\n";
			setState(158);
			match(T__9);
			saida+=""+t+t;
			setState(160);
			((ComandoSeContext)_localctx).bloco = bloco();
			saida+=(((ComandoSeContext)_localctx).bloco!=null?_input.getText(((ComandoSeContext)_localctx).bloco.start,((ComandoSeContext)_localctx).bloco.stop):null) + "\n"+t+t+t;
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					comandoSenaoSe();
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(168);
				comandoSenao();
				}
				break;
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
	public static class ComandoSenaoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ComandoSenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoSenao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterComandoSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitComandoSenao(this);
		}
	}

	public final ComandoSenaoContext comandoSenao() throws RecognitionException {
		ComandoSenaoContext _localctx = new ComandoSenaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comandoSenao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__16);
			setState(172);
			match(T__9);
			setState(173);
			bloco();
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
	public static class ComandoSenaoSeContext extends ParserRuleContext {
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ComandoSenaoSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoSenaoSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterComandoSenaoSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitComandoSenaoSe(this);
		}
	}

	public final ComandoSenaoSeContext comandoSenaoSe() throws RecognitionException {
		ComandoSenaoSeContext _localctx = new ComandoSenaoSeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comandoSenaoSe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__17);
			setState(176);
			condicao();
			setState(177);
			match(T__9);
			setState(178);
			bloco();
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
	public static class ComandoEnquantoContext extends ParserRuleContext {
		public CondicaoContext condicao;
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ComandoEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterComandoEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitComandoEnquanto(this);
		}
	}

	public final ComandoEnquantoContext comandoEnquanto() throws RecognitionException {
		ComandoEnquantoContext _localctx = new ComandoEnquantoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comandoEnquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__18);
			saida+="while (";
			setState(182);
			((ComandoEnquantoContext)_localctx).condicao = condicao();
			saida+="(((ComandoEnquantoContext)_localctx).condicao!=null?_input.getText(((ComandoEnquantoContext)_localctx).condicao.start,((ComandoEnquantoContext)_localctx).condicao.stop):null)){\n";
			setState(184);
			match(T__9);
			setState(185);
			bloco();
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
	public static class BlocoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bloco);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(187);
					comando();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(190); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class CondicaoContext extends ParserRuleContext {
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			expressaoLogica();
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
	public static class AtribuicaoBooleanaContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public AtribuicaoBooleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoBooleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterAtribuicaoBooleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitAtribuicaoBooleana(this);
		}
	}

	public final AtribuicaoBooleanaContext atribuicaoBooleana() throws RecognitionException {
		AtribuicaoBooleanaContext _localctx = new AtribuicaoBooleanaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atribuicaoBooleana);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			variavel();
			setState(195);
			match(T__4);
			setState(196);
			expressaoLogica();
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
	public static class OperadorRelacionalContext extends ParserRuleContext {
		public OperadorRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterOperadorRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitOperadorRelacional(this);
		}
	}

	public final OperadorRelacionalContext operadorRelacional() throws RecognitionException {
		OperadorRelacionalContext _localctx = new OperadorRelacionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operadorRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66060320L) != 0)) ) {
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
	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressao);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				expressaoLogica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				expressaoAritmetica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public OperadorRelacionalContext operadorRelacional() {
			return getRuleContext(OperadorRelacionalContext.class,0);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitExpressaoRelacional(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressaoRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			expressaoAritmetica();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 66060320L) != 0)) {
				{
				setState(205);
				operadorRelacional();
				setState(206);
				expressaoAritmetica();
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
	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public FatorContext fator;
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> Soma() { return getTokens(jiboiaParser.Soma); }
		public TerminalNode Soma(int i) {
			return getToken(jiboiaParser.Soma, i);
		}
		public List<TerminalNode> Subtracao() { return getTokens(jiboiaParser.Subtracao); }
		public TerminalNode Subtracao(int i) {
			return getToken(jiboiaParser.Subtracao, i);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitExpressaoAritmetica(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressaoAritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			((ExpressaoAritmeticaContext)_localctx).fator = fator();
			saida+="(((ExpressaoAritmeticaContext)_localctx).fator!=null?_input.getText(((ExpressaoAritmeticaContext)_localctx).fator.start,((ExpressaoAritmeticaContext)_localctx).fator.stop):null)){\n";
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Soma || _la==Subtracao) {
				{
				{
				setState(212);
				_la = _input.LA(1);
				if ( !(_la==Soma || _la==Subtracao) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(213);
				((ExpressaoAritmeticaContext)_localctx).fator = fator();
				}
				}
				setState(218);
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
	public static class ExpressaoLogicaContext extends ParserRuleContext {
		public List<ExpressaoRelacionalContext> expressaoRelacional() {
			return getRuleContexts(ExpressaoRelacionalContext.class);
		}
		public ExpressaoRelacionalContext expressaoRelacional(int i) {
			return getRuleContext(ExpressaoRelacionalContext.class,i);
		}
		public List<OperadorLogicoContext> operadorLogico() {
			return getRuleContexts(OperadorLogicoContext.class);
		}
		public OperadorLogicoContext operadorLogico(int i) {
			return getRuleContext(OperadorLogicoContext.class,i);
		}
		public ExpressaoLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterExpressaoLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitExpressaoLogica(this);
		}
	}

	public final ExpressaoLogicaContext expressaoLogica() throws RecognitionException {
		ExpressaoLogicaContext _localctx = new ExpressaoLogicaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressaoLogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			expressaoRelacional();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) {
				{
				{
				setState(220);
				operadorLogico();
				setState(221);
				expressaoRelacional();
				}
				}
				setState(227);
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
	public static class OperadorLogicoContext extends ParserRuleContext {
		public OperadorLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorLogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterOperadorLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitOperadorLogico(this);
		}
	}

	public final OperadorLogicoContext operadorLogico() throws RecognitionException {
		OperadorLogicoContext _localctx = new OperadorLogicoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operadorLogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) ) {
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
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> Multiplicacao() { return getTokens(jiboiaParser.Multiplicacao); }
		public TerminalNode Multiplicacao(int i) {
			return getToken(jiboiaParser.Multiplicacao, i);
		}
		public List<TerminalNode> Divisao() { return getTokens(jiboiaParser.Divisao); }
		public TerminalNode Divisao(int i) {
			return getToken(jiboiaParser.Divisao, i);
		}
		public List<TerminalNode> Modulo() { return getTokens(jiboiaParser.Modulo); }
		public TerminalNode Modulo(int i) {
			return getToken(jiboiaParser.Modulo, i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			fator();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) {
				{
				{
				setState(231);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(232);
				fator();
				}
				}
				setState(237);
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
	public static class DecVariavelBooleanaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(jiboiaParser.ID, 0); }
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public DecVariavelBooleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decVariavelBooleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterDecVariavelBooleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitDecVariavelBooleana(this);
		}
	}

	public final DecVariavelBooleanaContext decVariavelBooleana() throws RecognitionException {
		DecVariavelBooleanaContext _localctx = new DecVariavelBooleanaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_decVariavelBooleana);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__3);
			setState(239);
			match(ID);
			setState(240);
			match(T__4);
			setState(241);
			expressaoLogica();
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
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(jiboiaParser.NUMERO, 0); }
		public TerminalNode TEXTO() { return getToken(jiboiaParser.TEXTO, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode AP() { return getToken(jiboiaParser.AP, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(jiboiaParser.FP, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fator);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(NUMERO);
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(TEXTO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				variavel();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(247);
				match(T__29);
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				match(AP);
				setState(249);
				expressao();
				setState(250);
				match(FP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(jiboiaParser.ID, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImprimivelContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(jiboiaParser.NUMERO, 0); }
		public TerminalNode TEXTO() { return getToken(jiboiaParser.TEXTO, 0); }
		public ImprimivelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimivel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterImprimivel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitImprimivel(this);
		}
	}

	public final ImprimivelContext imprimivel() throws RecognitionException {
		ImprimivelContext _localctx = new ImprimivelContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_imprimivel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(256);
				variavel();
				}
				break;
			case NUMERO:
				{
				setState(257);
				match(NUMERO);
				}
				break;
			case TEXTO:
				{
				setState(258);
				match(TEXTO);
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
	public static class ComandoImprimirContext extends ParserRuleContext {
		public ImprimivelContext imprimivel;
		public TerminalNode AP() { return getToken(jiboiaParser.AP, 0); }
		public ImprimivelContext imprimivel() {
			return getRuleContext(ImprimivelContext.class,0);
		}
		public TerminalNode FP() { return getToken(jiboiaParser.FP, 0); }
		public ComandoImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoImprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).enterComandoImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jiboiaListener ) ((jiboiaListener)listener).exitComandoImprimir(this);
		}
	}

	public final ComandoImprimirContext comandoImprimir() throws RecognitionException {
		ComandoImprimirContext _localctx = new ComandoImprimirContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_comandoImprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__30);
			saida+="System.out.println";
			setState(263);
			match(AP);
			saida+="(";
			setState(265);
			((ComandoImprimirContext)_localctx).imprimivel = imprimivel();
			saida+=(((ComandoImprimirContext)_localctx).imprimivel!=null?_input.getText(((ComandoImprimirContext)_localctx).imprimivel.start,((ComandoImprimirContext)_localctx).imprimivel.stop):null);
			setState(267);
			match(FP);
			saida+=");\n"+t+t;
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
		"\u0004\u0001*\u010f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000A\b\u0000\n\u0000\f\u0000D\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002M\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"W\b\u0004\n\u0004\f\u0004Z\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004`\b\u0004\n\u0004\f\u0004c\t\u0004\u0003\u0004"+
		"e\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006v\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007{\b\u0007\n\u0007\f\u0007"+
		"~\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0087\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008d\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0099\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00a4"+
		"\b\u000b\n\u000b\f\u000b\u00a7\t\u000b\u0001\u000b\u0003\u000b\u00aa\b"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u00bd\b\u000f\u000b\u000f\f"+
		"\u000f\u00be\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00cb\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00d1\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u00d7\b\u0015\n\u0015\f\u0015\u00da\t\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u00e0\b\u0016\n\u0016\f\u0016\u00e3\t\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u00ea\b\u0018\n\u0018\f\u0018\u00ed\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u00fd\b\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0104\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0000\u0000\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0005\u0001"+
		"\u0000\u0001\u0004\u0002\u0000\u0005\u0005\u0014\u0019\u0001\u0000!\""+
		"\u0001\u0000\u001a\u001c\u0001\u0000#%\u0113\u0000<\u0001\u0000\u0000"+
		"\u0000\u0002H\u0001\u0000\u0000\u0000\u0004L\u0001\u0000\u0000\u0000\u0006"+
		"N\u0001\u0000\u0000\u0000\bS\u0001\u0000\u0000\u0000\nh\u0001\u0000\u0000"+
		"\u0000\fu\u0001\u0000\u0000\u0000\u000ew\u0001\u0000\u0000\u0000\u0010"+
		"\u0086\u0001\u0000\u0000\u0000\u0012\u0088\u0001\u0000\u0000\u0000\u0014"+
		"\u0098\u0001\u0000\u0000\u0000\u0016\u009a\u0001\u0000\u0000\u0000\u0018"+
		"\u00ab\u0001\u0000\u0000\u0000\u001a\u00af\u0001\u0000\u0000\u0000\u001c"+
		"\u00b4\u0001\u0000\u0000\u0000\u001e\u00bc\u0001\u0000\u0000\u0000 \u00c0"+
		"\u0001\u0000\u0000\u0000\"\u00c2\u0001\u0000\u0000\u0000$\u00c6\u0001"+
		"\u0000\u0000\u0000&\u00ca\u0001\u0000\u0000\u0000(\u00cc\u0001\u0000\u0000"+
		"\u0000*\u00d2\u0001\u0000\u0000\u0000,\u00db\u0001\u0000\u0000\u0000."+
		"\u00e4\u0001\u0000\u0000\u00000\u00e6\u0001\u0000\u0000\u00002\u00ee\u0001"+
		"\u0000\u0000\u00004\u00fc\u0001\u0000\u0000\u00006\u00fe\u0001\u0000\u0000"+
		"\u00008\u0103\u0001\u0000\u0000\u0000:\u0105\u0001\u0000\u0000\u0000<"+
		"B\u0006\u0000\uffff\uffff\u0000=A\u0003\u0010\b\u0000>A\u0003\u0016\u000b"+
		"\u0000?A\u0003\u001c\u000e\u0000@=\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000EF\u0005\u0000\u0000\u0001FG\u0006\u0000\uffff"+
		"\uffff\u0000G\u0001\u0001\u0000\u0000\u0000HI\u0007\u0000\u0000\u0000"+
		"I\u0003\u0001\u0000\u0000\u0000JK\u0005\u0005\u0000\u0000KM\u0003&\u0013"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0005\u0001"+
		"\u0000\u0000\u0000NO\u0003\u0002\u0001\u0000OP\u0005(\u0000\u0000PQ\u0003"+
		"\u0004\u0002\u0000QR\u0006\u0003\uffff\uffff\u0000R\u0007\u0001\u0000"+
		"\u0000\u0000SX\u0005(\u0000\u0000TU\u0005\u0006\u0000\u0000UW\u0005(\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000[d\u0005)\u0000\u0000\\a\u0003&\u0013\u0000]^\u0005"+
		"\u0007\u0000\u0000^`\u0003&\u0013\u0000_]\u0001\u0000\u0000\u0000`c\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000d\\\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005*\u0000"+
		"\u0000g\t\u0001\u0000\u0000\u0000hi\u0005\b\u0000\u0000ij\u0005)\u0000"+
		"\u0000jk\u0003\f\u0006\u0000kl\u0005\t\u0000\u0000lm\u0003 \u0010\u0000"+
		"mn\u0005\t\u0000\u0000no\u0003\u000e\u0007\u0000op\u0005*\u0000\u0000"+
		"pq\u0005\n\u0000\u0000qr\u0003\u001e\u000f\u0000r\u000b\u0001\u0000\u0000"+
		"\u0000sv\u0003\u0006\u0003\u0000tv\u0003&\u0013\u0000us\u0001\u0000\u0000"+
		"\u0000ut\u0001\u0000\u0000\u0000v\r\u0001\u0000\u0000\u0000w|\u0003\u0012"+
		"\t\u0000xy\u0005\u0007\u0000\u0000y{\u0003\u0012\t\u0000zx\u0001\u0000"+
		"\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u000f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000\u007f\u0087\u0003\u0012\t\u0000\u0080\u0087\u0003\b\u0004\u0000"+
		"\u0081\u0087\u0003\u0006\u0003\u0000\u0082\u0087\u0003:\u001d\u0000\u0083"+
		"\u0087\u0003\n\u0005\u0000\u0084\u0087\u0003\u0016\u000b\u0000\u0085\u0087"+
		"\u0003\u001c\u000e\u0000\u0086\u007f\u0001\u0000\u0000\u0000\u0086\u0080"+
		"\u0001\u0000\u0000\u0000\u0086\u0081\u0001\u0000\u0000\u0000\u0086\u0082"+
		"\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0011"+
		"\u0001\u0000\u0000\u0000\u0088\u008c\u00036\u001b\u0000\u0089\u008d\u0003"+
		"\u0014\n\u0000\u008a\u008b\u0005\u0005\u0000\u0000\u008b\u008d\u0003&"+
		"\u0013\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008d\u0013\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u000b"+
		"\u0000\u0000\u008f\u0099\u0003&\u0013\u0000\u0090\u0091\u0005\f\u0000"+
		"\u0000\u0091\u0099\u0003&\u0013\u0000\u0092\u0093\u0005\r\u0000\u0000"+
		"\u0093\u0099\u0003&\u0013\u0000\u0094\u0095\u0005\u000e\u0000\u0000\u0095"+
		"\u0099\u0003&\u0013\u0000\u0096\u0097\u0005\u000f\u0000\u0000\u0097\u0099"+
		"\u0003&\u0013\u0000\u0098\u008e\u0001\u0000\u0000\u0000\u0098\u0090\u0001"+
		"\u0000\u0000\u0000\u0098\u0092\u0001\u0000\u0000\u0000\u0098\u0094\u0001"+
		"\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u0015\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005\u0010\u0000\u0000\u009b\u009c\u0006"+
		"\u000b\uffff\uffff\u0000\u009c\u009d\u0003 \u0010\u0000\u009d\u009e\u0006"+
		"\u000b\uffff\uffff\u0000\u009e\u009f\u0005\n\u0000\u0000\u009f\u00a0\u0006"+
		"\u000b\uffff\uffff\u0000\u00a0\u00a1\u0003\u001e\u000f\u0000\u00a1\u00a5"+
		"\u0006\u000b\uffff\uffff\u0000\u00a2\u00a4\u0003\u001a\r\u0000\u00a3\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00aa"+
		"\u0003\u0018\f\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u0017\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		"\u0011\u0000\u0000\u00ac\u00ad\u0005\n\u0000\u0000\u00ad\u00ae\u0003\u001e"+
		"\u000f\u0000\u00ae\u0019\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0012"+
		"\u0000\u0000\u00b0\u00b1\u0003 \u0010\u0000\u00b1\u00b2\u0005\n\u0000"+
		"\u0000\u00b2\u00b3\u0003\u001e\u000f\u0000\u00b3\u001b\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005\u0013\u0000\u0000\u00b5\u00b6\u0006\u000e\uffff"+
		"\uffff\u0000\u00b6\u00b7\u0003 \u0010\u0000\u00b7\u00b8\u0006\u000e\uffff"+
		"\uffff\u0000\u00b8\u00b9\u0005\n\u0000\u0000\u00b9\u00ba\u0003\u001e\u000f"+
		"\u0000\u00ba\u001d\u0001\u0000\u0000\u0000\u00bb\u00bd\u0003\u0010\b\u0000"+
		"\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u001f\u0001\u0000\u0000\u0000\u00c0\u00c1\u0003,\u0016\u0000\u00c1"+
		"!\u0001\u0000\u0000\u0000\u00c2\u00c3\u00036\u001b\u0000\u00c3\u00c4\u0005"+
		"\u0005\u0000\u0000\u00c4\u00c5\u0003,\u0016\u0000\u00c5#\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0007\u0001\u0000\u0000\u00c7%\u0001\u0000\u0000\u0000"+
		"\u00c8\u00cb\u0003,\u0016\u0000\u00c9\u00cb\u0003*\u0015\u0000\u00ca\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\'\u0001"+
		"\u0000\u0000\u0000\u00cc\u00d0\u0003*\u0015\u0000\u00cd\u00ce\u0003$\u0012"+
		"\u0000\u00ce\u00cf\u0003*\u0015\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1)\u0001\u0000\u0000\u0000\u00d2\u00d3\u00034\u001a\u0000\u00d3\u00d8"+
		"\u0006\u0015\uffff\uffff\u0000\u00d4\u00d5\u0007\u0002\u0000\u0000\u00d5"+
		"\u00d7\u00034\u001a\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00da"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9+\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00db\u00e1\u0003(\u0014\u0000\u00dc\u00dd\u0003.\u0017"+
		"\u0000\u00dd\u00de\u0003(\u0014\u0000\u00de\u00e0\u0001\u0000\u0000\u0000"+
		"\u00df\u00dc\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e2-\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0007\u0003\u0000\u0000\u00e5/\u0001\u0000\u0000\u0000\u00e6\u00eb"+
		"\u00034\u001a\u0000\u00e7\u00e8\u0007\u0004\u0000\u0000\u00e8\u00ea\u0003"+
		"4\u001a\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec1\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0005\u0004\u0000\u0000\u00ef\u00f0\u0005(\u0000\u0000"+
		"\u00f0\u00f1\u0005\u0005\u0000\u0000\u00f1\u00f2\u0003,\u0016\u0000\u00f2"+
		"3\u0001\u0000\u0000\u0000\u00f3\u00fd\u0005&\u0000\u0000\u00f4\u00fd\u0005"+
		"\'\u0000\u0000\u00f5\u00fd\u00036\u001b\u0000\u00f6\u00fd\u0005\u001d"+
		"\u0000\u0000\u00f7\u00fd\u0005\u001e\u0000\u0000\u00f8\u00f9\u0005)\u0000"+
		"\u0000\u00f9\u00fa\u0003&\u0013\u0000\u00fa\u00fb\u0005*\u0000\u0000\u00fb"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fc\u00f3\u0001\u0000\u0000\u0000\u00fc"+
		"\u00f4\u0001\u0000\u0000\u0000\u00fc\u00f5\u0001\u0000\u0000\u0000\u00fc"+
		"\u00f6\u0001\u0000\u0000\u0000\u00fc\u00f7\u0001\u0000\u0000\u0000\u00fc"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fd5\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0005(\u0000\u0000\u00ff7\u0001\u0000\u0000\u0000\u0100\u0104\u00036"+
		"\u001b\u0000\u0101\u0104\u0005&\u0000\u0000\u0102\u0104\u0005\'\u0000"+
		"\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u01049\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0005\u001f\u0000\u0000\u0106\u0107\u0006\u001d\uffff\uffff"+
		"\u0000\u0107\u0108\u0005)\u0000\u0000\u0108\u0109\u0006\u001d\uffff\uffff"+
		"\u0000\u0109\u010a\u00038\u001c\u0000\u010a\u010b\u0006\u001d\uffff\uffff"+
		"\u0000\u010b\u010c\u0005*\u0000\u0000\u010c\u010d\u0006\u001d\uffff\uffff"+
		"\u0000\u010d;\u0001\u0000\u0000\u0000\u0015@BLXadu|\u0086\u008c\u0098"+
		"\u00a5\u00a9\u00be\u00ca\u00d0\u00d8\u00e1\u00eb\u00fc\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}