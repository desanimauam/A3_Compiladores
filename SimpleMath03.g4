grammar SimpleMath03;

// Regras léxicas
WS : [ \t\r\n]+ -> skip;

// Regras gramaticais
programa : (comando | comandoSe | comandoEnquanto)* EOF {System.out.println("OK"); };

tipo : 'inteiro' | 'duplo' | 'texto';

decVariavel : tipo ID ('=' expressao)?;

chamadaFuncao : ID ('.' ID)* '(' (expressao (',' expressao)*)? ')';

comPor : 'por' '(' inicioPor?  condicao? ';' atualizaPor? ')' bloco;

inicioPor : decVariavel | expressao;

atualizaPor : atribuicao (',' atribuicao)*;

comando : atribuicao | chamadaFuncao | decVariavel | comandoImprimir | comPor;

atribuicao : variavel '=' expressao;

comandoSe : 'se' condicao':' bloco comandoSeSenao? comandoSenao?;

comandoSenao : 'senao' ':' bloco?;

comandoSeSenao : 'se senao' condicao':' bloco?;

comandoEnquanto : 'enquanto' '(' condicao ')' bloco;

bloco : comando+;

condicao : expressao operadorRelacional expressao;

operadorRelacional : '==' | '!=' | '<' | '>' | '<=' | '>=';

expressao : termo ((Soma | Subtracao) termo)*;

termo : fator ((Multiplicacao | Divisao | Modulo) fator)*;

fator : NUMERO
       | TEXTO
       | variavel
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