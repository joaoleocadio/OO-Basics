package reading_list;

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
 * a data structure used to store {@link Book books}
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
public interface ReadingList {

    /**
     * Adds a {@link Book book} to the data structure used to store
     * {@link Book books}. Only one copy of each {@link Book#isbn book isbn} and
     * only books with {@link BookStatus#WANT_TO_READ WANT_TO_READ} status are
     * allowed to be added.
     *
     * @param book The {@link Book book} to be added
     *
     * @return <code>true</code> if the {@link Book book} has been added,
     * otherwise <code>false</code>
     */
    boolean add(Book book);

    /**
     * Get the {@link Book book} through its {@link Book#isbn ISBN} from the
     * books in the reading list.
     *
     * @param isbn The book {@link Book#isbn ISBN}
     *
     * @return {@link Book book} with the given {@link Book#isbn ISBN}. Returns
     * null, if not found
     *
     */
    Book getBook(String isbn);

    /**
     * Removes the {@link Book book} from the data structure used to store
     * {@link Book books} based on a specific {@link Book#isbn isbn}. Only books
     * with the {@link BookStatus#READ READ} status can be removed.
     *
     * @param isbn The {@link Book#isbn isbn} used to remove {@link Book books}
     *
     * @return  <code>true</code> if the {@link Book book} has been removed,
     * otherwise <code>false</code>
     *
     */
    boolean remove(String isbn);

    /**
     * Changes the book {@link Book#status status}. Only one book can have the
     * {@link BookStatus#CURRENTLY_READING CURRENTLY_READING} status. If the new
     * status is {@link BookStatus#CURRENTLY_READING CURRENTLY_READING} and
     * another book has this status, no changes are done
     *
     * @param isbn The {@link Book#isbn ISBN} in the reading list to change
     * status
     * @param status The new book {@link Book#status status}
     *
     * @return <code>true</code> if the {@link Book#isbn} has been changed,
     * otherwise <code>false</code>
     *
     */
    boolean changeStatus(String isbn, BookStatus status);

    /**
     * Says how many {@link Book books} exists in the data structure used to
     * store {@link Book books}
     *
     * @return The number of {@link Book books} in the data structure used to
     * store {@link Book books}
     *
     */
    int getNumberOfBooks();

    /**
     * Prints all {@link Book books}, not <code>null</code> references, stored
     * in the data structure used to store {@link Book books}
     */
    void printAll();

}
