package ficha10;

import interfaces.HipermarketService;

/**
 *
 * @author joaoc
 */
public class HiperMarket extends Company implements HipermarketService {
    /**
     * Preço do café
     */
    private double coffePrice;
    
    /**
     * Preço das Batatas
     */
    private double potatoesPrice;
    
    /**
     * Preço do gás
     */
    private double gasPrice;
    
    /**
     * Taxa anual
     */
    private double annualRate;

    /**
     * Construtor para um Hipermercado
     * @param coffePrice
     * @param potatoesPrice
     * @param gasPrice
     * @param annualRate
     * @param name
     * @param vatNumber 
     */
    public HiperMarket(double coffePrice, double potatoesPrice, double gasPrice, double annualRate, String name, int vatNumber) {
        super(name, vatNumber);
        this.coffePrice = coffePrice;
        this.potatoesPrice = potatoesPrice;
        this.gasPrice = gasPrice;
        this.annualRate = annualRate;
    }
    
    /**
     * Getter para o preço do café
     * @return 
     */
    @Override
    public double getCoffePrice() {
        return this.coffePrice;
    }

    /**
     * Setter para o preço do café
     * @param p 
     */
    @Override
    public void setCoffePrice(double p) {
        if (p > 0) {
            this.coffePrice = p;
        }
    }

    /**
     * Retorna o preço total a pagar dos cafés
     * @param coffes
     * @return 
     */
    @Override
    public double getCoffeTotal(int coffes) {
        return this.coffePrice * coffes;
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
     * Retorna o preço total a pagar das batatas
     * @param kilos
     * @return 
     */
    @Override
    public double getMarketTotal(double kilos) {
        return this.potatoesPrice * kilos;
    }

    /**
     * Getter para a taxa anual
     * @return 
     */
    @Override
    public double getAnnualRate() {
        return this.annualRate;
    }

    /**
     * Setter para a taxa anual
     * @param r 
     */
    @Override
    public void setAnnualRate(double r) {
        if (r > 0) {
            this.annualRate = r;
        }
    }

    /**
     * Retorna o valor da prestação mensal a suportar pelo cliente dado um montante e um prazo em meses
     * @param ammount
     * @param months
     * @return 
     */
    @Override
    public double computeMonthlyPayment(double ammount, int months) {
        double monthlyRate = Math.pow(1 + this.annualRate, (double)1 / (double)12) - 1;
        
        System.out.print("Prestação mensal: ");
        return ( (monthlyRate * ammount) / (1 - Math.pow(1 + monthlyRate, -months)));
    }

    /**
     * Getter para o preço do gás
     * @return 
     */
    @Override
    public double getGasPrice() {
        return this.gasPrice;
    }

    /**
     * Setter para o preço do gás
     * @param p 
     */
    @Override
    public void setGasPrice(double p) {
        if (p > 0) {
            this.gasPrice = p;
        }
    }

    /**
     * Retorna o preço total a pagar do gás
     * @param litres
     * @return 
     */
    @Override
    public double getGasTotal(double litres) {
        return this.gasPrice * litres;
    }

    /**
     * Método toString()
     * @return 
     */
    @Override
    public String toString() {
        String text = "";
        text += super.toString() + "Coffe Price: " + this.coffePrice + " €" + "\n" + "Potatoes Price: " + this.potatoesPrice + " €" + "\n";
        text += "Gas Price: " + this.gasPrice + " €" + "\n" + "Annual Rate: " + this.annualRate + "%" + "\n";
        return text;
    }  
}