
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

    /**
     * Getter para o número de ocupantes
     * @return 
     */
    public int getNumOcupantes() {
        return numOcupantes;
    }

    /**
     * Getter para o nº de portas
     * @return 
     */
    public int getNumPortas() {
        return numPortas;
    }

    /**
     * Método reescrito do preço
     * @return 
     */
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

    /**
     * Método toString()
     * @return 
     */
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

    /**
     * Método equals para comparação do objeto Automóvel
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
