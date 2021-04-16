package fp_fp05.store;

/**
 *
 * @author joaoc
 */
public class User {
    protected String nome;
    protected int idade;
    protected String email;

    public User(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    @Override
    public String toString() {
        String text = "Nome:" + nome + "\n" 
                        + "Idade: " + idade + "\n"
                        + "Email: " + email;
        return text;
    }
    
    
    
}
