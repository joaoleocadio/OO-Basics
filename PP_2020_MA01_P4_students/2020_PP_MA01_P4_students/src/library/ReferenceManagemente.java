package library;

import java.util.Arrays;
import java.util.Locale;

/**
 *
 * @author joaoc
 */
public class ReferenceManagemente implements Library{
    private static final int MAX = 10;
    private Reference[] lista;
    private int cont;

    /**
     * Método construtor
     */
    public ReferenceManagemente() {
        this.lista = new Reference[MAX];
        this.cont = 0;
    }  
 
    /**
     * Método que permite redefinir o tamanho do array de referências bibliográficas
     * sendo que todas as referências bibliográficas previamente adicionadas são descartadas
     * @param size 
     */
    @Override
    public void reset(int size) {
        this.lista = new Reference[size];
        this.cont = 0;
    }

    /**
     * Método que permite adicionar uma referencia bibliográfica
     * @param reference
     * @return 
     */
    @Override
    public int add(Reference reference) {
        if (cont >= MAX) return -1;
        
        for (int i = 0; i < cont; i++) {
            if (lista[i].getDOI().equals(reference)) {
                return 0;
            }
        }
        
        lista[cont++] = reference;
        return 1;
    }   

    /**
     * Método que retorna o número de referências bibliográficas de um dado autor
     * @param author
     * @return 
     */
    @Override
    public int getNumberOfReferencesByAuthor(String author) {      
        int num = 0;
        
        for (int i = 0; i < this.cont; i++) {
            if (lista[i].getAuthors() != null) {
                String[] tmp = this.lista[i].getAuthors();
                for (int j = 0; j < tmp.length; j++) {
                    if (tmp[j].equals(author)) {
                        ++num;
                        break;
                    }
                }
            }      
        }
            
        System.out.println("O author: " + author.toUpperCase(Locale.ITALY) + " tem " + num + " referencias!");
        return num;
    }

    /**
     * Método que imprime todas as referências bibliográficas de acordo com um estilo de citação (APA ou IEEE) 
     * @param citationStyle 
     */
    @Override
    public void printAll(CitationStyle citationStyle) {
        for (int i = 0; i < this.cont; i++) {
            String[] autores = this.lista[i].getAuthors();
            concretReference tmp = (concretReference) lista[i];
            
            if (tmp.getCitation().equals(citationStyle.APA))
            {
                for (int j = 0; j < autores.length - 1; j++)
                {
                    System.out.println("##### Referencia " + (j+1) + " #####" + "\n");
                    //System.out.println(lista[i].toString());
                    System.out.println(lista[i].getReferenceCitation(citationStyle)+ "-" + autores[i].toString() + "(" + lista[i].getYear() + ")" + ", " + lista[i].getDOI());
                }                    
            }
            
            if (tmp.getCitation().equals(citationStyle.IEEE)) 
            {
                for (int j = 0; j < autores.length - 1; j++) 
                {
                    System.out.println("##### Referencia " + (j+1) + " #####" + "\n");
                    System.out.println(lista[i].getReferenceCitation(citationStyle)+ "-" + autores[i].toString() + ", " + lista[i].getTitle() + ", " + lista[i].getYear());
                }              
            }
        }      
    }
    
    /**
     * Método que permite imprimir todas as referências do array
     */
    public void printAll() {
        String text = "";
        
        for (int i = 0; i < this.cont; i++) {
            System.out.println("##### Referencia " + (i+1) + " #####" + "\n");
            System.out.println(lista[i].toString());
        }      
    }   
}
