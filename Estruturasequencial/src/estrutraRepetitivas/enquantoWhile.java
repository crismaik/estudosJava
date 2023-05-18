package estrutraRepetitivas;

import java.util.Scanner;



public class enquantoWhile {
    public static void main(String[] args) {
      //* Quando usar : quando não se sabe previamente
      // a quantidade de repetições que sera realizada*/
      Scanner sc = new Scanner(System.in);

      int x = sc.nextInt();

      while (x != 8){ // se for verdadeiro repete a estrutura
        x = sc.nextInt();// se for falso ele termina ela!
        System.out.println("numero errado! ");
      }
      System.out.println("Numero correto!");// só executou depois de sair do while!
      
        sc.close();
    }
    
}
