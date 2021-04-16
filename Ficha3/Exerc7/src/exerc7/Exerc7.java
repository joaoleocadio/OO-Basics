package exerc7;

/**
 *
 * @author joaoc
 */
public class Exerc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]); //a=5 dividendo
        int b = Integer.parseInt(args[1]); //b=2 divisor
        int q = 0, r; //quociente e resto
        int aux; //valor da subtracao a ser armazenado

        aux = a;

        while (aux >= b) {
            aux = aux - b;
            q++;
        }

        r = aux;

        System.out.println(a + " / " + b + " = " + q);
        System.out.println("Resto: " + r);
        
    }
    
}
