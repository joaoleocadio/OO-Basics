package Trailler;

import enums.Tipologia;

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

    @Override
    public String toString() {
        String text = "";
        
        text += super.toString();
        text += "Tipo de Trailler: " + this.tipologia + "\n";
        
        return text;
    }  
}
