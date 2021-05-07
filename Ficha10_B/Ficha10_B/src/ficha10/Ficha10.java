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
        
        JumbHipermarket jumbo = new JumbHipermarket(0.55, 0.29, 1.10, 0.10, "Jumbo", 0213);
        System.out.println(jumbo.getPoints(20));
        
        ContinentHipermarket continente = new ContinentHipermarket(0.62, 0.28, 1.09, 0.05, "Continente", 2340);
        System.out.println(continente.getPoints(25.32));
        
        HiperMarket hm1 = new HiperMarket(0.35, 0.32, 1.10, 0.12, "ertsed", 2340);
        hm1.verificarPontos(100, jumbo, continente);
        
        GasStation[] bombas = {g1, lg1};
        
        hm1.verificarGasolina(bombas);
        
        HiperMarket[] hiper = {continente, jumbo};
        
        System.out.println(hm1.verificarCompras(hiper, 1.5, 7.5, 3));
    }
    
}
