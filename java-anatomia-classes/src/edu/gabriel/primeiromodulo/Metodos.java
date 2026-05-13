package edu.gabriel.primeiromodulo;

public class Metodos {
    public static void main (String [] args){
        // Todas as ações das aplicações são consideradas métodos.
        // Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos, por sua vez, correspondem a FUNÇÕES ou SUBROTINAS disponíveis dentro de nossas classes.
        
        /* CRITÉRIO DE NOMEAÇÃO DE MÉTODOS
        Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos o códigos mais legível para nós e também para outras pessoas. Para métodos, os critérios são:
            . Deve ser nomeado com verbo;
            . Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).

        Exemplos sugeridos para nomenclatura de métodos:
            . somar(int n1, int n2){}
            . abrirConexao(){}
            . concluirProcessamento(){}
            . findById(int id){}
            . calcularImprimir(){} há algo errado neste método, ele deveria ter apenas uma responsabilidade - ou calcular ou imprimir.
        */
        
        // ATENÇÃO! Não existe em JAVA o conceito de MÉTODOS GLOBAIS. Todos os métodos devem sempre ser definidos dentro de uma classe.

        /*Critérios de definição de métodos
        Como saber a melhor forma de definir os métodos das classes? Para chegar à essa conclusão, existe o auxílio de uma convenção estrutural para todos os métodos. Essa convenção é determinada pelos aspectos abaixo:
            
            1. Qual a proposta principal do método? Você deve se perguntar constantemente até compreender a real finalidade do mesmo.
            
            2. Qual o tipo de retorno esperado após executar o método? Você analisar se o método será responsável por retornar algum valor ou não. (Obs.: caso o método não retorne nenhum valor, ele será representado pela palavra-chave VOID).

            3. Quais os parâmetros serão necessários para execução do método? Os métodos as vezes precisam de argumentos como critérios para a execução.

            4. O método possui o risco de apresentar alguma exceção? Exceções são comuns na execução de métodos, às vezes é necessário prever e tratar a possível existência de uma exceção.

            5. Qual a visibilidade do método? Será necessário que o método seja visível a toda a aplicação, somente em mesmo pacotes, através de herança ou somente a nível a própria classe.

        Abaixo há um exemplo de uma classe com dois métodos e suas respectivas considerações:

            public class MyClass {
                public double somar(int num1, int num2){
                    // LOGICA - FINALIDADE DO MÉTODO
                    return...;
                }

                public void imprimir(String texto){
                    // LOGICA - FINALIDADE DO MÉTODO
                    // AQUI NÂO PRECISA DO RETURN
                    // POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
                }

                // throws Exception: indica que o métodos, ao ser utilizado, poderá gerar uma exceção
                public double dividir(int dividendo, int divisor) throws Exception{}

                // este método não pode ser visto por outras classes no prjeto
                private void metodoPrivado(){}

                // alguns equívocos estruturais
                public void validar(){
                    // este método deveria retornar algun valor
                    // no caso boolean (true or false)
                }
                
                public void calcularEnviar(){
                    // um método deve representar uma única responsabilidade
                }

                public void gravarCliente(String nome, String cpf, Interger telefone, ...){
                    // este método tem a finalidade de gravar informações de um cliente
                    // Por que não criar um objeto cliente e passar como parâmetro?
                    // veja abaixo
                }

                public void gravarCliente(Cliente cliente){}
                //ou
                public void gravar(Cliente cliente){}
            } */
    }
}