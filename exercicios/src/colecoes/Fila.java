package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// A diferença entre o .add e o .offer é que quando a fila tiver um númeor máximo de valores que podem estar dentro dela
		// suando o .add caso a fila esteja cheia ele vai gerar um erro, e usando .offer ele vai retornar "false"
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// A diferença entre .peek e .element é que ambos vão buscar o próximo a ser chamado (primeiro da fila) porém o .peek caso a fila esteja vazia
		// irá retornar "null" e o .element irá retornar um erro (ambos não deletam o valor da fila, apenas chamam)
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		//fila.isEmpty(); - verifica se a fila está vazia
		// fila.size(); - verifica quantos valores temos na fila
		//fila.clear(); - limpa toda a fila
		//fila.contains(); - para verificar se certo valor está na fila
		
		// .poll serve para chamar o próximo da fila já removendo o valor da fila 
		// quando chega ao fim da fila o .poll retorna null
		// .remove serve para chamar o próximo da fila já removendo o valor da fila 
		// quando chega ao fim da fila o .remove retorna um erro
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}

}
