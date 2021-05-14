package ficha10;

import java.util.Calendar;

/**
 *
 * @author joaoc
 */
public class ContinentHipermarket extends HiperMarket{

    public ContinentHipermarket(double coffePrice, double potatoesPrice, double gasPrice, double annualRate, String name, int vatNumber) {
        super(coffePrice, potatoesPrice, gasPrice, annualRate, name, vatNumber);
    }

    @Override
    public int getPoints(double purchaseValue) {
        Calendar c = Calendar.getInstance();
        
        double menor20 = (int)(purchaseValue / 5);
        double maior21 = (int)3*(purchaseValue / 20);

        System.out.print("Pontos Atribuídos: ");
        
        if (c.get(Calendar.DAY_OF_MONTH) < 21) {
            return (int) menor20;
        } else if (c.get(Calendar.DAY_OF_MONTH) > 20) {
            return (int) maior21;
        }
        return 0;
    }
    
}
