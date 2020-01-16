package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String a = "";
		String b = "sair";
		
		while(!a.equalsIgnoreCase(b.toLowerCase().trim())) {
			System.out.print("Olá, Digite 'sair' para Continuar executando o programa: ");
			 a = entrada.next();
		}
			
		
		
		entrada.close();
	}

}
