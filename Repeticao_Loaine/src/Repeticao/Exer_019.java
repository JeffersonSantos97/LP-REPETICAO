package Repeticao;

import java.util.Scanner;

public class Exer_019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		int soma = 0;
		boolean continuar = true;
		
		System.out.print("Entre com um numero: ");
		int numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {
			int n;

			do {
				System.out.print("Entre com o numero: ");
				n = sc.nextInt();
				// Se o n for menor que 0 e maior que 1000 ( errado ) 
				if (n < 0 || n > 1000) {
					
					// resposta se o n for menor que 0  ( errado ) 
					if (n < 0) {

						System.out.println("Numero menor que 0");
					} 
					
					// resposta se o  n for maior que 100 ( errado ) 
					else {
						System.out.println("Numero maior que 1000");
					}
					continuar = false;
				} 
				
				// se for maior que 0 e menor que 1000 ( certo ) 
				else {

					continuar = true;
				}

			} while (continuar == false);
			
			// Se o n for o maior 
			if (n > maior) {
				maior = n;
			}
			
			// Se o n for o menor 
			if (n < menor) {
				menor = n;
			}
			
			// soma dos numero 
			soma += n;
		}
		
		System.out.println("Maior: " + maior );
		System.out.println("Menor: " + menor );
		System.out.println("Soma: " + soma);
		

		sc.close();

	}

}
