package edu.gabriel.primeiromodulo;

public class TiposVariaveis {
    public static void main (String [] args) {
        // Estudar sobre tipos primitivos de variáveis
        // Estudar sobre a classe String que reporesenta texto na aplicação
        
        System.out.println("Hello, world!");
        
        String meuNome = "Gabriel";
        System.out.println(meuNome);
        
        // Peculiaridades de tipos específicos de variáveis
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, tavlez tenha que se routro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo - adicionar a letra l ao final do valor atribuído, podendo ser tanto maiúscula como minúscula - a letra representa que é do tipo Long e não Int, possibilitando ao Java à fazer o armazenamento correto da variável
        float pi = 3.14F; // adicionar a letra f ao final do valor atribuído - podendo ser tanto maiúscula como minúscula - a letra representa que é do tipo Float e não Int, possibilitando ao Java à fazer o armazenamento correto da variável
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Uma variável pode receber um novo valor ao decorrer da codificação
        int numero = 5; 
        numero = 10;

        // Para isto ser evitado, deve-se utilizar uma Constante. Para defini-la a palavra "final" deve ser posta ao início da declaração junto com o nome de toda a Constante, por convenção, em CAIXA ALTA mais o valor ao final. Desta forma o valor permanecerá inalterado não podendo ser reatribuído.
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
}
