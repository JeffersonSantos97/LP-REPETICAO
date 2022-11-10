package Repeticao;

import java.util.Scanner;

public class Exer_014 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		int numero;
		int numPar = 0;
		int numImpar = 0;
		for ( int i = 0; i < 10; i++ ) {
			
			System.out.println("Entre com o numero: ");
			numero = sc.nextInt();
			
			if(numero % 2 == 0 ) {
				
				numPar++;
			} else {
				numImpar++;
			}
		}
		
		System.out.println("Numeros Pares = " + numPar);
		System.out.println("Numero Impares = " + numImpar);
		
		
		sc.close();

	}

}
