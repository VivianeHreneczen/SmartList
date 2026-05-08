package br.com.model;


//A classe Produto representa um item da lista de compras e contém os atributos nome, quantidade e preco.
public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    //construtor
    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //metodos set e get
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    //"imprimir o objeto"
    @Override
    public String toString() {
        return nome + " - " + quantidade + " unidades - R$" + preco;
    }
}