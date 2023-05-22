package entities1;

public class retangulo {
    public Double alturaa;
    public Double larguraa;

    //agora tenho que arma uma logóca para resolver a area o perimetro e 
    // a diagonal do retangulo
    public double areaa(){
        return larguraa*alturaa;
    }
    public double diagonal(){
        return Math.sqrt((larguraa*larguraa) + (alturaa*alturaa));       
    }
    public double perimetro(){
        return (alturaa+alturaa) + (larguraa + larguraa);
        // poderia ser feito altura *2 e largura *2, porem preferi seguir a formula
    }

    



    
    
}
