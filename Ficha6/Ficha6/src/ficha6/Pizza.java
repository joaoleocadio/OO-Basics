package ficha6;

import enums.Origem;
import enums.Tamanho;

/**
 *
 * @author joaoc
 */
public class Pizza {
    private static final int MAX = 5;
    
    private int codigo;
    private String nome;
    private String descricao;
    private float preco;
    private Tamanho tamanho;
    private int numIngredientes;
    private Ingrediente[] ingrediente;

    public Pizza(int codigo, String nome, String descricao, float preco, Tamanho tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingrediente = new Ingrediente[MAX];
    }

    public int getCodigo() {
        return codigo;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }
    
     
    private int find(int id) {
        int pos = -1;
        int i = 0;
        
        while (pos == -1 && i < numIngredientes) {            
            if(id == ingrediente[i].getCodigo()) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }
    
    /**
     * Método que permite adicionar ingredientes a uma pizza
     * @param ing
     * @return 
     */
    public boolean adicionarIngrediente(Ingrediente ing) {
        //Verificar se é valido o ingrediente
        if (ing == null) return false;
    
        //Verificar se há espaço
        if(numIngredientes == MAX) return false;
        
        //Verificar se ha repetidos
        if (find(ing.getCodigo()) != -1) return false;
        
        //Adicionar
        ingrediente[numIngredientes++] = ing;
        return true;          
    }    
   
    public void removerIngrediente(int id) {
        int[] positions = new int[ingrediente.length];
        int found = 0;

        for (int i = 0; i < numIngredientes; i++) {
            if (ingrediente[i].getCodigo() == id) {
                positions[i] = 1;
                found += 1;
            }
        }

        if (found > 0) {
            Ingrediente[] tmp = new Ingrediente[ingrediente.length - found];
            int tmpPosition = 0;

            for (int i = 0; i < positions.length; i++) {
                if (positions[i] == 0) {
                    tmp[tmpPosition] = ingrediente[i];
                    tmpPosition += 1;
                }
            }

            this.ingrediente = tmp;
            this.numIngredientes--;
        } else {
            System.out.println("Não foi encontrado.");
        }
    }
    
    
    public void removerIngrediente(Ingrediente ing) {
        int[] positions = new int[ingrediente.length];
        int found = 0;
        
        for (int i = 0; i < this.numIngredientes; i++) {
            if(ingrediente[i].getCodigo() == ing.getCodigo()) {
                positions[i] = 1;
                found++;
            }
        }
        
        if (found > 0) {
            Ingrediente[] tmp = new Ingrediente[ingrediente.length - found];
            int tmpPosition = 0;
            
            for (int i = 0; i < positions.length; i++) {
                if (positions[i] == 0) {
                    tmp[tmpPosition] = ingrediente[i];
                    tmpPosition += 1;
                }
            }
            
            this.ingrediente = tmp;
            this.numIngredientes--;
            
        } else {
            System.out.println("Não encontrado!");
        }
    }
    
    
    /**
     * @return Método que retorna o total de 
     * calorias de uma pizza
     */
    public String totalCalorias() {
        int calorias = 0;
        String text = "";
        
        for (int i = 0; i < numIngredientes; i++) {
            calorias += this.ingrediente[i].getCalorias();
        }
        text += "Total de Calorias : " + calorias + " Kcal";
        return text;
    }

    @Override
    public String toString() {
        String text = "ID: " + this.codigo + "\n"
                    + "Nome : " + this.nome + "\n"
                    + "Tamanho : " + Tamanho.pizzaToString(tamanho) + "\n"
                    + "\n"; 
                    //+ "*** Tabela de Ingredientes ***" + "\n";
        //text += imprimirIngrediente();
        return text;
    }
    
    public String imprimirIngrediente() {
        
        String text = "";
        for (int i = 0; i < this.numIngredientes; i++) {
            text += "*** Ingrediente nº " + (int) (i+1) + "***"  + "\n" + ingrediente[i].toString() +"\n";
        }
        return text;
    
    }  
    
    public String infoIngrediente(int id) {
        String text = "";
        
        for (int i = 0; i < ingrediente.length; i++) {
            if (ingrediente[i].getCodigo() == id) {
                text += "Ingrediente nº " + (int) (i+1) +"\n" + ingrediente[i].toString();
            }
        }
        return text;
    }
    
    public int findOrigemIngredients(Origem origem) {
        int found = 0;
        
        for(int i = 0; i < this.numIngredientes; i++){
            if(this.ingrediente[i].getOrigem() == origem){
                found += 1;
            }
        }
        return found;
    }
    
}
