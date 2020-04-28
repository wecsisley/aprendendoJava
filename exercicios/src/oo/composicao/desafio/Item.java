package oo.composicao.desafio;

import java.util.ArrayList;

public class Item {
	
	String nome;
	int quantidade;
	double preco;
	Compra compra;
	
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public String toString() {
		//return "\nnome: " + this.nome + "\nquantidade: " + this.quantidade + "\npreço: R$" + preco + "\n\n";
		return   this.nome + " " + this.quantidade + " " + preco + "\n";
	}
}
