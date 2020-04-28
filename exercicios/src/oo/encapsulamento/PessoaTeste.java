package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("João", "Alcântara", -30); //já aplicado controle para 
		//transformar números negativos em números positivos
		p1.setIdade(230);// já aplicado controle para retorna "0" quando um número for 
		//muito grande e fora da realidade do exemplo
		
		System.out.println(p1); // pegando o "toString"
	}
}
