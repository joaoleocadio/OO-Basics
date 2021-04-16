package ficha7;

import enums.Material;
import enums.Travoes;

/**
 *
 * @author joaoc
 */
public class Bike {
    private static int nextId = 0;
    
    private int id;
    private int numberOfGears;
    private String color;
    private float wheelSize;
    private Travoes travoes;
    private Material material;
    private float price;
    private int guarantee;

    public Bike(int numberOfGears, String color, float wheelSize, Travoes travoes, Material material, float price, int guarantee) {
        this.id = ++nextId;
        this.numberOfGears = numberOfGears;
        this.color = color;
        this.wheelSize = wheelSize;
        this.travoes = travoes;
        this.material = material;
        this.price = price;
        this.guarantee = guarantee;
    }

    public Bike(int numberOfGears, String color, float wheelSize, float price, int guarantee) {
        this.id = ++nextId;
        this.numberOfGears = numberOfGears;
        this.color = color;
        this.wheelSize = wheelSize;
        this.price = price;
        this.guarantee = guarantee;
        this.travoes = Travoes.HIDRAULICOS;
        this.material = Material.CARBONO;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public String getColor() {
        return color;
    }

    public float getWheelSize() {
        return wheelSize;
    }

    public Travoes getTravoes() {
        return travoes;
    }

    public Material getMaterial() {
        return material;
    }

    public float getPrice() {
        return price;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    

    @Override
    public String toString() {
         String text = "ID: " + id + "\n"
                + "Number of gears: " + numberOfGears + "\n"
                + "Cor: " + this.color + "\n"
                + "Travões: " + this.travoes.TravoesToString(travoes) + "\n"
                + "Material: " + this.material.MaterialToString(material) + "\n"
                + "Preço: " + this.price + " €" + "\n" 
                + "Garantia : " + guarantee + "\n";
        return text;
        
    }    
}
