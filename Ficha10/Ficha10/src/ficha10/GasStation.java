package ficha10;

import interfaces.GasService;

/**
 *
 * @author joaoc
 */
public class GasStation extends Company implements GasService{
    /**
     * Gas Price
     */
    private double gasprice;

    /**
     * Construtor para o uma GasStation
     * @param gasprice
     * @param name
     * @param vatNumber 
     */
    public GasStation(double gasprice, String name, int vatNumber) {
        super(name, vatNumber);
        this.gasprice = gasprice;
    }    
    
    /**
     * Getter do Gas Price
     * @return 
     */
    @Override
    public double getGasPrice() {
        return this.gasprice;
    }

    /**
     * Setter para o gas Price
     * @param p 
     */
    @Override
    public void setGasPrice(double p) {
        if (p > 0) {
            this.gasprice = p;
        }
    }

    /**
     * Método que retorna o total a pagar em euros
     * @param litres
     * @return 
     */
    @Override
    public double getGasTotal(double litres) {
        double total;
        
        total = this.gasprice * litres;
        return total;
    }

    /**
     * Método toString()
     * @return 
     */
    @Override
    public String toString() {
        String text = "";
        
        text += super.toString() + "Gas Price: " + this.gasprice + " €" + "\n";
        return text;
    }  
}