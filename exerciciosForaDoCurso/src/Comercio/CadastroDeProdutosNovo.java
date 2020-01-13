package Comercio;

import javax.swing.JOptionPane;

public class CadastroDeProdutosNovo {
	public static void main(String[] args) {
		
		String produto = JOptionPane.showInputDialog("Nome do produto:");
		System.out.println("Produto: " + produto);
		
		String codigoDeBarras = JOptionPane.showInputDialog("C�digo de Barras:");
		System.out.println("C�digo de Barras: "+ codigoDeBarras.replace(",", "."));
		
		String precoDeCusto = JOptionPane.showInputDialog("Pre�o de Custo:");
		System.out.println("Pre�o de custo: R$ " + precoDeCusto.replace(",", "."));
		
		String precoDeVenda = JOptionPane.showInputDialog("Pre�o de Venda:");
		System.out.println("Pre�o de venda: R$ " + precoDeVenda.replace(",", "."));
		
		double valorPrecoDeCusto = Double.parseDouble(precoDeCusto);
		double valorPrecoDeVenda = Double.parseDouble(precoDeVenda);
		
		double lucro = valorPrecoDeVenda - valorPrecoDeCusto;
		System.out.println("Lucro do produto: R$ "+ lucro); // colocar mais 1 casa decimal
		
		String grupo = JOptionPane.showInputDialog("Grupo do produto:");
		System.out.println("Grupo do produto: " + grupo);
		
		String dataDeFabricacao = JOptionPane.showInputDialog("Data de fabrica��o: ");
		System.out.println("Data de fabrica��o: " + dataDeFabricacao);
		
		String dataDeVencimento = JOptionPane.showInputDialog("Data de vencimento: ");
		System.out.println("Data de vencimento: " + dataDeVencimento);
		
		// Verifica��o da data de vencimento (ainda n�o aprendido)
		
		String estoque = JOptionPane.showInputDialog("Quantidade em estoque: ");
		estoque.replace(",", ".");
		double valorEmEstoque = Double.parseDouble(estoque);
		System.out.println("Quantidade em estoque: " + valorEmEstoque);
		
		String vendidoPor = JOptionPane.showInputDialog("Produto vendido por (KG, L, UN,): ");
		System.out.println("Produto vendido por: " + vendidoPor);
		
		String ncm = JOptionPane.showInputDialog("Informe NCM do produto: ");
		System.out.println("NCM: " + ncm);
		
		String csosn = JOptionPane.showInputDialog("Informe CSOSN do produto: ");
		System.out.println("CSOSN: " + csosn);
		
		String cfop = JOptionPane.showInputDialog("Informe CFOP do produto: ");
		System.out.println("CFOP: " + cfop);
		
		
	}

}

