package oo.encapsulamento.casaA;

public class Paulo {

	
	Ana esposa = new Ana();
	
	void testeAcessos() {
		
		//imposs�vel acessar "esposa.segredo" pois � um atributo "private" de Ana
		//System.out.println(esposa.segredo);
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
		
	}
}
