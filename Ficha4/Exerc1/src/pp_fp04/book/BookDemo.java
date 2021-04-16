package pp_fp04.book;

/**
 *
 * @author joaoc
 */
public class BookDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book book1 = null;
        
        book1.titulo = new char[]{'H','a','r','r','y',' ','P','o','t','t','e','r'};
        book1.editor = new char[]{'A','r','i','a','l'};
        book1.autor.id = new char[]{'J','K','R'};
        book1.autor.nomeAutor = new char[]{'J','.','K','R','o','w','l','i','n','g'};
        book1.autor.nacionalidade = new char[]{'I','n','g','l','e','s','a'};
        book1.ano = 1998;
        book1.paginas = 599;
        book1.cotacao = new Cotacao[]{Cotacao.cinco, Cotacao.nove, Cotacao.nove};
        
        System.out.print("Título: ");
        System.out.println(book1.titulo);
        System.out.print("Editor: ");
        System.out.println(book1.editor);
        System.out.print("Autor Acronimo: ");
        System.out.println(book1.autor.id);
        System.out.print("Nome Autor: ");
        System.out.println(book1.autor.nomeAutor);
        System.out.print("Nacionalidade do Autor: ");
        System.out.println(book1.autor.nacionalidade);
        System.out.print("Ano do livro: ");
        System.out.println(book1.ano);
        System.out.print("Nº de páginas: ");
        System.out.println(book1.paginas);
        System.out.println("*** Cotação do livro ***");
        System.out.println("Critico nº 1: " + book1.cotacao[0] + "\n" + "Critico nº 2: " + book1.cotacao[1] + "\n" + "Critico nº 3: " + book1.cotacao[2] + "\n");
    }
    
}
