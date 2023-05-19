package funções;

import java.util.Scanner;
/*
 * voce pode configurar a função a fazer a ação que deseja
 */

public class FuncoesSintaxe {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         System.out.println("Digite 3 numeros: ");
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();

         int higher = max(a, b ,c);

         showResult(higher);

         sc.close();
    }
    public static int max(int x, int y, int z){
        int aux;
        if (x > y && x > z){
            aux = x;
        }else if(y > z){
            aux = y;
        }
        else{
            aux = z;
        }
        return aux;
         // aqui criei uma função onde calcula o maior de 3 nuemeros!!.
    }
    public static void showResult(int value){
        // aqui dentro fica a função
        System.out.println("Higher: "+ value);

    }
}

