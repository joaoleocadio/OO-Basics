package reading_list;

/**
 *
 * @author joaoc
 */
public class BookManagement implements ReadingList{
    
    private static final int MAX = 10;
    private Book[] lista;
    private int contBook;

    public BookManagement() {
        this.lista = new Book[MAX];
        this.contBook = 0;
    }
    
    /*
    private int find(String isbn) {
        int pos = -1;
        int i = 0;
        
        while (pos == -1 && i < this.contBook) {
            if (lista[i].getISBN().equals(isbn)) {
                pos = i;
            }
            i++;
        }
        return pos;
    }*/
    
    /**
     * Método privado que retorna a posição de um livro no array através do parametro isbn
     * @param isbn
     * @return 
     */
    private int find(String isbn) {
        int pos = -1;
        
        for (int i = 0; i < this.contBook; i++) {
            if (lista[i].getISBN().equals(isbn)) {
                pos = i;
            }          
        }
        return pos;
    }
    
    /**
     * Método que permite adicionar um livro ao array
     * @param book
     * @return 
     */
    @Override
    public boolean add(Book book) {
        int pos = find(book.getISBN());
        
        if (book == null) return false;
        
        if (pos != -1) return false;
        
        if (contBook >= MAX) return false;
        
        if (book.getStatus().equals(BookStatus.WANT_TO_READ)) {
            lista[contBook++] = book;
        }   
        return true;
    }

    /**
     * Método que permite obter um livro do array através do seu isbn
     * @param isbn
     * @return 
     */
    @Override
    public Book getBook(String isbn) {
        Book temp = null;
        
        for (int i = 0; i < this.contBook; i++) {
            if (lista[i].getISBN().equals(isbn)) {
                temp = lista[i];
            }          
        }
        
        return temp;
    }

    /**
     * Método que permite remover um livro do array através do seu isbn
     * @param isbn
     * @return 
     */
    @Override
    public boolean remove(String isbn) {
        int[] position = new int[MAX];
        int found = 0;
        
        for (int i = 0; i < contBook; i++) {
            if (this.lista[i].getISBN().equals(isbn) && this.lista[i].getStatus().equals(BookStatus.READ)) {
                position[i] = 1;
                found++;
            }
        }
        
        if (found > 0) {
            Book[] tmp = new Book[MAX - found];
            int tmpPosition = 0;
            
            for (int i = 0; i < position.length; i++) {
                if (position[i] == 0) {
                    tmp[tmpPosition] = lista[i];
                    tmpPosition++;
                }
            }
            
            this.lista = tmp;
            this.contBook--;
            
        } 
        return true;
        
    }

    /**
     * Método que permite alterar o status de um livro 
     * @param isbn 
     * @param status
     * @return 
     */
    @Override
    public boolean changeStatus(String isbn, BookStatus status) {
        if (isbn == null || isbn.equals("")) return false;
        
        for (int i = 0; i < contBook; i++) {
            if (lista[i].getISBN().equals(isbn)) {
                lista[i].setStatus(status);
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * Método que permite obter o número de livros disponíveis para leitura
     * @return 
     */
    @Override
    public int getNumberOfBooks() {    
        
        System.out.print("Número de livros disponíveis: " + contBook + "\n");

        return this.contBook;
    }

    /**
     * Método que permite imprimir todos os livros presentes no array
     */
    @Override
    public void printAll() {
       
        for (int i = 0; i < this.contBook; i++) {
            System.out.println("##### Book " + (i+1) + " #####" + "\n"); 
            System.out.println(lista[i].toString());
        }
    }
    
}
