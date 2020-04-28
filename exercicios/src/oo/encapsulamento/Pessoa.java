package oo.encapsulamento;

public class Pessoa {
	
	private String sobreNome;
	private String nome;
	private int idade;
	
	public Pessoa(String nome, String sobreNome, int idade) {
		setNome(nome);
		setSobreNome(sobreNome);
		setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getNomeCompleto() {
		return getNome() + " " + getSobreNome();
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		} 
	}
	@Override
	public String toString() {
		return "Olá, eu sou o " + getNomeCompleto() 
		+ " e tenho " + getIdade() + " anos.";
	}
}
