import java.util.Locale;
import java.util.Scanner;

import entities1.product;

public class produt {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        product product = new product();//( product é o metodo ) e o product é o nome da variavel
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();// aqui leu o nome e guardou em products!
        System.out.print("price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantidades ");
        product.quantity = sc.nextInt();
        System.out.println(product);
        System.out.println();

        System.out.println("Quantos produtos quer adcionar ??");
        int quantity = sc.nextInt();
        product.addProducts(quantity);// aqui ele adiciona o valor da variavel acima 
        // e salva no objeto criado.
        // ele adcina as unidades junto com a variavel quantity.

        System.out.println();
        System.out.println("Update data:  "+product);
        System.out.println();
        System.out.println("Entre com quantos produtos vendidos: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Update data:  "+product);





        sc.close();
    }
    
}
