package exerc8;

/**
 *
 * @author joaoc
 */
public class Exerc8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valor = Double.parseDouble(args[0]);
        int moeda2 = 0;
        int moeda1 = 0;
        int moeda50 = 0;
        int moeda20 = 0;
        
        while (valor != 0) {            
            if (valor >= 2) {
                valor = valor - 2;
                moeda2++;
            } 
            else if (valor >= 1) {
                valor -= 1;
                moeda1++;
            }
            else if (valor >= 0.50) {
                valor -= 0.50;
                moeda50++;
            }
            else if (valor >= 0.20) {
                valor -= 0.20;
                moeda20++;
            }
        }
        
        System.out.println("Moedas de 2 euros: " + moeda2);
        System.out.println("Moedas de 1 euro: " + moeda1);
        System.out.println("Moedas de 50 cêntimos: " + moeda50);
        System.out.println("Moedas de 20 cêntimos: " + moeda20);     
    }
    
}
