package enums;

/**
 *
 * @author joaoc
 */
public enum Material {
    CARBONO, ALUMÍNIO;
    
    public static String MaterialToString(Material material) {
        switch(material) {
            case CARBONO:
                return "Material - Carbono";
            case ALUMÍNIO:
                return "Material - Alumínio";
            default:
                return "Material - Alumínio";
        }
    }
}
