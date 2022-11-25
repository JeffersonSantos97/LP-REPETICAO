package Repeticao;

import java.util.Scanner;

public class Exer_025 {

	public static void main(String[] args) {
		
		// pedir a idade de n pessoas
		
		// fazer a media de idade
		
		// varia entre 0 e 25 == Jovem
		
		// vaira entre 26 60 == adulto
		
		// maior que 60 == idoso
		
		Scanner sc = new Scanner ( System.in );
		int qtdIdade;
		double media;
		int idade;
		int soma = 0;
		
		
		
		
		// pedir a idade de n pessoas 
		System.out.print("Vai entrar com quantas idades? ");
		qtdIdade = sc.nextInt();
		
		// fazer a media de idades
		for( int i = 0 ; i < qtdIdade ; i++ ) { 
			
			System.out.println("Entre com a idade " + (i + 1 ) ) ;
			idade = sc.nextInt();
			
			soma += idade;
		}
		
		media = soma / qtdIdade; 
		
		System.out.println("Media da turma = " + media);
		
		
		// verificar entre 0 e 25 == jovem
		
		if(media > 0 && media <= 25) {
			
			System.out.println("Jovem");
		} 
		// entre 25 e 60 == adulto
		else if ( media > 25 && media <= 60 ) { 
			
			System.out.println("Adulto");
		} 
		// Maior que 60 == idoso
		else if( media > 60 ) { 
			
			System.out.println("Idoso");
		} 
		
		sc.close();
	}

}
