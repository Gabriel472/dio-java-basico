package edu.gabriel.segundomodulo.projetos;
import java.util.Random;
/**
 * ProjetoValidacaoProcessoSeletivo
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Gabriel Rodrigues
 * @version 1.3
 * @since 31/08/2026
 */

public class ProjetoValidacaoProcessoSeletivo {
    public static void main(String[] args) {
        /*analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);

        selecaoCandidatos();

        imprimirSelecionados();*/

        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
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


    /*Caso 2: Foi solicitado que o sistema garanta que diante das inúmeras candidaturas sejam selecionados apenas no máximo 5 candidatos para entrevista onde o salário pretendido seja menor ou igual ao salário base.
    

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
    }*/


    /*Caso 3: Imprima a lista dos candidatos selecionados para o RH entrar em contato.
    

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento: \n");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O(A) candidato(a) de nº " + (indice+1) + " é o(a) " + candidatos[indice] + ".");
        }
        System.out.println();
        System.out.println();

        System.out.println("Forma abreviada de interação For/Each: \n"); // Desta forma não é possível definir o número de índice

        for(String candidato: candidatos){
            System.out.println("O(A) candidato(a) selecionado(a) foi " + candidato + ".");
        }

        System.out.println();
        System.out.println();
    }*/


    /*Caso 4: O RH deverá realizar uma ligação com no máximo 03 tentativas para cada candidato selecionado, e, caso o candidato atenda, deve-se imprimir:
    . "CONSEGUIMOS CONTATO COM [candidato] APÓS [tentativa] TENTATIVA(S)."
    . do contrário imprima: "NÃO CONSEGUIMOS CONTATO COM O [candidato]." */

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando;
        boolean atendeu = false;

        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso!.");
        } while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "ª tentativa.");
        else{
            System.out.println("Não conseguimos contato com " + candidato + ".");
            System.out.println("Número máximo de " + tentativasRealizadas + " tentativas atingido.");
        }

        System.out.println();

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
}