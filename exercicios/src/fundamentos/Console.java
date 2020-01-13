package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" Dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("Dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d \n", 
				01, 02, 03, 04, 05, 06);
		
		System.out.printf("Salário: %.1f\n", 1234.5678);
		System.out.printf("Nome: %s\n", "João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu primeiro nome: ");		
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		
		System.out.printf("\n%s %s tem %d anos.",
				nome, sobrenome, idade);
		entrada.close();
	}

}
