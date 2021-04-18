package ficha7exerc2;

import enums.Contrato;

/**
 *
 * @author joaoc
 */
public class Funcionario extends Pessoa{
    private static int nextId = 0;
    
    private int id;
    private Contrato contrato;

    public Funcionario(Contrato contrato, String nome, String dataNasc, String morada, int CC, int NIF) {
        super(nome, dataNasc, morada, CC, NIF);
        this.contrato = contrato;
        this.id = ++nextId;
    }

    public int getId() {
        return id;
    }

    public Contrato getContrato() {
        return contrato;
    }

    @Override
    public String toString() {
        String text = "";
        text += "Id: " + id + "\n" + "Contrato: " + contrato + "\n";
        text += super.toString();
        return text;
    }
    
    
}
