package pp_fp03;

/**
 *
 * @author joaoc
 */
public class Exerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] vetor = {
            {1,2,3},
            {2,4,8},
            {1,2,0},
            {2,9,0}
        };
        
        int[][] repetidos = new int[vetor.length][vetor[0].length];
 
        int maior = 0;
        int menor = 0;
        
        //Imprimir a matriz
        for (int i = 0; i < vetor.length; i++){
            System.out.println("");
            for (int j = 0; j < vetor[i].length; j++){
                System.out.print(vetor[i][j] + "\t");
            }
        }
        
        System.out.println("");
        System.out.println("");
        
        for (int i = 0; i < vetor.length; i++) {
            maior = vetor[i][0];
            menor = vetor[i][0];
            for (int j = 0; j < vetor[i].length; j++) {
                if (vetor[i][j] > maior) {
                    maior = vetor[i][j];
                } else if (vetor[i][j] < menor) {
                    menor = vetor[i][j];
                }
            }
            System.out.println("O número maior da linha " + (i + 1) + " é: " + maior);
            System.out.println("O número menor da linha " + (i + 1) + " é: " + menor);
            System.out.println(" ");
        }
        
    
    }
    
}
