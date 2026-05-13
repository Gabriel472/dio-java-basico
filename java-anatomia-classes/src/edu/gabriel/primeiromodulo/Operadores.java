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
        {/*
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
            } */
        }


        // Operadores Relacionais
        {/*
            // Os Operadores Relacionais avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior ou maior ou igual ao da direita, retornando um valor booleano como resultado.
            // == - é utilizado quando se deseja verificar se uma variável é IGUAL A outra.
            // != - é utilizado quando se deseja verificar se uma variável é DIFERENTE da outra.
            // > - é utilizado quando se deseja verificar se uma variável é MAIOR QUE a outra.
            // >= - é utilizado quando se deseja verificar se uma variável é MAIOR OU IGUAL a outra.
            // < - é utilizado quando se deseja verificar se uma variável é MENOR que a outra.
            // <= - é utilizado quando se deseja verificar se uma variávem é MENOR OU IGUAL a outra.
            {
                //Igual
                int numeroUmIgual = 1;
                int numeroDoisIgual = 1;
                if(numeroUmIgual == numeroDoisIgual)
                    System.out.println("Numero1 é IGUAL ao Numero2.");
                else
                    System.err.println("Numero1 não é IGUAL ao Numero2.");
                int resultadoNumeroUmIgual = numeroUmIgual == numeroDoisIgual ? 1 : 0;
                System.out.println(resultadoNumeroUmIgual);

                //Diferente
                int numeroUmDiferente = 2;
                int numeroDoisDiferente = 1;
                if(numeroUmDiferente != numeroDoisDiferente)
                    System.out.println("Numero1 é DIFERENTE do Numero2.");
                else
                    System.out.println("Numero1 não é DIFERENTE do Numero2.");
                int resultadoNumeroDiferente = numeroUmDiferente != numeroDoisDiferente ? 1 : 0;
                System.out.println(resultadoNumeroDiferente);
                
                // Maior
                int numeroUmMaior = 2;
                int numeroDoisMaior = 1;
                if(numeroUmMaior > numeroDoisMaior)
                    System.out.println("Numero1 é MAIOR que Numero2.");
                else
                    System.out.println("Numero1 não é MAIOR que Numero2.");
                int resultadoNumeroMaior = numeroUmMaior > numeroDoisMaior ? 1 : 0;
                System.out.println(resultadoNumeroMaior);

                // Maior ou igual
                int numeroUmMaiorIgual = 2;
                int numeroDoisMaiorIgual = 2;
                if(numeroUmMaiorIgual >= numeroDoisMaiorIgual)
                    System.out.println("Numero1 é MAIOR OU IGUAL que Numero2.");
                else
                    System.out.println("Numero1 não é MAIOR OU IGUAL que Numero2.");
                int resultadoNumeroMaiorIgual = numeroUmMaiorIgual >= numeroDoisMaiorIgual ? 1 : 0;
                System.out.println(resultadoNumeroMaiorIgual);

                // Menor
                int numeroUmMenor = 1;
                int numeroDoisMenor = 2;
                if(numeroUmMenor < numeroDoisMenor)
                    System.out.println("Numero1 é MENOR que Numero2.");
                else
                    System.out.println("Numero1 não é MENOR que Numero2.");
                int resultadoNumeroMenor = numeroUmMenor < numeroDoisMenor ? 1 : 0;
                System.out.println(resultadoNumeroMenor);

                // Menor ou igual
                int numeroUmMenorIgual = 1;
                int numeroDoisMenorIgual = 1;
                if(numeroUmMenorIgual <= numeroDoisMenorIgual)
                    System.out.println("Numero1 é MENOR OU IGUAL ao Numero2.");
                else
                    System.out.println("Numero1 não é IGUAL OU MENOR que o Numero2.");

                int resultadoNumeroMenorIgual = numeroUmMenorIgual <= numeroDoisMenorIgual ? 1 : 0;
                System.out.println(resultadoNumeroMenorIgual);

                // Strings
                String nomeUm = "Gabriel";
                String nomeDois = "Gabriel";
                System.out.println(nomeUm == nomeDois);

                String nomeTres = "Gabriel";
                String nomeQuatro = new String("Gabriel");
                System.out.println(nomeTres == nomeQuatro);

                String nomeCinco = "Gabriel";
                String nomeSeis = new String("Gabriel");
                System.out.println(nomeCinco.equals(nomeSeis));
            } */
        }


        // Operadores Lógicos
        {/*
            // Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.
            // && - operador lógico "E".
            // || - operador lógico "OU".

            // Operador Lógico E
            System.out.println("Operador Lógico E (&&):");
            boolean condicaoUmE = false;
            boolean condicaoDoisE = false;
            if(condicaoUmE && condicaoDoisE)
                System.out.println("As duas condições são verdadeiras.");
            else
                System.out.println("Uma ou ambas condições não são verdade.");

            if(condicaoUmE && (8 > 3))
                System.out.println("As duas condições são verdadeiras.");
            else
                System.out.println("As duas condições não são verdadeiras.");
            
            // Operador Lógico OU
            System.out.println("Operador Lógico OU (||):");
            boolean condicaoUmOu = true;
            boolean condicaoDoisOu = true;
            if(condicaoUmOu || condicaoDoisOu)
                System.out.println("Uma das condições é verdadeira.");
            else
                System.out.println("Nenhuma das condições é verdadeira.");

            if(condicaoUmOu || (8 < 3))
                System.out.println("Uma das condições é verdadeira.");
            else
                System.out.println("Nenhuma das condições é verdadeira.");

            System.out.println("Fim."); */
        }
    }
}