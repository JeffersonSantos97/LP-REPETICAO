package Repeticao;

import java.util.Scanner;

public class Exer_008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		
		int soma = 0;
		int num;
		
		for (int i = 0; i < 5; i++ ) {
			
			System.out.print("Entre com o " + (i + 1) + " numero: ");
			num = sc.nextInt();
			
			soma+= num;
			
		}
			
		double media = soma / 5;
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
		
		
		
		sc.close();

	}

}
