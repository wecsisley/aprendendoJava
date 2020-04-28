package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	List<Compra> compras = new ArrayList<>();
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
		compra.clientes.add(this);
	}
	
	Cliente(String nome) {
		this.nome = nome;
	}
	public String toString() {
		return nome;
	}
}
