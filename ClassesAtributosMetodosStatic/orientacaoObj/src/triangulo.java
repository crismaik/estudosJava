import java.util.Locale;
import java.util.Scanner;

import entities1.tirangle;

public class triangulo {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US); 

        tirangle x, y;
        x = new tirangle();
        y = new tirangle();

        System.out.println("Enter the mesuares of triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the mesuares of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.println(areaX);
        System.out.println(areaY);

        //double p = (x.a + x.b + x.c) / 2;
        //double areaX = Math.sqrt(p * (p-x.a)*(p-x.b)*(p-x.c));

       // p = (y.a + y.b +y.c);
        //double areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));

       // System.out.printf("Triangle X area: %.4f%n" areaX);
       // System.out.printf("Triangle Y area: %.4f%n" areaY);
        sc.close();

    }

}
