package br.com.caelum.livraria.dominio;

import br.com.livraria.dominio.Autor;
import br.com.livraria.dominio.Cliente;

public class ObjetosParaTestes {
	
//	public static final Telefone UM_TELEFONE = new Telefone("11", "55555555");
	
	public static final String ddd = "11";
	public static final String numeroTelefone = "55555555";
	
	public static final String CEP = "03297060";
	public static final String ID_CLIENTE = "idCliente";
	public static final Cliente UM_CLIENTE = new Cliente("idCliente", ddd, numeroTelefone, CEP);
	public static final Cliente OUTRO_CLIENTE = new Cliente("outroIdCliente",  ddd, numeroTelefone, CEP);
	public static final Autor umAutor = new Autor("Rodrigo vieira");
}
