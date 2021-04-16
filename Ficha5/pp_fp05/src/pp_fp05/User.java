package pp_fp05;

import pp_fp05.expenses.Expense;

/**
 *
 * @author joaoc
 */
public class User {
    protected final int EXPENSES_SIZE = 31;
    static int nextId = 1;
    
    protected int id;
    protected String nome;
    protected String email;
    protected String birthDate;
    protected Expense[] expenses;

    public User(String nome, String email, String birthDate) {
        this.expenses = new Expense[EXPENSES_SIZE];
        this.id = nextId++;
        this.nome = nome;
        this.email = email;
        this.birthDate = birthDate;
    }
    
    
}
