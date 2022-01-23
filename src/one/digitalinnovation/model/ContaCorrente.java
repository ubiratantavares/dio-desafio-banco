package one.digitalinnovation.model;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirSaldo() {
        System.out.println("===== Extrato da Conta Corrente =====");
        this.imprimirInformacoes();
    }

}
