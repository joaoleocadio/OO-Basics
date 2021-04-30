package ex2;

/**
 *
 * @author joaoc
 */
public class Rectangle extends Square{
    protected double height = 1.0;

    public Rectangle(boolean filled) {
        super(filled);
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(boolean filled, double width) {
        super(filled, width);
    }

    public Rectangle(String color, boolean filled, double width) {
        super(color, filled, width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        double perimetro = 0.0;
        
        perimetro = 2 * (super.width + getHeight());
        
        return perimetro;
    }

    @Override
    public double getArea() {
        double area = 0.0;
        
        area = super.width * getHeight();
        
        return area;
    }

    @Override
    public String toString() {
        String text = "";
        
        text += super.toString() + "Height: " + getHeight() + "\n";
        
        return text;
    }

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
        Rectangle tmp = (Rectangle) obj;
        
        if (tmp.getHeight() == this.height) {
            if (tmp.getColor() == this.color) {
                if (tmp.isFilled() == this.filled) {
                    equal = true;
                }
            }
        }
        return equal;
    } 
}
