package Repeticao;

import java.util.Scanner;

public class Exer_002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in );
		boolean cont;
		String usuario, senha;
		
		do {
		System.out.println("Entre com o usuario");
		usuario = sc.nextLine();
		
		System.out.println("Entre com a senha: ");
		senha = sc.nextLine();
		
		if(usuario.equalsIgnoreCase(senha)) {
				
			cont = false;
			
			System.out.println("Usuario e senha iguais !! ");
		} else {
			
			cont = true;
		}
		
	}while (cont == false);
		
	System.out.println("Programa ENCERRADO");	
		
		
		sc.close();

	}

}
