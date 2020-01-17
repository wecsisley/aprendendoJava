package Classe;

public class DataTeste {
	public static void main(String[] args) {
		
		// Pegando a data padr�o do construtor
		Data d1 = new Data();
		
		// Informando a data nos parenteses do construtor
		Data d2 = new Data(10,10,1999);
		
		// alterando apenas o ano e pegeando o restante da data padr�o do construtor
		Data d3 = new Data();
		d3.ano = 2020;
		
		//chamando os construtores atrav�s de metodos
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
		
		//chamando os construtores atrav�s de metodos simplificados (n�o aconselhavel) 
		//System.outr.print inserido diretamente no m�todo.
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		d3.imprimirDataFormatada();
		
	}

}
