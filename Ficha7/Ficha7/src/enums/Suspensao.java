package enums;

/**
 *
 * @author joaoc
 */
public enum Suspensao {
    
    SIMPLES, DUPLA, SEM_SUSPENSAO;
   
    public static String SuspensaoToString(Suspensao suspensao) {
              
        switch(suspensao) {
            case SIMPLES:
                return "Suspensão Simples";
            case DUPLA:
                return "Suspensão Dupla";
            case SEM_SUSPENSAO:
                return "Sem Suspensão";
            default:
                return "Suspensão Simples";
        }
    }
}
