package reading_list;

/**
 *
 * @author joaoc
 */
public class concretBook extends Book{

    /**
     * Método construtor com o estado definido por defeito como WANT_TO_READ
     * @param isbn
     * @param title 
     */
    public concretBook(String isbn, String title) {    
        super(isbn, title, BookStatus.WANT_TO_READ);
    }
    
    /**
     * Método equals para comparação de objetos
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        if (obj == null) return false;
        
        if (!(obj instanceof concretBook)) return false;
        
        boolean equal = false;
        concretBook temp = (concretBook) obj;
        
        if (temp.getTitle().equals(this.getTitle())) {
            if (temp.getISBN().equals(this.getISBN())) {
                if (temp.getStatus().equals(this.getStatus())) {
                    equal = true;
                }
            }
        }
        
        return equal;
    }

    /**
     * Método toString para a impressão dos atributos de um livro
     * @return 
     */
    @Override
    public String toString() {
        String text = "";
        
        text += "ISBN: " + this.getISBN() + "\n" + "Titulo: " + this.getTitle() + "\n" + "Status: " + this.getStatus() + "\n";
        
        return text;
    }
    
}
