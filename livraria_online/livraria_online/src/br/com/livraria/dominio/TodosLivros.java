package br.com.livraria.dominio;

public interface TodosLivros {

	Livros por(String nome);

	Livro por(ISBN isbn);

}
