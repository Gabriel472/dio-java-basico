package edu.gabriel.primeiromodulo;

public class Operadores {
    public static void main (String [] args) {
        
        // Operadores Aritméticos
        {
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
            }
        }
    }
}