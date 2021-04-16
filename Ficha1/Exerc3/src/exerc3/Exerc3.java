package exerc3;

/**
 *
 * @author joaoc
 */
public class Exerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean canITakeHisMoney;
        int hisBalance = 5;
        long myBalance = 4;
        hisBalance += 8;
        
        canITakeHisMoney = hisBalance > myBalance;
        canITakeHisMoney = canITakeHisMoney && (hisBalance >= 3);
        
        System.out.println(canITakeHisMoney);
    }
    
}
