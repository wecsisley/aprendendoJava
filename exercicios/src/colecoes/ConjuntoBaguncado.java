package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// criando um conjunto
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // ele converte automaticamente o tipo primitivo para uma classe ( double para Double)
		conjunto.add(true); // boolean para Boolean
		conjunto.add("Teste");
		conjunto.add(1); // int para Integer
		conjunto.add('x'); // char para Character
		
		//anotação " .size " serve para informar o tamanho do conjunto
		System.out.println("Tamanho é " + conjunto.size());
		
		// ele ignora quando é adicionado valores repetidos porém faz distinção de maiúsculo e minúsculo
		conjunto.add("teste"); // teste com letra minúscula será adicionado no conjunto
		conjunto.add(1); // valor repetido, não será considerado
		conjunto.add('x'); // valor repetido, não será considerado
		
		System.out.println("Tamanho é " + conjunto.size());
		
		
		// anotação " .remove " serve para remover valores do conjunto, se a remoção for feita 
		// ele retornará " true " se a remoção não for feita ele retornará " false "
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove(2)); // retornando falso pois não existe valor 2 no conjunto
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		//anotação " .contains " serve para verificar se existe um valor determinado dentro do conjunto
		System.out.println(conjunto.contains(1.2)); // retornará true pois existe o valor 1.2 dentro do conjunto
		System.out.println(conjunto.contains('x')); // retornará false pois o valor 'x' já foi removido do conjunto na linha 31
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//Fazendo a união de dois conjuntos, todos os valores de nums serão adicionados em conjunto
		conjunto.addAll(nums);
		
		System.out.println(conjunto);
		
		// a notação " .retainAll " serve para guardar apenas os valores que estão em comum dentro dos 2 conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		// a anotação " .clear " serve para limpar todos os valores de dentro do conjunto
		conjunto.clear();
		System.out.println(conjunto);
	}

}
