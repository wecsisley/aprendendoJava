package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();
	
	void testeAcessos() {
		//Imposs�vel acessar "sogra.segredo" pois � um atributo "private" de Ana
		//System.out.println(sogra.segredo);
		
		//imposs�vel acessar "sogra.facoDentroDeCasa" pois � um atributo "default" de Ana
		//System.out.println(sogra.facoDentroDeCasa);
		
		//imposs�vel acessar "sogra.formaDeFalar" pois � um atributo "protected" de Ana 
		//System.out.println(sogra.formaDeFalar);
		
		System.out.println(sogra.todosSabem);
	}
}
