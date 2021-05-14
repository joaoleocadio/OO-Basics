package shopping_cart;

/**
 * <h2>
 * Escola Superior de Tecnologia e Gestão (ESTG)<br>
 * Politécnico do Porto (PP)<br>
 * Licenciatura em Engenharia Informática (LEI)<br>
 * Licenciatura em Segurança Informática em Redes de Computadores (LSIRC)<br>
 * Paradigmas de Programação (PP)<br>
 * 2019 / 2020<br>
 * </h2>
 * <p>
 * Item abstract class
 * </p>
 * <p>
 * Authors:
 * </p>
 * <ul>
 * <li>@author <a href="rjs@estg.ipp.pt">Ricardo Santos</a></li>
 * <li>@author <a href="bmo@estg.ipp.pt">Bruno Oliveira</a></li>
 * <li>@author <a href="fas@estg.ipp.pt">Fábio Silva</a></li>
 * <li>@author <a href="jrmr@estg.ipp.pt">João Ramos</a></li>
 * <li>@author <a href="oao@estg.ipp.pt">Óscar Oliveira</a></li>
 * </ul>
 *
 */
public abstract class Item {

    /**
     * The item's reference
     */
    private String reference;

    /**
     * The item's name
     */
    private String name;

    /**
     * The item's price
     */
    private double price;

    /**
     * The item's type
     */
    private ItemType itemType;

    /**
     * Creates an instance of <code>Item</code>
     *
     * @param reference The {@link Item#reference reference}
     * @param name The {@link Item#name name}
     * @param price The {@link Item#price price}
     * @param itemType The {@link Item#itemType item type}
     */
    protected Item(String reference, String name, double price, ItemType itemType) {
        this.setReference(reference);
        this.setName(name);
        this.setPrice(price);
        this.setItemType(itemType);
    }

    /**
     * Sets the attribute {@link Item#reference reference}
     *
     * @param reference The {@link Item#reference reference}
     */
    private void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Sets the attribute {@link Item#name name}
     *
     * @param name The {@link Item#name name}
     */
    private void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the attribute {@link Item#price price}
     *
     * @param price The {@link Item#price price}
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Sets the attribute {@link Item#itemType item type}
     *
     * @param itemType The {@link Item#itemType item type}
     */
    private void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    /**
     * Gets the attribute {@link Item#reference reference}
     *
     * @return The item's {@link Item#reference reference}
     */
    public String getReference() {
        return this.reference;
    }

    /**
     * Gets the attribute {@link Item#name name}
     *
     * @return The item's {@link Item#name name}
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the attribute {@link Item#price price}
     *
     * @return The item's {@link Item#price price}
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Gets the attribute {@link Item#name name}
     *
     * @return The item's {@link Item#name name}
     */
    public ItemType getItemType() {
        return this.itemType;
    }

    /**
     * Sets the quantity
     *
     * @param quantity The item quantity
     */
    public abstract void setQuantity(int quantity);

    /**
     * Gets the attribute item quantity
     *
     * @return The item's quantity
     */
    public abstract int getQuantity();

    /**
     * Indicates whether some other object is "equal to" this one, that is, if
     * the other object is an instance of <code>Item</code> and his
     * {@link Item#name name} and item quantity are the same of this object
     *
     * @param obj The reference object with which to compare
     *
     * @return <code>true</code> if this object is "the same" as the
     * <code>obj</code> argument; <code>false</code> otherwise
     */
    @Override
    public abstract boolean equals(Object obj);

    /**
     * Returns a string representation of the object. In general, the toString
     * method returns a string that "textually represents" this object. The
     * result should be a concise but informative representation that is easy
     * for a person to read
     *
     * @return A string representation of the object (<code>item</code>)
     */
    @Override
    public abstract String toString();

}
