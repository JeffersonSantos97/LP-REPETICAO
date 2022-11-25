package Repeticao;

public class Exer_030 {

	public static void main(String[] args) {
		
		double preco;
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		
		for ( int i = 1 ; i <= 50; i++) { 
			
			preco = 0.18 * i;
			
			System.out.printf("%d - %.2f%n", i , preco);
		}

	}

}
