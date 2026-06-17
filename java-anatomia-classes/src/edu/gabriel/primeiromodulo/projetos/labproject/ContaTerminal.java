package edu.gabriel.primeiromodulo.projetos.labproject;

import java.util.Scanner;

/**
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Gabriel Rodrigues
 * @version 1.0
 * @since 16/06/2026
 */

public class ContaTerminal {
    public static void main(String[] args) {
        
        // importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numeroConta;
        String numeroAgencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("E o número da Agência: ");
        numeroAgencia = scanner.next();

        scanner.nextLine();

        System.out.println("Digite o seu nome e sobrenome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o valor a ser sacado: ");
        saldo = scanner.nextDouble();

        // Exibir a mensagem de conta criada
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}