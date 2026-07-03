package edu.gabriel.segundomodulo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TiposEstruturaRepeticao {
    public static void main(String[] args) {
        /*
        Estruturas de repetição

            Laços de repetição, também conhecidos como laços de iteração, ou, simplesmente, loops, são comandos que permitem iteração de código, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes.

            Laços ou repetições são representados pelas seguintes estrutuas:
                . For (para);
                . While (enquanto);
                . Do While (faça enquanto).

                For

                    O comando For permite que uma variável contadora seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. Este comando recebe como entrada uma variável contadora, a condição e o valor de incrementação.

                    A estrutura de sintaxe do controle de repetição For é exibida abaixo:

                        // Estrutura do controle de fluxo For

                        for (bloco de inicialização; expressão booleana de validação; bloco de atualização){
                            // comando que será executado até que a expressão de validação torne-se falsa
                        }
        */

                // Exemplo: Joãozinho precisa contar até 20 carneirinhos para pegar no sono:
                for(int carneirinhos = 0; carneirinhos <= 20; carneirinhos++){
                    System.out.println("Contando carneirnhos: " + carneirinhos + ".");
                }
                System.out.println("Joãozinho dormiu...");


                // Também usamos o controle de fluxo For para interagir sobre arrays e coleções
                // Exemplo com a Classe ExemploFor.java
                // Em arrays o índice inicia em ZERO.
                String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};
                    for(int indice = 0; indice < alunos.length; indice++){
                 System.out.println("O aluno no índice " + indice + " é " + alunos[indice] + ".");
                }



                /*
                For / Each
                    O uso do For / Each está fortemente relacionado com um cenário onde contenha um array ou coleção, e assim, a interação é baseada aos elementos da coleção.
                */
                String alunos2[] = {"Pedro", "Eduardo", "Maria", "Fernando"};

                // Forma abreviada
                for(String aluno : alunos2){
                    System.out.println(aluno);
                }

        

                /*
                Break e Continue
                    BREAK significa quebrar, parar, frear, interromper. E é isso que se faz quando o Java encontra esse comando pela frente. CONTINUE, como o nome diz, ele 'continua' o laço. O comando BREAK interrompe o laço, já o CONTINUE interrompe somente a iteração atual.
                */

                // Exemplo de BREAK com a Classe ExemploBreakContinue.java
                for(int numero = 1; numero <= 5; numero++){
                    if(numero == 3)
                        break; // interrompe a iteração no momento em que a condição é atingida
                    System.out.println(numero);
                }

                // Exemplo de CONTINUE com a Classe ExemploBreakContinue.java
                for(int numero2 = 1; numero2 <= 5; numero2++){
                    if(numero2 == 3)
                        continue; // continua a iteração apesar da condição ser atingida
                    System.out.println(numero2);
                }



                /*
                While
                    O laço WHILE determina que enquanto uma condição for válida, o bloco de código será executado. Ele testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste, o bloco nem será executado.

                    A estrutura de sintaxe do controle de repetição WHILE é exibida abaixo:
                        // Estrutura do controle de fluxo WHILE
                        while(expressão booleana de validação){
                            // comando que será executado até que a expressão de validação se torne falsa.
                        }

                    Exemplo: Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro. Logo, enquanto o valor dos doces não igualar a R$ 50,00, ele foi adicionando itens no carrinho. 

                    import java.util.concurrent.ThreadLocalRandom; // Importação da Classe ThreadLocalRandom que serve para gerar valores aleatórios.
                */
               
                // Exemplo de WHILE com a Classe ExemploWhile.java
                double mesada = 50.0; // Usar o método valorAleatorio()
                
                while(mesada > 0){
                    double valorDoce = valorAleatorio();
                    if(valorDoce > mesada)
                        valorDoce = mesada;

                    System.out.printf("Doce de valor R$ %.2f adicionado ao carrinho.%n", valorDoce);
                    mesada = mesada - valorDoce;
                    
                }
                System.out.printf("Mesada restante: R$ %.2f.%n", mesada);
                System.out.println("Joãozinho gastou toda a sua mesada em doces.");



                /*
                Do / While
                    O laço DO / WHILE, assim como o laço WHILE, considera que, enquanto uma determinada condição for válida, o bloco de código será executado. Entretando, DO / WHILE testa a condição após executar o código, sendo assim, mesmo que a condição seja considerada inválida no primeiro teste, o bloco será executado pelo menos uma vez.

                    A estrutura da sintaxe do controle de repetição DO / WHILE é exibida abaixo:
                        // Estrutura do controle de fluxo DO / WHILE
                        do{
                            // comando que será executado até que a expressão torne-se falsa
                        }
                        while(expressão booleana de validação);
                    
                    Exemplo: Joãozinho resolveu ligar para o seu amigo dizendo que hoje se entupiu de comer doces.

                    import java.util.Random; // Importação da Classe Random que serve para gerar valores aleatórios.
                */

                // Exemplo de DO / WHILE com a Classe ExemploDoWhile.java
                System.out.println("Discando...");
                do{
                    // Executando repetidas vezes até alguém atender
                    System.out.println("Telefone tocando");
                }while(tocando());
                System.out.println("Alô!!!");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return ! atendeu;
    }
}               