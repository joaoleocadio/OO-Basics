package shopping_cart;

/**
 *
 * @author joaoc
 */
public class ItemManagement implements Cart{
    private static final int MAX = 10;
    private Item[] lista;
    private int cont;

    /**
     * Método construtor
     */
    public ItemManagement() {
        this.lista = new Item[MAX];
        this.cont = 0;
    }
    
    /**
     * Método privado que retorna a posição do artigo no array pesquisada como argumento
     * @param reference
     * @return 
     */
    private int find(String reference) {
        int pos = -1;
        
        for (int i = 0; i < this.cont; i++) {
            if (lista[i].getReference().equals(reference)) {
                pos = i;
            }
        }
        return pos;
    }

    /**
     * Método que permite adicionar um artigo ao array
     * @param item
     * @return 
     */
    @Override
    public boolean add(Item item) {
        int pos = find(item.getReference());
        if (item == null) return false;
        
        if (cont >= MAX) return false;
        
        if (pos != -1){       
            item.setQuantity(item.getQuantity() + 1);
        } else {
            lista[cont++] = item; 
            item.setQuantity(item.getQuantity() + 1);
        }
        
        return true;
    }

    /**
     * Método que permite remover apenas uma unidade de um artigo
     * @param reference
     * @return 
     */
    @Override
    public boolean removeUnit(String reference) {
        int pos = find(reference);
        
        if (pos != -1) {
            for (int i = pos; i < this.cont; i++) {
                if (lista[i].getQuantity() > 1) {
                    lista[i].setQuantity(lista[i].getQuantity() - 1);
                    break;
                } else if (lista[i].getQuantity() == 1) {
                    lista[i] = lista[i+1]; 
                    lista[--cont] = null;
                }              
            }           
        }
        return true;
    }

    /**
     * Método que permite remover um artigo totalmente do array incluindo as quantidades
     * @param reference
     * @return 
     */
    @Override
    public boolean remove(String reference) {
        int pos = find(reference);
        
        if (pos != -1) {
            for (int i = pos; i < this.cont; i++) {
                lista[i] = lista[i+1];
            }  
            
            lista[--cont] = null;
        }
        return true;
    }

    /**
     * Método que retorna o total de artigos presentes no array tendo em 
     * consideração as quantidades de cada artigo
     * @return 
     */
    @Override
    public int numberOfItems() {
        int numArtigos = 0;
        
        for (int i = 0; i < cont; i++) {
            numArtigos += lista[i].getQuantity();
        }
        
        System.out.print("Número total de artigos: " + numArtigos + "\n");
        
        return numArtigos;
    }

    /**
     * Método que permite a impressão de todos os artigos existentes no array
     */
    @Override
    public void printAll() {
        for (int i = 0; i < this.cont; i++) {
            System.out.println("##### Artigo " + (i+1) + " #####" + "\n");
            System.out.println(lista[i].toString());
        }
    }
    
    /**
     * Método que permite alterar o preço de um determinado artigo
     * @param reference
     * @param price
     * @return 
     */
    public boolean changePrice(String reference, double price) {
        boolean temp = false;
        for (int i = 0; i < this.cont; i++) {
            if (lista[i].getReference().equals(reference)) {
                lista[i].setPrice(price);
                temp = true;
            } else {
                temp = false;
            }
        }
        
        return temp;
    }
    
    /**
     * Método que permite imprimir a fatura e o respetivo valor a pagar
     * @return 
     */
    public double valorPagar() {
        double valor = 0.0;
        
        for (int i = 0; i < this.cont; i++) {
            valor += lista[i].getPrice() * lista[i].getQuantity();
        }
        
        System.out.println("****** Fatura Descriminada *******");
        printAll();
        System.out.printf("Valor a total pagar: %.2f €\n", valor);
        return valor;
    }   
}
