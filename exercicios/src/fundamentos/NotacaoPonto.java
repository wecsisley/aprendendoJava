package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
	
		String y = "Bom dia X"
				.replace("X", "Gui") // faz a troca de palavras ( X para Gui )
				.toUpperCase() // Coloca tudo em letra mai�scula
				.concat("!!!"); // acrescenta mais coisas � vari�el 
		
		System.out.println(y);
		
		// Tipos primitivos n�o tem o operador  " . "
				
	}

}
