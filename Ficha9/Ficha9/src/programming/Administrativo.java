package programming;

import enums.Habilitacoes;
import enums.TipoContrato;
import java.time.LocalDate;
import java.util.Date;
import programming.Pessoa;

/**
 *
 * @author joaoc
 */
public class Administrativo extends Pessoa{
    private static int nextID = 0; 
    
    private int id;
    private String sigla;
    private TipoContrato contrato;
    private Habilitacoes hablitacoes;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    
    public Administrativo(String sigla, Habilitacoes hablitacoes, LocalDate dataInicio, String nome, LocalDate dataNascimento, String morada, int CC, int NIF, float salarioBase) {
        super(nome, dataNascimento, morada, CC, NIF, salarioBase);
        this.sigla = sigla;
        this.contrato = contrato.INTEGRAL;
        this.hablitacoes = hablitacoes;
        this.dataInicio = dataInicio;
        this.dataFim = null;
    }

    public Administrativo(String sigla, TipoContrato contrato, Habilitacoes hablitacoes, LocalDate dataInicio, LocalDate dataFim, String nome, LocalDate dataNascimento, String morada, int CC, int NIF, float salarioBase) {
        super(nome, dataNascimento, morada, CC, NIF, salarioBase);
        this.sigla = sigla;
        this.contrato = contrato;
        this.hablitacoes = hablitacoes;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
    
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public TipoContrato getContrato() {
        return contrato;
    }

    public void setContrato(TipoContrato contrato) {
        this.contrato = contrato;
    }

    public Habilitacoes getHablitacoes() {
        return hablitacoes;
    }

    public void setHablitacoes(Habilitacoes hablitacoes) {
        this.hablitacoes = hablitacoes;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
    
    @Override
    public float salario() {
        float salario = 0.0f;
        
        if (this.getHablitacoes().equals(Habilitacoes.LICENCIATURA)) {
            salario += super.getSalarioBase() + (super.getSalarioBase() * 0.10);
        } else if (this.getHablitacoes().equals(Habilitacoes.MESTRADO)) {
            salario += super.getSalarioBase() + (super.getSalarioBase() * 0.20);
        } else if (this.getHablitacoes().equals(Habilitacoes.DOUTORAMENTO)) {
            salario += super.getSalarioBase() + (super.getSalarioBase() * 0.30);
        }
        
        return salario;
    }
     
    @Override
    public String toString() {
        String text = "";
        text += super.toString() + "Salário: " + this.salario() + " €" + "\n";
        text += "Sigla: " + this.sigla + "\n" + "Contrato: " + this.contrato + "\n" + "Habilitações: " + this.hablitacoes + "\n";
        text += "Data Início Contrato: " + this.dataInicio + "\n" + "Data Fim Contrato: " + this.dataFim + "\n";
        
        return text;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        boolean equal = false;
        Administrativo tmp = (Administrativo) obj;
        
        if (this.id != tmp.id) {
            return false;
        }
        return true;
    }
}
