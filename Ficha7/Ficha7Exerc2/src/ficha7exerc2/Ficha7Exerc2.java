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
        SchoolManagement sc = new SchoolManagement();
        
        Professor joao = new Professor("JECL", Contrato.INTEGRAL, "João Leocádio", "20/08/1998", "Rua central da gateira, nº 733", 15633, 280155);
        
        UnidadeCurricular pp = new UnidadeCurricular("Paradigmas de programação", "PP", "Engenharia Informática", 1, 2);
        UnidadeCurricular mc1 = new UnidadeCurricular("Matematica", "MC1", "Engenharia Informática", 1, 2);
        UnidadeCurricular sio = new UnidadeCurricular("Sistemas de Informação", "SIO", "Engenharia Informática", 3, 2);
        UnidadeCurricular ng = new UnidadeCurricular("Gestão", "NG", "Engenharia Informática", 3, 2);
        
        Aluno aluno1 = new Aluno("José", "12/12/2012", "Rua x", 1020, 2410);
        Aluno aluno2 = new Aluno("Tiago", "30/04/2011", "Travessa X", 1470, 3650);
        
        Funcionario func1 = new Funcionario(Contrato.PARCIAL, "Maria", "16/07/1974", "Rua central x", 4150, 1417);
        Funcionario func2 = new Funcionario(Contrato.INTEGRAL, "Olga", "20/04/1980", "reua x", 41540, 57450);
        
        joao.addUC(mc1);
        joao.addUC(pp);
        joao.addUC(sio);
        joao.editUcs(pp, ng);
        
        sc.addPeople(aluno1);
        sc.addPeople(aluno2);
        sc.addPeople(joao);
        sc.addPeople(func1);
        sc.addPeople(func2);


        System.out.println(sc.printFuncionario());
    }   
}
