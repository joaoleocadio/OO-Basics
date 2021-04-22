package Trailler;

/**
 *
 * @author joaoc
 */
public class SemiReboque extends Trailler{
    private int pneusSobress;

    public SemiReboque(int pneusSobress, int numEixos, int capacidade) {
        super(numEixos, capacidade);
        this.pneusSobress = pneusSobress;
    }

    @Override
    public String toString() {
        String text = "";
        
        text += super.toString();  
        text += "Nº de pneus sobressalentes: " + this.pneusSobress + "\n";
        
        return text;
    }  
}
