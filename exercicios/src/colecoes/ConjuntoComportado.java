package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//SortedSet e no final TreeSet serve para organizar na ordem o conjunto
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		listaAprovados.add("ana");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(14);
		nums.add(20);
		nums.add(4);
		nums.add(98);
		
		for(int n: nums) {
			System.out.println(n);
		}
		
	}

}
