
package ficha8;

import enums.Condicao;
import enums.Origem;

/**
 *
 * @author joaoc
 */
public class Automovel extends Vehicle{
    private int numOcupantes;
    private int numPortas;

    public Automovel(int numOcupantes, int chassis, String marca, String modelo, String dataFabrico, Origem origem, int numKM, Condicao condicao, int price) {
        super(chassis, marca, modelo, dataFabrico, origem, numKM, condicao, price);
        this.numOcupantes = numOcupantes;
        this.numPortas = 3;
    }

    public Automovel(int numOcupantes, int numPortas, int chassis, String marca, String modelo, String dataFabrico, Origem origem, int numKM, Condicao condicao, int price) {
        super(chassis, marca, modelo, dataFabrico, origem, numKM, condicao, price);
        this.numOcupantes = numOcupantes;
        this.numPortas = numPortas;
    }  

    public int getNumOcupantes() {
        return numOcupantes;
    }

    public int getNumPortas() {
        return numPortas;
    }

    @Override
    public int getPrice() {
        int preco = 0, desconto = 0;
        
        if (this.getCondicao().equals(Condicao.NOVO)) {
            preco = this.getPrice(); 
        } else if (this.getCondicao().equals(Condicao.USADO)) {
            desconto = (int) (0.30 * super.getPrice());
            preco = (int) super.getPrice() - desconto;
        }
        
        return preco;
    }

    @Override
    public String toString() {
        String text = "";
        
        text += super.toString() + "Preço: " + this.getPrice() + " €" + "\n";
        text += "Nº de ocupantes: " + this.getNumOcupantes() + "\n" + "Nº de portas: " + this.getNumPortas() + "\n";
        
        return text;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        
        if (!(obj instanceof Automovel)) {
            return false;
        }
        
        Automovel tmpAutomovel = (Automovel) obj;
        if (!(this.getId() == tmpAutomovel.getId())) {
            return false;
        }

        return true;
    }   
}
