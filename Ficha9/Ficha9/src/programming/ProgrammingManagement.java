package programming;

/**
 *
 * @author joaoc
 */
public class ProgrammingManagement {
    private final int MAX = 10;
    
    private Pessoa[] lista = new Pessoa[MAX];
    private int countPessoas = 0;
    
    /**
     * Método que permite adicionar uma pessoa ao array
     * @param pessoa 
     */
    public void addPessoa(Pessoa pessoa) {
        if (pessoa == null) {
            System.out.println("Pessoa Inválida!");
        }
        
        if (countPessoas >= MAX) {
            Pessoa[] tmp = new Pessoa[(MAX * 2)];
            
            for (int i = 0; i < this.countPessoas; i++) {
                tmp[i] = lista[i];
            }
            
            lista = tmp;
        }
        
        if (find(pessoa.getId()) != -1) {
            System.out.println("Pessoa não existe!");
        }
        
        lista[countPessoas++] = pessoa;
        System.out.println("A pessoa " + pessoa.getNome() + " Adicionada com sucesso!");
    }
    
    private int find(int id) {
        int pos = -1;
        int i = 0;
        
        while (pos == -1 && i < this.countPessoas) {
            if (id == lista[i].getId()) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }
    
    /**
     * Método que permite remover uma pessoa
     * @param pessoa 
     */
    public void removePessoa(Pessoa pessoa) {
        int position = find(pessoa.getId());
        
        if (position != -1) {
            for (int i = position; i < countPessoas; i++) {
                lista[i] = lista[i+1];
            }
            lista[--countPessoas] = null;
        }
    }
    
    /**
     * Método que permite remover uma pessoa através do seu ID
     * @param id 
     */
    public void removePessoa(int id) {
        int[] positions = new int[MAX];
        int found = 0;
        
        for (int i = 0; i < countPessoas; i++) {
            if (lista[i].getId() == id) {
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
            
            lista = tmp;
            countPessoas--;
        } else {
            System.out.println("Não foi encontrado! ");
        }
    }
    
    /**
     * Método que permite imprimir todas as pessoas
     * @return 
     */
    public String printAllPessoas() {
        String text = "";
        
        for (int i = 0; i < countPessoas; i++) {
            text += "####### Pessoa " + (i+1) + " #######" + "\n";
            text += lista[i].toString() + "\n";
        }
        
        return text;
    }  
    
    /**
     * Método imprimir todos os gestores
     * @return 
     */
    public String printGestor() {
        String text = "";
        
        for (int i = 0; i < countPessoas; i++) {
            if (this.lista[i] instanceof GestorProjeto) {
                text += "####### Gestores de Projeto " + (i+1) + " #######" + "\n";
                text += lista[i].toString() + "\n";
            }
        }
        return text;
    }
}
