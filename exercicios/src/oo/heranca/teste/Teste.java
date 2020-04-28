package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Teste {
	public static void main(String[] args) {
		
		Civic carro1 = new Civic ();
		
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.frear();
		carro1.frear();
		carro1.frear();
		System.out.println(carro1);
		
		Ferrari carro2 = new Ferrari();
		
		carro2.acelerar();
		System.out.println("\nFerrari: normal\n" + carro2);
		
		carro2.ligarTurbo();
		carro2.acelerar();
		System.out.println("\nFerrari: com turbo\n" + carro2);

		carro2.ligarAr();
		carro2.acelerar();
		System.out.println("\nFerrari: com turbo e Ar\n" + carro2);
		
		carro2.desligarTurbo();
		carro2.acelerar();
		System.out.println("\nFerrari: Sem Turbo com Ar\n" + carro2);
		
		carro2.frear();
		System.out.println("\nFerrari: Freando\n" + carro2);
		
	}
}
