package Repeticao;

import java.util.Scanner;

public class Exer_027 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// quantidade de turmas

		// quantidade de alunos para cada turma ( nao pode ser maior que 40 )

		// media de alunos por turma

		int qtdTurma = 0; // quantidade de turmas 
		
		int total = 0; // total de aluno de todas as turmas 

		System.out.println("Entre com a quantidade de turmas: ");
		int turma = sc.nextInt(); // onde vai ficar o numero de alunos na turma 

		boolean invalido = true;
		
		for (int i = 0; i < turma; i++) {
			// do while pra repeti equanto o numero de alunos na turma for maior que 40 
			do {
				System.out.println("Quantidade de alunos sala " + (i + 1));
				qtdTurma = sc.nextInt();

				if (qtdTurma > 40) {

					System.out.println("numero inválido. Entre novamente ");
					invalido = false;
				} else {

					invalido = true;
				}
			} while (!invalido);

			
			total += qtdTurma; // total + total + qtd turma 
		}

		double media = total / turma; // soma total de alunos na escola / quantidade de turmas 

		System.out.println("Media por turma: " + media);
		sc.close();
	}

}
