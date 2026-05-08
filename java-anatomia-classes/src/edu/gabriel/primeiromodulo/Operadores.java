package edu.gabriel.primeiromodulo;

public class Operadores {
    public static void main (String [] args) {
        
        // Operadores Aritiméticos
        {/*
            // Declaração de valores à variáveis
            // Adição
            double primeiroNumeroSoma = 80.60;
            double segundoNumeroSoma = 93.63;

            // Subtração
            double primeiroNumeroSubtracao = 26.32;
            double segundoNumeroSubtracao = 69.67;

            // Multiplicação
            double primeiroNumeroMultiplicacao = 20.56;
            double segundoNumeroMultiplicacao = 58.74;

            // Divisão
            double primeiroNumeroDivisao = 41;
            double segundoNumeroDivisao = 12;

            // Módulo
            int primeiroNumeroModulo = 94;
            int segundoNumeroModulo = 60;

            // Incremento
            int valorIncremento = 28;

            // Decremento
            int valorDecremento = 42;


            // Operações
            // Adição
            double adicao = primeiroNumeroSoma + segundoNumeroSoma;
            System.out.println("O valor da Adição é de " + adicao + ".");

            // Subtração
            double subtracao = primeiroNumeroSubtracao - segundoNumeroSubtracao;
            System.out.println("O valor da Subtração é de " + subtracao + ".");

            // Multiplicação
            double multiplicacao = primeiroNumeroMultiplicacao * segundoNumeroMultiplicacao;
            System.out.println("O valor da Multiplicação é de " + multiplicacao + ".");

            // Divisao
            double divisao = primeiroNumeroDivisao / segundoNumeroDivisao;
            System.out.println("O valor da Divisão é de " + divisao + ".");

            // Módulo
            int modulo = primeiroNumeroModulo % segundoNumeroModulo;
            System.out.println("O valor do Módulo é de " + modulo + ".");

            // Incremento 
            while (valorIncremento < 30) {
                System.out.println("O valor do Incremento é de " + valorIncremento + ".");
                ++valorIncremento;
            }          
            
            // Decremento
            while (valorDecremento > 40) {
                System.out.println("O valor do Decremento é de " + valorDecremento + ".");
                --valorDecremento;
            }*/
        }
    

        // Operadores Unários
        {/*
            // Declaração de valores à variáveis
            // Subtração
            int operadorUnarioSubtracao = 8;
            System.out.println("O valor da variável operadorUnarioSubtracao é " + operadorUnarioSubtracao + ".");
            System.out.println(operadorUnarioSubtracao);
            
            operadorUnarioSubtracao = - operadorUnarioSubtracao;
            System.out.println("O valor da variável operadorUnarioSubtracao é " + 
            operadorUnarioSubtracao + ".");
            System.out.println(operadorUnarioSubtracao);
            
            operadorUnarioSubtracao = operadorUnarioSubtracao * -1;
            System.out.println("Convertendo o valor da variável operadorUnarioSubtracao de negativo para positivo " + operadorUnarioSubtracao + ".");
            System.out.println(operadorUnarioSubtracao);
            
            // Incremento
            int operadorUnarioIncremento = 0; 
            while (operadorUnarioIncremento <= 3) {
                System.out.println("O valor da variável operadorUnarioIncremento é de " + operadorUnarioIncremento + ".");
                ++operadorUnarioIncremento;
            }
                        
            // Decremento
            int operadorUnarioDecremento = 0;
            while (operadorUnarioDecremento >= -3) {
                System.out.println("O valor da variável operadorUnarioDecremento é de " + operadorUnarioDecremento + ".");
                --operadorUnarioDecremento;
            }

            // Boolean
            boolean variavelBooleana = true;
            System.out.println("O valor da variável variavelBooleana é " + variavelBooleana + ".");
            // Para inverter o valor de uma variável booleana se utiliza o ponto de exclamação (!) antes de seu nome.
            System.out.println(!variavelBooleana); // Porém isso não atualiza o valor da variável.
            System.out.println(variavelBooleana);
            // Para isso, seu valor deve ser reatribuído.
            variavelBooleana = !variavelBooleana;
            System.out.println(variavelBooleana);*/
        }
        

        // Operadores Ternários  
        {
            // Os Operadores Ternários são utilizados para definir uma condição entre dois valores. Se assemelha à estrutura de controle de decisão IF, com o diferencial de ser estruturada em apenas uma única linha.
            // É representado pelos símbolos de interrogação e dois pontos (?:), e são utilizados na seguinto estrutura de sintaxe: <Expressão Condicional> ? <Caso condição seja True> : <Caso condição seja False>
            {
                int a, b;
                a = 6;
                b = 6;
                {
                    String resultadoCondicao = "";
                    if (a == b)
                        resultadoCondicao = "Verdadeiro";
                    else
                        resultadoCondicao = "Falso";
                    System.out.println("O resultado é " + resultadoCondicao + ".");
                }
                {
                    // Toda essa expressão pode ser resumida ao utilizar o operador ternário:
                    String resultadoTernario = a == b ? "True" : "False";
                    System.out.println("O resultado é " + resultadoTernario + ".");
                    
                    // E esse operador não se limita apenas à Strings. Ele também é capaz de lidar com numerais.
                    int resultadoTernarioNumeral = a == b ? 1 : 0;
                    System.out.println("A resposta para o resultado é " + resultadoTernarioNumeral + ".");
                }
            }
        }
    }
}