package pp_fp03;

/**
 *
 * @author joaoc
 */
public class Exerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] matriz = {1,2,3,4,5,6,7,8,9, 10, 11};
        int num = 0;
        
        //System.out.println(matriz.length);
        
        for (int i = 0; i < matriz.length; i++) {
            num = matriz[i];
            int cont = 0;
            for (int j = 1; j <= matriz.length; j++) {
                if (num % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println("O numero: " + matriz[i] + " é primo!");
            } else {
                System.out.println("O numero: " + matriz[i] + " não é primo!");
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            int a = 0;
            for (int j = 1; j < matriz[i]; j++) {
                // soma dos divisores
                if (matriz[i] % j == 0) {
                    a += j;
                }
            }
            // se a soma dos divisore for igual ao proprio numero
            if (a == matriz[i]) {
                System.out.println(matriz[i] + " é número perfeito");
            }
        }       
    }
    
}
