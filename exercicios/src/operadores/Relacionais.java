package operadores;

public class Relacionais {
	public static void main(String[] args) {
		
		int numero1 = 4;
		int numero2 = 5;
		
		System.out.println(numero1 == numero2);
		System.out.println(numero1 != numero2);
		System.out.println(numero1 > numero2);
		System.out.println(numero1 < numero2);
		System.out.println(numero1 >= numero2);
		System.out.println(numero1 <= numero2);
		
		
		// critérios para dar desconto ao aluno: nota maior que 7.0 e ter bom comprotamento
		double nota = 8.0;
		boolean bomComportamento = true;
		boolean temDesconto = nota >= 7 && bomComportamento;
		
		System.out.println("\nO aluno tem desconto: " + temDesconto);
	}

}
