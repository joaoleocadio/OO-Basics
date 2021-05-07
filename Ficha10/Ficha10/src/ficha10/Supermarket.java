package ficha10;

import interfaces.MarketService;

/**
 *
 * @author joaoc
 */
public class Supermarket extends Company implements MarketService{
    /***
     * Potatoes Price
     */
    private double potatoesPrice;

    public Supermarket(double potatoesPrice, String name, int vatNumber) {
        super(name, vatNumber);
        this.potatoesPrice = potatoesPrice;
    }
       
    /**
     * Getter para o preço das batatas
     * @return 
     */
    @Override
    public double getPotatoesPrice() {
        return this.potatoesPrice;
    }

    /**
     * Setter para o preço das batatas
     * @param p 
     */
    @Override
    public void setPotatoesPrice(double p) {
        if (p > 0) {
            this.potatoesPrice = p;
        }
    }

    /**
     * Retorna o preço total a pagar por x kilos de batas 
     * @param kilos
     * @return 
     */
    @Override
    public double getMarketTotal(double kilos) {
        return kilos * this.potatoesPrice;
    }

    /**
     * Método toString()
     * @return 
     */
    @Override
    public String toString() {
        String text = "";
        
        text += super.toString() + "Preço das Batatas: " + this.potatoesPrice + " €" + "\n";
        return text;
    }
}
