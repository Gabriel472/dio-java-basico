package edu.gabriel.primeiromodulo;

import java.util.Locale;
import java.util.Scanner;

/**
 *  <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor
 * 
 * @author Gabriel Rodrigues
 * @version 1.0
 * @since 11/06/2026
 */

public class TerminalArgumentosCinco {
    public static void main (String[] args) {
        
        /*Scanner
            Nos exemplo anteriores percebemos que podemos receber dados digitados pelo usuário do nosso sistema, porém tudo precisa estar em uma linha e também é necessário informar os valores nas posições correspondentes. Esta abordagem pode deixar margens de execução com erro do nosso programa. Para isso, com finalidade de deixar as nossas entradas de dados mais seguras agora vamos receber estes dados via SCANNER. A classe SCANNER permite que o usuário tenha uma interação mais assertiva com o nosso programa, veja como vamos mudar o nosso programa TerminalArgumentosCinco para deixar mais intuitivo aos usuários. */
        
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        
        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " cm.");
    }
}