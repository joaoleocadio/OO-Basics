package ficha9;

import enums.Habilitacoes;
import enums.TipoProgramador;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import programming.Administrativo;
import programming.GestorProjeto;
import programming.ProgramadorJava;
import programming.ProgrammingManagement;

/**
 *
 * @author joaoc
 */
public class Ficha9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        ProgrammingManagement lista = new ProgrammingManagement();
        
        GestorProjeto p1 = new GestorProjeto(1, LocalDate.ofYearDay(2010, 10), "Luís", LocalDate.ofYearDay(1974, 7), "Rua X", 1540, 415150, 900.75f);
        p1.addProjects("Aplicação Livros");
        p1.addProjects("Aplicação Flutter");
        
        GestorProjeto p2 = new GestorProjeto(3, LocalDate.ofYearDay(2010, 10), "Diogo", LocalDate.ofYearDay(1974, 7), "Rua Y", 4520, 745540, 525240);
        ProgramadorJava j1 = new ProgramadorJava(2, 4, "Angular", TipoProgramador.JÚNIOR, "João", LocalDate.of(1998, Month.AUGUST, 20), "Travessa Central", 454560, 45780, 1000.00f);
        Administrativo ad1 = new Administrativo("JCL", Habilitacoes.DOUTORAMENTO, LocalDate.of(1990, Month.MARCH, 10), "Henrique", LocalDate.of(1997, Month.APRIL, 10), "Avenida da liberdade", 750, 850, 1200.75f);
        
        lista.addPessoa(p1);
        lista.addPessoa(j1);
        lista.addPessoa(ad1);
        lista.addPessoa(p2);
 
        lista.removePessoa(2);
        System.out.println(lista.printAllPessoas());
    }
    
}
