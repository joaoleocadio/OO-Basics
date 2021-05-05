package ex2;

import java.util.Objects;

/**
 *
 * @author joaoc
 */
public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    /**
     * Método abstrato para o cálculo da área
     * Terá que ser obrigatoriamente implementado nas sub-classes
     * @return 
     */
    public abstract double getArea();
    
    /**
     * Método abstrato para o cálculo do perímetro
     * Terá que ser obrigatoriamente implementado nas sub-classes
     * @return 
     */
    public abstract double getPerimeter();

    /**
     * Método toString()
     * @return 
     */
    @Override
    public String toString() {
        String text = "";
        
        text += "Color: " + this.color + "\n" + "Filled: " + this.filled + "\n";        
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
        Shape tmp = (Shape) obj;

        if (tmp.getColor() == this.color) {
            if (tmp.isFilled() == this.filled) {
                equal = true;
            }
        }
        return equal;
    }  
}
