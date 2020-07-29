package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		List<Integer> nums = Arrays.asList
				(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		int decnum, aux, i=1, j, cont=0;
		int binnum[] = new int[100];
		
		
		for (int a = nums.get(1); a < 10; nums.get(1 + 1) ) {
		decnum = nums.indexOf(nums) + 1;
		aux = decnum;
		while(aux != 0)
		{
		    binnum[i++] = aux%2;
		    aux /=2;
		}

		System.out.print
		("O numero equivalente em binario de " + nums + " é :\n");
		for(j=i-1; j>0; j--)
		{
		    System.out.print(binnum[j]);
		}
		}
		/*
		 * 1. Número para string binária (6 => "110)
		 * 2. Inverter a string "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 */
		
	}

}
