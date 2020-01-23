package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); // usando .get voc� pega apeas o valor daquele indice
		
		System.out.println("Removendo o usu�rio: " + lista.remove(1)); // removendo
		System.out.println("Verificando se existe o usu�rio: " + lista.contains(new Usuario("Lia"))); // verificando se tem
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}

}
