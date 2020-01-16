package controle;

public class SweitchSemBreak {
	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Neidan");
		case "amarela":
			System.out.println("Sei o Heian Shondan");
			break;
		default:
			System.out.println("Não sei nada");
		}
		System.out.println("Fim!\n");
	
		int idade = 3;
		
		switch(idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe Falar");
		case 1:
			System.out.println("Sabe andar");
		}
	}

}
