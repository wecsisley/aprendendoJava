package Comercio;

import java.time.LocalDate;

public class CadastroDeProdutos {
	
	public static void main(String[] args) {
		
		var produto = "Leite Integral Piracanjuba 1L";
	    long codigoDeBarras = 7898080640017L; 
	    double precoDeCusto = 2.50;
	    double precoDeVenda = precoDeCusto *2 ;
	    double lucro = precoDeVenda - precoDeCusto;
	    var grupo = "Laticínios";
	    var vendidoPor = "unidade";
	    var dataDeFabricacao = "12/12/2019";
	    var dataDeVencimento = "12/02/2020";	    
	    LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2020, 12, 02);
		System.out.println();	    	    		
	    var ncm = 04011010;
	    var csosn = 102;
	    var cfop = 5102;
	    
	    System.out.printf("\nProduto: %s \n\nCódigo de barras: %d \n\nPreço de Custo: R$ %.2f", 
	    		produto, codigoDeBarras, precoDeCusto);
	    
	    System.out.printf("\n\nPreço de Venda: R$%.2f \n", precoDeVenda );
	    
	    System.out.printf("\nGrupo do produto: %s \n\nVendido por: %s \n\n",
	    		grupo, vendidoPor);
	    
	    System.out.printf("Lucro do produto: R$%.2f \n ", lucro );
	    
	    System.out.printf("\nProduto fabricado em: %s \n\nVencimento do produto em: %s\n\n",
	    		dataDeFabricacao, dataDeVencimento);
	    
	    System.out.println("Produto Vencido ? - " + date1.isAfter(date2));
	    
	    System.out.printf("\nCódigo NCM do produto: %d \n\nCódigo CSOSN da opereação: %d \n\nCódigo CFOP da operação: %d",
	    		ncm, csosn, cfop); 
	}

}
