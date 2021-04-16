package pp_fp02;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author joaoc
 */
public class Exerc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] listaB = {6, 99, -1, 12, 1, -2};
        int[] novo = new int[listaA.length + listaB.length];
        int[] listaC = IntStream.concat(Arrays.stream(listaA), Arrays.stream(listaB)).toArray();
        
        //Adicionar elementos da lista A ao novo vetor
        for (int i = 0; i < listaA.length; i++) {
            novo[i] = listaA[i];
        }
        
        //Adicionar elementos da lista B ao novo vetor
        int cont = 0;
        for (int i = (novo.length - listaB.length); i < novo.length; i++) {
            novo[i] = listaB[cont];
            cont++;
        }
        
        //Imprimir o novo Array
        System.out.println("União do Array: ");
        for (int i = 0; i < novo.length; i++) {
            System.out.print(novo[i] + " ");
        }
        
        //Verificação dos repetidos
        int contRep = 0;
        int pos = 0;
        for (int i = 0; i < novo.length; i++) {
            for (int j = i + 1; j < novo.length; j++) {
                if (novo[i] == novo[j] && i != j) {
                    contRep++;
                }
            }
        }
        System.out.println("");
        System.out.println("Números Repetidos: " + contRep); 
         
        

        int tamanho = listaC.length;
        
        Arrays.sort(listaC);
        for (int i = 0; i <= listaC.length; i++) {
            for (int j = i + 1; j < listaC.length; j++) {
                if (listaC[i] == listaC[j]) {
                    listaC[j] = listaC[tamanho - 1];
                    --tamanho;
                }
            }
        }
        System.out.println(Arrays.toString(listaC));
        
        //System.out.println("Não repetidos: " + contador);         
    } 
}