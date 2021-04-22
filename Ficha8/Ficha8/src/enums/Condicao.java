package enums;

/**
 *
 * @author joaoc
 */
public enum Condicao {
    NOVO, USADO;
    
    
    public static String condicaoToString(Condicao condicao) {
        switch(condicao) {
            case NOVO:
                return "O veículo é novo!";
            case USADO:
                return "O veículo é usado!";
            default:
                return "O veículo é novo!";
        }
    }
}
