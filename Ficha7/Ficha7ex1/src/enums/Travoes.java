package enums;

/**
 *
 * @author joaoc
 */
public enum Travoes {
    PINÇAS, HIDRAULICOS;
    
    public static String TravoesToString(Travoes travoes) {
        switch (travoes) {
            case PINÇAS:
                return "Travões a Pinças!";
            case HIDRAULICOS:
                return "Travões Hidraulicos!";
            default:
                return "Travões Hidraulicos";
        }
    }
}
