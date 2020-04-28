package AcompanhamentoDePressao;

public class Paciente extends Endereco{
	
	String nome;
	String telefone;
	int idade;
	double peso;
	double altura;
	double pressao;
	
	public Paciente () {
	}
	
	public Paciente (String rua, String bairro, String cidade, String numero, String cep) {
		super(rua, bairro, cidade, numero, cep);
	}
	
	public Paciente (String nome, String telefone, int idade, double peso, double altura, double pressao) {
		setNome(nome);
		setIdade(idade);
		setPeso(peso);
		setAltura(altura);
		setPressao(pressao);
		setTelefone(telefone);
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPressao() {
		return pressao;
	}

	public void setPressao(double pressao) {
		this.pressao = pressao;
	}
	
	 
}
