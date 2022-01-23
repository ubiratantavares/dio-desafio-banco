package one.digitalinnovation.model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public void imprimirSaldo() {
        System.out.println("===== Extrato da Conta Poupança =====");
        this.toString();
    }
}
