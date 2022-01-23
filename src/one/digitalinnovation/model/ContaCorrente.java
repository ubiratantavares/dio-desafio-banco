package one.digitalinnovation.model;

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public void imprimirSaldo() {
        System.out.println("===== Extrato da Conta Corrente =====");
        this.toString();
    }

}
