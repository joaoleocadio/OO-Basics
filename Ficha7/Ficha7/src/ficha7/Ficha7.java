package ficha7;

import enums.Material;
import enums.Suspensao;
import enums.Travoes;
import enums.Utensilios;

/**
 *
 * @author joaoc
 */
public class Ficha7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BikeManagement stand = new BikeManagement();
        
        MontainBike bike1 = new MontainBike(4, Suspensao.DUPLA, 10, "Azul", 0.35f, Travoes.PINÇAS, Material.CARBONO, 259.10f, 2);
        MontainBike bike2 = new MontainBike(1, Suspensao.SIMPLES, 7, "Branca", 0.85f, Travoes.HIDRAULICOS, Material.ALUMÍNIO, 160.99f, 2);
        
        RoadBike bike3 = new RoadBike(true, 3.52f, 8, "Verde", 1.34f, 167.56f, 2);
        RoadBike bike4 = new RoadBike(true, 0.25f, 7, "Lilás", 1.23f, Travoes.PINÇAS, Material.ALUMÍNIO, 99.21f, 2);
        RoadBike bike5 = new RoadBike(true, 3.52f, 8, "Verde", 1.34f, 167.56f, 2);
        RoadBike bike6 = new RoadBike(true, 3.52f, 8, "Verde", 1.34f, 167.56f, 2);
        RoadBike bike7 = new RoadBike(true, 3.52f, 8, "Verde", 1.34f, 167.56f, 2);
        RoadBike bike8 = new RoadBike(true, 3.52f, 8, "Verde", 1.34f, 167.56f, 2);
        RoadBike bike9 = new RoadBike(true, 3.52f, 8, "Verde", 1.34f, 167.56f, 2);
        RoadBike bike10 = new RoadBike(true, 3.52f, 8, "Verde", 1.34f, 167.56f, 2);
        RoadBike bike11 = new RoadBike(true, 3.52f, 8, "Verde", 1.34f, 167.56f, 2);
        RoadBike bike12 = new RoadBike(true, 3.52f, 8, "Verde", 1.34f, 167.56f, 2);

        
        
        bike3.addObservation("Seguir indicações de construção!");
        
        stand.addBike((Bike) bike1);
        stand.addBike((Bike) bike2);
        stand.addBike((Bike) bike3);
        stand.addBike((Bike) bike4);
        stand.addBike((Bike) bike5);
        stand.addBike((Bike) bike6);
        stand.addBike((Bike) bike7);
        stand.addBike((Bike) bike8);
        stand.addBike((Bike) bike9);
        stand.addBike((Bike) bike10);
        stand.addBike((Bike) bike11);
        stand.addBike((Bike) bike12);
        
        System.out.println(stand.printRoadBike());
        
        /*
        bike1.addTool(Utensilios.ALFORJE);
        bike1.addTool(Utensilios.CONTA_KM);
        bike1.addTool(Utensilios.KIT_PNEU);       
        bike1.editTools(Utensilios.ALFORJE, Utensilios.SUPORTE_TLM);
        //System.out.println(bike1.printTool());
        System.out.println(bike1.toString());
        System.out.println(bike2.toString());*/
    } 
}
