grammar jiboia;

@header { import java.util.*; }
@members {
	Variavel x = new Variavel();
	ControleVariavel cv = new ControleVariavel();
	String saida="";
	int escopo;
	int tipo;
	String nome;
	String tipoJava;
	String t="    ";
	String idt="";
}

// Regras léxicas
WS : [ \t\r\n]+ -> skip;

// Regras gramaticais - inicio
programa : {idt=t; saida+="public class Saida{\n" + idt + "public static void main(String args[]){\n"; idt+=t;}
			(comando | comandoSe | comandoEnquanto)*  EOF {idt=t; saida+="\n"+idt+"}\n}";  System.out.println(saida);};

tipo : 'inteiro' | 'duplo' | 'texto' | 'booleano';

infVariavel: ('=' expressao)?;

decVariavel : tipo ID infVariavel {
	switch($tipo.text){
        case "inteiro":
            tipoJava = "int";
			break;
		case "duplo":
			tipoJava = "double";
			break;
		case "texto":
			tipoJava = "String";
			break;
		case "booleano":
			tipoJava = "boolean";
			break;
		}

	saida+= ""+ tipoJava + " " + $ID.text + $infVariavel.text + ";\n";};

chamadaFuncao : ID ('.' ID)* '(' (expressao (',' expressao)*)? ')';

comPor : 'por' '(' inicioPor ';' condicao ';' atualizaPor ')' ':' bloco;

inicioPor : decVariavel | expressao;

atualizaPor : atribuicao (',' atribuicao)*;

comando : ({saida+=""+idt;}atribuicao) 
        | ({saida+=""+idt;}chamadaFuncao)
        | ({saida+=""+idt;}decVariavel)
        | ({saida+=""+idt;}comandoImprimir {saida+=$comandoImprimir.text + "\n";})
        | ({saida+=""+idt;}comPor)
        | ({saida+=""+idt;}comandoSe)
        | (comandoEnquanto);

atribuicao : variavel (atribuicaoComposta | '=' expressao);

atribuicaoComposta : '+=' expressao
                   | '-=' expressao
                   | '*=' expressao
                   | '/=' expressao
                   | '%=' expressao;

comandoSe : 'se' {saida+="\n" + idt + "if (";} condicao {saida+=$condicao.text + "){\n";} ':'
			{idt+=t;} bloco comandoSenaoSe* comandoSenao?;

comandoSenao : 'senao' ':' bloco;

comandoSenaoSe : 'senaose' condicao ':' bloco;

comandoEnquanto : 'enquanto' condicao ':' bloco;

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

comandoImprimir : 'imprimir' '(' expressao ')';

Soma : '+';
Subtracao : '-';
Multiplicacao : '*';
Divisao : '/';
Modulo : '%';

NUMERO : [0-9]+ ('.' [0-9]+)?;
TEXTO : '"' ~[\r\n]* '"';
ID : [a-zA-Z]+;
