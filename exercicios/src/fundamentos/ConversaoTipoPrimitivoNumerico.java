package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // conversão implícita
		System.out.println(a);
		
		float b = (float) 1.2345678888; // conversão explícita ( CAST ) com perda e valores e arredondamento
		System.out.println(b);
		
		int c = 4; 
		byte d = (byte) c; // conversão explícita ( CAST )
		System.out.println(d);
		
		double e = 1.9999; // conversão explícita ( CAST ) com perca de valores
	    int f = (int) e;
	    System.out.println(f);
	}
}
