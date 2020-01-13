package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // convers�o impl�cita
		System.out.println(a);
		
		float b = (float) 1.2345678888; // convers�o expl�cita ( CAST ) com perda e valores e arredondamento
		System.out.println(b);
		
		int c = 4; 
		byte d = (byte) c; // convers�o expl�cita ( CAST )
		System.out.println(d);
		
		double e = 1.9999; // convers�o expl�cita ( CAST ) com perca de valores
	    int f = (int) e;
	    System.out.println(f);
	}
}
