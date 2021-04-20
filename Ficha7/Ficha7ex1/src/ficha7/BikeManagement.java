package ficha7;

/**
 *
 * @author joaoc
 */
public class BikeManagement {
    private final int MAX_BIKES = 10;
    
    private Bike[] lista = new Bike[MAX_BIKES];
    private int countBikes = 0;
    
    /**
     * Método que permite adicionar bikes à lista
     * @param bike
     * @return true
     */
    public boolean addBike(Bike bike) {
        if (bike == null) return false;
        
        //Quando o array esta cheio duplica o seu tamanho automaticamente
        if (countBikes >= MAX_BIKES) {
            Bike[] tmp = new Bike[(MAX_BIKES * 2)];
            
            for (int i = 0; i < this.lista.length; i++) {
                tmp[i] = this.lista[i];
            }
            
            lista = tmp;
        }
        
        //Verificar se a bicicleta ja existe no array
        for (int i = 0; i < countBikes; i++) {
            if (lista[i].equals(bike)) {
                return false;
            }
        }
        
        lista[countBikes++] = bike;
        return true;
    }
    
    /**
     * Método que permite remover bikes da lista
     * @param bike
     */
    public void removeBike(Bike bike) {
        int[] positions = new int[MAX_BIKES];
        int found = 0;
        
        for (int i = 0; i < countBikes; i++) {
            if (lista[i].equals(bike)) {
                positions[i] = 1;
                found++;
            }
        }
        
        if (found > 0) {
            Bike[] tmp = new Bike[MAX_BIKES - found];
            int tmpPosition = 0;
            
            for (int i = 0; i < positions.length; i++) {
                if (positions[i] == 0) {
                    tmp[tmpPosition] = lista[i];
                    tmpPosition++;
                }
            }
            
            this.lista = tmp;
            this.countBikes--;
        } else {
            System.out.println("Não foi encontrado! ");
        }
    }
    
    /**
     * Método que permite remover bikes da lista por id
     * @param id
     */
    public void removeBike(int id) {
        int[] positions = new int[MAX_BIKES];
        int found = 0;
        
        for (int i = 0; i < countBikes; i++) {
            if (lista[i].getId() == id) {
                positions[i] = 1;
                found++;
            }
        }
        
        if (found > 0) {
            Bike[] tmp = new Bike[MAX_BIKES - found];
            int tmpPosition = 0;
            
            for (int i = 0; i < positions.length; i++) {
                if (positions[i] == 0) {
                    tmp[tmpPosition] = lista[i];
                    tmpPosition++;
                }
            }
            
            this.lista = tmp;
            this.countBikes--;
        } else {
            System.out.println("Não foi encontrado! ");
        }
    }
    
    /**
     * Método que permite alterar o preço de uma determinada bike
     * @param bike
     * @param price
     */
    public void editPrice(Bike bike, float price) {
        int found = 0;
        
        if (bike == null) {
            System.out.println("Bike inválida! ");
        }
        
        for (int i = 0; i < this.countBikes; i++) {
            if (this.lista[i].equals(bike)) {
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
    
    /**
     * Método que permite procurar bikes por cores
     * @param cor
     * @return text
     */
    public String searchColor(String cor) {
        String text = "";
        
        for (int i = 0; i < countBikes; i++) {
            if (this.lista[i].getColor().equals(cor)) {
                text += "###### Bicicletas de cor " + cor.toUpperCase() + " ######\n";
                text += lista[i].toString() + "\n";
            }
        }
        return text;
    }
    
    /**
     * Método que permite imprimir todas as bikes de montanha
     * @return text
     */
    public String printMountainBike() {
        String text = "";
        
        for (int i = 0; i < countBikes; i++) {
            if (this.lista[i] instanceof MontainBike) {
                text += "****** Mountain Bikes " + (i+1) + " ****** " + "\n";
                text += lista[i].toString() + "\n";
            }
        }
        return text;
    }
    
    /**
     * Método que permite imprimir todas as bikes de estrada
     * @return
     */
    public String printRoadBike() {
        String text = "";
        
        for (int i = 0; i < countBikes; i++) {
            if (this.lista[i] instanceof RoadBike) {
                text += "****** Road Bikes " + (i+1) + " ****** " + "\n";
                text += lista[i].toString() + "\n";
            }
        }
        return text;
    }
    
    /**
     * Método que permite imprimir todas as bikes da lista
     * @return
     */
    public String printAllBikes() {
        String text = "";
        
        for (int i = 0; i < countBikes; i++) 
        {
            text += "****** Bike " + (i+1) + " ****** " + "\n"; 
            text += lista[i].toString() + "\n";
        }
        
        return text;
    }
}
