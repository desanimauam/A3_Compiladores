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
COMMENT : '#' ~[\r\n]* -> skip;
TRIPLE_QUOTES : '\'\'\'' .*? '\'\'\'' -> skip;
WS : [ \t\r\n]+ -> skip;

// Regras gramaticais - inicio do programa (programa)
programa : {idt=t; saida+="public class Saida{\n" + idt + "public static void main(String[] args){\n"; idt+=t;}
    (comando | comandoSe | comandoEnquanto)* EOF {idt=t; saida+="\n"+idt+"}\n}";  System.out.println(saida);};

tipo : 'inteiro' | 'duplo' | 'texto' | 'booleano';

infVariavel : '=' expressao?;

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

    saida+= ""+ tipoJava + " " + $ID.text + $infVariavel.text + ";\n";
};

chamadaFuncao : ID ('.' ID)* '(' (expressao (',' expressao)*)? ')';

comPor : 'por' '(' inicioPor ';' condicao ';' atualizaPor ')' ':' bloco;

inicioPor : decVariavel | expressao;

atualizaPor : atribuicao (',' atribuicao)*;

comando : ({saida+=""+idt;}atribuicao) 
    | ({saida+=""+idt;}chamadaFuncao)
    | ({saida+=""+idt;}decVariavel)
    | ({saida+=""+idt;}comandoImprimir)
    | ({saida+=""+idt;}comPor)
    | ({saida+=""+idt;}comandoSe)
    | (comandoEnquanto);

atribuicao : variavel {saida+=$variavel.text;} (atribuicaoComposta {saida+=$atribuicaoComposta.text;} | '=' expressao);

atribuicaoComposta : '+=' expressao
    | '-=' expressao
    | '*=' expressao
    | '/=' expressao
    | '%=' expressao;

comandoSe : 'se' {saida+="\n" + idt + "if (";} condicao {saida+=$condicao.text + "){\n";} ':' {idt+=t;} bloco {idt=""+t+t;saida+="\n"+idt+"}\n";} comandoSenaoSe* comandoSenao?;

comandoSenao : 'senao' ':' {saida+="else{\n";}{idt+=t;} 
    bloco {idt=idt.replaceFirst(t, "");saida+="\n"+idt+"}\n";};

comandoSenaoSe : 'senaose' condicao ':' {saida+="else if("+$condicao.text+"){\n"; idt+=t;}
    bloco {idt=idt.replaceFirst(t, "");saida+="\n"+idt+"}";};

comandoEnquanto : 'enquanto' { saida += "\n" + idt + "while ("; } condicao { saida += $condicao.text + ") {\n"; } ':' bloco { idt = idt.replaceFirst(t, ""); saida += idt + "}\n" + idt; };

bloco : comando+;

condicao : expressaoLogica;

atribuicaoBooleana : variavel '=' expressaoLogica;

operadorRelacional : '==' | '!=' | '<' | '>' | '<=' | '>=' | '=';

expressao : expressaoLogica | expressaoAritmetica;

expressaoRelacional : expressaoAritmetica (operadorRelacional expressaoAritmetica)?;

expressaoAritmetica : termo ((Soma | Subtracao) termo)*;

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

imprimivel : (variavel | NUMERO | TEXTO | expressaoAritmetica);

comandoImprimir : 'imprimir' {saida+="System.out.println";} AP {saida+="(";} imprimivel {saida+=$imprimivel.text;} (impVariavel)? FP {saida+=");\n";};

impVariavel : ',' {saida+="+";} AP {saida+="(";} expressaoLogica {saida += $expressaoLogica.text;};

Soma : '+';
Subtracao : '-';
Multiplicacao : '*';
Divisao : '/';
Modulo : '%';

NUMERO : [0-9]+ ('.' [0-9]+)?;
TEXTO : '"' ~[\r\n]* '"';
ID : [a-zA-Z0-9]+;
AP : '(';
FP : ')';
