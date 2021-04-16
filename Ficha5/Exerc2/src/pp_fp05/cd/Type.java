package pp_fp05.cd;

/**
 *
 * @author joaoc
 */
public enum Type {
    Vendedor, Gratuito;
    
    public static String Type(Type type) {
        switch(type) {
            case Vendedor:
                return "Autor do tipo Vendedor";
            case Gratuito:
                return "Autor do tipo Gratuito";
            default:
                return "Outro";
        }
    }
}
