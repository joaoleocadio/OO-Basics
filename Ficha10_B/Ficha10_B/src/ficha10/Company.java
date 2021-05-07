package ficha10;

/**
 *
 * @author joaoc
 */
public abstract class Company {
    /**
     * Nome da Empresa
     */
    private String name;
    /**
     * Vat Number
     */
    private int vatNumber;

    /**
     * Construtor para uma empresa
     * @param name
     * @param vatNumber 
     */
    public Company(String name, int vatNumber) {
        this.name = name;
        this.vatNumber = vatNumber;
    }

    /**
     * Getter para o nome de uma empresa
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Setter para o nome da empresa
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter para o vatNumber
     * @return 
     */
    public int getVatNumber() {
        return vatNumber;
    }

    /**
     * Setter para o vatNumber
     * @param vatNumber 
     */
    public void setVatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }

    /**
     * Método toString()
     * @return 
     */
    @Override
    public String toString() {
        String text = "";
        
        text += "Nome da Empresa: " + this.name + "\n" + "Contribuinte: " + this.vatNumber + "\n";
        
        return text;
    }  
}