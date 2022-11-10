package Repeticao;

import java.util.Scanner;

public class Exer_015 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		
		System.out.println("Entre com o n-esimo numero: ");
		 int n = sc.nextInt();
		 
		 int primeiro = 1;
		 int segundo = 1; 
		 int proximo;
		 
		 // na seŕie de fibonacci nós já sabemos o primeiro e segundo numero
		 // o proximo numero é a soma do primeiro + segundo 
		 
		 
		 System.out.print(primeiro + ", ");
		 System.out.print(segundo + ", ");
		 
		 for ( int i = 3; i <= n ; i++) {
			 
			 proximo = primeiro + segundo;
			 
			 primeiro = segundo;
			 
			 segundo = proximo;
			 
			 System.out.print(proximo + ", ");
		 } 
		
			 
		
		
		sc.close();

	}

}
