package Comercio;

public class CadastroDeProdutos {
	public static void main(String[] args) {
		
		var produto = "Leite Integral Piracanjuba 1L";
	    long codigoDeBarras = 7898080640017L; 
	    double precoDeCusto = 2.00;
	    double precoDeVenda = precoDeCusto *2 ;
	    double lucro = precoDeVenda - precoDeCusto;
	    var grupo = "Laticínios";
	    var vendidoPor = "unidade";
	    var dataDeFabricacao = "12/12/2019";
	    var dataDeVencimento = "12/02/2020";
	    boolean verificacaoDeVencimento = false ;	    		
	    var ncm = 04011010;
	    var csosn = 102;
	    var cfop = 5102;
	    
	    System.out.printf("\nProduto: %s \n\nCódigo de barras: %d \n\nPreço de Custo: R$ %.2f", 
	    		produto, codigoDeBarras, precoDeCusto);
	    
	    System.out.println("\n\nPreço de Venda: R$ " + precoDeVenda + 0);
	    
	    System.out.printf("\nGrupo do produto: %s \n\nVendido por: %s \n\n",
	    		grupo, vendidoPor);
	    
	    System.out.println("Lucro do produto: R$ " + lucro + 0);
	    
	    System.out.printf("\nProduto fabricado em: %s \n\nVencimento do produto em: %s\n\n",
	    		dataDeFabricacao, dataDeVencimento);
	    
	    System.out.println("Produto Vencido ? - " + verificacaoDeVencimento );
	    
	    System.out.printf("\nCódigo NCM do produto: %d \n\nCódigo CSOSN da opereação: %d \n\nCódigo CFOP da operação: %d",
	    		ncm, csosn, cfop);
	}

}
