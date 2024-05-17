package edu.lucas.collections.exerciciosList.pesquisa.exemplos.livro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> listLivros;

    public CatalogoLivros() {
        this.listLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(autor,anoPublicacao,titulo);
        this.listLivros.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listLivros.isEmpty()){
            for (Livro l : listLivros){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        else {
            throw new RuntimeException("A lista está vazia");
        }
        return livrosPorAutor;

    }

    public List<Livro> pesquisarPorIntervalosDeAnos(int anoInicial,int anoFinal){
        List<Livro> livrosPorIntervalosDeAnos = new ArrayList<>();
        if(!listLivros.isEmpty()){
            for (Livro l : listLivros){
                if(l.getAnoPublicacao() <= anoFinal && l.getAnoPublicacao() >= anoInicial){
                    livrosPorIntervalosDeAnos.add(l);
                }
            }
        }
        else {
            throw new RuntimeException("A lista está vazia");
        }
        return livrosPorIntervalosDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPortitulo = null;
        if (!listLivros.isEmpty()){
            for (Livro l : listLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPortitulo = l;
                    break;
                }
            }
        }
        else {
            throw new RuntimeException("A lista está vazia");
        }
    return livroPortitulo;
    }

    public void exibirCatalogo(){
        System.out.println(this.listLivros);
    }

    public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        // Exibindo livros pelo mesmo autor
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

        // Exibindo livros dentro de um intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervalosDeAnos(2010, 2022));

        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(catalogoLivros.pesquisarPorIntervalosDeAnos(2025, 2030));

        // Exibindo livros por título
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));

        catalogoLivros.exibirCatalogo();
    }
}
