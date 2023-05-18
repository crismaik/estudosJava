import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int ano, idade, duahj, mesniver, totaldias; //meshj;
        Double dias, diasquefalta ;
        String nome;
        System.out.println("Qual é o seu nome ?");
        nome = sc.nextLine();

        ano = 365;
        System.out.println("Quantos anos voce tem ? ");
        idade = sc.nextInt();
        System.out.println("Que dia é hoje ?");
        dias = sc.nextDouble();
        System.out.println("Que dia voce faz aniversario ?");
        duahj = sc.nextInt();
        System.out.println("Qual mes voce faz aniverasrio ?");
        mesniver = sc.nextInt();
        System.out.println("Qual mes é hoje ?");
        //meshj = sc.nextInt();

        totaldias = idade * ano + 16 + (4 * 30);

        //diasatehj = meshj -( 16 - 4 * 30 ) ;
        diasquefalta = (mesniver*30 - (dias + duahj));
        System.out.println("Então, "+nome+" e viveu "+totaldias+" e faltam "+diasquefalta+" para o seu aniversario!");




        sc.close();

        
        
    }
}
