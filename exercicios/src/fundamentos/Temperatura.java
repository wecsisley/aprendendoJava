package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		
		// formula - (�f -32) * 5/9 = �C
		final double controle = 32;
		final double fator = 5.0/9.0;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - controle) * fator;
		
		System.out.println("O resultado � " + celsius +"c�");
		
		
		       fahrenheit = 0;
		       celsius = (fahrenheit - controle) * fator;
		       System.out.println("O resultado � " + celsius +"c�");
	}
}
