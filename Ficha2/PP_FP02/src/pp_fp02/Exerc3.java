package pp_fp02;

/**
 *
 * @author joaoc
 */
public class Exerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        int mult = 1;
        int contNeg = 0;
        int maior = lista[0];
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > 0) {
                mult *= lista[i];
                maior = lista[i];
            } else {
                contNeg++;
            }
        }

        System.out.println("Multiplicação: " + mult);
        System.out.println("Negativos: " + contNeg);
        System.out.println("Maior Número: " + maior);
    }
    
}
