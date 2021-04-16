
package pp_fp03;

/**
 *
 * @author joaoc
 */
public class PP_FP03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][]matriz = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] transposta = new int[matriz.length][matriz.length];
        
        System.out.println("*** Matriz Normal ***");
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        
        System.out.println(" ");
        System.out.println("*** Matriz Transposta ***");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + "\t");
            }
        }
    }
    
}
