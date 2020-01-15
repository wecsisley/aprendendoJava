package controle;
import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		boolean criterioDeAprovacao = media >= 7 && media <= 10;
		boolean criterioDeRecuperacao = media >= 5 && media <= 6.9;
		boolean criterioDeReprovacao = media >= 0 && media <= 4.9;
		boolean valorInvalido = media < 0 || media > 10;
		
		if(criterioDeAprovacao) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		
		
		if(criterioDeRecuperacao) {
			System.out.println("Você está de recuperação.");
			System.out.println("Estude Mais!");
		}
		
		
		if(criterioDeReprovacao) {
			System.out.println("Infelizmente você foi reprovado.");
			System.out.println("Se esforce mais no próximo ano!");
		}
		
		if(valorInvalido) {
			System.out.println("O valor informado é invalido.");
		}
			
		entrada.close();
	}
}
