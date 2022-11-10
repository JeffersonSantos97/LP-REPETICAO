package Repeticao;

import java.util.Scanner;

public class Exer_010 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero: ");
		int n1 = sc.nextInt();
		System.out.println("Entre com o segundo numero: ");
		int n2 = sc.nextInt();

		for (int i = n1; i <= n2; i++) {
			
			System.out.println( i );
		}

		sc.close();

	}

}
