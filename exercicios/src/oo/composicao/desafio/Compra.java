package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	
	String nome;
	Cliente cliente;
	ArrayList<Item> itens = new ArrayList<>();
	ArrayList<Cliente> clientes = new ArrayList<>();
	
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	void adicionarCliente(Cliente clientee) {
		this.clientes.add(cliente);
		cliente.compras.add(this);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
	
}
