package ficha8;

import enums.Condicao;
import enums.Origem;

/**
 *
 * @author joaoc
 */
public class Motociclo extends Vehicle{
    private int cilindrada;
    private float tamanhoRodas;

    public Motociclo(int cilindrada, float tamanhoRodas, int chassis, String marca, String modelo, String dataFabrico, Origem origem, int numKM, Condicao condicao, int price) {
        super(chassis, marca, modelo, dataFabrico, origem, numKM, condicao, price);
        this.cilindrada = cilindrada;
        this.tamanhoRodas = tamanhoRodas;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public float getTamanhoRodas() {
        return tamanhoRodas;
    }

    @Override
    public String toString() {
        String text = "";
        
        text += super.toString() + "Preço: " + this.getPrice() + " €" + "\n"; 
        text += "Cilindrada: " + this.cilindrada + "\n" + "Tamanho rodas: " + this.tamanhoRodas + "\n";
        return text;
    }
}
