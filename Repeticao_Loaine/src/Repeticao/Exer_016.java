package Repeticao;

import java.util.Scanner;

public class Exer_016 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		
		int primeiro = 0;
		int segundo = 1; 
		int proximo = 0;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		while ( proximo <= 500) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);

			
		}
		
		
		
		
		sc.close();
	}

}