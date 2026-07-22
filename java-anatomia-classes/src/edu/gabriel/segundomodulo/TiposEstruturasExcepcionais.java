package edu.gabriel.segundomodulo;

import java.util.Locale;
import java.util.Scanner;

public class TiposEstruturasExcepcionais {
    public static void main(String[] args){
        /*
        Estruturas Exceptionais
            Exceções
                Ao executar o código Java, diferentes erros podem acontecer: erros de codificação feitos pelo programador, erros devidos a entrada errônea ou outros imprevistos.

                Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: Java lançará uma EXCEÇÃO (jogará um erro).

                De forma interpretativa, em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drasticamente. Já exceções são fluxos inesperados da aplicação. Exemplo: Querer dividir um valor por zero, querer abrir um arquivo que não existe, abrir uma conexão de banco com usuário ou senha inválidos.
                Todos estes cenários e os demais não são erros, mas sim fluxos não previstos pela aplicação.

                É aí que entra mais uma responsabilidade do desenvolvedor: prever situações iguais a estas e realizar o que denominamos de TRATAMENTO DE EXCEÇÕES.
        
                Lista de algumas possíveis exceções:
                    . Não informar o nome e sobrenome;
                    . O valor da idade ter um caractere NÃO numérico;
                    . O valor da altura ter uma vírgula ao invés de um ponto (conforme o padrão US and A).
                
                Abaixo há uma lista com as exceções que devem acontecer:
                    ENTRADA: Digite seu nome:
                    VALOR: Marcelo
                    EXCEÇÃO: 

                    ENTRADA: Digite seu sobrenome:
                    VALOR: Azevedo
                    EXCEÇÃO:

                    ENTRADA: Digite sua idade:
                    VALOR: quinze (15)
                    EXCEÇÃO: java.util.inputMismatchException

                    ENTRADA: Digite sua altura:
                    VALOR: 1,65
                    EXCEÇÃO: java.util.InputMismatchException

                Conhecendo algumas exceções já mapeadas:
                    A linguagem Java dispõe de uma vasta lista de classes que representam exceções. Abaixo estão listadas as mais comuns:
                        NOME: java.lang.NullPointerException
                        CAUSA: Tentativa de obter alguma informação de uma variável nula.

                        NOME: java.lang.ArithmeticException
                        CAUSA: Tentativa de dividir um valor por zero.

                        NOME: java.sql.SQLException
                        CAUSA: Quando existe algum erro relacionado a interação com a base de dados.

                        NOME: java.io.FileNotFoundException
                        CAUSA: Quando há a tentativa de ler ou escrever em um arquivo que não existe.
                
                Tratamento de exceções
                    E quando inevitavelmente ocorrer uma exceção? Como os desenvolvedores podem ajustar o algoritmo para amenizar o ocorrido?

                    A instrução TRY permite que você defina um bloco de código para ser testador quando há erros enquanto está sendo executado.

                    A instrução CATCH permite definir um bloco de código a ser executado, caso ocorra um erro no bloco TRY.

                    A instrução FINALLY permite definir um bloco de código a ser executado independente de ocorrer um erro ou não. As palavras-chave TRY e CATCH vêm em pares.
            */

            // Estrutura de um bloco com TRY e CATCH:
            try {
                // bloco de código conforme esperado
            } catch (Exception e) {
                // é preciso saber qual exceção e 
                // bloco de código que captura as 
                // exceções que podem acontecer em 
                // caso de um fluxo não previsto
            }

            // Exemplo com a Classe TerminalArgumentosCinco.java
            // Criando o objeto scanner
            try { // Não sei qual é a utildade do TRY abaixo   
                try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
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
            
            catch (Exception e) {
                System.err.println("Os campos Idade e Altura precisam ser numéricos.");
            }
    }       
}