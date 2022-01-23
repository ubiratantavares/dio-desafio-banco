package one.digitalinnovation.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private static int SEQUENCIAL = 1;

    private int id;
    private String nome;
    private List<Conta> contas = new ArrayList<Conta>();

    public Cliente(String nome) {
        this.id = SEQUENCIAL++;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome='" + nome + '\'' + '}';
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void exibirContas() {
        System.out.println(String.format("Lista de contas do cliente %s", this.nome));
        for (Conta conta:contas) {
            System.out.println(String.format("%d - %d - %.2f", conta.getAgencia(), conta.getNumero(), conta.getSaldo()));
        }
    }
}
