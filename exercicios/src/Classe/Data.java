package Classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada () {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	void imprimirDataFormatada() {
		System.out.print("\n" + obterDataFormatada());
	}
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
		
	}
	Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
		
	}
}
