package outroTopJava;

public class Split {
    public static void main(String[] args) {
        
        /*gera um vetor com a string */
        String s = "potato apple lemon";
        
        String[] vect = s.split(" ");// oque tem no parenteses é a regra
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println((vect[0]));
        System.out.println((vect[1]));
        System.out.println((vect[2]));

       




    }
    
}
