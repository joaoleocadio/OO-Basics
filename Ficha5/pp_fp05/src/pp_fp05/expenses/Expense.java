package pp_fp05.expenses;

/**
 *
 * @author joaoc
 */
public class Expense {
    static int nextId = 1;
    
    protected int id;
    protected Type type;
    protected float amount;
    protected String date;

    public Expense(Type type, float amount, String date) {
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.id = nextId++;
    }

    @Override
    public String toString() {
        return "id=" + id + ", type=" + type.Type(type) + ", amount=" + amount + ", date=" + date + '}';
    }  
}
