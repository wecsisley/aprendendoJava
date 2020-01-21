package operadores.Desafios;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		// Primeira parte da formula		
		int f1numero1 = 6 ;
		int f1numero2 = 3 ;
		int f1numero3 = 2 ;
		
		int f1resultado1 = f1numero1 * (f1numero2 + f1numero3) / f1numero1 ;
		
		//Segunda parte da formula
		int f2numero1 = 1;
		int f2numero2 = 5;
		int f2numero3 = 2;
		int f2numero4 = 7;
		
		int f2resultado2 = (f2numero1 - f2numero2)*(f2numero3 - f2numero4) / f2numero3;
		
		// Terceira parte da formula
		
		int f3resultado3 = f1resultado1 * f2resultado2;
		int divisao = 10;
		
		// Quarta parte da formula
		int f4resultado = (int) Math.pow(f3resultado3, 3);
		int divisaoFinal = (int) Math.pow(divisao, 3);
		
		// Resultado da formula
		int resultadoFinal = (f4resultado / divisaoFinal);
		System.out.println(resultadoFinal);
		
		// JEITO CERTO DE FAZER A OPERAÇÃO - CÓDIGO DO PROFESSOR - JEITO CERTO DE FAZER A OPERAÇÃO !!!!!
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é: " + resultado);
		
		
		
		
	}

}
