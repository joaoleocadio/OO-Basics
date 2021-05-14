package waiting_room;

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
 * The "contract" that identifies which operations has to be available to handle
 * a data structure used to store {@link Registration Registrations}
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
public interface WaitingRoom {

    /**
     * Get the {@link Registration registration} through its SSN from the
     * registrations in the waiting room
     *
     * @param ssn The patient SSN
     *
     * @return {@link Registration registration} with the given
     * {@link Registration#ssn ssn}. Returns <code>null</code>, if not found
     *
     */
    Registration getRegistration(String ssn);

    /**
     * Says how many free positions exists in the data structure used to store
     * {@link Registration registration}
     *
     * @return The amount of free positions in the data structure used to store
     * {@link Registration registrations}
     *
     */
    int getFreeSeats();

    /**
     * Adds a {@link Registration registration} to the data structure used to
     * store {@link Registration registrations}. The same patient can not have
     * more than one registration in the waiting room
     *
     * @param registration The {@link Registration registration} to be added
     *
     * @return <code>true</code> if the {@link Registration registration} has
     * been added, otherwise <code>false</code>
     *
     */
    boolean add(Registration registration);

    /**
     * Removes the {@link Registration registration} from the data structure
     * used to store {@link Registration registrations}. The registration can
     * only be removed if its status is:
     * {@link RegistrationStatus#COMPLETE COMPLETE}
     *
     * @param registration The {@link Registration registration} to be removed
     *
     * @return <code>true</code> if removed, <code>false</code> otherwise
     *
     */
    boolean remove(Registration registration);

    /**
     * Gets the number os {@link Registration registrations} with
     * {@link RegistrationStatus specified status}
     *
     * @param registrationStatus The
     * {@link RegistrationStatus registration status} to filter
     *
     * @return The number of {@link Registration registrations} with
     * {@link RegistrationStatus specified status}
     */
    int getWithStatus(RegistrationStatus registrationStatus);

    /**
     * Prints all {@link Registration registrations} stored in the data
     * structure used to store {@link Registration registrations}
     *
     */
    void printAll();

}
