package Repeticao;

import java.util.Scanner;

public class Exer_021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com um numero: ");
		int num = sc.nextInt();

		boolean primo = true;

		// começa por 2 por que 1 todos já são divisiveis

		for (int i = 2; i < num; i++) {
			// o ( i ) só vai na visisão até o ( num ) pq maior que o ( num ), o numero a
			// dividir vai ser maior,
			// e maior é certeza de não ser divisivel
			if (num % i == 0) {

				System.out.println("Não é primo");
				primo = false;
				break; // usado pra sair do loop
			}
		}

		// se dividir por todos menor que o ( num ) e não tiver nenhum divisivel
		// então quer dizer que o numero só é divisil por 1 e po ele mesmo
		// fazendo então ele ser primo

		if(primo == true) {
			
			System.out.println("É um numero primo");
		}

		sc.close();

	}

}
