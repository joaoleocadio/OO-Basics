package ficha7exerc2;

/**
 *
 * @author joaoc
 */
public class Aluno extends Pessoa{
    private static final int MAX = 5;
    
    private static int nextId = 0; 
    
    private int id;
    private UnidadeCurricular[] ucs;
    private int contUcs = 0;

    public Aluno(String nome, String dataNasc, String morada, int CC, int NIF) {
        super(nome, dataNasc, morada, CC, NIF);
        this.id = ++nextId;
        this.ucs = new UnidadeCurricular[MAX];
    }

    public int getId() {
        return id;
    }
    
    public boolean addUcs(UnidadeCurricular uc) {
        if (uc == null) return false;
        
        if (this.contUcs == MAX) return false;
        
        for (int i = 0; i < this.contUcs; i++) {
            if (ucs[i].equals(uc)) {
                return false;
            }
        }
        
        ucs[contUcs++] = uc;
        return true;
    }

    public void removeUcs(UnidadeCurricular uc) {
        int[] positions = new int[MAX];
        int found = 0;
        
        for (int i = 0; i < this.contUcs; i++) {
            if (this.ucs[i].equals(uc)) {
                positions[i] = 1;
                found++;
            }
        }
        
        if (found > 0) {
            UnidadeCurricular[] tmp = new UnidadeCurricular[MAX - found];
            int tmpPosition = 0;
            
            for (int i = 0; i < positions.length; i++) {
                if (positions[i] == 0) {
                    tmp[tmpPosition] = ucs[i];
                    tmpPosition++;
                }
            }
            
            this.ucs = tmp;
            this.contUcs--;
        } else {
            System.out.println("Unidade Curricular não encontrada! ");
        }
        
        
    }
    
    public String printUcs() {
        String text = "";
        
        for (UnidadeCurricular uc : ucs) {
            if (uc != null) {
                text += uc.toString();
                text += "***********" + "\n";
            }
        }
        
        return text;
    }
    
    @Override
    public String toString() {
        String text = "";
        
        text += "ID: " + this.id + "\n";
        text += super.toString();
        
        return text;
    }
    
    
}
