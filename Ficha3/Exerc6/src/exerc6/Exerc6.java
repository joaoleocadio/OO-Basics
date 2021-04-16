package exerc6;

/**
 *
 * @author joaoc
 */
public class Exerc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valor = Double.parseDouble(args[0]);
        int euros = (int) (valor / 100);
        int cent = (int) valor % 100;
        
        System.out.printf("%d euros e %d centimos", euros, cent);
    }
    
}
