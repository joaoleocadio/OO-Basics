package exerc2;

import pp_fp05.cd.Author;

/**
 *
 * @author joaoc
 */
public class Exerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artista a1 = new Artista("joao", "portuguesa", "1998-08-20");
        Artista a2 = new Artista("Jack", "Inglesa", "1990-04-25");
        Artista a3 = new Artista("Werner", "Alemmã", "1992-07-16");
        
        Author autor1 = new Author("ze", 28);
        Author autor2 = new Author("xpto", 30, "Rua x", 15633906, 0055453231);
        Author autor3 = new Author("no name", 32);
              
        Musica m1 = new Musica(1, "Ho Hey", 90);
        m1.nome_autor[0] = autor1;
        m1.nome_autor[1] = autor3;
        
        Musica m2 = new Musica(2, "Stubborn Love", 180);
        m2.nome_autor[0] = autor2;
        
        Artista[] artistas = {a1, a2, a3};
        
        CD cd1 = new CD("The Lumineers", "The Lumineers" , 195, 2012, "Dualtone Records", artistas);
        cd1.musicas[0] = m1;
        cd1.musicas[1] = m2;
        
        System.out.println("Nome do cd: " + cd1.nome_CD);
        System.out.println("Ano de lançamento: " + cd1.ano);
        System.out.println("Editora: " + cd1.editora);
        
        int nMusicas = cd1.musicas.length;
        for (int i = 0; i < nMusicas; i++) {
            if (cd1.musicas[i] != null) {
                //m.id -> cd1.musicas[i]
                Musica m = cd1.musicas[i];
                System.out.println("Musica nº: " + m.id + " com titulo " + m.nome_Musica);
                System.out.println("Duração: " + m.duracao);
                for (int j = 0; j < m.nome_autor.length; j++) {
                    if (m.nome_autor[j] != null) {
                        System.out.println(m.nome_autor[j].toString());
                    }                    
                }
            }
        }       
    }  
}
