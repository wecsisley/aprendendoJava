package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Jo�o", "Alc�ntara", -30); //j� aplicado controle para 
		//transformar n�meros negativos em n�meros positivos
		p1.setIdade(230);// j� aplicado controle para retorna "0" quando um n�mero for 
		//muito grande e fora da realidade do exemplo
		
		System.out.println(p1); // pegando o "toString"
	}
}
