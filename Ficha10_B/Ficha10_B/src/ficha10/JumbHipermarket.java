
package ficha10;

import java.util.Calendar;

/**
 *
 * @author joaoc
 */
public class JumbHipermarket extends HiperMarket{

    public JumbHipermarket(double coffePrice, double potatoesPrice, double gasPrice, double annualRate, String name, int vatNumber) {
        super(coffePrice, potatoesPrice, gasPrice, annualRate, name, vatNumber);
    }

    @Override
    public int getPoints(double purchaseValue) {
        Calendar c = Calendar.getInstance();
        
        double pontosSemana = (3 * purchaseValue) / 10;
        double pontosFimSemana = (1 * purchaseValue) / 10;
        
        System.out.print("Pontos Atribuídos: ");
        
        switch (c.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY:
                return (int) pontosSemana;
            case Calendar.TUESDAY:
                return (int) pontosSemana;
            case Calendar.WEDNESDAY:
                return (int) pontosSemana;
            case Calendar.THURSDAY:
                return (int) pontosSemana;
            case Calendar.FRIDAY:
                return (int) pontosSemana;
            default:
                return (int) pontosFimSemana;
        }
    }
    
    
}
