package pp_fp05.cd;

/**
 *
 * @author joaoc
 */
public class Author {
    
    protected String nome;
    protected int idade;
    protected String morada;
    protected int NIF;
    protected int NIB;
    protected Type tipo;

    public Author(String nome, int idade, String morada, int NIF, int NIB) {
        this.nome = nome;
        this.idade = idade;
        this.morada = morada;
        this.NIF = NIF;
        this.NIB = NIB;
        this.tipo = tipo.Vendedor;
    }
   
    public Author(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = Type.Gratuito;
    }

    @Override
    public String toString() {
        return "Author{" + "nome=" + nome + ", idade=" + idade + ", morada=" + morada + ", NIF=" + NIF + ", NIB=" + NIB + ", tipo=" + tipo + '}';
    }  
}
