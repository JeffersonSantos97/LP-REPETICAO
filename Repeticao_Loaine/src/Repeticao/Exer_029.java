package Repeticao;

public class Exer_029 {

	public static void main(String[] args) {

		// obs: Todos os produtos valem 1,99

		double preco;
		System.out.println("Lojas Quase Dois - Tabela de preços");
		for (int i = 1; i <= 50; i++) {

			preco = 1.99 * i;

			System.out.printf("%d - %.2f%n", i, preco);
		}

	}

}
