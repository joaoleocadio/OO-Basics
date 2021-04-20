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

    /**
     * Construtor para o bicicleta com o id a incrementar automaticamente
     * @param numberOfGears
     * @param color
     * @param wheelSize
     * @param travoes
     * @param material
     * @param price
     * @param guarantee
     */
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

    /**
     * Construtor para o bicicleta com o id a incrementar automaticamente
     * Travões hidraulicos e material carbono por omissão
     * @param numberOfGears
     * @param color
     * @param wheelSize
     * @param price
     * @param guarantee
     */
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

    /**
     * getter para o id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * getter para o numero de velocidades
     * @return numberOfGears
     */
    public int getNumberOfGears() {
        return numberOfGears;
    }

    /**
     * getter para a cor da bike
     * @return cor
     */
    public String getColor() {
        return color;
    }

    /**
     * getter para o tamanho das rodas
     * @return tamanho das rodas
     */
    public float getWheelSize() {
        return wheelSize;
    }

    /**
     * getter para os travões
     * @return travões
     */
    public Travoes getTravoes() {
        return travoes;
    }

    /**
     * getter para o material
     * @return material
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * getter para o preço
     * @return preço
     */
    public float getPrice() {
        return price;
    }

    /**
     * getter para a garantia
     * @return garantia
     */
    public int getGuarantee() {
        return guarantee;
    }

    /**
     * setter para o preço
     * @param price
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
    /**
     * Método toString para a impressão dos atributos de uma bike
     * @return
     */
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
