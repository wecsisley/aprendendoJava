package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto");
		usuarios.put(20, "Ricardo");
		usuarios.put(30, "Rafaela");
		usuarios.put(44, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); // mostra os valores dado a cada nome
		System.out.println(usuarios.values()); // mostra os nomes dado
		System.out.println(usuarios.entrySet()); // mostra os valores e os nomes dado
		
		System.out.println(usuarios.containsKey(20)); // verifica se tem o valor perguntado
		System.out.println(usuarios.containsValue("Rebeca")); // verifica se tem o nome perguntado
		
		System.out.println(usuarios.get(1)); // busca o nome do valor informado
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(" " + registro.getKey() + " - ");
			System.out.println(registro.getValue());
		}
		System.out.println(usuarios.remove(1, "Roberto"));
	}

}
