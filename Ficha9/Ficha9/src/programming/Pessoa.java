package programming;

import java.time.LocalDate;

/**
 *
 * @author joaoc
 */
    public abstract class Pessoa {   
    private static int nextID = 0; 
    
    private int id;
        
    private String nome;
    private LocalDate dataNascimento;
    private String morada;
    private int CC;
    private int NIF;
    private float salarioBase;
    

    public Pessoa(String nome, LocalDate dataNascimento, String morada, int CC, int NIF, float salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.morada = morada;
        this.CC = CC;
        this.NIF = NIF;
        this.salarioBase = salarioBase;
        this.id = ++nextID;
    }

    public int getId() {
        return id;
    }
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public float getSalarioBase() {
        return salarioBase;
    }      

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public abstract float salario();
   
    @Override
    public String toString() {
        String text = "";
        text += "Nome: " + this.nome + "\n" + "Data de Nascimento: " + this.dataNascimento + "\n" + "Morada: " + this.morada + "\n";
        text += "CC: " + this.CC + "\n" + "NIF: " + this.NIF + "\n" + "ID: " + this.id + "\n";
        
        return text;
    }   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        boolean equal = false;
        Pessoa tmp = (Pessoa) obj;
        
        if (tmp.getId() == this.id) {
            if (tmp.getNome() == this.nome) {
                if (tmp.getCC() == this.CC) {
                    equal = true;
                }               
            }           
        }
        
        return equal;
    }
    
    
}
