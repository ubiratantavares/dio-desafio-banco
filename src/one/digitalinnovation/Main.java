package one.digitalinnovation;

import one.digitalinnovation.model.Cliente;
import one.digitalinnovation.model.Conta;
import one.digitalinnovation.model.ContaCorrente;
import one.digitalinnovation.model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Ubiratan");

        Conta cc = new ContaCorrente(cliente);

        cc.imprimirSaldo();

        cc.depositar(500.00);

        cc.imprimirSaldo();

        Conta cp = new ContaPoupanca(cliente);

        cp.imprimirSaldo();

        cc.transferir(100.00, cp);

        cc.imprimirSaldo();
        cp.imprimirSaldo();




    }
}
