package interfaces;

/**
 *
 * @author joaoc
 */
public interface GasService {
    public double getGasPrice();
    public void setGasPrice(double p);
    public double getGasTotal(double litres);
}
