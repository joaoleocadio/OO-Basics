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
 * Book abstract class
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
public abstract class Book {

    /**
     * The book's ISBN
     */
    private String isbn;

    /**
     * The book's title
     */
    private String title;

    /**
     * The book's status
     */
    private BookStatus status;

    /**
     * Creates an instance of <code>Book</code>
     *
     * @param isbn The {@link Book#isbn ISBN}
     * @param title The {@link Book#title title}
     * @param status The {@link Book#status status}
     */
    protected Book(String isbn, String title, BookStatus status) {
        this.setISBN(isbn);
        this.setTitle(title);
        this.setStatus(status);
    }  
        
    /**
     * Sets the attribute {@link Book#isbn ISBN}
     *
     * @param isbn The {@link Book#isbn ISBN}
     */
    private void setISBN(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Sets the attribute {@link Book#title title}
     *
     * @param title The {@link Book#title title}
     */
    private void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets the attribute {@link Book#status status}
     *
     * @param status The {@link Book#status status}
     */
    public final void setStatus(BookStatus status) {
        this.status = status;
    }

    /**
     * Gets the attribute {@link Book#isbn ISBN}
     *
     * @return The book's {@link Book#isbn ISBN}
     */
    public String getISBN() {
        return this.isbn;
    }

    /**
     * Gets the attribute {@link Book#title title}
     *
     * @return The book's {@link Book#title title}
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Gets the attribute {@link Book#status status}
     *
     * @return The book's {@link Book#status status}
     */
    public BookStatus getStatus() {
        return this.status;
    }

    /**
     * Indicates whether some other object is "equal to" this one, that is, if
     * the other object is an instance of <code>Book</code> and his
     * {@link Book#isbn isbn} are the same of this object
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
     * @return A string representation of the object (<code>book</code>)
     */
    @Override
    public abstract String toString();

}
