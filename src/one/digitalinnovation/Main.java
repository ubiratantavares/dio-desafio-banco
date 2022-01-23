package one.digitalinnovation;

import one.digitalinnovation.model.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // criação de objetos da classe Conta
        Conta conta1 = new ContaCorrente(1000.00);
        Conta conta2 = new ContaPoupanca(500.00);
        Conta conta3 = new ContaCorrente(3000.00);

        // criação de objetos da classe Cliente
        Cliente cliente1 = new Cliente("Ubiratan");
        Cliente cliente2 = new Cliente("Roselane");

        // associação dos objetos da classe Conta aos objetos da classe Cliente
        cliente1.adicionarConta(conta1);
        cliente1.adicionarConta(conta2);
        cliente2.adicionarConta(conta3);

        // criação do objeto da classe Banco
        Banco banco = new Banco("XPTO");

        // associacao dos objetos da classe Cliente ao objeto da classe Banco
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        // exibição dos clientes do objeto banco
        banco.exibirClientes();

        // exibição das contas do objeto cliente1
        cliente1.exibirContas();

        // exibição das contas do objeto cliente2
        cliente2.exibirContas();

        // transação de transferencia de valor da conta1 do cliente1 para a conta3 do cliente2
        conta1.transferir(300.00, conta3);

        // exibição das contas do objeto cliente1
        cliente1.exibirContas();

        // exibição das contas do objeto cliente2
        cliente2.exibirContas();

    }
}
