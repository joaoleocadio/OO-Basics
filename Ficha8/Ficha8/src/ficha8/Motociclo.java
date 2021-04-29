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

    /**
     * Getter para a colindrada de um motociclo
     * @return 
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * Getter para o tamanho das rodas
     * @return 
     */
    public float getTamanhoRodas() {
        return tamanhoRodas;
    }

    /**
     * Método toString() para a impressão de um motociclo 
     * @return 
     */
    @Override
    public String toString() {
        String text = "";
        
        text += super.toString() + "Preço: " + super.getPrice() + " €" + "\n"; 
        text += "Cilindrada: " + this.cilindrada + "\n" + "Tamanho rodas: " + this.tamanhoRodas + "\n";
        return text;
    }

    /**
     * Método equals para comparação do objeto Motociclo
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
        if (!(obj instanceof Motociclo)) {
            return false;
        }
        
        boolean equal = false;
        Motociclo tmp = (Motociclo) obj;
        if (tmp.getId() == this.getId()) {
            if (tmp.getCilindrada() == this.cilindrada) {
                if (tmp.getTamanhoRodas() == this.tamanhoRodas) {
                    equal = true;
                }
            }
        }
        return equal;
    } 
}
