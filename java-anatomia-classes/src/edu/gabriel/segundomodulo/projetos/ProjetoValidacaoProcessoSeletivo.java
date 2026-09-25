package edu.gabriel.segundomodulo.projetos;

import java.util.concurrent.ThreadLocalRandom;

/**
 * ProjetoValidacaoProcessoSeletivo
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Gabriel Rodrigues
 * @version 1.1
 * @since 31/08/2026
 */

public class ProjetoValidacaoProcessoSeletivo {
    public static void main(String[] args) {
        /*analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);*/

        selecaoCandidatos();
    }


    /*Caso 1: Um processo seletivo onde o valor salarial base é de R$ 2.000,00 e o salário pretendido pelo candidato é questionado à ele, onde, dependendo do valor requisitado pelo candidato, imprima respostas específicas.
        . Se o valor salarial base for maior que o valor salario pretendido, imprima "LIGAR PARA O CANDIDATO";
        . Senão Se o valor salarial base for igual ao valor pretendido, imprima "LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA";
        . Senão imprima "AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS".
    

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato.");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para candidato com contra proposta.");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    } */


    /*Caso 2: Foi solicitado que o sistema garanta que diante das inúmeras candidaturas sejam selecionados apenas no máximo 5 candidatos para entrevista onde o salário pretendido seja menor ou igual ao salário base.*/
    

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato(a) " + candidato + " solicitou R$ %.2f de salário.%n", salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println(candidato + " foi selecionado para a vaga. Parabéns!");
                candidatosSelecionados++;
                System.out.println("Número de candidatos(as) selecionados(as): " + candidatosSelecionados);
            }
            else{
                System.out.println("Boa sorte na próxima, " + candidato + ".");
            }
            
            candidatoAtual++;
            
            System.out.println();
            }
            System.out.println();
            System.out.println("Sem vagas disponíveis.");
            System.out.println();
        }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
}