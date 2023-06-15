grammar variaveis;

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

inicio: {escopo = 0; saida+="public class Saida{\n"+t;}
		declvar 'inicio' {escopo = 1; saida+="\n"+t+"public static void main(String args[]){\n"+t+t;}
		declvar cmd 'fim' {saida+="\n"+t+"}\n}";System.out.println(saida);} ;

declvar: (tipo ID {x = new Variavel($ID.text, tipo, escopo);
					boolean ret = cv.adiciona(x);
					if(!ret){
						System.out.println("Variavel "+$ID.text+" ja foi declarada!!!");
						System.exit(0);
					} 
				   } PV {saida+=$ID.text+";\n"+t+t;} )* ;

tipo: ('int' {tipo = 0; saida+="int ";} | 'char' {tipo = 1; saida+="char ";} | 'double' {tipo = 2; saida+="double ";} );
cmd: (cond_if | atrib | escrever)*;

cond_if: {saida+="\n"+t+t;}'se' {saida+="if"; } AP {saida+="("; } comp {saida+=$comp.text;} FP {saida+=")";} AC {saida+="{\n"+t+t+t; } cmd FC {saida+="\n"+t+t+"}"; }
		 {saida+="\n"+t+t;}('senao' {saida+="else"; }AC {saida+="{\n"+t+t+t; }cmd FC {saida+="\n"+t+t+"}"; })? ;

comp: (ID | NUM) OPREL (ID | NUM);

sr: (ID | NUM);

escrever: 'imprima' {saida+="System.out.println";} AP{saida+="(";} sr{saida+=$sr.text;} FP{saida+=")";} PV;

atrib: ID;

ID: [A-Za-z]+;
NUM: [0-9]+;
OPREL: '>' | '<' | '>=' | '<=' | '==' | '!=' ;
OPARIT: '+' | '-' | '*' | '/' ;
PV: ';' ;
AC: '{' ;
FC: '}' ;
AP: '(' ;
FP: ')' ;
Op_atrib: '=';
WS: [ \t\r\n]+ -> skip;