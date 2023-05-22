import java.util.Scanner;
import entities1.retangulo;

public class retanguloExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        retangulo retangulo = new retangulo();
        System.out.println("Entre com a largura e altura do retângulo: ");
        retangulo.larguraa = sc.nextDouble();
        retangulo.alturaa = sc.nextDouble();
        // até aqui esta feito a entradas de dados
        // saida de dados !!
        System.out.println("A area do retangulo é: " +retangulo.areaa() );
        System.out.println("o Perimetro do retangulo é: "+retangulo.perimetro());
        System.out.println("A diagonal do retangulo é: "+retangulo.diagonal());
        sc.close();

    }
    
}
