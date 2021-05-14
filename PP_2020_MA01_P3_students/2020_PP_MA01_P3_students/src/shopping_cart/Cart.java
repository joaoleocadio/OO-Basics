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
 * The "contract" that says which operations has to be available to handle a
 * data structure used to store {@link Item items}
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
public interface Cart {

    /**
     * Adds a {@link Item item} to the data structure used to store
     * {@link Item items}. If the {@link Item item} does not exist, sets the
     * {@link Item#setQuantity(int) quantity} equals to 1. If the
     * {@link Item item} exists, then the quantity value is incremented
     *
     * @param item The {@link Item item} to be added
     *
     * @return <code>true</code> if the {@link Item item} has been
     * added/updated, otherwise <code>false</code>
     */
    boolean add(Item item);

    /**
     * Removes one unit of {@link Item item} with provided reference from the
     * data structure used to store {@link Item items}. If the quantity is equal
     * to 0, then the {@link Item item} should be removed
     *
     * @param reference The {@link Item#reference reference} to be removed
     *
     * @return <code>true</code> if the {@link Item item}/quantity has been
     * removed, otherwise <code>false</code>
     */
    boolean removeUnit(String reference);

    /**
     * Removes the {@link Item item} (regardless the item quantity from the data
     * structure used to store {@link Item items} with provided reference .
     *
     * @param reference The {@link Item#reference reference} to be removed
     *
     * @return <code>true</code> if the {@link Item item} has been removed,
     * otherwise <code>false</code>
     */
    boolean remove(String reference);

    /**
     * Returns the sum of each {@link Item item} item quantity for the
     * {@link Item itens} in the data structure used to store {@link Item items}
     *
     * @return the sum of each {@link Item item} item quantity
     */
    int numberOfItems();

    /**
     * Prints all {@link Item items} and respective quantity, stored in the data
     * structure used to store {@link Item items}
     */
    void printAll();

}
