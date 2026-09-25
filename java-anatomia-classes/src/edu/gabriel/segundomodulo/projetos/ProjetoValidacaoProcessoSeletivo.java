package edu.gabriel.segundomodulo.projetos;

/**
 * ProjetoValidacaoProcessoSeletivo
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Gabriel Rodrigues
 * @version 1.0
 * @since 31/08/2026
 */

public class ProjetoValidacaoProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
    }


    /*Caso 1: Um processo seletivo onde o valor salarial base é de R$ 2.000,00 e o salário pretendido pelo candidato é questionado à ele, onde, dependendo do valor requisitado pelo candidato, imprima respostas específicas.
        . Se o valor salarial base for maior que o valor salario pretendido, imprima "LIGAR PARA O CANDIDATO";
        . Senão Se o valor salarial base for igual ao valor pretendido, imprima "LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA";
        . Senão imprima "AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS".
    */

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato.");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para candidato com contra proposta.");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    } 
}