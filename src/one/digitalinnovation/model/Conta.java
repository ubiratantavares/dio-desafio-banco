package one.digitalinnovation.model;

public abstract class Conta implements IConta {

    private static final int AGENCIA = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;


    public Conta(double saldo) {
        this.agencia = Conta.AGENCIA;
        this.numero = SEQUENCIAL++;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public String toString() {
        return "Conta{" + "agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
}
