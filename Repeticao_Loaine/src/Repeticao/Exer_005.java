package Repeticao;

import java.util.Scanner;

public class Exer_005 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int popA, popB;

		int tempo = 0;

		double taxA, taxB;

		boolean cont = true;
		
		
		// repetir enquanto popA for maior que popB 
		// pra fazer isso, eu criei um boolean cont que se for falso repete, se for verdadeiro da continuação no codigo
		do {
			System.out.print("Entre com a quantidade de habitantes da populção A: ");
			popA = sc.nextInt();

			System.out.print("Entre com a taxa de crescimento da população A: ");
			taxA = sc.nextDouble();

			System.out.print("Entre com a quantidade de habitantes da população B: ");
			popB = sc.nextInt();
			// se minha popB for menor que a minha popA, eu já paro aquie mesmo, digo que está errado e repito a pergunta
			if (popB < popA) {
				System.out.println("A população B não pode ser menor que a população A");

				System.out.println(" "); // pular uma linha
				cont = false;
			} else {

				cont = true;
			}

		} while (cont == false);
		
		// coloquei aqui fora, pq só vou pedir a taxB se a popB for maior que a popA
		// caso contrario, repito sem nem pegar a taxB no meu ( Do while )
		System.out.print("Entre com a taxa de crescimento da população B: ");
		taxB = sc.nextDouble();
		
		// enquanto popA for menor que popB, vai continuar somando a porcentagem em cima das populações 
		while (popA < popB) {

			popA += (popA * taxA) / 100;
			popB += (popB * taxB) / 100;
			
			tempo++;
			
		}
		
		System.out.println("População A: " + popA);
		System.out.println("Ppulação B: " + popB);
		System.out.println("Tempo: " + tempo);
		sc.close();

	}

}
