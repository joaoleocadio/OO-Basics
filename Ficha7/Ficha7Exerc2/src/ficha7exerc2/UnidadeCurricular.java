package ficha7exerc2;

/**
 *
 * @author joaoc
 */
public class UnidadeCurricular {
    private String nome;
    private String sigla;
    private String nomeCurso;
    private int anoLetivo;
    private int semestre;

    public UnidadeCurricular(String nome, String sigla, String nomeCurso, int anoLetivo, int semestre) {
        this.nome = nome;
        this.sigla = sigla;
        this.nomeCurso = nomeCurso;
        this.anoLetivo = anoLetivo;
        this.semestre = semestre;
    }

    
    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public int getSemestre() {
        return semestre;
    }

    @Override
    public String toString() {
        String text = "";
        text += "Nome: " + nome + "\n" + "Sigla: " + sigla + "\n" + "Curso: " + nomeCurso + "\n" +
                "Ano Letivo: " + this.anoLetivo + "º" +"\n" + "Semestre: " + this.semestre + "º" + "\n";
        
        return text;
    }
    
    
    
}
