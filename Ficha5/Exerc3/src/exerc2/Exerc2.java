package exerc2;

import fp_fp05.store.Sale;
import fp_fp05.store.User;
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
        
        Musica m3 = new Musica(1, "Better Man", 200);
        m3.nome_autor[0] = autor2;
        
        Musica m4 = new Musica(2, "Alive", 304);
        m4.nome_autor[1] = autor2;
        
        CD cd2 = new CD("Pearl Jam", "Gigaton", 200, 1990, "Dualtone Records", artistas, 19.90f);
        cd2.musicas[0] = m3;
        cd2.musicas[1] = m4;
        
        CD compra[] = {cd1, cd2};
        
        User user1 = new User("Tiago", 20, "Tiago@gmail.com");
        Sale venda1 = new Sale("2021-03-26", compra, user1);
        float total_pagar = 0;
        System.out.println("---- Fatura ----");
        System.out.println("ID da Venda: " + venda1.id);
        System.out.println("Data: " + venda1.data);

        for (int i = 0; i < compra.length; i++) {           
            if (compra[i] != null) {
                System.out.println("CD: " + (i+1) + " " + compra[i].nome_CD + " Preço: " + compra[i].preco);
                total_pagar += compra[i].preco;               
            }            
        }
        System.out.printf("Total a pagar: %.2f", total_pagar);
        System.out.println(" ");
        System.out.println("---- Info Comprador ----");
        System.out.println("Nome: " + venda1.comprador.toString());       
    }  
}
