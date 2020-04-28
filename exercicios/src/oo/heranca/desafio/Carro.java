package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual = 0;
	private int delta = 5;
	
	public Carro(){
		this(0);
	}
	
	public Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar () {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}
		velocidadeAtual += 5;
	}
	public void frear () {
		if(velocidadeAtual > 5) {
			velocidadeAtual -=  5;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString () {
		return "A velocidade atual é: " + velocidadeAtual + "Km/h";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
