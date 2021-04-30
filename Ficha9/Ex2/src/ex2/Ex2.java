
package ex2;

/**
 *
 * @author joaoc
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeManagement lista = new ShapeManagement();
        
        Circle c1 = new Circle(true, 2.0, "Vermelho");
        
        Square s1 = new Square("Verde", true, 3.0);
        
        Rectangle r1 = new Rectangle("Azul", true, 5.0);
        
        lista.addShape(c1);
        lista.addShape(s1);
        lista.addShape(r1);
        lista.addShape(s1);
        System.out.println(lista.printRetangle());
    }
    
}
