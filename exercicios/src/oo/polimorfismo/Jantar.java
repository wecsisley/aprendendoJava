package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65, "Pedro");
		
		Arroz prato1 = new Arroz (0.2, "Arroz");
		Feijao prato2 = new Feijao (0.1, "Feijao");
		
		System.out.println("Prato: " + prato1.getNome() + ", Peso: " 
		+ prato1.getPeso() + "kg.");
		
		System.out.println("\nO Convidado: " + convidado.getNome() 
		+ ", pesa: " + convidado.getPeso() + "kg.");
		
		convidado.comer(prato1);
		convidado.comer(prato1);
		System.out.println("\nO Convidado: " + convidado.getNome() 
		+ ", pesa: " + convidado.getPeso() + "kg.");
		
		convidado.comer(prato2);
		System.out.println("\nO Convidado: " + convidado.getNome() 
		+ ", pesa: " + convidado.getPeso() + "kg.");
		
		
	}
}
