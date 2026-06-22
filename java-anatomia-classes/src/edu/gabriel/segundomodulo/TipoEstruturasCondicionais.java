package edu.gabriel.segundomodulo;

import java.util.Scanner;
/**
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Gabriel Rodrigues
 * @version 1.0
 * @since 19/06/2026
 */

public class TipoEstruturasCondicionais {
    public static void main(String[] args) {
        /* 
        Introdução
            
            Controle de fluxo é a hablilidade de ajustar a maneira como um programa realiza suas tarefas.
            Por meio de instruções especiais, chamadas de comandos, essas tarefas podem ser executadas seletivamente, repetidamente ou excepcionalmente.

            Classificação:
                . Estruturas condicionais: if-else, switch-case;
                . Estruturas de repetição: for, while, do-while;
                . Estruturas de exceções: try-catch-finally, throw.

        
        Estruturas condicionais

            A Estrutura Condicional possibilita a escolha de um grupo de ações e comportamentos a serem executadas quando determinadas condições são ou não satisfeitas. A Estrutura Condicional pode ser SIMPLES ou COMPOSTA.

            Condicional Simples

                Ocorre uma validação de execução de fluxo somente quando a condição for positiva. Consideramos como estrutura SIMPLES o exemplo abaixo:

                    Início -> Sacar -> Contem Saldo? -> (Se Sim) Atualiza Saldo || (Se Não) Fim.
        */
            // Exemplo simulando um caixa eletrônico - CaixaEletronico.java
            double saldo, valorSolicitado;
            saldo = 25.0;
            valorSolicitado = 17.0;

            if(valorSolicitado < saldo) 
                saldo = saldo - valorSolicitado;

            System.out.println(saldo);

            // Aqui já é uma Condicional Composta
            double saldo2, valorSolicitado2;
            saldo2 = 17.0;
            valorSolicitado2 = 25.0;

            if(valorSolicitado2 < saldo2){
                saldo2 = saldo2 - valorSolicitado2;
                System.out.printf("Novo saldo: R$ %.2f.", saldo2);
            }
            else{
                System.out.println("O valor solicitado para saque é insuficiente.");
                System.out.printf("Saldo disponível: R$ %.2f.", saldo2);
            }
            

            /*
            Condicional Composta
                
                Algumas vezes o nosso programa deverá seguir mais de uma jornada de execução condicionado a uma regra de negócio - este cenário é denominado ESTRUTURA CONDICIONAL COMPOSTA. Vejamos o exemplo abaixo:

                    Início -> Resultado Escolar -> Nota >= 7? -> (Se sim) Imprime Aprovado || (Se não) Imprime Reprovado.
            */
            // Exemplo simulando a aprovação ou reprovação de um aluno dependendo da nota obtida - ResultadoEscolar.java
            int nota = 6;

            if(nota >= 7){
                System.out.println("Nota obtida: " + nota);
                System.out.println("Aprovado");
                }
            else{
                System.out.println("Nota obtida: " + nota);
                System.out.println("Reprovado");
                }


            /*
            Condicionais Encadeadas

                Em um controle de fluxo condicional, nem sempre nos limitamos ao SE (if) e SENÃO (else). Há a possibilidade de se ter uma terceira, quarta e ou inúmeras condições.

                    Início -> Resultado Escolar -> Nota >= 7? -> (Se sim) Imprime aprovado || (Se não) Nota >= 5 e < 7 -> (Se sim) Imprime Recuperação || (Se não) Imprime Reprovado.
            */
            // Exemplo utilizando Condicionais Encadeadas na Classe ResultadoEscolar.java
            Scanner scanner = new Scanner(System.in);
            double nota2;

            System.out.println("Digite a nota do aluno(a): ");
            nota2 = scanner.nextDouble();

            if (nota2 >= 7)
                System.out.println("Aprovado");
            
            else if(nota2 >= 5 && nota2 < 7)
                System.out.println("Recuperação");

            else
                System.out.println("Reprovado");
            
            scanner.close();

            
            /*
            Condição Ternária

                Como vimos em operadores, podemos abreviar nosso algorítmo condicional refatorando com conceito de operador ternário. Vamos refatorar o exemplo ResultadoEscolar.java acima para ilustrar o poder deste recurso:
            */
            // Exemplo utlizando Operador Ternário na Classe ResultadoEscolar.java
            Scanner scanner2 = new Scanner(System.in);
            double nota3;

            System.out.println("Digite a nota do aluno(a): ");
            nota3 = scanner2.nextDouble();

            String resultado = nota3 >= 7 ? "Aprovado"  : nota3 >= 5 && nota3 < 7 ? "Recuperação" : "Reprovado";
            System.out.println(resultado);
            
            scanner2.close();


            /*
            Switch/Case

                A estrutura SWITCH compara o valor de cada caso com o da variável sequencialmente, e sempre que encontra um valor correspondente, executa o código associado ao caso. Para evitar que as comparações continuem a ser executadas após um caso correspondente ter sido encontrado, acrescentamos o comando BREAK ao final de cada bloco de código. O comando BREAK, quando utilizado, encerra a execução da estrutura onde ele se encontra.

                Vamos imaginar que precisaremos imprimir uma medida com base em mapa de valores, exemplo:

                    Sigla: P, M e G | Tamanho: Pequeno, Medio e Grande
            */
            // Exemplo utilizando Condicional Encadeada na Classe SistemaMedida.java
            Scanner scanner3 = new Scanner(System.in);
            String sigla;

            System.out.println("Digite o tamanho da medida a ser impressa: ");
            sigla = scanner3.nextLine();

            if("P".equals(sigla))
                System.out.println("Pequeno");
            else if("M".equals(sigla))
                System.out.println("Medio");
            else if("G".equals(sigla))
                System.out.println("Grande");
            else
                System.out.println("Indefinido");

            scanner3.close();


            // Exemplo utilizando Switch Case na Classe SistemaMedida.java
            Scanner scanner4 = new Scanner(System.in);
            String sigla2;

            System.out.println("Digite o tamanho da medida a ser impressa: ");
            sigla2 = scanner4.next();
            
            switch (sigla2) {
                case "P": {
                    System.out.println("Pequeno");
                    break; // o utilização do comando BREAK é necessário após cada CASE para impedir que as próxima instruções sejam executadas sem necessidade.
                }
                case "M": {
                    System.out.println("Médio");
                    break;
                }
                case "G": {
                    System.out.println("Grande");
                    break;
                }
                default:
                    System.out.println("Indefinido");

                scanner4.close();
            }


            /*
            Porém um cenário que poderíamos adequar o uso do Switch/Case para melhorar nosso algorítmo seria conforme a ilustração abaixo:

                Imagine que fomos requisitados a criar um sistema de plano telefônico onde:

                    . O sistema terá 3  planos: BASIC, MIDIA e TURBO.
                        . BASIC: 100 minutos de ligação;
                        . MIDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
                        . TURBO: 100 minutos de ligação + WhatsApp grátis + 5GB de Youtube.
            */
            // Exemplo utilizando Condicional Encadeada na Classe PlanoOperadora.java
            Scanner scanner5 = new Scanner(System.in);
            
            System.out.println("Digite o plano a ser contratado: ");
            String plano = scanner5.next();

            if("BASIC".equals(plano)){
                System.out.println(". 100 minutos de ligação.");
            }
            else if("MIDIA".equals(plano)){
                System.out.println(". 100 minutos de ligação");
                System.out.println(". WhatsApp e Instagram grátis");
            }
            else if("TURBO".equals(plano)){
                System.out.println(". 100 minutos de ligação");
                System.out.println(". WhatsApp e Instagram grátis");
                System.out.println(". 5GB de Youtube");
            }

            scanner5.close();


            // Exemplo utilizando Switch/Case na Classe PlanoOperadora.java
            Scanner scanner6 = new Scanner(System.in);
            System.out.println("Digite o plano a ser contratado: ");
            String plano2 = scanner6.next();

            // O estrutura Switch/Case deve ser utilizado com cautela, tendo antes conversado com a equipe se ela é a opção mais apropriada a ser adotar. Na maioria dos casos a estrutura Condicional Encadeada será a melhor opção a ser empregada, salvo em alguns casos, como o abaixo.
            switch(plano2){
                case "TURBO": {
                    System.out.println(". 5GB de Youtube");
                }
                case "MIDIA": {
                    System.out.println(". WhatsApp e Instagram grátis");
                }
                case "BASIC": {
                    System.out.println(". 100 minutos de ligação");
                    break;
                }
                default:{
                    System.out.println("Plano não reconhecido.");
                }
            }

            scanner6.close();

            // Se optarem por usar Switch/Case, estude um pouco mais sobre os conceitos de CONTINUE, BREAK e DEFAULT.
    }
}