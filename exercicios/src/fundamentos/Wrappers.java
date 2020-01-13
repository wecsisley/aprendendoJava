package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		
		Byte b = 100;
		Short s = 1000;
		
		//Integer.parseInt(entrada.next()); - convertendo um valor inteiro em uma String
		Integer i = 10000; // int
		Long l = 1000000000L;
		
		System.out.println(b.byteValue()); // chamando o valor de byte
		System.out.println(s.toString()); // convertendo o valor de " s " para String
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); // convertendo boolean para String
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");
	}
	
}
