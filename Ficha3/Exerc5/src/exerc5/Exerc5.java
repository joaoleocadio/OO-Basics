package exerc5;

/**
 *
 * @author joaoc
 */
public class Exerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String euro = "e", dolar = "d";
        
        double valor = Double.parseDouble(args[0]);
        double valor2;
        
        if (args[1].equals(euro)){
            valor2 = valor * 0.84;
            System.out.println("Valor em euros: "+valor2);
        } else if (args[1].equals(dolar)){
            valor2 = valor * 1.19;
            System.out.println("Valor em dólares: "+valor2);
        }
    }
    
}
