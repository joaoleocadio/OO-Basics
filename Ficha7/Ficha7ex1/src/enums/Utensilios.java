package enums;

/**
 *
 * @author joaoc
 */
public enum Utensilios {   
    GARRAFA_AGUA, KIT_PNEU, CONTA_KM, ALFORJE, SUPORTE_TLM;     
    
    public static String UtensiliosToString(Utensilios utensilios) {
              
        switch(utensilios) {
            case GARRAFA_AGUA:
                return "Garrafa de Agua";
            case KIT_PNEU:
                return "Kit de reparação dos pneus";
            case CONTA_KM:
                return "Conta Kilometros";
            case ALFORJE:
                return "Alforje";
            case SUPORTE_TLM:
                return "Suporte para telemóvel";
            default:
                return "Sem Tools";
        }
    }
}
