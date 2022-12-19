package Repeticao;

import java.util.Scanner;

public class Treino {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int numero;
        // 001

       do {
           System.out.println("Entre com um numero: ");
           numero = sc.nextInt();

           if(numero < 0 || numero > 10 ) {

               System.out.println("Entre com o numero novamente !! ");
           }

       } while(numero < 0 || numero > 10);




        sc.close();
    }
}
