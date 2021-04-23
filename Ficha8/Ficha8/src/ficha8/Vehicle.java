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

    public int getId() {
        return id;
    }

    public int getChassis() {
        return chassis;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDataFabrico() {
        return dataFabrico;
    }

    public Origem getOrigem() {
        return origem;
    }

    public int getNumKM() {
        return numKM;
    }

    public Condicao getCondicao() {
        return this.condicao;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

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

    @Override
    public String toString() {
        String text = "";
        
        text += "ID: " + this.id + "\n" + "Numéro Chassis: " + this.chassis + "\n" + "Marca: " + this.marca + "\n" + 
                "Modelo: " + this.modelo + "\n" + "Data de Fabrico: " + this.dataFabrico + "\n" + "KM: " + this.numKM + "\n" +
                "Condição: " + this.condicao + "\n";
        return text;
    } 
}
