package lambidas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Desafio {

	public static void main(String[] args) {
		
		double precoProduto = 3324.00;
		double descontoProduto = 10.00;
		double impostoMunicipio = 20.00;
		
		// Função para calcular o preço do produto já com desconto
		BiFunction<Double, Double, Double> precoReal = (preco, desconto) -> {
			double precoDesconto = (preco * desconto) / 100;
			return precoDesconto = preco - precoDesconto;
		};
		
			double precoComDesconto = precoReal.apply(precoProduto, descontoProduto);
		
		// Função para calcular o preço do produto com Imposto
		BiFunction<Double, Double, Double> impostoMunicipal = (preco, imposto) -> {
			double precoImposto = (preco * imposto) / 100;
			return preco >= 2500.00 ? (preco - preco) + precoImposto : (preco - preco);
		};
		
			double precoComImposto = impostoMunicipal.apply(precoProduto, impostoMunicipio);
		
		// Função para calcular o preço do produto com frete
		Function<Double, Double> frete =
				preco -> preco >= 3000.00 ? (preco - preco) + 100 : (preco - preco) + 50;
				
			double precoComFrete = frete.apply(precoProduto);
				
		double precoFinal = precoComDesconto + precoComImposto + precoComFrete;
		
		//Arredondando preço do produto
		double precoArredondado = Math.round(precoFinal);
		
		//Criando Produto
		Produto produto1 = new Produto("iPad", precoArredondado, descontoProduto);
		
		System.out.println("Produto: " + produto1.nome + "\nValor R$: " + produto1.preco);
	
		
		/*
		 * 1. A partir do produto calcular o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500(8.5%) < 2500 (Isento)
		 * 3. Frete: >= 3000 (100) <3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar R$ 1234,56
		 */
		
	}
}
