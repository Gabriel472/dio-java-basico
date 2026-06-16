package edu.gabriel.primeiromodulo.desafios;

import java.util.Scanner;

/**
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos ofereciso pelo autor.
 * 
 * @author Gabriel Rodrigues
 * @version 1.0
 * @since 16/06/2026
 */

public class DesafioDois{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);
    }
}