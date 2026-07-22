package edu.gabriel.segundomodulo.desafios;

import java.util.Scanner;

/**
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Gabriel Rodrigues
 * @version 1.0
 * @since 18/06/2026
 */

public class DesafioEscopoEstruturasControleDois {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            // TODO: complete os espaços em branco com sua solução para o problema
            String[] nomes = new String[10];

            for(int i=0; i<10; i++){
                nomes[i] = sc.nextLine();
            }

            System.out.println("Terceiro nome da lista: " + nomes[2]);
            System.out.println("Sétimo nome da lista: " + nomes[6]);
            System.out.println("Nono nome da lista: " + nomes[8]);
        }
    }
}