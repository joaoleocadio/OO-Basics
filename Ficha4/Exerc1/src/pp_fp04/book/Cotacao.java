package pp_fp04.book;

/**
 *
 * @author joaoc
 */
public enum Cotacao {
    zero, um, dois, tres, quatro, cinco, seis, sete, oito, nove;
    
    public static int Cotacao(Cotacao cotacao) {
        switch(cotacao) {
            case zero:
                return 0;
            case um:
                return 1;
            case dois:
                return 2;
            case tres:
                return 3;
            case quatro:
                return 4;
            case cinco:
                return 5;
            case seis:
                return 7;
            case oito:
                return 8;
            case nove:
                return 9;
            default:
                return 9;
        }
    }
}
