package Classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;
		
		System.out.println(a1.area());
		
		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.pi);
		System.out.println(Math.PI);
	}
}
