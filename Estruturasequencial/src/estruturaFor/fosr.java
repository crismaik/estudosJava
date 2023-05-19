package estruturaFor;

import java.util.Scanner;

public class fosr {
    /*é otima para  uma repetição baseada em contagem!
     i++ é uma contagem/
     i -- decremetan o valor! */
    /*ata/
     */
     
    public static void main(String[] args) {
   /*     //* é uma estrutura de controle//
    // que repete um bloco de comandos//
    // para um certo intervalo de valores!//
    //Quando usar: quando se sabe previamente a quantidade de//
    // repetições, ou intervalo de valores!! */
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int soma = 0;

    //int = inicio // i<N = condição a se executada // i++ incremento para
    //não repetir o anterior!
    // i<N da o valor em "chances (x) " se  for verdade entra na condição
    // i++ comsume as "chances"

    for(int i=0; i<N; i++ ){
        int x = sc.nextInt();
        soma = soma + x;

    }
    System.out.println(soma);
    sc.close();
    }
    

}
