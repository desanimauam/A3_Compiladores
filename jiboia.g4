grammar jiboia;

@header { import java.util.*; }
@members {
	Variavel x = new Variavel();
	ControleVariavel cv = new ControleVariavel();
	String saida="";
	int escopo;
	int tipo;
	String nome;
	String t="    ";
}

// Regras léxicas
WS : [ \t\r\n]+ -> skip;

// Regras gramaticais - inicio
programa : {saida+="public class Saida{\n"+t+"\n"+t+"public static void main(String args[]){\n";}
			(comando | comandoSe | comandoEnquanto)*  EOF {saida+="\n"+t+"}\n}";  System.out.println(saida);};

tipo : 'inteiro' | 'duplo' | 'texto' | 'booleano';

infVariavel: ('=' expressao)?;

decVariavel : tipo ID infVariavel {saida+= ""+t+t + $tipo.text + " " + $ID.text + $infVariavel.text + ";\n";};

chamadaFuncao : ID ('.' ID)* '(' (expressao (',' expressao)*)? ')';

comPor : 'por' '(' inicioPor ';' condicao ';' atualizaPor ')' ':' bloco;

inicioPor : decVariavel | expressao;

atualizaPor : atribuicao (',' atribuicao)*;

comando : atribuicao
        | chamadaFuncao
        | decVariavel
        | comandoImprimir
        | comPor
        | comandoSe
        | comandoEnquanto;

atribuicao : variavel (atribuicaoComposta | '=' expressao);

atribuicaoComposta : '+=' expressao
                   | '-=' expressao
                   | '*=' expressao
                   | '/=' expressao
                   | '%=' expressao;

comandoSe : 'se' {saida+="\n" + t+t + "if (";} condicao {saida+=$condicao.text + "){\n";} ':'
			{saida+=""+t+t;} bloco {saida+=$bloco.text + "\n"+t+t+t;} comandoSenaoSe* comandoSenao?;

comandoSenao : 'senao' ':' bloco;

comandoSenaoSe : 'senaose' condicao ':' bloco;

comandoEnquanto : 'enquanto' {saida+="while (";} condicao {saida+="lalala){\n";}':' bloco;

bloco : comando + ;

condicao : expressaoLogica;

atribuicaoBooleana : variavel '=' expressaoLogica;

operadorRelacional : '==' | '!=' | '<' | '>' | '<=' | '>=' | '=';

expressao : expressaoLogica | expressaoAritmetica;

expressaoRelacional : expressaoAritmetica (operadorRelacional expressaoAritmetica)?;

expressaoAritmetica : fator ((Soma | Subtracao) fator)*;

expressaoLogica : expressaoRelacional (operadorLogico expressaoRelacional)*;

operadorLogico : 'e' | 'ou' | '!';

termo : fator ((Multiplicacao | Divisao | Modulo) fator)*;

decVariavelBooleana : 'booleano' ID '=' expressaoLogica;

fator : NUMERO
       | TEXTO
       | variavel
       | 'verdadeiro'
       | 'falso'
       | '(' expressao ')';

variavel : ID;

imprimivel: (variavel | NUMERO | TEXTO);

comandoImprimir: 'imprima' {saida+="System.out.println";} AP{saida+="(";} imprimivel{saida+=$imprimivel.text;} FP{saida+=");\n"+t+t;};

Soma : '+';
Subtracao : '-';
Multiplicacao : '*';
Divisao : '/';
Modulo : '%';

NUMERO : [0-9]+ ('.' [0-9]+)?;
TEXTO : '"' ~[\r\n]* '"';
ID : [a-zA-Z]+;
AP: '(' ;
FP: ')' ;