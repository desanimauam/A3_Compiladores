// Generated from variaveis.g4 by ANTLR 4.13.0
 import java.util.*; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link variaveisParser}.
 */
public interface variaveisListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link variaveisParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(variaveisParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveisParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(variaveisParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveisParser#declvar}.
	 * @param ctx the parse tree
	 */
	void enterDeclvar(variaveisParser.DeclvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveisParser#declvar}.
	 * @param ctx the parse tree
	 */
	void exitDeclvar(variaveisParser.DeclvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveisParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(variaveisParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveisParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(variaveisParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveisParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(variaveisParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveisParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(variaveisParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveisParser#cond_if}.
	 * @param ctx the parse tree
	 */
	void enterCond_if(variaveisParser.Cond_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveisParser#cond_if}.
	 * @param ctx the parse tree
	 */
	void exitCond_if(variaveisParser.Cond_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveisParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(variaveisParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveisParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(variaveisParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveisParser#sr}.
	 * @param ctx the parse tree
	 */
	void enterSr(variaveisParser.SrContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveisParser#sr}.
	 * @param ctx the parse tree
	 */
	void exitSr(variaveisParser.SrContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveisParser#escrever}.
	 * @param ctx the parse tree
	 */
	void enterEscrever(variaveisParser.EscreverContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveisParser#escrever}.
	 * @param ctx the parse tree
	 */
	void exitEscrever(variaveisParser.EscreverContext ctx);
	/**
	 * Enter a parse tree produced by {@link variaveisParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(variaveisParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link variaveisParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(variaveisParser.AtribContext ctx);
}