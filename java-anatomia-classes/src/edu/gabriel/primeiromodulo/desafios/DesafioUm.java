package edu.gabriel.primeiromodulo.desafios;

import java.util.Scanner;

/**
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Gabriel Rodrigues
 * @version 1.0
 * @since 16/06/2026
 */

public class DesafioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        A = sc.nextInt();
        B = sc.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);
    }
}