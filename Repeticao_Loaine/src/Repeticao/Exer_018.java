package Repeticao;

import java.util.Scanner;

public class Exer_018 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		int soma = 0;
		
		System.out.println("Quantos numeros ? ");
		int numero = sc.nextInt();
		
		for ( int i = 0; i < numero; i++ ) {
			
			System.out.println("Entre com um numero: ");
			int n = sc.nextInt();
			
			if(n > maior ) {
				maior = n;
			}
			
			if(n < menor ) {
				menor = n;
			}
			
			soma += n;
		}
		
		System.out.println("Maior:" + maior );
		System.out.println("Menor: " + menor);
		System.out.println("Soma: " + soma);
		
		
		
		sc.close();

	}

}
