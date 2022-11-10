package Repeticao;

import java.util.Scanner;

public class Exer_003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in );
		boolean cont;
		String nome,sexo, estCivil;
		int idade;
		double salario;
		
		
		
		// nome maior que 3 caractere
		
		do {
			
			System.out.print("Entre com um nome [ Maior que 3 caractere]: ");
			nome = sc.nextLine();
			
			if(nome.length() < 3 ) {
				
				cont = false;
			} else {
				
				cont = true;
			}
		} while (cont == false);
		
		// idade entre 0 e 150 
		
		do {
			System.out.println("Entre com a idade [ entre 0 e 150 ]:  ");
			idade = sc.nextInt();
			
			if(idade < 0 || idade > 150 ) {
				
				cont = false;
			} else {
				
				cont = true;
			}
			
		} while (cont == false);
		
		
		// salario 
		
		do {
			System.out.println("Entre com o salário [ Maior que 0 ]: ");
			salario = sc.nextDouble();
			
			if(salario < 0 ) {
				
				cont = false;
			} else {
				
				cont = true;
			}
			
		} while ( cont == false);
		
		
		// Sexo
		
		do {
			
			System.out.println("Entre com o sexo [ F ou M ]:  ");
			sexo = sc.next();
			
			if(sexo.equalsIgnoreCase("f") ||  sexo.equalsIgnoreCase("m")) {
					
				cont = true;
			} else {
				
				cont = false;
			}
			
		} while (cont == false);
		
		// Estado Civil 
		
		do {
			
			System.out.println("Entre com o estado civil [ 's', 'c', 'v', 'd']:  ");
			estCivil = sc.next();
			
			if(estCivil.equalsIgnoreCase("s") || estCivil.equalsIgnoreCase("c") || estCivil.equalsIgnoreCase("v") ||
					
					estCivil.equalsIgnoreCase("d") ) {
					
				cont = true;
			} else {
				
				cont = false;
			}
		} while (cont == false);
		
		sc.close();

	}

}
