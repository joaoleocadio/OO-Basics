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

    public int getId() {
        return id;
    }

    public int getNumEixos() {
        return numEixos;
    }

    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        String text = "";
        
        text += "ID: " + this.id + "\n" + "Nº de Eixos: " + this.numEixos + "\n" + "Capacidade: " + this.capacidade + "\n";
        
        return text;
    }
}