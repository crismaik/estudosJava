public class exprCondTernaria {
    public static void main(String[] args) {
    // seria assim com if/
    // Double preco = 34.5;
    // Double desconto;

    // if(preco < 20.0 ){
    //     desconto = preco * 0.1;

    // }else{
    //     desconto = preco * 0.05;
    // }

    //*agora com exp Ternaria é assim  */
    Double preco =34.5;
    Double desconto = (preco > 20.0 )? preco * 0.1 : preco * 0.05;

    System.out.println("DEsconto!: "+desconto);


    }
}
