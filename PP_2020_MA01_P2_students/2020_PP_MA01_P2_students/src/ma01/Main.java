package ma01;

import reading_list.BookManagement;
import reading_list.BookStatus;
import reading_list.concretBook;

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
        BookManagement lista = new BookManagement();
        
        concretBook b1 = new concretBook("qw1", "Harry Potter e a pedra filosofal");
        concretBook b2 = new concretBook("ert2", "Harry Potter e a camara secreta");
        concretBook b3 = new concretBook("zxc3", "Harry Potter e o prisoneiro de Azkaban");
        concretBook b4 = new concretBook("fbd", "gfopk", BookStatus.READ);
        
        lista.add(b1);
        lista.add(b2);
        lista.add(b3);
        lista.changeStatus("qw1", BookStatus.READ);
        lista.printAll();
        
    }

}
