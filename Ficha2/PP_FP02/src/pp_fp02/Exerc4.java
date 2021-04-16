package pp_fp02;

/**
 *
 * @author joaoc
 */
public class Exerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] nome = {'A','n','a',' ','S','a','n','t','o','s','\n'};
        int vogais = 0;
        int cont = 0;
        int cons = 0;
        
        for (int i = 4; i < nome.length - 1; i++) {
            System.out.print(nome[i]);
        }
        System.out.print(", ");
        
        for (int i = 0; i < nome.length - 7; i++) {
            System.out.print(nome[i]);
        }
        
        System.out.println(" ");
        for (int i = 0; i < nome.length; i++) {
            if (nome[i] == 'a' || nome[i] == 'o' || nome[i] == 'A') {
                vogais++;
            } else if (nome[i] == '\n' || nome[i] == ' '){
                cont++;
            } else {
                cons++;
            }
        }
        
        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + cons);
    }   
}
