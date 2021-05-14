package ma01;

import library.CitationStyle;
import library.ReferenceManagemente;
import library.concretReference;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] author = {"jose", "bruno"};
        String[] author1 = {"jose"};
        concretReference c1 = new concretReference(CitationStyle.IEEE, "qwe", "referencia", 1990, author);
        concretReference c2 = new concretReference(CitationStyle.APA, "asd", "referencia 2", 1995, author1);
        
        ReferenceManagemente lista = new ReferenceManagemente();
        lista.add(c1);
        lista.add(c2);
        //lista.printAll();
        //lista.printAll(CitationStyle.IEEE);
        lista.getNumberOfReferencesByAuthor("jose");
    }
    
}
