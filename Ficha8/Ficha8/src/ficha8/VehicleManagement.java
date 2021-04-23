package ficha8;

import Trailler.Reboque;
import enums.Tipologia;
import enums.TruckType;

/**
 *
 * @author joaoc
 */
public class VehicleManagement {
    private final int MAX = 20;
    
    private Vehicle[] lista = new Vehicle[MAX];
    private int countVehicles = 0;
    
    public boolean addVehicle(Vehicle veiculo) {
        if (veiculo == null) return false;
        
        if (this.countVehicles >= MAX) {
            Vehicle[] tmp = new Vehicle[(MAX * 2)];
            
            for (int i = 0; i < this.lista.length; i++) {
                tmp[i] = lista[i];
            }
            
            lista = tmp;
        }
        
        //Verificar numero de chassis 
        for (int i = 0; i < countVehicles; i++) {
            if (lista[i].getChassis() == veiculo.getChassis()) {
                return false;
            }
        }
        //Função find em vez do for
        if (find(veiculo.getId()) != -1) return false;
        
        lista[countVehicles++] = veiculo;
        return true;
    }
    
    private int find(int id) {
        int pos = -1;
        int i = 0;
        
        while (pos == -1 && i < this.countVehicles) {
            if (id == lista[i].getId()) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }
    
    public void removeVehicle(Vehicle veiculo) {
        int[] positions = new int[MAX];
        int found = 0;
        
        if (veiculo == null) {
            System.out.println("Veículo Inválido!");
        }
        
        for (int i = 0; i < countVehicles; i++) {
            if (this.lista[i].equals(veiculo)) {
                positions[i] = 1;
                found++;
            }
        }
        
        if (found > 0) {
            Vehicle[] tmp = new Vehicle[MAX - found];
            int tmpPosition = 0;
            
            for (int i = 0; i < positions.length; i++) {
                if (positions[i] == 0) {
                    tmp[tmpPosition] = lista[i];
                    tmpPosition++;
                }
            }
            
            this.lista = tmp;
            this.countVehicles--;
            
        } else {
            System.out.println("Veículo não encontrado! ");
        }     
    }
    
    public void removeVehicle(int id) {
        int[] positions = new int[MAX];
        int found = 0;
        
        for (int i = 0; i < countVehicles; i++) {
            if (this.lista[i].getId() == id) {
                positions[i] = 1;
                found++;
            }
        }
        
        if (found > 0) {
            Vehicle[] tmp = new Vehicle[MAX - found];
            int tmpPosition = 0;
            
            for (int i = 0; i < positions.length; i++) {
                if (positions[i] == 0) {
                    tmp[tmpPosition] = lista[i];
                    tmpPosition++;
                }
            }
            
            this.lista = tmp;
            this.countVehicles--;
        } else {
            System.out.println("Não foi encontrado! ");
        }
    }
    
    public void editPrice(Vehicle veiculo, int price) {
        int found = 0;
        
        if (veiculo == null) {
            System.out.println("Veículo Inválido! ");
        }
        
        if (price == -1) {
            System.out.println("Preço Inválido! ");
        }
        
        for (int i = 0; i < countVehicles; i++) {
            if (lista[i].equals(veiculo)) {
                lista[i].setPrice(price);
                found++;
                break;
            }
        }
        
        if (found > 0) {
            System.out.println("Preço alterado com sucesso! ");
        } else {
            System.out.println("Impossível atualizar o preço!");
        }
    }
    
    public String printAutomoveis() {
        String text = "";
        
        for (int i = 0; i < countVehicles; i++) {
            if (this.lista[i] instanceof Automovel) {
                text += "####### Automóveis " + (i+1) + " #######" + "\n";
                text += lista[i].toString() + "\n";
            }
        }
        return text;       
    }
    
    public String printPesados() {
        String text = "";
        
        for (int i = 0; i < countVehicles; i++) {
            if (this.lista[i] instanceof Pesado) {
                text += "####### Pesados " + (i+1) + " #######" + "\n";
                text += lista[i].toString() + "\n";
            }
        }
        return text;       
    }
    
    public String printMotociclos() {
        String text = "";
        
        for (int i = 0; i < countVehicles; i++) {
            if (this.lista[i] instanceof Motociclo) {
                text += "####### Motociclo " + (i+1) + " #######" + "\n";
                text += lista[i].toString() + "\n";
            }
        }
        return text;       
    }

    public String printAllVehicles() {
        String text = "";
        
        for (int i = 0; i < countVehicles; i++) {
            text += "####### Vehicle " + (i+1) + " #######" + "\n";
            text += lista[i].toString() + "\n";
        }
        
        return text;
    }  
    
    public String contForTipo(TruckType tipo) {
        int cont = 0;
        String text = "";
              
        for (int i = 0; i < countVehicles; i++) {   
            if (lista[i] instanceof Pesado) {
                Pesado tmp = (Pesado) lista[i];
                if (tmp.getTipo().equals(tipo)) {
                    cont++;
                    text += "****** Camiões do tipo " + tipo.toString() + " ****** " + "\n";
                    text += "****** Informação " + " ****** " + "\n";
                    text += lista[i].toString() + "\n";
                }                       
            }
        }
        return "Nº total de camiões: " + cont + "\n" + text;
    }
}
