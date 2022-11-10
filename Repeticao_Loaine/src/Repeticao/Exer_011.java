package Repeticao;

import java.util.Scanner;

public class Exer_011 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		
		int soma = 0;
		
		System.out.print("Entre com o primeiro numero: ");
		int n1 = sc.nextInt();
		
		System.out.print("Entre com o segundo numero: ");
		int n2 = sc.nextInt();
		
		for ( int i = n1; i <= n2; i++ ) {
			
			soma += i;
		}
		
		System.out.println("Soma: " + soma);
		
		
		
		sc.close();

	}

}
