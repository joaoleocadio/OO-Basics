package ficha7exerc2;

/**
 *
 * @author joaoc
 */
public class Pessoa {
    
    private String nome;
    private String dataNasc;
    private String morada;
    private int CC;
    private int NIF;

    public Pessoa(String nome, String dataNasc, String morada, int CC, int NIF) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.morada = morada;
        this.CC = CC;
        this.NIF = NIF;
    }

    
    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getMorada() {
        return morada;
    }

    public int getCC() {
        return CC;
    }

    public int getNIF() {
        return NIF;
    }

    @Override
    public String toString() {
        String text = "";
        text += "Nome: " + this.nome + "\n" + "Data de Nascimento: " + this.dataNasc + "\n"
                + "Morada: " + this.morada + "\n" +"Nº CC: " + this.CC + "\n" + "NIF: " + this.NIF + "\n";
        
        return text;
    }
    
}
