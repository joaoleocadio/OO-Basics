package ficha6;

import enums.Origem;

/**
 *
 * @author joaoc
 */
public class Ingrediente {
    private int codigo;
    private String nome;
    private Origem origem;
    private int calorias;

    public Ingrediente(int codigo, String nome, Origem origem, int calorias) {
        this.codigo = codigo;
        this.nome = nome;
        this.origem = origem;
        this.calorias = calorias;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Origem getOrigem() {
        return origem;
    }

    public int getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        String text = "Código : " + this.codigo + "\n"
                + "Nome : " + this.nome + "\n"
                + "Origem : " + this.origem + "\n"
                + "Calorias : " + this.calorias + "\n";
        return text;
    }
    
}
