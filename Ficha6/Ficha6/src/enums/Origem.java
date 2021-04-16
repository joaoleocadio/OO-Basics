package enums;

/**
 *
 * @author joaoc
 */
public enum Origem {
    ANIMAL, VEGETAL, MINERAL;
    
    public static String OrigemToString(Origem origem) {
        switch (origem) {
            case ANIMAL:
                return "Origem Animal";
            case VEGETAL:
                return "Origem Vegetal";
            case MINERAL:
                return "Origem Mineral";
            default:
                return "Origem Animal";
        }
    }
}
