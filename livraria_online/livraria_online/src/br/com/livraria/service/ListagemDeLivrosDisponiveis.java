package br.com.livraria.service;

import br.com.livraria.dominio.Livros;
import br.com.livraria.dominio.TodosLivros;

public class ListagemDeLivrosDisponiveis {
	
	private final TodosLivros todosLivros;
	
	public ListagemDeLivrosDisponiveis(TodosLivros todosLivros) {
		this.todosLivros = todosLivros;
	}
	
	public Livros listagemPor(String nome) {
		return todosLivros.por(nome);
	}
}
