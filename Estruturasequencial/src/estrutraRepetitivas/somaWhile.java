package estrutraRepetitivas;

import java.util.Scanner;

public class somaWhile {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();// ja começa com valor na variavel
        int soma = 0;// da varlor a variavel

        while(x != 8){
            soma =  soma + x;// vai somar x + a soma
            x = sc.nextInt();


        }
        System.out.println("Soma total deu:>  "+soma);

        sc.close();
    }

}
