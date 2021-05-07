package ficha10;

import interfaces.CoffeService;

/**
 *
 * @author joaoc
 */
public class LargeGasStation extends GasStation implements CoffeService {
    /**
     * Coffe Price
     */
    private double coffePrice;

    public LargeGasStation(double coffePrice, double gasprice, String name, int vatNumber) {
        super(gasprice, name, vatNumber);
        this.coffePrice = coffePrice;
    }

    /**
     * Getter para o coffe price
     * @return 
     */
    @Override
    public double getCoffePrice() {
        return this.coffePrice;
    }

    /**
     * Setter para o coffe price
     * @param p 
     */
    @Override
    public void setCoffePrice(double p) {
        if (p > 0) {
            this.coffePrice = p;
        }
    }

    /**
     * Retorna o preço total do numéro de cafés
     * @param coffes
     * @return 
     */
    @Override
    public double getCoffeTotal(int coffes) {
        return coffes * this.coffePrice;
    }

    /**
     * Método toString()
     * @return 
     */
    @Override
    public String toString() {
        String text = "";
        
        text += super.toString() + "Preço do Café: " + this.coffePrice + " €"+ "\n";
        return text;
    }
}
