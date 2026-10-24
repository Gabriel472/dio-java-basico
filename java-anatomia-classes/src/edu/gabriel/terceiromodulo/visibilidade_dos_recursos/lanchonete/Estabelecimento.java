package edu.gabriel.terceiromodulo.visibilidade_dos_recursos.lanchonete;

import edu.gabriel.terceiromodulo.visibilidade_dos_recursos.lanchonete.area_cliente.Cliente;
import edu.gabriel.terceiromodulo.visibilidade_dos_recursos.lanchonete.atendimento.Atendente;
import edu.gabriel.terceiromodulo.visibilidade_dos_recursos.lanchonete.atendimento.cozinha.Almoxarife;
import edu.gabriel.terceiromodulo.visibilidade_dos_recursos.lanchonete.atendimento.cozinha.Cozinheiro;

/**
 * 20 minutos e 3 segundos
 * <h1>Estabelecimento</h1>
 * Classe que reúne as atribuições e obrigações do estabelecimento.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Gabriel Rodrigues
 * @version 1.0
 * @since 23/10/2026
 */

public class Estabelecimento {
    public static void main(String[] args){
        Cozinheiro cozinheiro = new Cozinheiro();
        // ações que não precisam estarem disponíveis para toda a aplicação
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.prepararVitamina();

        // ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();


        Almoxarife almoxarife = new Almoxarife();
        // ações que não precisam estarem disponíveis para toda a aplicação
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();

        // ações que somente o seu pacote cozinha precisa conhecer (default)
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();


        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();

        // ação que somente o seu pacote cozinha precisa conhecer (default)
        atendente.trocarGas();


        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // não deveria, mas o estabelecimento ainda não definiu normas de atendimento
        cliente.pegarPedidoBalcao();

        // esta ação é muito sigilosa, que tar ser privada?
        cliente.consultarSaldoAplicativo();

        // já pensou os clientes ouvindo que o gás acabou?
        cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);
    }
}
