package SorteadorDeNumeros;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class sorteadorDeNumeros {
	public static void main(String[] args) {
		
		
		String sorteio = JOptionPane.showInputDialog("Informe o número da pergunta:");
		Integer sorteio1 = Integer.parseInt(sorteio);
		
		Map <Integer, String> map = new HashMap<>();
		
		map.put(1, "\nNormalmente, quantos litros de sangue uma pessoa tem ?\nEm média quanto é retirado em uma doação de sangue ?\n\nA) Tem entre 2 a 4 litros. "
				+ "São retirados 450 mililitros\nB) Tem entre 4 a 6 litros. São retirados 450 mililitros\nC) Tem 10 litros. São retirados 2 litros\nD) Tem 7 litros. São retirados 1,5 litros"
				+ "\nE) Tem 0,5 litros. São retirados 0,5 litros");
		map.put(2, "\nDe onde é a invenção do chuveiro elétrico ?\n\nA) França "
				+ "\nB) Inglaterra\nC) Brasil\nD) Austrália"
				+ "\nE) Itália");
		map.put(3, "\nQual o livro mais vendido no mundo a seguir à Biblia ?\n\nA) O Senhor dos anéis\nB) Dom Quixote\nC) O pequeno príncipe"
				+ "\nD) Ela, a Feiticeira\nE) Um conto de Duas Cidades");
		map.put(4, "\nAtualmente, quantos elementos quimicos"
				+ "\na tabela periódica possui ?\n\nA) 113\nB) 109\nC) 108"
				+ "\nD) 118\nE) 92");
		map.put(5, "\nQuais os países que tem a maior e a menor expectativa"
				+ "\nde vida do mundo ?\n\nA) Japão e Serra Leoa\nB) Austrália e Afeganistão\nC) Itália e Chade"
				+ "\nD) Brasil e Congo\nE) Estados Unidos e angola");
		map.put(6, "\nQuais as duas datas que são comemoradas em Novembro ?\n\nA) Independência do Brasil e Dia da Bandeira\nB) Proclamação da República e Consciência Negra"
				+ "\nC) Dia do médico e Dia de São Lucas"
				+ "\nD) Dia de finados e Dia Nacional do livro\nE) Black Friday e Dia da Árvore");
		map.put(7, "\nEm que período da pré-hitória do fogo foi descoberto ?\n\nA) Neolítico\nB) Paleolítico\nC) Idade dos metais"
				+ "\nD) Período da pedra polida\nE) Idade média");
		map.put(8, "\nEm qual lugar da ásia o português é lingua oficial ?\n\nA) India\nB) Filipinas\nC) Moçanbique"
				+ "\nD) Macau\nE) Portugal");
		map.put(9, "\nQuais destas construções famosas ficam nos Estados Unidos ?\n\nA) Estatua da Liberdade "
				+ "\ne Golden Gate Bridge e Empire State Building"
				+ "\nB) Estátua da Liberdade, Big Ben, e The High Line\nC) Angkor wat, Taj Mahal e Skywalk no Grand Canyon"
				+ "\nD) Lincoln Memorial, Sidney Opera House e Burj Khalifa\nE) 30 St Mary Axe, "
				+ "\nThe High Line e Residencial 148 Spruce Street");
		map.put(10, "\nQual destes países é transcontinental ?\n\nA) Rússia\nB) Filipinas\nC) Istambul"
				+ "\nD) Groelandia\nE) Tanzãnia");
		map.put(11, "\nQual foi o recurso utilizado inicialmente pelo homem "
				+ "\npara explicar a origem das coisas ?\n\nA) Filosofia\nB) Biologia\nC) Matemática"
				+ "\nD) AStronomia\nE) Mitologia");
		map.put(12, "\nQual é o maior animal terrestre ?\n\nA) Baleia Azul\nB) Dinossauro\nC) elefante Africano"
				+ "\nD) tubarão Branco\nE) Girafa");
		map.put(13, "\nQuais os nomes dos três Reis Megos ?\n\nA) Gaspar, Nicolau e Natanael\nB) Belchior, Gaspar e Baltazar\nC) Belchior, Gaspar e Nataniel"
				+ "\nD) Gabriel, Nenjamim e Melchior\nE) Melchior, Noé e Galileu");
		map.put(14, "\nQual o nome do cientista que descobriu o processo "
				+ "\nde pasteurização e a vacina contra a raiva ?\n\nA) Marie Curie\nB) Blaise Pascal\nC) Louis Pasteurs"
				+ "\nD) Antonie Lavoisier\nE) Charles Darwin");
		map.put(15, "\nComo morreu Saddam Hussein ?\n\nA) Câncer\nB) Suicídio\nC) Ataque Cardiaco"
				+ "\nD) Enforcado\nE) Com chocolate 70% cacau");
		map.put(16, "\nEm que ano e onde aconteceu o maior acidente aéreo do Brasil?\n\nA) 2007, em São Paulo\nB) 1982, no Ceará\nC) 1996, em São Paulo"
				+ "\nD) 1952, na Amazônia\nE) 2006, no Mato Grosso");
		map.put(17, "\nQuais os quatro países que tem a maior população "
				+ "\ncarcerária do mundo ?\n\nA) Brasil, Estados Unidos, México e India\nB) China, Estados Unidos, India e Indonésia"
				+ "\nC) Rússia, Japão, Canadá e China"
				+ "\nD) Estados Unidos, China, Rússia e Brasil\nE) Brasil, Estados Unidos, China e Vaticano");
		map.put(18, "\nO Etanaol é produzido através de qual fonte de energia ?\n\nA) Solar\nB) Biomassa\nC) Eólica"
				+ "\nD) Geotérmica\nE) Hidroelétrica");
		map.put(19, "\nQual destas, apesar do seu nome, não é considerada "
				+ "\num tipo de força ?\n\nA) Força de atrito\nB) Força peso\nC) Força centrípeta"
				+ "\nD) Força eletromotriz\nE) Força normal");
		map.put(20, "\nQual desses não é um instrumento meteorológico ?\n\nA) Barágrafo\nB) Termômetro\nC) Pluviômetro"
				+ "\nD) Anemômetro\nE) Etilômetro");
		map.put(21, "\nQual dessas aves não voa ?\n\nA) Pinguim\nB) Galinha\nC) Cegonha"
				+ "\nD) Pato\nE) Peru");
		map.put(22, "\nQual é respectivamente o animal mais lento e mais veloz\n\nA) Bicho preguiça e Guepardo\nB) Tartaruga e Leão\nC) Coala e Cavalo"
				+ "\nD) Caracol e Tubarão\nE) Bicho preguiça e Libélula");
		map.put(23, "\nO que é Ortorexia ?\n\nA) Obsessão pelo consumo de alimentos saudáveis\nB) Transtorno alimentar caracterizado pela perda de apetite\nC) Obsessão em falar de forma correta"
				+ "\nD) Preocupação exagerada em ter um corpo elegante\nE) Distúrbio alimentar que provoca a ingestão excessiva"
				+ "\nde alimentos");
		map.put(24, "\nNesses pares, ambos são mamíferos: ?\n\nA) Baleia Azul e Golfinhos\nB) Morcegos e Galinhas\nC) Girafas e Tartarugas"
				+ "\nD) Porcos e Pinguins\nE) Macacos e Sapos");
		map.put(25, "\nQuanto tempo garrafas e plástico e jornal, respectivamente,"
				+ "\ndemoram para se decompor ?\n\nA) 1000 anos e 1 ano\nB) 450 anos e 6 semanas\nC) 100 anos e 10 semanas"
				+ "\nD) 1 milhão de anos e 1 semana\nE) 500 anos e 5 meses");
		map.put(26, "\nQuantos animais estavam na arca de moises ?\n\nA) 4 de cada espécie\nB) 1 de cada espécie\nC) 2 de cada espécie"
				+ "\nD) 6 de cada espécie\nE) Nenhum");
		map.put(27, "\nQuanto mede uma girafa ?\n\nA) entre 4,8 e 5,5 metros\nB) 2 metros\nC) entre 5 e 6 metros"
				+ "\nD) 2,5 metros\nE) 4 metros");
		map.put(28, "\nQuais das alternativas contém apenas nomes de rios ?\n\nA) São Francisco, Douro, Antártico\nB) Nilo, Amazonas, Mississipi\nC) Cáspio, Vermelho, Reno"
				+ "\nD) Tocantins, Bering, Ganges\nE) Danúbio, Jordão, Morto");
		map.put(29, "\nAs pessoas de qual tipo sanguíneo são consideradas doadores "
				+ "\nuniversais ?\n\nA+) A-\nB) B\nC) O-"
				+ "\nD) AB\nE) O+");
		map.put(30, "\nQuantos planetas terra cabem dentro do Sol ?\n\nA) Um Milhão\nB) Cem\nC) Seiscentos"
				+ "\nD) Cento e Cinquenta\nE) Dois Milhões");
		
		System.out.println(map.get(sorteio1));
	}
}
