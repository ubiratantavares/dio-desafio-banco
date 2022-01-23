package one.digitalinnovation.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Cliente> clientes = new ArrayList<Cliente>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void exibirClientes() {
        System.out.println(String.format("Lista de clientes do banco %s", this.nome));
        for(Cliente cliente:this.clientes) {
            System.out.println(String.format("%d - %s", cliente.getId(), cliente.getNome()));
        }
    }
}
