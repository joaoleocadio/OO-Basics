
package exerc2;

import pp_fp05.cd.Author;

/**
 *
 * @author joaoc
 */
public class Musica {  
    protected final int AUTHORS_SIZE = 5;
    static int nextId = 1;
    
    protected int id;
    protected String nome_Musica;
    protected int duracao;
    protected Author[] nome_autor;

    public Musica(int id, String nome_Musica, int duracao) {
        this.id = id;
        this.nome_Musica = nome_Musica;
        this.duracao = duracao;
        this.nome_autor = new Author[AUTHORS_SIZE];
    }  
}
