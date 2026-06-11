package edu.gabriel.primeiromodulo;
/**
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor
 *  
 * @author Gabriel Rodrigues
 * @version 1.0
 * @since 02/06/2026
 */

public class TerminalArgumentosTresQuatro {
    /*
    Quando executamos uma classe que contenha o método main, o mesmo permite que passemos um array [] de argumentos do tipo String. Logo podemos após a definição da classe a ser executada informar estes parâmetros, exemplo:

    java MinhaClasse argumentoUm argumentoDois
    */

    public static void main (String[] args) {
        System.out.println("Quantidade de argumentos recebidos: " + args.length);
        // os argumentos começam com índice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); // vamos falar sobre...
        Double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " cm.");
    }
}