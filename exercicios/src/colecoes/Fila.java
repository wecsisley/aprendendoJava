package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// A diferen�a entre o .add e o .offer � que quando a fila tiver um n�meor m�ximo de valores que podem estar dentro dela
		// suando o .add caso a fila esteja cheia ele vai gerar um erro, e usando .offer ele vai retornar "false"
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// A diferen�a entre .peek e .element � que ambos v�o buscar o pr�ximo a ser chamado (primeiro da fila) por�m o .peek caso a fila esteja vazia
		// ir� retornar "null" e o .element ir� retornar um erro (ambos n�o deletam o valor da fila, apenas chamam)
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		//fila.isEmpty(); - verifica se a fila est� vazia
		// fila.size(); - verifica quantos valores temos na fila
		//fila.clear(); - limpa toda a fila
		//fila.contains(); - para verificar se certo valor est� na fila
		
		// .poll serve para chamar o pr�ximo da fila j� removendo o valor da fila 
		// quando chega ao fim da fila o .poll retorna null
		// .remove serve para chamar o pr�ximo da fila j� removendo o valor da fila 
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
