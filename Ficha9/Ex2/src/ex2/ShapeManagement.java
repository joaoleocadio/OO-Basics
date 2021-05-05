package ex2;

/**
 *
 * @author joaoc
 */
public class ShapeManagement {
    private final int MAX = 10;
    
    private Shape[] lista = new Shape[MAX];
    private int contShapes = 0;
    
    /**
     * Método que permite adicionar uma forma
     * @param shape
     * @return 
     */
    public boolean addShape(Shape shape) {
        if (shape == null) return false;
        
        if (contShapes >= MAX) {
            Shape[] tmp = new Shape[(MAX * 2)];
            
            for (int i = 0; i < lista.length; i++) {
                tmp[i] = lista[i];
            }
            
            lista = tmp;            
        }
        
        for (int i = 0; i < contShapes; i++) {
            if (lista[i].equals(shape)) {
                return false;
            }
        }
        
        lista[contShapes++] = shape;
        return true;
    }
    
    /**
     * Método que permite remover uma forma
     * @param shape 
     */
    public void removeShapes(Shape shape) {
        int[] positions = new int[MAX];
        int found = 0;
        
        for (int i = 0; i < contShapes; i++) {
            if (lista[i].equals(shape)) {
                positions[i] = 1;
                found++;
            }
        }
        
        if (found > 0) {
            Shape[] tmp = new Shape[MAX - found];
            int tmpPosition = 0;
            
            for (int i = 0; i < positions.length; i++) {
                if (positions[i] == 0) {
                    tmp[tmpPosition] = lista[i];
                    tmpPosition++;
                }
            }
            
            lista = tmp;
            contShapes--;
        } else {
            System.out.println("Não foi encontrado! ");
        }
    }
    
    /**
     * Método que permite listar todas as formas presentes no array
     * @return 
     */
    public String printAllShapes() {
        String text = "";
        
        for (int i = 0; i < contShapes; i++) {
            text += "####### Shape " + (i+1) + " #######" + "\n";
            text += lista[i].toString() + "\n";
        }
        
        return text;
    }
    
    /**
     * Método que permite listar todos os circulos existentes no array de formas
     * @return 
     */
    public String printCircles() {
        String text = "";
        
        for (int i = 0; i < this.contShapes; i++) {
            if (this.lista[i] instanceof Circle) {
                text += "####### Circles " + (i+1) + " #######" + "\n";
                text += lista[i].toString() + "\n";
            }
        }
        return text;
    }
    
    /**
     * Método que permite listar todos os retangulos existentes no array de formas
     * @return 
     */
    public String printRetangle() {
        String text = "";
        
        for (int i = 0; i < contShapes; i++) {
            if (this.lista[i] instanceof Rectangle) {
                text += "####### Retangles " + (i+1) + " ########" + "\n";
                text += lista[i].toString() + "\n";
            }
        }
        return text;
    }
    
    /**
     * Método que permite listar todos os Quadrados existentes no array de formas
     * @return 
     */
    public String printSquare() {
        String text = "";
        
        for (int i = 0; i < this.contShapes; i++) {
            if (this.lista[i] instanceof Square) {
                text += "####### Squares " + (i+1) + " ########" + "\n";
                text += lista[i].toString() + "\n";
            }
        }
        return text;
    }  
}
