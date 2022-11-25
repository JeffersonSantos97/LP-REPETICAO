package Repeticao;
import java.util.Scanner;
public class Exer_028 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		
		// quantidade de CDS
		
		// quanto custa cada cd 
		
		// valor total investido 
		
		// valor medio de cada um deles 
		
		double soma = 0.0;
		double valorCd;
		
		
		System.out.println("Entre com a quantidade de cds: ");
		int cds = sc.nextInt();
		
		for ( int i = 0 ; i < cds ; i++ ) { 
			
			System.out.println("Quanto custou o cd: " + ( i + 1 ));
			valorCd = sc.nextDouble();
			
			soma += valorCd;
		}
		
		double media = soma / cds;
		
		System.out.println("TOTAL: " + soma);
		System.out.println("Media: " + media);
		
		
		
		
		sc.close();
	}

}
