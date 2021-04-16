package ficha6;

import enums.Tamanho;

/**
 *
 * @author joaoc
 */
public class Ementa {
    private final int MAX_PIZZAS = 10;
    
    private String designacao;
    private String descricao;
    private int id;
    private String Data_inicio;
    private String Data_fim;
    private int numPizzas;
    private Pizza[] ementa;

    public Ementa(String descricao, int id, String Data_inicio, String Data_fim) {
            this.descricao = descricao;
            this.id = id;
            this.Data_inicio = Data_inicio;
            this.Data_fim = Data_fim;
            this.ementa = new Pizza[MAX_PIZZAS];   
    }
    
    private int find(int id) {
        int pos = -1;
        int i = 0;
        
        while (pos == -1 && i < numPizzas) {            
            if(id == ementa[i].getCodigo()) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }
    
    public boolean addPizza(Pizza pizza) {
        //Verificar se a pizza é valida
        if (pizza == null) return false;
        
        //Verificar se há espaço
        if (numPizzas == MAX_PIZZAS) return false;
        
        //Verificar se ha repetidos
        if (find(pizza.getCodigo()) != -1) return false;
        
        ementa[numPizzas++] = pizza;
        return true;       
    }
    
    public void removerPizza(int id) {
        int[] positions = new int[ementa.length];
        int found = 0;
        
        for (int i = 0; i < this.numPizzas; i++) {
            if (ementa[i].getCodigo() == id) {
                positions[i] = 1;
                found++;
            }
        }
        
        if (found > 0) {
            Pizza[] tmp = new Pizza[ementa.length - found];
            int tmpPosition = 0;
            
            for (int i = 0; i < positions.length; i++) {
                if (positions[i] == 0) {
                    tmp[tmpPosition] = ementa[i];
                    tmpPosition += 1;
                }
            }
            
            this.ementa = tmp;
            this.numPizzas--;
        } else {
            System.out.println("Não foi encontrado!");
        }
    }
    
    public int countPizzaSize(Tamanho tamanho) {
        int found = 0;
        
        for(int i = 0; i < numPizzas; i++) {
            if (this.ementa[i].getTamanho() == tamanho) {
                found++;
            }
        }
        return found;
    }
    
    public int countPizzaMedia() {
        int found = 0;
        
        for (Pizza pizza : ementa) {
            if (pizza.getTamanho() == Tamanho.MEDIUM) {
                found++;
            }
        }
        
        return found;
    }
    
    public int countPizzaSmall() {
        int found = 0;
        
        for (Pizza pizza : ementa) {
            if (pizza.getTamanho() == Tamanho.SMALL) {
                found++;
            }
        }
        
        return found;
    }
    
    public String imprimirPizza() {
        String text = "";
        
        for (int i = 0; i < this.numPizzas; i++) {
            text += "Pizza nº " + (int) (i+1) + "\n" + ementa[i].toString();
        }
        return text;
    }

    @Override
    public String toString() {
        String text = "Ementa : " + "\n";
        
        for (int i = 0; i < this.numPizzas; i++) {
            text += "Pizza nº " + (int) (i+1) + "\n" + ementa[i].toString() + "\n";
            text += this.ementa[i].imprimirIngrediente();
        }
        return text;
    }  
}
