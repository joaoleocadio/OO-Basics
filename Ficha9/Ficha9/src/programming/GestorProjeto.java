package programming;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author joaoc
 */
public class GestorProjeto extends Pessoa{
    private final int MAX = 5;
    
    private int codigo;
    private String[] projetos;
    private LocalDate dataContracao;
    
    private int contProj = 0;

    public GestorProjeto(int codigo, LocalDate dataContracao, String nome, LocalDate dataNascimento, String morada, int CC, int NIF, float salarioBase) {
        super(nome, dataNascimento, morada, CC, NIF, salarioBase);
        this.codigo = codigo;
        this.dataContracao = dataContracao;
        this.projetos = new String[MAX];
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataContracao() {
        return dataContracao;
    }

    public void setDataContracao(LocalDate dataContracao) {
        this.dataContracao = dataContracao;
    }

    public int getContProj() {
        return contProj;
    }

    public void setContProj(int contProj) {
        this.contProj = contProj;
    }
    
    public boolean addProjects(String project) {
        if (project == null) return false;
        
        if (contProj == MAX) return false;
        
        this.projetos[contProj++] = project;
        
        return true;
    }
    
    private int getYears(){
        Period p = Period.between(this.dataContracao,LocalDate.now());
        
        return p.getYears();
    }
    
    private String imprimirProjetos() {
        String text = "";
        
        for (int i = 0; i < this.contProj; i++) {
            text += "Projeto nº " + (i+1) + ": " + projetos[i] + "\n";
        }
        
        return text;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += super.toString() + "Salário: " + this.salario() + " €" + "\n";
        text += "Código: " + this.codigo + "\n" + "Data de Início: " + this.dataContracao + "\n" + "Nº de anos: " + this.getYears() + "\n";
        text += imprimirProjetos();
        
        return text;
    }  

    @Override
    public float salario() {
        float salario = super.getSalarioBase() * 1.15f;
        
        salario += (this.getYears() * 0.015) + (this.contProj * 0.01);
        
        return salario;
    }
}
