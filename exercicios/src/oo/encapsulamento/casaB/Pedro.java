package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {
		// imposs�vel acessar "segredo" pois � um atributo "private" de Ana
		//System.out.println(segredo);
		
		//imposs�evl acessar "facoDentroDeCasa" pois � um atributo vis�vel apenas
		// dentro do pacote casaA onde Ana est�
		//System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}
}
