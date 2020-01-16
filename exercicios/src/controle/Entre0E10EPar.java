package controle;

import java.util.Scanner;

public class Entre0E10EPar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numero = entrada.nextDouble();
		
		if (numero <=10 && numero >=0) {
			System.out.println("\nO número digitado foi: " + numero);
			if (numero % 2 == 0) {
				System.out.println("Número 'PAR'");
			}
			if (numero % 2 == 1) {
				System.out.println("Número 'Impar'");
			}
		}
		else {
			System.out.println("Número inválido");
		}
		entrada.close();
	}

}
