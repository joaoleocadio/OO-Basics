package library;

import java.util.Arrays;

/**
 *
 * @author joaoc
 */
public class concretReference extends Reference{

    private CitationStyle citation;
    private int cont = 0;

    /**
     * Método construtor
     * @param citation
     * @param doi
     * @param title
     * @param year
     * @param authors 
     */
    public concretReference(CitationStyle citation, String doi, String title, int year, String[] authors) {
        super(doi, title, year, authors);
        this.citation = citation;
    }

    /**
     * Getter para a citation
     * @return 
     */
    public CitationStyle getCitation() {
        return citation;
    }    

    
    @Override
    public String getReferenceCitation(CitationStyle citationStyle) {
        String text = "";
        if (citationStyle.equals(citationStyle.APA)) {
            text += (CitationStyle) this.citation;
        }
        
        if (citationStyle.equals(citationStyle.IEEE)) {
            text += (CitationStyle) this.citation;
        }
        return text;
    }

    /**
     * Método equals para comparação de referências
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        if (obj == null) return false;
        
        if (!(obj instanceof concretReference)) return false;
        
        boolean equal = false;
        concretReference tmp = (concretReference) obj;
        
        if (tmp.getDOI().equals(this.getDOI())) {
            if (tmp.getTitle().equals(this.getTitle())) {
                if (tmp.getYear() == this.getYear())  {
                    if (tmp.getAuthors().equals(this.getAuthors())) {
                        equal = true;
                    }
                }
            }
        }
        return equal;
    }

    /**
     * Método toString para impressão dos atributos
     * @return 
     */
    @Override
    public String toString() {
        String text = "";
        
        text += "Title: " + this.getTitle() + "\n" + "DOI: " + this.getDOI() + "\n" + "Year: " + this.getYear() + "\n";
        text += "Authors: " + Arrays.toString(this.getAuthors()) + "\n" + "Citation: " + this.getReferenceCitation(citation);
        
        return text;
    }    
}
