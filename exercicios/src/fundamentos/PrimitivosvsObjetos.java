package fundamentos;

public class PrimitivosvsObjetos {
	
	public static void main(String[] args) {
		String s = new String("Texto"); // forma menos usada para declarar uma String
		s.toUpperCase(); // Objetos possuem atribuíções que podem ser dadas a eles
		
		// Wrappers são a versão objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);
	}
}
