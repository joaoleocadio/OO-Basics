package enums;

/**
 *
 * @author joaoc
 */
public enum Tipologia {
    BASCULANTE, ABERTO, FECHADO, FRIGORIFICO;

    public static String TrailerTypeToString(Tipologia trailerType){
        switch (trailerType){
            case BASCULANTE:
                return "Basculante";
            case ABERTO:
                return "Aberto";
            case FECHADO:
                return "Fechado";
            case FRIGORIFICO:
                return "Frigorifico";
            default:
                return "Trailer Type Inválido!";
        }
    }
}
