package enums;

/**
 *
 * @author joaoc
 */
public enum TruckType {
    TRUCK, TIR;

    public static String truckTypeToString(TruckType tp){
        switch (tp){
            case TIR:
                return "Camiao TIR";
            case TRUCK:
                return "Truck";
            default:
                return "Tipologia invalida";
        }
    }
}
