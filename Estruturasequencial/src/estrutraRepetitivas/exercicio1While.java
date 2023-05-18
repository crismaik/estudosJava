package estrutraRepetitivas;

import java.util.Scanner;

public class exercicio1While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        int x = 5, y = 0 ;

        while(c > 2 ){
            System.out.println(x);
            y = y + x;
            x = y - 1;


        }
        sc.close();
    }
    
}
