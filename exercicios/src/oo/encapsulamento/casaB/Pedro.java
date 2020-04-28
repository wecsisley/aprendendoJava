package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {
		// impossível acessar "segredo" pois é um atributo "private" de Ana
		//System.out.println(segredo);
		
		//impossíevl acessar "facoDentroDeCasa" pois é um atributo visível apenas
		// dentro do pacote casaA onde Ana está
		//System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}
}
