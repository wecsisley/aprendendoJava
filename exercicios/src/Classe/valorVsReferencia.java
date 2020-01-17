package Classe;

public class valorVsReferencia {
	public static void main(String[] args) {
		
		double a =2;
		double b = a; // atribuição por valor (Tipo Primitivo)
		
		a++;
		b--;
		
		System.out.println(a + "\n" + b);
		
		Data d1 = new Data(1, 06, 2022);
		Data d2 = d1; // atribuição por referência (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		System.out.println("\n" + d1.obterDataFormatada()); //O valor do objeto é alterado
		System.out.println(d2.obterDataFormatada()); // O valor do objeto é alterado
		
		voltarDataParaValorPadrao(d1);

		System.out.println("\n" + d1.obterDataFormatada()); // O valor do objeto é alterado
		System.out.println(d2.obterDataFormatada()); // O valor do objeto é alterado
	
		int c = 5;
		alterarPrimitivo(c); // O valor do primitivo não é alterado
		System.out.println("\n" + c);
		
		
	}
	
	
	
	
	
	static void voltarDataParaValorPadrao( Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

	static void alterarPrimitivo(int a) {
		a++;
	}
}
