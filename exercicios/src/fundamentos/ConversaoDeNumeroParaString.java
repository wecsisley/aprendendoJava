package fundamentos;

public class ConversaoDeNumeroParaString {
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); // .length() diz quantos caracteres tem a variável
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
	}

}
