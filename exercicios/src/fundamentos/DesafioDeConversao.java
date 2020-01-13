package fundamentos;

import java.util.Scanner;

public class DesafioDeConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do primeiro sal�rio: ");
		String primeiroSalario = entrada.nextLine().replace(",", ".");
		
		System.out.print("\nDigite o valor do segundo sal�rio: ");
		String segundoSalario = entrada.nextLine().replace(",", ".");
		
		System.out.print("\nDigite o valor do terceiro sal�rio: ");
		String terceiroSalario = entrada.nextLine().replace(",", ".");
		
		float valor1 = Float.parseFloat(primeiroSalario);
		float valor2 = Float.parseFloat(segundoSalario);
		float valor3 = Float.parseFloat(terceiroSalario);
		
		double soma = valor1 + valor2 + valor3;
		double media = soma / 3;
		
		System.out.printf("\nA soma total dos sal�rios � de: R$ %.2f \nA m�dia dos sal�rios � de: R$ %.2f",
				soma, media);
		
		entrada.close();
	}

}
