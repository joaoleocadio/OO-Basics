
package pp_fp02;

/**
 *
 * @author joaoc
 */
public class Exerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = {{11, 7, 333}, {-20, -23, 63}, {-22, 501, 10000}};
        int soma = 0;
        int num = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                soma += matriz[i][j];
                num++;
            }
        }
        float media = (float) (soma / num); 
        
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f", media);
    }
    
}
