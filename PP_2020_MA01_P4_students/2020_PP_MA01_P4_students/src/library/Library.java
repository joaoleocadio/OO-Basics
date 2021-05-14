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
 * The "contract" that identifies which operations has to be available to handle
 * a data structure used to store {@link Reference Reference}
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
public interface Library {

    /**
     * Resets the library and initialize the collections with a different size.
     * Previous {@link Reference Reference} are discarded.
     *
     * @param size The collection size of {@link Reference reference}
     *
     */
    void reset(int size);

    /**
     * Adds a {@link Reference reference} to the data structure used to store
     * {@link Reference reference}. The method returns one of the following
     * outputs: 0, if there is no space for more {@link Reference references},
     * 1, if the {@link Reference reference} is new and is added to the library
     * 2 if the {@link Reference reference} already exists and is added (as
     * duplicate) to the library
     *
     * @param reference The {@link Reference reference} to be added
     * @return 0, if there is no space for more {@link Reference references} 1,
     * if the {@link Reference reference} is new and is added to the library 2,
     * if the {@link Reference reference} already exists and is added (as
     * duplicate) to the library
     *
     */
    int add(Reference reference);

    /**
     * Returns the number of {@link Reference references} of a given
     * {@link Reference#authors author}.
     *
     * @param author The {@link Reference#authors author} name.
     *
     * @return The number of {@link Reference references} of a given
     * {@link Reference#authors author}
     */
    int getNumberOfReferencesByAuthor(String author);

    /**
     * Prints all {@link Reference references} stored in the data structure
     * according to the {@link CitationStyle citation style}.
     *
     * @param citationStyle The {@link CitationStyle citation style} to be
     * applied.
     */
    void printAll(CitationStyle citationStyle);

}
