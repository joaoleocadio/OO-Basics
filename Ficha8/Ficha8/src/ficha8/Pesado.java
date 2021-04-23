package ficha8;

import Trailler.Trailler;
import enums.Condicao;
import enums.Origem;
import enums.TruckType;

/**
 *
 * @author joaoc
 */
public class Pesado extends Vehicle{
    private int comprimento;
    private int carga;
    private TruckType tipo;
    private Trailler atrelado;

    public Pesado(int comprimento, int carga, TruckType tipo, Trailler atrelado, int chassis, String marca, String modelo, String dataFabrico, Origem origem, int numKM, Condicao condicao, int price) {
        super(chassis, marca, modelo, dataFabrico, origem, numKM, condicao, price);
        this.comprimento = comprimento;
        this.carga = carga;
        this.tipo = tipo;
        this.atrelado = atrelado;
    }

    public Pesado(int comprimento, int carga, TruckType tipo, int chassis, String marca, String modelo, String dataFabrico, Origem origem, int numKM, Condicao condicao, int price) {
        super(chassis, marca, modelo, dataFabrico, origem, numKM, condicao, price);
        this.comprimento = comprimento;
        this.carga = carga;
        this.tipo = tipo;
        this.atrelado = null;
    }
    
    

    public int getComprimento() {
        return comprimento;
    }

    public int getCarga() {
        return carga;
    }

    public TruckType getTipo() {
        return tipo;
    }

    public Trailler getAtrelado() {
        return atrelado;
    }

    
    @Override
    public int getPrice() {
        int preco = 0, desconto = 0;
        
        if ((this.getAtrelado() != null) && this.getCondicao().equals(Condicao.NOVO)) {
            desconto = (int) (super.getPrice() * 0.05);
            preco = (int) (super.getPrice() - desconto);
        } else if ((this.getAtrelado() == null) && this.getCondicao().equals(Condicao.NOVO)) {
            preco = super.getPrice();
        } else {
            desconto = (int) (super.getPrice() * 0.15);
            preco = (int) (super.getPrice() - desconto);
        }
        
        return preco;
    } 

    @Override
    public String toString() {
        String text = "";
        
        text += super.toString() + "Preço: " + this.getPrice() + " €" + "\n";
        text += "Comprimento: " + this.comprimento + "\n" + "Carga: " + this.carga + " kg" + "\n";
        text += "Tipo: " + this.tipo + "\n";
        return text;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!super.equals(obj)) {
            return false;
        }

        if (!(obj instanceof Pesado)) {
            return false;
        }

        boolean equal = false;
        Pesado temp = (Pesado) obj;

        if (temp.comprimento == this.comprimento) {
            if (temp.carga == this.carga) {
                if (temp.tipo.equals(this.tipo)) {
                    if (temp.atrelado.equals(this.atrelado)) {
                        equal = true;
                    }
                }
            }
        }

        return equal;
    }


}
