package ficha7exerc2;

import enums.Contrato;

/**
 *
 * @author joaoc
 */
public class Ficha7Exerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professor joao = new Professor("JECL", Contrato.INTEGRAL, "João Leocádio", "20/08/1998", "Rua central da gateira, nº 733", 15633, 280155);
        
        UnidadeCurricular pp = new UnidadeCurricular("Paradigmas de programação", "PP", "Engenharia Informática", 1, 2);
        UnidadeCurricular mc1 = new UnidadeCurricular("Matematica", "MC1", "Engenharia Informática", 1, 2);
        
        Aluno aluno1 = new Aluno("José", "12/12/2012", "Rua x", 1020, 2410);
        Aluno aluno2 = new Aluno("Tiago", "30/04/2011", "Travessa X", 1470, 3650);
        
        Funcionario func1 = new Funcionario(Contrato.PARCIAL, "Maria", "16/07/1974", "Rua central x", 4150, 1417);
        
        aluno1.addUcs(pp);
        aluno1.addUcs(mc1);
        
        joao.addUC(pp);
        joao.addUC(mc1);
        joao.removeUcs(pp);
        System.out.println(aluno2.toString());
        System.out.println(func1.toString());
    }
    
}
