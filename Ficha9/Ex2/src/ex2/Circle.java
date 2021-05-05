package ex2;

/**
 *
 * @author joaoc
 */
public class Circle extends Shape{
    protected double radius = 1.0;

    public Circle(boolean filled) {
        super(filled);
    }

    public Circle(boolean filled, double radius) {
        super(filled);
        this.radius = radius;
    }

    public Circle(boolean filled, double radius, String color) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    } 
    
    /**
     * Método reescrito para a área (deriva da superclasse)
     * @return 
     */
    @Override
    public double getArea() {
        double area = 0.0;
        
        area = Math.PI * (getRadius() * getRadius());
        
        return area;
    }

    /**
     * Método reescrito para o perímetro (deriva da superclasse)
     * @return 
     */
    @Override
    public double getPerimeter() {
        double perimetro = 0.0;
        
        perimetro = 2 * Math.PI * getRadius();
        
        return perimetro;
    }

    /**
     * Método toString()
     * @return 
     */
    @Override
    public String toString() {
        String text = "";
        
        text += super.toString() + "Raio: " + this.radius + "\n";
        text += "Area: " + String.format("%,.2f", getArea()) + "\n" + "Perimetro: " + String.format("%,.2f", getPerimeter()) + "\n";
        
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
        Circle tmp = (Circle) obj;
        
        if (tmp.getRadius() == this.radius) {
            if (tmp.getColor() == this.color) {
                if (tmp.isFilled() == this.filled) {
                    equal = true;
                }
            }
        }
        return equal;
    }   
}