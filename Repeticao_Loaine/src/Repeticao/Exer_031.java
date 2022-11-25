package Repeticao;

import java.util.Scanner;

public class Exer_031 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int soma = 0;

		double preco = 1;

		int i = 1;
		while (preco > 0) {
			preco = 0;
			System.out.print("Produto " + i + ": ");
			preco = sc.nextDouble();
			if (preco == 0) {

				break;
			}
			soma += preco;

			i++;
			

		}

		System.out.println("Total: " + soma);

		System.out.print("Entre com o dinheiro: ");
		double dinheiro = sc.nextDouble();

		double troco = dinheiro - soma;

		System.out.println("Troco: " + troco);

	}

}
