package ficha7exerc2;

import enums.Contrato;

/**
 *
 * @author joaoc
 */
public class Professor extends Pessoa{
    private static final int MAX = 5;
    
    private String sigla;
    private Contrato contrato;
    private UnidadeCurricular[] ucs;
    private int contUcs = 0;

    public Professor(String sigla, Contrato contrato, String nome, String dataNasc, String morada, int CC, int NIF) {
        super(nome, dataNasc, morada, CC, NIF);
        this.sigla = sigla;
        this.contrato = contrato;
        this.ucs = new UnidadeCurricular[MAX];
    }

    public String getSigla() {
        return sigla;
    }

    public Contrato getContrato() {
        return contrato;
    }
    
    public boolean addUC(UnidadeCurricular uc) {
        if (uc == null) return false;
        
        if (contUcs == MAX) return false;
        
        for (int i = 0; i < this.contUcs; i++) {
            if (this.ucs[i].equals(uc)) {
                return false;
            }
        }
        
        ucs[contUcs++] = uc;
        return true;
    }
    
    public void removeUcs(UnidadeCurricular uc) {
        int[] positons = new int[MAX];
        int found = 0;
        
        for (int i = 0; i < contUcs; i++) {
            if (ucs[i].equals(uc)) {
                positons[i] = 1;
                found++;
            }
        }
        
        if (found > 0) {
            UnidadeCurricular[] tmp = new UnidadeCurricular[MAX - found];
            int tmpPosition = 0;
            
            for (int i = 0; i < positons.length; i++) {
                if (positons[i] == 0) {
                    tmp[tmpPosition] = ucs[i];
                    tmpPosition++;
                }
            }
            
            this.ucs = tmp;
            this.contUcs--;
        } else {
            System.out.println("Unidade curricular não encontrada! ");
        }
        
        
    }
    
    public String printUcs() {
        String text = "";
        
        for (UnidadeCurricular uc : ucs) {
            if (uc != null) {
                text += uc.toString();
                text += "*********" + "\n";
            }
        }
        
        return text;
    }

    @Override
    public String toString() {
        String text = "";
        text += super.toString();
        text += "Sigla: " + sigla + "\n" + "Contrato: " + contrato + "\n";
        return text;
    }
    
    
}
