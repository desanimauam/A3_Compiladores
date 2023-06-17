grammar jiboia;

// Regras léxicas
WS : [ \t\r\n]+ -> skip;

// Regras gramaticais
programa : (comando | comandoSe | comandoEnquanto)* EOF {System.out.println("OK"); };

tipo : 'inteiro' | 'duplo' | 'texto' | 'booleano';

decVariavel : tipo ID ('=' expressao)?;

chamadaFuncao : ID ('.' ID)* '(' (expressao (',' expressao)*)? ')';

comPor : 'por' '(' inicioPor?  condicao? ';' atualizaPor? ')' bloco;

inicioPor : decVariavel | expressao;

atualizaPor : atribuicao (',' atribuicao)*;

comando : atribuicao | chamadaFuncao | decVariavel | comandoImprimir | comPor;

atribuicao : variavel '=' expressao;

comandoSe : 'se' condicao ':' bloco comandoSeSenao? comandoSenao?;

comandoSenao : 'senao' ':' bloco?;

comandoSeSenao : 'se senao' condicao ':' bloco?;

comandoEnquanto : 'enquanto' '(' condicao ')' ':' bloco;

bloco : comando+;

condicao : expressaoLogica;

atribuicaoBooleana : variavel '=' expressaoLogica;

operadorRelacional : '==' | '!=' | '<' | '>' | '<=' | '>=';

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
