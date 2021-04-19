package ficha7exerc2;

/**
 *
 * @author joaoc
 */
public class SchoolManagement {
    private final int MAX = 10;
    
    private Pessoa[] lista = new Pessoa[MAX];
    private int countPeople = 0;
    
    public boolean addPeople(Pessoa pessoa) {
        if (pessoa == null) return false;
       
        //Quando o array esta cheio duplica o seu tamanho automaticamente
        if (countPeople >= MAX) {
            Pessoa[] tmp = new Pessoa[(MAX * 2)];
            
            for (int i = 0; i < this.lista.length; i++) {
                tmp[i] = this.lista[i];
            }
            
            lista = tmp;
        }       
        
        //Verificar se a pessoa já existe no array
        for (int i = 0; i < countPeople; i++) {
            if (lista[i].equals(pessoa)) {
                return false;
            }
        }
        
        lista[countPeople++] = pessoa;
        return true;
    }
    
    public void removePeople(Pessoa pessoa) {
        int[] positions = new int[MAX];
        int found = 0;
        
        for (int i = 0; i < countPeople; i++) {
            if (lista[i].equals(pessoa)) {
                positions[i] = 1;
                found++;
            }
        }
        
        if (found > 0) {
            Pessoa[] tmp = new Pessoa[MAX - found];
            int tmpPosition = 0;
            
            for (int i = 0; i < positions.length; i++) {
                if (positions[i] == 0) {
                    tmp[tmpPosition] = lista[i];
                    tmpPosition++;
                }
            }
            
            this.lista = tmp;
            this.countPeople--;
            
        } else {
            System.out.println("Não foi encontrado! ");
        }
    }
    
    public String printProf() {
        String text = "";
        
        for (int i = 0; i < countPeople; i++) {
            if (this.lista[i] instanceof Professor) {
                text += "****** Professor nº " + (i+1) + " ****** " + "\n";
                text += lista[i].toString() + "\n";
            }
        }
        return text;
    }
    
    public String printAluno() {
        String text = "";
        
        for (int i = 0; i < this.countPeople; i++) {
            if (this.lista[i] instanceof Aluno) {
                text += "****** Aluno nº " + (i+1) + " ****** " + "\n";
                text += lista[i].toString() + "\n";
            }
        }
        return text;
    }
    
    public String printFuncionario() {
        String text = "";
        
        for (int i = 0; i < countPeople; i++) {
            if (this.lista[i] instanceof Funcionario) {
                text += "****** Funcionário nº " + (i+1) + " ****** " + "\n";
                text += lista[i].toString();
            }
        }
        return text;
    }
    
    public String printAllPeople() {
        String text = "";
        
        for (int i = 0; i < countPeople; i++) {
            text += "******* Pessoa"+  + (i + 1) + " ******* " + "\n";
            text += lista[i].toString() + "\n";
        }
        
        return text;
    }
}
