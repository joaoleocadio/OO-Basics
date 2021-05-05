package ex2;

/**
 *
 * @author joaoc
 */
public class Square extends Shape{
    
    protected double width = 1.0;

    public Square(boolean filled) {
        super(filled);
    }

    public Square(String color, boolean filled) {
        super(color, filled);
    }
    
    public Square(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }
    
    public Square(boolean filled, double width) {
        super(filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    
    
    /**
     * Método reescrito para o área (deriva da superclasse) 
     * @return 
     */
    @Override
    public double getArea() {
        double area = 0;
        
        area = getWidth() * getWidth();
        
        return area;
    }

    /**
     * Método reescrito para o perímetro (deriva da superclasse)
     * @return 
     */
    @Override
    public double getPerimeter() {
        double perimetro = 0;
        
        perimetro = 4 * getWidth();
        
        return perimetro;
    }

    /**
     * Método toString()
     * @return 
     */
    @Override
    public String toString() {
        String text = "";
        
        text += super.toString() + "Largura: " + this.width + "\n";
        text += "Area: " + getArea() + "\n" + "Perimetro: " + this.getPerimeter() + "\n";
        
        return text;
    }

    /**
     * Método equals
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
        Square tmp = (Square) obj;
        
        if (tmp.getColor() == this.color) {
            if (tmp.getWidth() == this.width) {
                if (tmp.isFilled() == this.filled) {
                    equal = true;
                }
            }
        } 
        return equal;
    }
    
    
    
}
