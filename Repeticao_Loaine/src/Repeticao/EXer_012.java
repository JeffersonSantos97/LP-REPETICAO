package Repeticao;

import java.util.Scanner;

public class EXer_012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in );
		boolean verificar = true;
		int numero;
		do {
			System.out.print("Entre com um numero inteiro entre [ 1 e 10 ] para saber a tabuada: ");
			numero = sc.nextInt();
			
			if(numero < 1 || numero > 10 ) {
				System.out.println();// pular uma linha 
				
				System.out.println("Entre com um numero entre [ 1 e 10 ] ");
				
				System.out.println(); // pular um linha 
				verificar = false;
			} else {
				
				verificar = true;
			}
			
		} while(verificar == false);
		
		for ( int i = 0; i <= 10; i++ ) {
			
			int multiplicar = numero * i;
			System.out.printf("%n%d x %d = %d%n ", numero, i, multiplicar);
		}
		
		
		sc.close();

	}

}
