package waiting_room;

/**
 *
 * @author joaoc
 */
public class WaitingRoomManagement implements waiting_room.WaitingRoom{
    private static final int MAX = 10;
    private final Registration[] registos;
    private int cont;

    public WaitingRoomManagement() {
        this.registos = new Registration[MAX];
        this.cont = 0;
    }
    
    
    @Override
    public Registration getRegistration(String ssn) {
        Registration r1 = null;
        for (int i = 0; i < this.cont; i++) {
            if (registos[i].getSSN().equals(ssn)) {
                r1 = registos[i];
            }
        }
        return r1;
    }

    @Override
    public int getFreeSeats() {
        int num = 0;
        
        System.out.print("Número de lugares vazios na sala de espera: ");
        num = MAX - cont;
        return num;
    }

    private int find(String ssn) {
        
        int pos = -1;
        int i = 0;
        
        while (i < cont && pos == -1) {
            if (registos[i].getSSN().equals(ssn)) {
                pos = i;
            }
            i++;
        }
        return pos;
    }
    
    @Override
    public boolean add(Registration registration) {
        if (registration == null) return false;
        
        if (cont >= MAX) return false;
        
        for (int i = 0; i < this.cont; i++) {
            if (registos[i].getSSN().equals(registration.getSSN())) {
                return false;
            }
        }
        
        registos[cont++] = registration;
        registration.setStatus(RegistrationStatus.IN_SCREENING);
        return true;
    }

    /**
     * Método que permite remover um registo
     * @param registration
     * @return 
     */
    @Override
    public boolean remove(Registration registration) {
        int pos = find(registration.getSSN());
        
        if (pos != -1) {
            for (int i = 0; i < this.cont; i++) {
                if (registos[i].getStatus().equals(RegistrationStatus.COMPLETE)) {
                    registos[i] = registos[i+1];
                }             
            }
            registos[--cont] = null;
        }
        return true;
    }

    /**
     * Método que permite pesquisar o número registos através do Status
     * @param registrationStatus
     * @return 
     */
    @Override
    public int getWithStatus(RegistrationStatus registrationStatus) {
        int count = 0;
        
        for (int i = 0; i < cont; i++) {    
            if (registos[i].getStatus().equals(registrationStatus))
            {
                count++;
            }          
        }
        
        System.out.print("Nº de registos com o status " + registrationStatus.name() + ": ");
        return count;
    }

    /**
     * Método que permite imprimir todos os registos presentes no array
     */
    @Override
    public void printAll() {
        for (int i = 0; i < cont; i++) {
            System.out.println("##### Registo nº " + (i+1) + " #####");
            System.out.println(registos[i].toString());
        }
    } 
}
