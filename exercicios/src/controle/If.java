package controle;
import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		boolean criterioDeAprovacao = media >= 7 && media <= 10;
		boolean criterioDeRecuperacao = media >= 5 && media <= 6.9;
		boolean criterioDeReprovacao = media >= 0 && media <= 4.9;
		boolean valorInvalido = media < 0 || media > 10;
		
		if(criterioDeAprovacao) {
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
		}
		
		
		if(criterioDeRecuperacao) {
			System.out.println("Voc� est� de recupera��o.");
			System.out.println("Estude Mais!");
		}
		
		
		if(criterioDeReprovacao) {
			System.out.println("Infelizmente voc� foi reprovado.");
			System.out.println("Se esforce mais no pr�ximo ano!");
		}
		
		if(valorInvalido) {
			System.out.println("O valor informado � invalido.");
		}
			
		entrada.close();
	}
}
