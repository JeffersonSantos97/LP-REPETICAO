package Repeticao;

import java.util.Scanner;

public class Exer_007 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		
		int maior = Integer.MIN_VALUE;
		int num; 
		
		for ( int i = 0; i < 5; i++ ) {
			
			System.out.printf("Entre com um numero " + (i + 1 ) + ": ");
			num = sc.nextInt();
			
			if(num > maior ) {
				
				maior = num;
			}
			
		}
		
		System.out.println("Maior = " + maior);
		
		
		
		
		
		sc.close();

	}

}
