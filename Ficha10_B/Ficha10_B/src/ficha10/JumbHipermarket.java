
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
        
        double pontosFimSemana = (int)(purchaseValue / 10);
        
        System.out.print("Pontos Atribuídos: ");
        
        switch (c.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY:
                return (int) pontosFimSemana * 3;
            case Calendar.TUESDAY:
                return (int) pontosFimSemana * 3;
            case Calendar.WEDNESDAY:
                return (int) pontosFimSemana * 3;
            case Calendar.THURSDAY:
                return (int) pontosFimSemana * 3;
            case Calendar.FRIDAY:
                return (int) pontosFimSemana * 3;
            default:
                return (int) (pontosFimSemana);
        }
    }
    
    
}
