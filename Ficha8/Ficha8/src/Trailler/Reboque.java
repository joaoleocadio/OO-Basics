package Trailler;

import enums.Tipologia;
import java.util.Objects;

/**
 *
 * @author joaoc
 */
public class Reboque extends Trailler{
    private Tipologia tipologia;

    public Reboque(Tipologia tipologia, int numEixos, int capacidade) {
        super(numEixos, capacidade);
        this.tipologia = tipologia;
    }

    /**
     * Getter para a tipologia do reboque
     * @return 
     */
    public Tipologia getTipologia() {
        return tipologia;
    }
    
    /**
     * Método toString() para a impressão de um reboque, utilizando também os atributos herdados
     * @return 
     */
    @Override
    public String toString() {
        String text = "";
        
        text += super.toString();
        text += "Tipo de Trailler: " + this.tipologia + "\n";
        
        return text;
    }

    /**
     * Método equals para a comparação do objeto reboque
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
        if (!(obj instanceof Reboque)) {
            return false;
        }
        
        boolean equal = false;
        Reboque temp = (Reboque) obj;
        
        if (temp.getId() == this.getId()) {
            if (temp.tipologia.equals(this.tipologia)) {
                equal = true;
            }
        }
        
        return true;
    }  
}
