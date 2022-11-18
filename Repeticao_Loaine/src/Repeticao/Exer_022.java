package Repeticao;

import java.util.Scanner;

public class Exer_022 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		
		System.out.println("Entre como um numero: ");
		int num = sc.nextInt();
		
		for ( int i = 2; i < num ; i++ ) {
			
			if(num % i == 0 ) {
				
				System.out.println("Divisivel por - " + i );
			}
		}
		
		
		
		
		
		sc.close();

	}

}
