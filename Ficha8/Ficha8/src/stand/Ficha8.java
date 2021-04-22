package stand;

import enums.Condicao;
import enums.Origem;
import enums.TruckType;
import ficha8.Automovel;
import ficha8.Motociclo;
import ficha8.Pesado;
import ficha8.Vehicle;
import ficha8.VehicleManagement;

/**
 *
 * @author joaoc
 */
public class Ficha8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VehicleManagement stand = new VehicleManagement();
        
        Automovel bmw = new Automovel(5, 5, 2, "BMW", "X30", "20/01/2019", Origem.NACIONAL, 1000, Condicao.USADO, 26000);
        Automovel car2 = new Automovel(2, 3, 2, "Peugeot", "106", "02/06/1998", Origem.NACIONAL, 299501, Condicao.USADO, 800);
        
        Motociclo jawa = new Motociclo(1500, 0.70f, 1, "Jawa", "X", "30/01/1987", Origem.NACIONAL, 18000, Condicao.USADO, 10000);
        
        Pesado mazda = new Pesado(7, 2500, TruckType.TIR, true, 3, "Mazda", "X", "20/08/1998", Origem.IMPORTADO, 1800000, Condicao.NOVO, 150000);
        
        stand.addVehicle((Vehicle) bmw);
        stand.addVehicle((Vehicle) mazda);
        stand.addVehicle((Vehicle) jawa);
        stand.addVehicle(car2);
        System.out.println(stand.printAutomoveis());
    }
    
}
