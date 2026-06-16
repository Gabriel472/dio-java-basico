package edu.gabriel.primeiromodulo.desafios;

import java.util.Scanner;

/**
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Gabriel Rodrigues
 * @version 1.0
 * @since 16/06/2026
 */

public class DesafioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        System.out.println("Digite o valor do primeiro número: ");
        A = sc.nextDouble();

        System.out.println("Digite o valor do segundo número: ");
        B = sc.nextDouble();

        media = (A * 3.5 + B * 7.5)/11;

        System.out.printf("MEDIA = %.5f", media);
        
    }
}