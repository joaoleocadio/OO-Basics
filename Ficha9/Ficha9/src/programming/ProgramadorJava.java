package programming;

import enums.TipoProgramador;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author joaoc
 */
public class ProgramadorJava extends Pessoa{
    
    private int codigo;
    private int numAnosExp;
    private String NomeProjeto;
    private TipoProgramador tipo;

    public ProgramadorJava(int codigo, int numAnosExp, String NomeProjeto, TipoProgramador tipo, String nome, LocalDate dataNascimento, String morada, int CC, int NIF, float salarioBase) {
        super(nome, dataNascimento, morada, CC, NIF, salarioBase);
        this.codigo = codigo;
        this.numAnosExp = numAnosExp;
        this.NomeProjeto = NomeProjeto;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumAnosExp() {
        return numAnosExp;
    }

    public void setNumAnosExp(int numAnosExp) {
        this.numAnosExp = numAnosExp;
    }

    public String getNomeProjeto() {
        return NomeProjeto;
    }

    public void setNomeProjeto(String NomeProjeto) {
        this.NomeProjeto = NomeProjeto;
    }

    public TipoProgramador getTipo() {
        return tipo;
    }

    public void setTipo(TipoProgramador tipo) {
        this.tipo = tipo;
    }

    
    @Override
    public String toString() {
        String text = "";
        text += super.toString() + "Salário: " + this.salario() + " €" +"\n";
        text += "Código: " + this.codigo + "\n" + "Nº de anos exp: " + this.numAnosExp + "\n" + "Nome do projeto: " + this.NomeProjeto + "\n";
        text += "Tipo de Programador: " + this.tipo + "\n";
        
        return text;
    }

    @Override
    public float salario() {
        float salario = super.getSalarioBase() * 1.05f;
        
        if (this.tipo.equals(TipoProgramador.JÚNIOR)) {
            salario += (super.getSalarioBase() + 0.05) + ((this.numAnosExp * 0.5) * super.getSalarioBase());
        } else if (this.tipo.equals(TipoProgramador.SÉNIOR)) {
            salario += (super.getSalarioBase() + 0.15) + ((this.numAnosExp * 0.5) * super.getSalarioBase());
        }
        
        return salario;
    }
}
