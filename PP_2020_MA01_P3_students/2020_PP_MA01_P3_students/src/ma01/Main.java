package ma01;

import shopping_cart.ItemManagement;
import shopping_cart.ItemType;
import shopping_cart.concretItem;

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
public class Main {

    public static void main(String[] args) {
        ItemManagement lista = new ItemManagement();
        
        concretItem item1 = new concretItem("test1", "arroz", 0.87, ItemType.FOOD);
        concretItem item2 = new concretItem("aaa", "cotonetes", 0.99, ItemType.PERSONAL_CARE);
        
        lista.add(item1);
        lista.add(item1);
        lista.add(item1);
        lista.add(item2);
        lista.changePrice("test1", 0.70);
        lista.removeUnit("aaa");
        lista.numberOfItems();
        lista.valorPagar();
    }

}
