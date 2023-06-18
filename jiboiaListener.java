// Generated from jiboia.g4 by ANTLR 4.13.0
 import java.util.*; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jiboiaParser}.
 */
public interface jiboiaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(jiboiaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(jiboiaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(jiboiaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(jiboiaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#infVariavel}.
	 * @param ctx the parse tree
	 */
	void enterInfVariavel(jiboiaParser.InfVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#infVariavel}.
	 * @param ctx the parse tree
	 */
	void exitInfVariavel(jiboiaParser.InfVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#decVariavel}.
	 * @param ctx the parse tree
	 */
	void enterDecVariavel(jiboiaParser.DecVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#decVariavel}.
	 * @param ctx the parse tree
	 */
	void exitDecVariavel(jiboiaParser.DecVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(jiboiaParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(jiboiaParser.ChamadaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#comPor}.
	 * @param ctx the parse tree
	 */
	void enterComPor(jiboiaParser.ComPorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#comPor}.
	 * @param ctx the parse tree
	 */
	void exitComPor(jiboiaParser.ComPorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#inicioPor}.
	 * @param ctx the parse tree
	 */
	void enterInicioPor(jiboiaParser.InicioPorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#inicioPor}.
	 * @param ctx the parse tree
	 */
	void exitInicioPor(jiboiaParser.InicioPorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#atualizaPor}.
	 * @param ctx the parse tree
	 */
	void enterAtualizaPor(jiboiaParser.AtualizaPorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#atualizaPor}.
	 * @param ctx the parse tree
	 */
	void exitAtualizaPor(jiboiaParser.AtualizaPorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(jiboiaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(jiboiaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(jiboiaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(jiboiaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#atribuicaoComposta}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoComposta(jiboiaParser.AtribuicaoCompostaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#atribuicaoComposta}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoComposta(jiboiaParser.AtribuicaoCompostaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#comandoSe}.
	 * @param ctx the parse tree
	 */
	void enterComandoSe(jiboiaParser.ComandoSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#comandoSe}.
	 * @param ctx the parse tree
	 */
	void exitComandoSe(jiboiaParser.ComandoSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#comandoSenao}.
	 * @param ctx the parse tree
	 */
	void enterComandoSenao(jiboiaParser.ComandoSenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#comandoSenao}.
	 * @param ctx the parse tree
	 */
	void exitComandoSenao(jiboiaParser.ComandoSenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#comandoSenaoSe}.
	 * @param ctx the parse tree
	 */
	void enterComandoSenaoSe(jiboiaParser.ComandoSenaoSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#comandoSenaoSe}.
	 * @param ctx the parse tree
	 */
	void exitComandoSenaoSe(jiboiaParser.ComandoSenaoSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#comandoEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterComandoEnquanto(jiboiaParser.ComandoEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#comandoEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitComandoEnquanto(jiboiaParser.ComandoEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(jiboiaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(jiboiaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(jiboiaParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(jiboiaParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#atribuicaoBooleana}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoBooleana(jiboiaParser.AtribuicaoBooleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#atribuicaoBooleana}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoBooleana(jiboiaParser.AtribuicaoBooleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#operadorRelacional}.
	 * @param ctx the parse tree
	 */
	void enterOperadorRelacional(jiboiaParser.OperadorRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#operadorRelacional}.
	 * @param ctx the parse tree
	 */
	void exitOperadorRelacional(jiboiaParser.OperadorRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(jiboiaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(jiboiaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(jiboiaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(jiboiaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(jiboiaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(jiboiaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogica(jiboiaParser.ExpressaoLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogica(jiboiaParser.ExpressaoLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#operadorLogico}.
	 * @param ctx the parse tree
	 */
	void enterOperadorLogico(jiboiaParser.OperadorLogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#operadorLogico}.
	 * @param ctx the parse tree
	 */
	void exitOperadorLogico(jiboiaParser.OperadorLogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(jiboiaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(jiboiaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#decVariavelBooleana}.
	 * @param ctx the parse tree
	 */
	void enterDecVariavelBooleana(jiboiaParser.DecVariavelBooleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#decVariavelBooleana}.
	 * @param ctx the parse tree
	 */
	void exitDecVariavelBooleana(jiboiaParser.DecVariavelBooleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(jiboiaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(jiboiaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(jiboiaParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(jiboiaParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link jiboiaParser#comandoImprimir}.
	 * @param ctx the parse tree
	 */
	void enterComandoImprimir(jiboiaParser.ComandoImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link jiboiaParser#comandoImprimir}.
	 * @param ctx the parse tree
	 */
	void exitComandoImprimir(jiboiaParser.ComandoImprimirContext ctx);
}