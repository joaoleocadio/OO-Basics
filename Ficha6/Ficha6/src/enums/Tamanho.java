package enums;

/**
 *
 * @author joaoc
 */
public enum Tamanho {
    SMALL, MEDIUM, BIG;
    
    public static String pizzaToString(Tamanho tamnho) {
        switch(tamnho) {
            case SMALL:
                return "The pizza is small.";
            case BIG:
                return "The pizza is big.";
            default:
                return "The pizza is medium.";
        }
    }
}
