package interfaces;

/**
 *
 * @author joaoc
 */
public interface HipermarketService extends CoffeService, MarketService, CreditService, GasService {
    public abstract int getPoints(double purchaseValue);
}
