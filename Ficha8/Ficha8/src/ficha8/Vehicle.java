package ficha8;

import enums.Condicao;
import enums.Origem;
import java.util.Objects;

/**
 *
 * @author joaoc
 */
public class Vehicle {
    private static int nextId = 0;
    
    private int id;
    private int chassis;
    private String marca;
    private String modelo;
    private String dataFabrico;
    private Origem origem;
    private int numKM;
    private Condicao condicao;
    private int price;

    
    /**
     * Método construtor para um veículo
     * @param chassis
     * @param marca
     * @param modelo
     * @param dataFabrico
     * @param origem
     * @param numKM
     * @param condicao
     * @param price 
     */
    public Vehicle(int chassis, String marca, String modelo, String dataFabrico, Origem origem, int numKM, Condicao condicao, int price) {
        this.id = ++nextId;
        this.chassis = chassis;
        this.marca = marca;
        this.modelo = modelo;
        this.dataFabrico = dataFabrico;
        this.origem = origem;
        this.numKM = numKM;
        this.condicao = condicao;
        this.price = price;
    }

    /**
     * Getter para o ID
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Getter para o nº de chassis
     * @return 
     */
    public int getChassis() {
        return chassis;
    }

    /**
     * Getter para a marca
     * @return 
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Getter para o modelo
     * @return 
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Getter para a data
     * @return 
     */
    public String getDataFabrico() {
        return dataFabrico;
    }

    /**
     * Getter para o origem
     * @return 
     */
    public Origem getOrigem() {
        return origem;
    }

    /**
     * Getter para o nº de Km
     * @return 
     */
    public int getNumKM() {
        return numKM;
    }

    /**
     * Getter para a condição dos veiculos
     * @return 
     */
    public Condicao getCondicao() {
        return this.condicao;
    }

    
    /**
     * Getter para o preço
     * @return 
     */
    public int getPrice() {
        return price;
    }

    /**
     * Setter para o preço
     * @param price 
     */
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    /**
     * Método equals para comparação do objeto Vehicle
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
        if (!(obj instanceof Vehicle)) {
            return false;
        }
        
        boolean equal = false;
        Vehicle tmp = (Vehicle) obj;
        
        if (tmp.getId() == this.id) {
            if (tmp.getChassis() == this.chassis) {
                if (tmp.getCondicao().equals(this.condicao)) {
                    if (tmp.getNumKM() == this.numKM) {
                        if (tmp.getPrice() == this.price) {
                            if (tmp.getMarca().equals(this.marca)) {
                                equal = true;
                            }
                        }
                    }
                }
            }
        }

        return equal;
    }

    /**
     * Método toString()
     * @return 
     */
    @Override
    public String toString() {
        String text = "";
        
        text += "ID: " + this.id + "\n" + "Numéro Chassis: " + this.chassis + "\n" + "Marca: " + this.marca + "\n" + 
                "Modelo: " + this.modelo + "\n" + "Data de Fabrico: " + this.dataFabrico + "\n" + "KM: " + this.numKM + "\n" +
                "Condição: " + this.condicao + "\n";
        return text;
    } 
}
