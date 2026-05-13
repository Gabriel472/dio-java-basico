package edu.gabriel.primeiromodulo;

public class PalavrasReservadas {
    // Palavras Reservadas
    /*
        Palavras reservadas são identificadores de uma linguagem que já possuem uma finalidade específica, portanto não podem ser utilizados para nomear variáveis,classes, métodos ou atributos.
        A linguagem Java possui 52 palavras reservadas. Todas essas palavras são classificadas em grupos e escritas com letra minúscula, sendo identificadas com uma cor especial pela maioria das IDE's. Abaixo há uma lista de palavras agrupadas por suas finalidades.

        // Controle de pacotes
            . import: importa pacotes ou classes para dentro do código;
            . package: especifica a que pacote todas as classes de um arquivo pertencem.
        
        // Modificadores de acesso
            . public: acesso de qualquer classe;
            . private: acesso apenas dentro da classe;
            . protected: acesso por classes no mesmo pacote e subclasses.

        // Primitivos
            . boolean: um valor indicando verdadeiro ou falso;
            . byte: um inteiro de 8 bits (signed);
            . char: um character unicode (16-bit unsigned);
            . double: um número de ponto flutuante de 64 bits (signed);
            . float: um número de ponto flutuante de 32 bits (signed);
            . int: um inteiro de 32 bits (signed);
            . long: um inteiro de 64 bits (signed);
            . short: um intiro de 32 bits (signed);
            . void: indica que o método não tem retorno de valor.

        // Modificadores de classes, variáveis ou métodos
            . abstract: classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata;
            . class: especifica uma classe;
            . extends: indica a superclasse que a subclasse está estendendo;
            . final: impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada;
            . implements: indica as interfaces que uma classe irá implementar.
            . interface: especifica uma interface;
            . native*: indica que um método está escrito em uma linguagem dependente de plataforma, como o C (* = raramente utilizada);
            . new: instancia um novo objeto, chamando seu construtor;
            . static: faz um método ou variável pertencer à classe ao invés de às instâncias;
            . strictfp*: usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões (* = raramente utilizada);
            . synchronized: indica que um método só pode ser acessado por uma thread de cada vez;
            . transient: impede a serialização de campos;
            . volatile*: indica que uma variável pode ser alterada durante o uso de threads (* = raramente utilizada).

        // Controle de fluxo dentro de um bloco de código
            . break: sai do bloco de código em que ele está;
            . case: executa um bloco de código dependendo do testo do switch;
            . continue: pula a execução do código que viria após essa linha e vai para a próxima passagem do loop.

        // Tratamento de erros
            . assert*: testa uma expressão condicional para verificar uma suposição do programador (* = raramente utilizada);
            . catch: declara o bloco de código usado para tratar uma exceção;
            . finally: bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção.


        // Escopo de uso
            . Arquivo: package, import, static;
            . Classe: public ou protected ou private + final ou abstract + extends ou implements;
            . Método: public ou protected ou private + static ou final ou abstract + void ou return;
            . Atributo: public ou protected ou private + static ou final + tipo primitivo.

        
        // Palavras "opostas"
            Assim como nas classificações gramaticais da língua portuguesa, existem algumas palvras que são completamente opostas (antônimas) na linguagem Java conforme definidas abaixo:
            . package e import;
            . extends e implements;
            . final e abstract;
            . throws e throw.
     */
}