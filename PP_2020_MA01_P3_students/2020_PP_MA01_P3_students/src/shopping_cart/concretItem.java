package shopping_cart;

/**
 *
 * @author joaoc
 */
public class concretItem extends Item{
    private int quantity;

    /**
     * Método construtor para o item
     * @param reference
     * @param name
     * @param price
     * @param itemType 
     */
    public concretItem(String reference, String name, double price, ItemType itemType) {
        super(reference, name, price, itemType);
    }
    
    /**
     * Setter para a quantidade
     * @param quantity 
     */
    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter para a quantidade
     * @return 
     */
    @Override
    public int getQuantity() {
        return quantity;
    }

    /**
     * Método equals para a comparação de objetos
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        if (obj == null) return false;
        
        if (!(obj instanceof concretItem)) return false;
        
        boolean equal = false;
        concretItem tmp = (concretItem) obj;
        
        if (tmp.getName().equals(this.quantity)) {
            if (tmp.getReference() == this.getReference()) {
                if (tmp.getPrice() == this.getPrice()) {
                    if (tmp.getItemType() == this.getItemType()) {
                        if (tmp.getQuantity() == this.getQuantity()) {
                            equal = true;
                        }
                    }
                }
            }
        }
        
        return equal;
    }

    /**
     * Método toString para a impressão dos atributos de um item
     * @return 
     */
    @Override
    public String toString() {
        String text = "";
        
        text += "Name: " + this.getName() + "\n" + "Reference: " + this.getReference() + "\n" + "Price: " + this.getPrice() + "\n" + "Item Type: " + this.getItemType() + "\n";
        text += "Quantidade: " + this.getQuantity() + "\n";
        
        return text;
    }
    
}
