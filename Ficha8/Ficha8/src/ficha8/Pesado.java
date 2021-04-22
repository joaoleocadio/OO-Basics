package ficha8;

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
    private boolean atrelado;

    public Pesado(int comprimento, int carga, TruckType tipo, boolean atrelado, int chassis, String marca, String modelo, String dataFabrico, Origem origem, int numKM, Condicao condicao, int price) {
        super(chassis, marca, modelo, dataFabrico, origem, numKM, condicao, price);
        this.comprimento = comprimento;
        this.carga = carga;
        this.tipo = tipo;
        this.atrelado = atrelado;
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

    public boolean isAtrelado() {
        return atrelado;
    }

    @Override
    public int getPrice() {
        int preco = 0, desconto = 0;
        
        if (this.isAtrelado() && this.getCondicao().equals(Condicao.NOVO)) {
            desconto = (int) (super.getPrice() * 0.05);
            preco = (int) (super.getPrice() - desconto);
        } else if (!this.isAtrelado() && this.getCondicao().equals(Condicao.NOVO)) {
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
        text += "Comprimento: " + this.comprimento + "\n" + "Carga: " + this.carga + "\n";
        text += "Tipo: " + this.tipo + "\n" + "Atrelado: " + this.atrelado + "\n";
        return text;
    }

}
