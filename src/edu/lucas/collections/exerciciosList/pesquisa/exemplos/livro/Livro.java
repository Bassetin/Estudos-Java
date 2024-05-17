package edu.lucas.collections.exerciciosList.pesquisa.exemplos.livro;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String autor, int anoPublicacao, String titulo) {
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
