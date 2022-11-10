package Repeticao;

import java.util.Scanner;

public class Exer_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num;

		do {
			System.out.println("Entre com um valor entre 0 e 10: ");
			num = sc.nextInt();
		} while (num < 0 || num > 10);

		System.out.println("PROGRAMA FINALIZADO");

		sc.close();

	}

}
