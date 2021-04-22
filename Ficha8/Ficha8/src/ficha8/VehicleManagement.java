package ficha8;

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
        
        //Função find em vez do for
        if (find(veiculo.getId()) != -1)return false;
        
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

    public String printAllVehicles() {
        String text = "";
        
        for (int i = 0; i < countVehicles; i++) {
            text += "####### Vehicle " + (i+1) + " #######" + "\n";
            text += lista[i].toString() + "\n";
        }
        
        return text;
    }
    
}
