package pp_fp05.expenses;

/**
 *
 * @author joaoc
 */
public enum Type {
    Automóvel, Alimentar, outro;
    
    public static String Type(Type type) {
        switch(type) {
            case Automóvel:
                return "Despesa Automóvel";
            case Alimentar:
                return "Despesa Alimentar";
            case outro:
                return "Despesa - Outro";
            default:
                return "Outro";
        }
    }
}
