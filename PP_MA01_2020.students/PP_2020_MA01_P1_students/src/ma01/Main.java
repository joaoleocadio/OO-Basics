package ma01;

import waiting_room.RegistrationStatus;
import waiting_room.WaitingRoomManagement;
import waiting_room.concretRegistration;

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
        waiting_room.WaitingRoomManagement lista = new WaitingRoomManagement();
        
        concretRegistration c1 = new concretRegistration("1111", "João");
        concretRegistration c2 = new concretRegistration("123", "José");
        concretRegistration c3 = new concretRegistration("234", "Ricardo");
        concretRegistration c4 = new concretRegistration("123", "dfsv");
        
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        c2.changeRegistrationStatus();
        c2.changeRegistrationStatus();
        
        //lista.editName("1111", "Jorge Moreira");
        lista.remove(c2);
        //lista.editName("1111", "Zé");
        //System.out.println(lista.getRegistration("1111"));
        lista.printAll();
        
    }

}
