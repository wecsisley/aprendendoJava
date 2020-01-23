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
		
		//anota��o " .size " serve para informar o tamanho do conjunto
		System.out.println("Tamanho � " + conjunto.size());
		
		// ele ignora quando � adicionado valores repetidos por�m faz distin��o de mai�sculo e min�sculo
		conjunto.add("teste"); // teste com letra min�scula ser� adicionado no conjunto
		conjunto.add(1); // valor repetido, n�o ser� considerado
		conjunto.add('x'); // valor repetido, n�o ser� considerado
		
		System.out.println("Tamanho � " + conjunto.size());
		
		
		// anota��o " .remove " serve para remover valores do conjunto, se a remo��o for feita 
		// ele retornar� " true " se a remo��o n�o for feita ele retornar� " false "
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove(2)); // retornando falso pois n�o existe valor 2 no conjunto
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho � " + conjunto.size());
		
		//anota��o " .contains " serve para verificar se existe um valor determinado dentro do conjunto
		System.out.println(conjunto.contains(1.2)); // retornar� true pois existe o valor 1.2 dentro do conjunto
		System.out.println(conjunto.contains('x')); // retornar� false pois o valor 'x' j� foi removido do conjunto na linha 31
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//Fazendo a uni�o de dois conjuntos, todos os valores de nums ser�o adicionados em conjunto
		conjunto.addAll(nums);
		
		System.out.println(conjunto);
		
		// a nota��o " .retainAll " serve para guardar apenas os valores que est�o em comum dentro dos 2 conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		// a anota��o " .clear " serve para limpar todos os valores de dentro do conjunto
		conjunto.clear();
		System.out.println(conjunto);
	}

}
