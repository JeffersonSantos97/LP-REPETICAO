package Repeticao;

import java.util.Scanner;

public class Exer_013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in );
		
		System.out.println("Entre com a base: ");
		int base = sc.nextInt();
		
		System.out.println("Entre com a potencia: ");
		int potencia = sc.nextInt();
		
		int resultado = base;
		
		for ( int i = 1; i < potencia; i++) {
			
			resultado *= base; 
		}
		
		System.out.println( "Resultado: " + resultado );
		
		
		sc.close();

	}

}
