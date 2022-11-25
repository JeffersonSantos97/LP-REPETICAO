package Repeticao;

import java.util.Scanner;

public class Exer_024 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		
		double soma = 0 ;
		System.out.println("Quantas notas ? : ");
		double notas = sc.nextInt();
		double nota;
		for(int i = 0 ; i < notas ; i++ ) { 
			System.out.println("Entre com a nota " + (i + 1) );
			nota = sc.nextDouble();
			soma += nota;
		}  
		
		double media = soma / notas;
		
		
		System.out.println("Soma: " + soma);
		System.out.println("Media = "  + media);
		
		
		
		
		
		sc.close();
		

	}

}
