package ficha7;

import enums.Material;
import enums.Travoes;

/**
 *
 * @author joaoc
 */
public class RoadBike extends Bike {
    
    private static final int MAX = 50;
    
    private boolean handlebelt;
    private float frameSize;
    private String[] observations = new String[MAX];
    private int countObs = 0;

    public RoadBike(boolean handlebelt, float frameSize, int numberOfGears, String color, float wheelSize, Travoes travoes, Material material, float price, int guarantee) {
        super(numberOfGears, color, wheelSize, travoes, material, price, guarantee);
        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
        this.observations = new String[MAX];

    }

    public RoadBike(boolean handlebelt, float frameSize, int numberOfGears, String color, float wheelSize, float price, int guarantee) {
        super(numberOfGears, color, wheelSize, price, guarantee);
        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
        this.observations = new String[MAX];
    }

    public boolean addObservation(String text) {
        if (text == null) return false;
        
        if (countObs == MAX) return false;
        
        if (text.length() <= MAX) {
            this.observations[countObs++] = text;
        } else {
            this.observations[countObs++] = text.substring(0, MAX);
        }
        
        return true;
    }
    
    public void removeObs(String text) {
        int[] positions = new int[MAX];
        int found = 0;
        
        for (int i = 0; i < countObs; i++) {
            if (this.observations[i].equals(text)) {
                positions[i] = 1;
                found++;
            }
        }
        
        if (found > 0) {
            String[] tmp = new String[MAX - found];
            int tmpPosition = 0;
            
            for (int i = 0; i < positions.length; i++) {
                if (positions[i] == 0) {
                    tmp[tmpPosition] = observations[i];
                    tmpPosition++;
                }
            }
            
            this.observations = tmp;
            this.countObs--;
            
        } else {
            System.out.println("Não encontrado");
        }
    }
    
    public void editObs(String text, String editar) {
        int found = 0;
        
        if (text == null || editar == null) {
            System.out.println("Observações Inválidas! ");
        }
        
        for (int i = 0; i < this.countObs; i++) {
            if (this.observations[i].equals(text) && editar.length() <= MAX) {
                this.observations[i] = editar;
                found++;
                break;
            } else if (this.observations[i].equals(text) && editar.length() > MAX) {
                this.observations[i] = editar.substring(0, MAX);
                found++;
                break;
            }
        }
        
        if (found > 0) {
            System.out.println("Observação alterada com sucesso! ");
        } else {
            System.out.println("Observação não encontrada! ");
        }
    }
    
    public String printObs() {
        String text = "";
        
        for (int i = 0; i < this.countObs; i++) {
            text += "Observação " + (i + 1) + ": " + this.observations[i] + "\n";
        }
        return text;
    }

    @Override
    public String toString() {
        String text = "";
        text += super.toString();
        text += "handlebelt: " + handlebelt + "\n" + "FrameSize: " + frameSize + "\n";
        return text;
    }
}
