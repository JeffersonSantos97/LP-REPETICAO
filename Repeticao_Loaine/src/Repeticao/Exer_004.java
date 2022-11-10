package Repeticao;

public class Exer_004 {

	public static void main(String[] args) {
		
		int popA = 80000;
		double taxA = 3;
		int popB = 200000;
		double taxB = 1.5;
		int cont = 0;
		
		while(popA < popB ) {
			
			popA += (popA * taxA ) / 100;
			
			popB += (popB * taxB ) / 100;
			
			cont++;
			
		} 
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Tempo: " + cont);
		

	}

}
