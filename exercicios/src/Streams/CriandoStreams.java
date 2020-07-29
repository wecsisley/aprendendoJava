package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		//usando Stream passando os valores direto na Stream
		Stream<String> langs = Stream.of("Java", "Lua", "JS\n");
		langs.forEach(print);
		
		// usando Stream passando os valores por um Array pronto
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
		Stream.of(maisLangs).forEach(print);
		
		//Usando Stream usando um Arrays.stream
		Arrays.stream(maisLangs).forEach(print);
		
		//Usando Stream através de um Arrays.stream eliminando elementos
		Arrays.stream(maisLangs, 1, 2).forEach(print);
		
		//Usando Stream com o List
		List<String> outrasLangs = Arrays.asList
				("C ", "PHP ", "Kotlin\n");
		
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		// Stream infinita = Stream.generate(() -> "a").forEach(print);
	}
	
}
