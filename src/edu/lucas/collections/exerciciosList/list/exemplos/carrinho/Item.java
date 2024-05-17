package edu.lucas.collections.exerciciosList.list.exemplos.carrinho;

public class Item {
    private String nome;
    private double preco;
    private double quantidade;

    public Item(String nome, double preco, double quantidade) {
        this.nome = this.nome;
        this.preco = this.preco;
        this.quantidade = this.quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}