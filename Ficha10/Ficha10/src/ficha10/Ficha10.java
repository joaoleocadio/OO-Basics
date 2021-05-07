package ficha10;

/**
 *
 * @author joaoc
 */
public class Ficha10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GasStation g1 = new GasStation(1.42, "Coffe", 3606);
        g1.setGasPrice(1.50);
        System.out.println(g1.getGasTotal(10));
        System.out.println(g1.toString());
        
        LargeGasStation lg1 = new LargeGasStation(0.60, 1.60, "galp", 1230);
        System.out.println(lg1.getCoffeTotal(10));
        System.out.println(lg1.toString());
        
        Supermarket sp1 = new Supermarket(0.32, "jumbo", 134560);
        System.out.println(sp1.toString());
        System.out.println(sp1.getMarketTotal(100));
        
        HiperMarket hp1 = new HiperMarket(0.60, 0.32, 1.20, 0.15, "Continente", 5680);
        System.out.println(hp1.computeMonthlyPayment(1500, 10));
        System.out.println(hp1.toString());
    }
    
}
