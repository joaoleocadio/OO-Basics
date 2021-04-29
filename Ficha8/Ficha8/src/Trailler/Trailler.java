package Trailler;

/**
 *
 * @author joaoc
 */
public class Trailler {
    private static int nextID = 0;
    
    private int id;
    private int numEixos;
    private int capacidade;

    public Trailler(int numEixos, int capacidade) {
        this.id = ++nextID;
        this.numEixos = numEixos;
        this.capacidade = capacidade;
    }

    /**
     * Getter para o ID
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Getter para o nº de eixos
     * @return 
     */
    public int getNumEixos() {
        return numEixos;
    }

    /**
     * Getter para a capacidade
     * @return 
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * Método toString() para o trailler (super classe)
     * @return 
     */
    @Override
    public String toString() {
        String text = "";
        
        text += "ID do trailler: " + this.id + "\n" + "Nº de Eixos: " + this.numEixos + "\n" + "Capacidade: " + this.capacidade + "\n";
        
        return text;
    }

    /**
     * Método equals para a comparação do objeto trailler
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        boolean equal = false;
        Trailler temp = (Trailler) obj;
        
        if (temp.id == this.id) {
            if (temp.capacidade == this.capacidade) {
                if (temp.numEixos == this.numEixos) {
                    equal = true;
                }
            }
        }

        return equal;
    }  
}