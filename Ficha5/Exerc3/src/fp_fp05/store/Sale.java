package fp_fp05.store;

import exerc2.CD;

/**
 *
 * @author joaoc
 */
public class Sale {
    protected final int SALES_SIZE = 31;
    static int nextId = 1;
    
    public int id;
    public String data;
    public CD[] compra;
    public float total;
    public User comprador;

    public Sale(String data, CD[] compra, User cUser) {
        this.id = nextId++;
        this.data = data;
        this.compra = compra;
        this.comprador = cUser;
    }
  
    
}
