package SorteadorDeNumeros;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class sorteadorDeNumeros {
	public static void main(String[] args) {
		
		
		String sorteio = JOptionPane.showInputDialog("Informe o n�mero da pergunta:");
		Integer sorteio1 = Integer.parseInt(sorteio);
		
		Map <Integer, String> map = new HashMap<>();
		
		map.put(1, "\nNormalmente, quantos litros de sangue uma pessoa tem ?\nEm m�dia quanto � retirado em uma doa��o de sangue ?\n\nA) Tem entre 2 a 4 litros. "
				+ "S�o retirados 450 mililitros\nB) Tem entre 4 a 6 litros. S�o retirados 450 mililitros\nC) Tem 10 litros. S�o retirados 2 litros\nD) Tem 7 litros. S�o retirados 1,5 litros"
				+ "\nE) Tem 0,5 litros. S�o retirados 0,5 litros");
		map.put(2, "\nDe onde � a inven��o do chuveiro el�trico ?\n\nA) Fran�a "
				+ "\nB) Inglaterra\nC) Brasil\nD) Austr�lia"
				+ "\nE) It�lia");
		map.put(3, "\nQual o livro mais vendido no mundo a seguir � Biblia ?\n\nA) O Senhor dos an�is\nB) Dom Quixote\nC) O pequeno pr�ncipe"
				+ "\nD) Ela, a Feiticeira\nE) Um conto de Duas Cidades");
		map.put(4, "\nAtualmente, quantos elementos quimicos"
				+ "\na tabela peri�dica possui ?\n\nA) 113\nB) 109\nC) 108"
				+ "\nD) 118\nE) 92");
		map.put(5, "\nQuais os pa�ses que tem a maior e a menor expectativa"
				+ "\nde vida do mundo ?\n\nA) Jap�o e Serra Leoa\nB) Austr�lia e Afeganist�o\nC) It�lia e Chade"
				+ "\nD) Brasil e Congo\nE) Estados Unidos e angola");
		map.put(6, "\nQuais as duas datas que s�o comemoradas em Novembro ?\n\nA) Independ�ncia do Brasil e Dia da Bandeira\nB) Proclama��o da Rep�blica e Consci�ncia Negra"
				+ "\nC) Dia do m�dico e Dia de S�o Lucas"
				+ "\nD) Dia de finados e Dia Nacional do livro\nE) Black Friday e Dia da �rvore");
		map.put(7, "\nEm que per�odo da pr�-hit�ria do fogo foi descoberto ?\n\nA) Neol�tico\nB) Paleol�tico\nC) Idade dos metais"
				+ "\nD) Per�odo da pedra polida\nE) Idade m�dia");
		map.put(8, "\nEm qual lugar da �sia o portugu�s � lingua oficial ?\n\nA) India\nB) Filipinas\nC) Mo�anbique"
				+ "\nD) Macau\nE) Portugal");
		map.put(9, "\nQuais destas constru��es famosas ficam nos Estados Unidos ?\n\nA) Estatua da Liberdade "
				+ "\ne Golden Gate Bridge e Empire State Building"
				+ "\nB) Est�tua da Liberdade, Big Ben, e The High Line\nC) Angkor wat, Taj Mahal e Skywalk no Grand Canyon"
				+ "\nD) Lincoln Memorial, Sidney Opera House e Burj Khalifa\nE) 30 St Mary Axe, "
				+ "\nThe High Line e Residencial 148 Spruce Street");
		map.put(10, "\nQual destes pa�ses � transcontinental ?\n\nA) R�ssia\nB) Filipinas\nC) Istambul"
				+ "\nD) Groelandia\nE) Tanz�nia");
		map.put(11, "\nQual foi o recurso utilizado inicialmente pelo homem "
				+ "\npara explicar a origem das coisas ?\n\nA) Filosofia\nB) Biologia\nC) Matem�tica"
				+ "\nD) AStronomia\nE) Mitologia");
		map.put(12, "\nQual � o maior animal terrestre ?\n\nA) Baleia Azul\nB) Dinossauro\nC) elefante Africano"
				+ "\nD) tubar�o Branco\nE) Girafa");
		map.put(13, "\nQuais os nomes dos tr�s Reis Megos ?\n\nA) Gaspar, Nicolau e Natanael\nB) Belchior, Gaspar e Baltazar\nC) Belchior, Gaspar e Nataniel"
				+ "\nD) Gabriel, Nenjamim e Melchior\nE) Melchior, No� e Galileu");
		map.put(14, "\nQual o nome do cientista que descobriu o processo "
				+ "\nde pasteuriza��o e a vacina contra a raiva ?\n\nA) Marie Curie\nB) Blaise Pascal\nC) Louis Pasteurs"
				+ "\nD) Antonie Lavoisier\nE) Charles Darwin");
		map.put(15, "\nComo morreu Saddam Hussein ?\n\nA) C�ncer\nB) Suic�dio\nC) Ataque Cardiaco"
				+ "\nD) Enforcado\nE) Com chocolate 70% cacau");
		map.put(16, "\nEm que ano e onde aconteceu o maior acidente a�reo do Brasil?\n\nA) 2007, em S�o Paulo\nB) 1982, no Cear�\nC) 1996, em S�o Paulo"
				+ "\nD) 1952, na Amaz�nia\nE) 2006, no Mato Grosso");
		map.put(17, "\nQuais os quatro pa�ses que tem a maior popula��o "
				+ "\ncarcer�ria do mundo ?\n\nA) Brasil, Estados Unidos, M�xico e India\nB) China, Estados Unidos, India e Indon�sia"
				+ "\nC) R�ssia, Jap�o, Canad� e China"
				+ "\nD) Estados Unidos, China, R�ssia e Brasil\nE) Brasil, Estados Unidos, China e Vaticano");
		map.put(18, "\nO Etanaol � produzido atrav�s de qual fonte de energia ?\n\nA) Solar\nB) Biomassa\nC) E�lica"
				+ "\nD) Geot�rmica\nE) Hidroel�trica");
		map.put(19, "\nQual destas, apesar do seu nome, n�o � considerada "
				+ "\num tipo de for�a ?\n\nA) For�a de atrito\nB) For�a peso\nC) For�a centr�peta"
				+ "\nD) For�a eletromotriz\nE) For�a normal");
		map.put(20, "\nQual desses n�o � um instrumento meteorol�gico ?\n\nA) Bar�grafo\nB) Term�metro\nC) Pluvi�metro"
				+ "\nD) Anem�metro\nE) Etil�metro");
		map.put(21, "\nQual dessas aves n�o voa ?\n\nA) Pinguim\nB) Galinha\nC) Cegonha"
				+ "\nD) Pato\nE) Peru");
		map.put(22, "\nQual � respectivamente o animal mais lento e mais veloz\n\nA) Bicho pregui�a e Guepardo\nB) Tartaruga e Le�o\nC) Coala e Cavalo"
				+ "\nD) Caracol e Tubar�o\nE) Bicho pregui�a e Lib�lula");
		map.put(23, "\nO que � Ortorexia ?\n\nA) Obsess�o pelo consumo de alimentos saud�veis\nB) Transtorno alimentar caracterizado pela perda de apetite\nC) Obsess�o em falar de forma correta"
				+ "\nD) Preocupa��o exagerada em ter um corpo elegante\nE) Dist�rbio alimentar que provoca a ingest�o excessiva"
				+ "\nde alimentos");
		map.put(24, "\nNesses pares, ambos s�o mam�feros: ?\n\nA) Baleia Azul e Golfinhos\nB) Morcegos e Galinhas\nC) Girafas e Tartarugas"
				+ "\nD) Porcos e Pinguins\nE) Macacos e Sapos");
		map.put(25, "\nQuanto tempo garrafas e pl�stico e jornal, respectivamente,"
				+ "\ndemoram para se decompor ?\n\nA) 1000 anos e 1 ano\nB) 450 anos e 6 semanas\nC) 100 anos e 10 semanas"
				+ "\nD) 1 milh�o de anos e 1 semana\nE) 500 anos e 5 meses");
		map.put(26, "\nQuantos animais estavam na arca de moises ?\n\nA) 4 de cada esp�cie\nB) 1 de cada esp�cie\nC) 2 de cada esp�cie"
				+ "\nD) 6 de cada esp�cie\nE) Nenhum");
		map.put(27, "\nQuanto mede uma girafa ?\n\nA) entre 4,8 e 5,5 metros\nB) 2 metros\nC) entre 5 e 6 metros"
				+ "\nD) 2,5 metros\nE) 4 metros");
		map.put(28, "\nQuais das alternativas cont�m apenas nomes de rios ?\n\nA) S�o Francisco, Douro, Ant�rtico\nB) Nilo, Amazonas, Mississipi\nC) C�spio, Vermelho, Reno"
				+ "\nD) Tocantins, Bering, Ganges\nE) Dan�bio, Jord�o, Morto");
		map.put(29, "\nAs pessoas de qual tipo sangu�neo s�o consideradas doadores "
				+ "\nuniversais ?\n\nA+) A-\nB) B\nC) O-"
				+ "\nD) AB\nE) O+");
		map.put(30, "\nQuantos planetas terra cabem dentro do Sol ?\n\nA) Um Milh�o\nB) Cem\nC) Seiscentos"
				+ "\nD) Cento e Cinquenta\nE) Dois Milh�es");
		
		System.out.println(map.get(sorteio1));
	}
}
