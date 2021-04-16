package exerc2;

/**
 *
 * @author joaoc
 */
public class CD {
    protected final int CD_SIZE = 15;
    
    protected String nome_Banda;
    protected String nome_CD;
    protected int tempo;
    protected int ano;
    protected String editora;
    protected Artista[] elementos_Banda;
    protected Musica[] musicas;

    public CD(String nome_Banda, String nome_CD, int tempo, int ano, String editora, Artista[] elementos_Banda) {
        this.nome_Banda = nome_Banda;
        this.nome_CD = nome_CD;
        this.tempo = tempo;
        this.ano = ano;
        this.editora = editora;
        this.elementos_Banda = elementos_Banda;
        this.musicas = new Musica[CD_SIZE];
    }    
}