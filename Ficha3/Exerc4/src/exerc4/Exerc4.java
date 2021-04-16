package exerc4;

/**
 *
 * @author joaoc
 */
public class Exerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(args[0]);
        
        double radianos = numero * (Math.PI / 180);     
        
        System.out.printf("%d graus são: %.2f radianos ", numero, radianos);
        
    }
    
}
