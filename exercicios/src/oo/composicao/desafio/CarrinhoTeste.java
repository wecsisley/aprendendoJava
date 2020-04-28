package oo.composicao.desafio;


public class CarrinhoTeste {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Maizena");
		Cliente cliente2 = new Cliente("Sapo");
		Cliente cliente3 = new Cliente("Cuca");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Brahma Latão", 1, 5.00);
		compra1.adicionarItem("Brahma Litrão", 1, 9.50);
		compra1.adicionarItem("Brahma Garrafa", 1, 7.50);
		compra1.adicionarItem("Brahma Latinha", 1, 3.50);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Frango Assado", 1, 23.00);
		compra2.adicionarItem("Churrasco Misto", 1, 55.50);
		compra2.adicionarItem("Brahma Litrao", 10, 9.50);
		compra2.adicionarItem("Brahma Latao", 12, 5.00);
		
		Compra compra3 = new Compra();
		compra3.adicionarItem("Energético", 5, 8.00);
		compra3.adicionarItem("Uísque RedLable", 1, 95.00);
		compra3.adicionarItem("Brahma Litrao", 12, 9.50);
		compra3.adicionarItem("Brahma Latão", 12, 5.00);
		
		cliente1.adicionarCompra(compra3);
		cliente1.adicionarCompra(compra2);
		cliente2.adicionarCompra(compra1);
		cliente3.adicionarCompra(compra3);
		
		double totalCliente1 = compra3.obterValorTotal() + compra2.obterValorTotal();
		
//		for(Compra compra: cliente1.compras) {
//			 System.out.println("lista de comrpas: \n " + compra.itens.toString().replaceAll(",","").replaceAll("\\[", "").replaceAll("\\]", ""));
//		}
		System.out.println("Lista de compras do " + cliente1.nome + ":");
		for(Compra compra: cliente1.compras) {
			for(Item item: compra.itens) {
				System.out.println(item.nome + " " + item.quantidade + " " + item.preco);
			}
		}
		System.out.printf("\nTotal gasto R$ " + totalCliente1 + 0);
	}
}
