package operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean ATV50 = trabalho1 && trabalho2;
		boolean BTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean saudavel = !comprouSorvete;
		
		System.out.println("Comprou a TV de 50\"? " + ATV50);
		System.out.println("comprou a TV de 32\"? " + BTV32);
		System.out.println("Comprou Sorvete\"? " + comprouSorvete);
		System.out.println("Ficou mais saudável\"? " + saudavel);	
		
		
	}

}
