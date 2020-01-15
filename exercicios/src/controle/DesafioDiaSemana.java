package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String diaSemana = entrada.next().toLowerCase().trim();
		
		
		// USE O .equalsIgnoreCase para compara��o de String !!!!!!
		if(diaSemana.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		}
		else if(diaSemana.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		}
		else if(diaSemana.equalsIgnoreCase("ter�a")) {
			System.out.println("3");
		}
		else if(diaSemana.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		}
		else if(diaSemana.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		}
		else if(diaSemana.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		}
		else if(diaSemana.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		}
		else {
			System.out.println("Dia invalido");
		}

		
		entrada.close();
	}

}
