package controle.Desafio;

import java.util.Scanner;

public class DesafioAnoBiSexto {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// ano bisexto s�o multiplos de 4 
		System.out.print("Informe o ano de pesquisa: ");
		int anoBiSexto = entrada.nextInt();
		
			 if (anoBiSexto % 4 == 0) {
				System.out.print("O ano informado � Bisexto.");
			} 
			 else if (anoBiSexto % 4 == 1) {
				 System.out.println("N�o � ano Bisexto");
			 }
		entrada.close();
	}

}
