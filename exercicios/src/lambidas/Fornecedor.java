package lambidas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		Supplier<List<String>> umlista = 
				() -> Arrays.asList("Ana", "Lia", "Gui");
				
				System.out.println(umlista.get());
	}
}
