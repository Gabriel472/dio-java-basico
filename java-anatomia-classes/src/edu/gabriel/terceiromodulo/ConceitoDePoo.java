package edu.gabriel.terceiromodulo;

/**
 * 
 *                      arc
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Gabriel Rodrigues
 * @version 1.0
 * @since 30/09/2026
 */

public class ConceitoDePoo {
    // Conceito de POO
    /* 
        À medida que a tecnologia vem evoluindo, as linguagems de programação também, e esta é a transição natural que determina quando estamos nos referindo à linguagem de baixo e alto nível.
            . BAIXO NÍVEL: são linguagens que estão mais próxima da interpretação da máquina diante do algoritmo desenvolvido. Exemplo: LINGUAGEM ASSEMBLY e C.

            ALTO NÍVEL: são linguagens que disponibilizam uma proposta de síntaxe (forma de escrever processos para serem executados pelo computador) mais próxima de interpretação humana. Exemplo: JAVA, JAVASCRIPT, PYTHON e C++.

        Exemplo de um simples "Hello, World!" em ASSEMBLY versus PYTHON:

            // ASSEMBLY
                section .text

                    global _start

                _start:


                    mov edx, len

                    mov ecx, msg

                    mov ebx, 1

                    mov eax, 4

                    int 0x80

                    mov eax, 1

                    int 0x80

                section .data

                msg     db      'Hello, World!', 0xa

                len     equ     $ - msg


            // PYTHON
                print('Hello, World!')

        
        // Programação Estruturada
            A programação estruturada é um paradigma de programação que visa melhorar a clareza, a qualidade e o tempo de desenvolvimento de um programa de computador, fazendo uso extensivo das construções de fluxo de controle estruturado de seleção (if / then / else) e repetição (while e for), estruturas de bloco e sub-rotinas.

            O que devemos ter em mente é que na programação estruturada implementamos algoritmos com estruturas sequenciais denominados de procedimentos lineares, podendo afetar o valor das variáveis de escopo local ou global em uma aplicação.


        // Programação orientada a objetos
            Programação orientada a objetos, ou POO, é um paradigma de programação baseado no conceito de "objetos", que podem conter dados na forma de campos, também conhecidos como ATRIBUTOS, e códigos, na forma de procedimentos, também conhecidos como MÉTODOS.

            O que precisamos entender é que cada vez mais as linguagens se adequam ao cenário real, proporcionando assim que o programador desenvolva algoritmos mais próximos de fluxos comportamentais - logo tudo ao nosso redor é representado como OBJETO.

                Enquanto a PROGRAMAÇÃO ESTRUTURADA é voltada a procedimentos e funções definidas pelo usuário, a PROGRAMAÇÃO ORIENTADA A OBJETOS é voltada a conceitos como o de classes e objetos.

    */
}
