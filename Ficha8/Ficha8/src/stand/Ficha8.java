package stand;

import Trailler.Reboque;
import Trailler.SemiReboque;
import enums.Condicao;
import enums.Origem;
import enums.Tipologia;
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
        
        SemiReboque smr1 = new SemiReboque(2, 3, 3000);
        
        Reboque r1 = new Reboque(Tipologia.BASCULANTE, 2, 1000);
        
        Automovel bmw = new Automovel(5, 5, 2, "BMW", "X30", "20/01/2019", Origem.NACIONAL, 1000, Condicao.USADO, 26000);
        Automovel car2 = new Automovel(2, 3, 2, "Peugeot", "106", "02/06/1998", Origem.NACIONAL, 299501, Condicao.USADO, 800);
        
        Motociclo jawa = new Motociclo(1500, 0.70f, 1, "Jawa", "X", "30/01/1987", Origem.NACIONAL, 18000, Condicao.USADO, 10000);
        Motociclo casal = new Motociclo(50, 1.70f, 0, "Casal", "2", "01/01/1947", Origem.NACIONAL, 100000, Condicao.USADO, 100);
        
        Pesado mazda = new Pesado(7, 2500, TruckType.TIR, smr1, 3, "Mazda", "X", "20/08/1998", Origem.IMPORTADO, 1800000, Condicao.NOVO, 150000);
        Pesado iveco = new Pesado(10, 3000, TruckType.TIR, r1, 9, "Iveco", "A", "01/01/2021", Origem.NACIONAL, 0, Condicao.USADO, 200000);
        

        stand.addVehicle((Vehicle) bmw);
        stand.addVehicle((Vehicle) mazda);
        stand.addVehicle((Vehicle) jawa);
        stand.addVehicle(car2);
        stand.addVehicle(iveco);
        stand.addVehicle((Vehicle) casal);

        stand.editPrice(iveco, 250000);
        System.out.println(stand.printPesados());
    }
    
}
