package edu.gabriel.segundomodulo.desafios;

import java.util.Scanner;

/**
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Gabriel Rodrigues
 * @version 1.0
 * @since 18/06/2026
 */

public class DesafioEscopoEstruturasControleUm {
    public static void main(String[] args) {
    	try(Scanner leitor = new Scanner(System.in)){
			int N = leitor.nextInt();
			String jogador1, jogador2;
			// TODO: complete os espaços em branco com sua solução para o problema
			for (int i = 0; i < N; i++) {
				jogador1 = leitor.next();
				jogador2 = leitor.next();

				if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque"))
					System.out.println("Aniquilação mútua");

				else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel"))
					System.out.println("Ambos venceram");

				else if (jogador1.equalsIgnoreCase("ataque"))
					System.out.println("Jogador 1 venceu");

				else if (jogador2.equalsIgnoreCase("ataque"))
					System.out.println("Jogador 2 venceu");

				else if(jogador1.equalsIgnoreCase("papel"))
					System.out.println("Jogador 2 venceu");

				else if(jogador2.equalsIgnoreCase("papel"))
					System.out.println("Jogador 1 venceu");

				else 
					System.out.println("Sem ganhador");
			}
    	}
    }
}