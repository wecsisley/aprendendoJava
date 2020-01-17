package Classe;

public class ProdutoTeste {
	public static void main(String[] args) {
	
		//Construindo um produto com 1 construtor com parametros
		Produto p1 =  new Produto("Notebook", 4500.00);
		
		//construindo um produto com um construtor padrão 
		Produto p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 10.00;
		
		//Dando desconto de todos os produtos em 25%
		System.out.println("Produto: " + p1.nome + "\nValor com desconto: R$ " + p1.precoComDesconto());
		//Mostrando o preço origial dos produtos sem desconto
		System.out.printf("Valor sem desconto: R$ %.2f\n", p1.preco);
		
		//Dando desconto de todos os produtos em 25%
		System.out.println("\nProduto: " + p2.nome + "\nValor com desconto: R$ " + p2.precoComDesconto());
		//Mostrando o preço origial dos produtos sem desconto
		System.out.printf("Valor sem desconto: R$ %.2f\n", p2.preco);
		
		
		double totalDoCarrinho = p1.preco + p2.preco;
		double totalDoCarrinhoComDesconto = p1.precoComDesconto() + p2.precoComDesconto();
		System.out.print("\nTotal do carrinho é de: R$ " + totalDoCarrinho + "  SEM DESCONTO !\n");
		System.out.print("Total do carrinho é de: R$ " + totalDoCarrinhoComDesconto + "  COM DESCONTO !!!!!\n\n");
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaDoCarrinho = ((precoFinal1 + precoFinal2) / 2);
		System.out.printf("A média do carrinho está em: R$ %.2f", mediaDoCarrinho);
	}
}
