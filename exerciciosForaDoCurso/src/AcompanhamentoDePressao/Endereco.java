package AcompanhamentoDePressao;

public class Endereco {

	String rua;
	String bairro;
	String cidade;
	String numero;
	String cep;
	
	public Endereco() {
	}
	
	public Endereco (String rua, String bairro, String cidade, String numero, String cep) {
		setRua(rua);
		setBairro(bairro);
		setCidade(cidade);
		setNumero(numero);
		setCep(cep);
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}
