package ficha7;

import enums.Material;
import enums.Suspensao;
import enums.Travoes;
import enums.Utensilios;

/**
 *
 * @author joaoc
 */
public class MontainBike extends Bike {
    
    private static final int MAX = 5;
    
    private int numberOfLights;
    private Suspensao suspensao;
    private Utensilios[] utensilos;
    private int contTools = 0;

    public MontainBike(int numberOfLights, Suspensao suspensao, int numberOfGears, String color, float wheelSize, Travoes travoes, Material material, float price, int guarantee) {
        super(numberOfGears, color, wheelSize, travoes, material, price, guarantee);
        this.numberOfLights = numberOfLights;
        this.suspensao = suspensao;
        this.utensilos = new Utensilios[MAX];
    }

    
    public boolean addTool(Utensilios tool) {
        if (tool == null) return false;
        
        if (contTools == MAX) return false;
        
        for (int i = 0; i < contTools; i++) {
            if (utensilos[i].equals(tool)) {
                return false;
            }
        }
        
        utensilos[contTools++] = tool;
        
        return true;
    }
    
    public void removeTool(Utensilios tool) {
        int[] positions = new int[MAX];
        int found = 0;
        
        for (int i = 0; i < contTools; i++) {
            if (utensilos[i].equals(tool)) {
                positions[i] = 1;
                found++;
            }
        }
        
        if (found > 0) {
            Utensilios[] tmp = new Utensilios[MAX - found];
            int tmpPosition = 0;
            
            for (int i = 0; i < positions.length; i++) {
                if (positions[i] == 0) {
                    tmp[tmpPosition] = utensilos[i];
                    tmpPosition++;
                }
            }
            
            this.utensilos = tmp;
            this.contTools--;
        } else {
            System.out.println("Não foi encontrado!");
        }
    }
    
    // tentar fazer com for each
    public void editTools(Utensilios tool, Utensilios editar) {
        int found = 0;
        
        if (tool == null || editar == null) {
            System.out.println("Utensilios inválidos!");
        }
        
        for (int i = 0; i < contTools; i++) {
            if (utensilos[i].equals(tool)) {
                utensilos[i] = editar;
                found++;
                break;
            }
        }
        
        if (found > 0) {
            System.out.println("Foi alterado com sucesso!");
        } else {
            System.out.println("Não foi encontrado!");
        }
    }
    
    public String printTool() {
        String text = "";
        
        for (Utensilios utensilios : utensilos) {
            if(utensilios != null) {
                text += utensilios.UtensiliosToString(utensilios) + "\n";
            }
        }
        
        return text;
    }

    @Override
    public String toString() {
        String text = "";
        text += super.toString();
        text += "numberOfLights: " + numberOfLights + "\n" + "suspensao: " + this.suspensao;
        
        return text;
    }
    
    
    
}
