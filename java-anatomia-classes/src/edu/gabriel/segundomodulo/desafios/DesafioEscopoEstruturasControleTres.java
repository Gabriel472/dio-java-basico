package edu.gabriel.segundomodulo.desafios;

import java.util.Scanner;

public class DesafioEscopoEstruturasControleTres {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int C = leitor.nextInt();
            String nomeLevantador;

            /*
            // A variável numeroIteracoes é dispensável. Ao removê-la e deixar apenas leitor.nextInt();, o programa funciona perfeitamente.
            int numeroIteracoes;
            */

            // TODO: complete os espaços em branco com sua solução para o problema

            for(int i = 0; i < C; i++){
                nomeLevantador = leitor.next();
                leitor.nextInt();
                if(nomeLevantador.equals("Thor"))
                    System.out.println("I AM WORTHY!!!!");
                else
                    System.out.println("Falha em levantar o Mjölnir");
            }
        }
    }
}
