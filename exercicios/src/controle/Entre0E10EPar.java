package controle;

import java.util.Scanner;

public class Entre0E10EPar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		double numero = entrada.nextDouble();
		
		if (numero <=10 && numero >=0) {
			System.out.println("\nO n�mero digitado foi: " + numero);
			if (numero % 2 == 0) {
				System.out.println("N�mero 'PAR'");
			}
			if (numero % 2 == 1) {
				System.out.println("N�mero 'Impar'");
			}
		}
		else {
			System.out.println("N�mero inv�lido");
		}
		entrada.close();
	}

}
