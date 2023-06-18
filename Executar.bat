if exist Saida.java (del /f Saida.java)
rem
antlr4 jiboia.g4 && javac *.java && grun jiboia programa imp03.txt > Saida.java
