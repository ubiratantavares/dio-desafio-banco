package one.digitalinnovation.model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirSaldo() {
        System.out.println("===== Extrato da Conta Poupança =====");
        this.imprimirInformacoes();
    }
}
