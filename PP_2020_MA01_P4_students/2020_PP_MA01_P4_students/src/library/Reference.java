package library;

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
 * The <code>Reference</code> represents a scientific publication.
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
public abstract class Reference {

    /**
     * The reference's DOI
     */
    private String doi;

    /**
     * The reference's title
     */
    private String title;

    /**
     * The reference's publication year
     */
    private int year;

    /**
     * The reference's authors
     */
    private String[] authors;

    /**
     * Creates an instance of <code>reference</code>
     *
     * @param doi The {@link Reference#doi DOI}
     * @param title The {@link Reference#title title}
     * @param year The {@link Reference#year publiction year}
     * @param authors The {@link Reference#authors authors}
     */
    protected Reference(String doi, String title, int year, String[] authors) {
        this.setDOI(doi);
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    /**
     * Sets the attribute {@link Reference#doi doi}.
     *
     * @param doi The {@link Reference#doi doi}
     */
    protected final void setDOI(String doi) {
        this.doi = doi;
    }

    /**
     * Sets the attribute {@link Reference#title title}.
     *
     * @param title The {@link Reference#title title}
     */
    protected final void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets the attribute {@link Reference#year publiction year}.
     *
     * @param year The {@link Reference#year publiction year}
     */
    protected final void setYear(int year) {
        this.year = year;
    }

    /**
     * Sets the attribute {@link Reference#authors authors}.
     *
     * @param authors The {@link Reference#authors authors}
     */
    protected final void setAuthors(String[] authors) {
        this.authors = authors;
    }

    /**
     * Gets the attribute {@link Reference#doi doi}
     *
     * @return The reference's {@link Reference#doi doi}
     */
    public String getDOI() {
        return this.doi;
    }

    /**
     * Gets the attribute {@link Reference#title title}
     *
     * @return The reference's {@link Reference#title title}
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Gets the attribute {@link Reference#year publication year}
     *
     * @return The reference's {@link Reference#year publication year}
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Gets the attribute {@link Reference#authors authors}
     *
     * @return The reference's {@link Reference#authors authors}
     */
    public String[] getAuthors() {
        return this.authors;
    }

    /**
     * Gets the {@link Reference reference} according to the citation style
     *
     * @param citationStyle The {@link CitationStyle citation style} to be
     * applied.
     *
     * @return String with the citation
     */
    public abstract String getReferenceCitation(CitationStyle citationStyle);

    /**
     * Indicates whether some other object is "equal to" this one, that is, if
     * the other object is an instance of {@link Reference Reference} and his
     * {@link Reference#doi DOI} is the same as this object
     *
     * @param obj The reference object with which to compare
     *
     * @return <code>true</code>if this object is "the same" as the
     * <code>obj</code>, <code>false</code> otherwise
     *
     */
    @Override
    public abstract boolean equals(Object obj);

    /**
     * Returns a string representation of the object. In general, the toString
     * method returns a string that "textually represents" this object. The
     * result should be a concise but informative representation that is easy
     * for a person to read
     *
     * @return A string representation of the object
     *
     */
    @Override
    public abstract String toString();

}
