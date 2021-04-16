package pp_fp05;

import pp_fp05.expenses.Expense;
import pp_fp05.expenses.Type;

/**
 *
 * @author joaoc
 */
public class Pp_fp05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Expense despesa1 = new Expense(Type.Alimentar, 190.89f, "23/02/1998");
        Expense despesa2 = new Expense(Type.Automóvel, 19.29f, "16/03/1998");
        
        User user1 = new User("João", "joao@gmail.com", "20/08/1998");
        user1.expenses[0] = despesa1;
        user1.expenses[1] = despesa2;
        
        Expense ex1 = new Expense(Type.Automóvel, 100.23f, "20/03/2021");
        Expense ex2 = new Expense(Type.outro, 59.96f, "16/03/2021");
        
        User user2 = new User("Hugo", "hugo@gmail.com", "20/06/1998");
        user2.expenses[0] = ex1;
        user2.expenses[1] = ex2;
        
        System.out.println("-----User 1-----");
        System.out.println("ID: " + user1.id);
        System.out.println("Nome: " + user1.nome);
        System.out.println("Email: " + user1.email);
        System.out.println("Data de Nascimento: " + user1.birthDate);
        
        for (int i = 0; i < user1.expenses.length; i++) {
            if (user1.expenses[i] != null) {
                System.out.println("Despesa " + (i+1) + ": " + user1.expenses[i].toString());                   
            }            
        }
        
        System.out.println("-----User 2-----");
        System.out.println("ID: " + user2.id);
        System.out.println("Nome: " + user2.nome);
        System.out.println("Email: " + user2.email);
        System.out.println("Data de Nascimento: " + user2.birthDate);
        
        for (int i = 0; i < user2.expenses.length; i++) {
            if (user2.expenses[i] != null) {
                System.out.println("Despesa " + (i+1) + ": " + user2.expenses[i].toString());                   
            }            
        }
    }  
}
