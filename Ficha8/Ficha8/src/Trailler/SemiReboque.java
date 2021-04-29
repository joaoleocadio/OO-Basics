package Trailler;

/**
 *
 * @author joaoc
 */
public class SemiReboque extends Trailler{
    
    private int pneusSobress;

    /**
     * Contrutor para um SemiReboque
     * @param pneusSobress
     * @param numEixos
     * @param capacidade 
     */
    public SemiReboque(int pneusSobress, int numEixos, int capacidade) {
        super(numEixos, capacidade);
        this.pneusSobress = pneusSobress;
    }

    /**
     * Getter para os pneus Sobresselentes
     * @return 
     */
    public int getPneusSobress() {
        return pneusSobress;
    }
    
    /**
     * Método toString para impressão de um SemiReboque
     * @return 
     */
    @Override
    public String toString() {
        String text = "";
        
        text += super.toString();  
        text += "Nº de pneus sobressalentes: " + this.pneusSobress + "\n";
        
        return text;
    }
    
    /**
     * Método equals para o SemiReboque
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof SemiReboque)) {
            return false;
        }
        
        boolean equal = false;
        SemiReboque temp = (SemiReboque) obj;
        
        if (temp.getId() == this.getId()) {
            if (temp.getPneusSobress() == this.pneusSobress) {
                equal = true;
            }          
        }
        return true;
    }
}
