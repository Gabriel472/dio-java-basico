package edu.gabriel.terceiromodulo.visibilidade_dos_recursos.lanchonete.atendimento.cozinha;

import edu.gabriel.terceiromodulo.visibilidade_dos_recursos.lanchonete.atendimento.Atendente;

/**
 * 
 * <h1>Cozinheiro</h1>
 * Classe que reúne as atribuições e obrigações do cozinheiro.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Gabriel Rodrigues
 * @version 1.0
 * @since 23/10/2026
 */

public class Cozinheiro {
    // pode ser default
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche natural no balcão...");
    }

    //pode ser default
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco no balcão...");
    }
    
    //pode ser default
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche(){
        System.out.println("Preparando lanche tipo hamburguer...");
    }

    public void prepararVitamina(){
        System.out.println("Preparando vitamina...");
    }

    public void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    public void selecionarIngredientesLanche(){
        System.out.println("Selecionado o pão, salada, ovo e carne...");
    }

    public void selecionarIngredientesVitamina(){
        System.out.println("Selecionado fruta, leite e suco...");
    }

    public void lavarIngredientes(){
        System.out.println("Lavando ingredientes...");
    }

    public void baterVitaminaLiquidificador(){
        System.out.println("Batendo vitamina no liquidificador...");
    }

    public void fritarIngredientesLanche(){
        System.out.println("Fritando a carne e ovo para o hamburguer...");
    }

    public void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }

    public void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
