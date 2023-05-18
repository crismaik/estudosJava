package estruturaFacaEnquanto;

import java.util.Scanner;

public class facca {
    public static void main(String[] args) {
        /* do {
            comando 1
            comando 2
        }while(condição)
         */

      /*Scanner sc = new Scanner(System.in);
      System.out.print("Digite a temperatu em Celsius: ");
        double C =sc.nextDouble();
        double F =  9.0 * C / 5.0 +32.0;

        System.out.printf("Equivalente em Fahrenheit: %.2f%n", F );

        System.out.print("Deseja repetir ? (s/n)");
        char resp = sc.next().charAt(0);
        while (resp != 'n'){
            System.out.print("Digite a temperatu em Celsius: ");
            C =sc.nextDouble();
            F =  9.0 * C / 5.0 +32.0;

            
    
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", F );
    
            System.out.print("Deseja repetir ? (s/n)");
            

        }essa é maneira não boa de fazer! kk
        */
        char resp;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.println("DEseja repetir ? (s/n)");
            resp = sc.next().charAt(0);

        } while(resp != 'n');


        sc.close();
    }
    
}
