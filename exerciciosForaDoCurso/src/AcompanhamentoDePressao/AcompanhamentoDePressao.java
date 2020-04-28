package AcompanhamentoDePressao;

import javax.swing.JOptionPane;

public class AcompanhamentoDePressao {
	public static void main(String[] args) {
	
		// Inicio do bloco de cadastro pessoal do paciente
		String nome = JOptionPane.showInputDialog("Informe o nome do paciente: ");
		String telefone = JOptionPane.showInputDialog("Informe o telefone do paciente: ");
		String pegarIdade = JOptionPane.showInputDialog("Informe a idade do paciente: ");
		Integer idade = Integer.parseInt(pegarIdade);
		String pegarPeso = JOptionPane.showInputDialog("Informe o peso do paciente: ");
		Double peso = Double.parseDouble(pegarPeso);
		String pegarAltura = JOptionPane.showInputDialog("Informe a altura do paciente: ");
		Double altura = Double.parseDouble(pegarAltura);
		String pegarPressao = JOptionPane.showInputDialog("Informe a pressão do paciente: ");
		Double pressao = Double.parseDouble(pegarPressao);
		
		Paciente paciente1 = new Paciente (nome, telefone, idade, peso, altura, pressao);
		// Fim do bloco de cadastro pessoal do paciente
		
		System.out.println("\nDados pessoais: \n\n" + "Nome: " + paciente1.nome + "\nTelefone: " + paciente1.telefone + "\nIdade: " + paciente1.idade + " anos" + "\nPeso: " 
				+ paciente1.peso + "kg." + "\nAltura: " + paciente1.altura + "m" + "\nPressão (ultima aferição): " + paciente1.pressao);
		
		// Inicio do bloco de cadastro de endereço do paciente
		String rua = JOptionPane.showInputDialog("Informe o nome da rua do paciente: ");
		String bairro = JOptionPane.showInputDialog("Informe o nome do bairro do paciente: ");
		String cidade = JOptionPane.showInputDialog("Informe o nome da cidade do paciente: ");
		String numero = JOptionPane.showInputDialog("Informe o número da casa do paciente: ");
		String cep = JOptionPane.showInputDialog("Informe o cep do paciente: ");
		
		Endereco endereco1 = new Endereco (rua, bairro, cidade, numero, cep);
		// Fim do bloco de cadastro de endereço do paciente
		
		System.out.println("\n\nEndereço: \n\n" + "Rua: " + endereco1.rua + "\nNúmero: " + endereco1.numero + "\nCEP: " 
				+ endereco1.cep + "\nBairro: " + endereco1.bairro + "\nCidade: " + endereco1.cidade);
	}

}
