package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();
	
	void testeAcessos() {
		//Impossível acessar "sogra.segredo" pois é um atributo "private" de Ana
		//System.out.println(sogra.segredo);
		
		//impossível acessar "sogra.facoDentroDeCasa" pois é um atributo "default" de Ana
		//System.out.println(sogra.facoDentroDeCasa);
		
		//impossível acessar "sogra.formaDeFalar" pois é um atributo "protected" de Ana 
		//System.out.println(sogra.formaDeFalar);
		
		System.out.println(sogra.todosSabem);
	}
}
