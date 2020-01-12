package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(2));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!"));
		System.out.println(s + ("!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().endsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("Tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		String nome = "Pedro";
		String sobrenome = "Santos";
		int idade = 33;
		double salario = 997.50;
				
		System.out.println("Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nIdade: " + idade + 
				"\nSalario: " + salario + "\n\n");
		
		System.out.printf("\nO Senhor %s %s tem %d anos e ganha R$ %.2f de salário.",
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO Senhor %s %s tem %d anos e ganha R$ %.2f de salário.",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
				
	}
}
