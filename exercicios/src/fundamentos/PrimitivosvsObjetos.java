package fundamentos;

public class PrimitivosvsObjetos {
	
	public static void main(String[] args) {
		String s = new String("Texto"); // forma menos usada para declarar uma String
		s.toUpperCase(); // Objetos possuem atribu���es que podem ser dadas a eles
		
		// Wrappers s�o a vers�o objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);
	}
}
