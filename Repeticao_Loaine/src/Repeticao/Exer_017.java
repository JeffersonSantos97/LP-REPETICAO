package Repeticao;

import java.util.Scanner;

public class Exer_017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in );
		
		System.out.print("Entre com um numero inteiro: ");
		int num = sc.nextInt();
		
		int fatorial = num;
		
		for ( int i = 1; i < num; i++) {
			
			fatorial *= i;
		}
		
		System.out.println("Fatorial = " + fatorial );
		
		
		
		
		sc.close();

	}

}
