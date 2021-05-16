package waiting_room;

/**
 *
 * @author joaoc
 */
public class concretRegistration extends Registration{

    /**
     *
     * @param ssn
     * @param name
     * @param registrationStatus
     */
    public concretRegistration(String ssn, String name) {
        super(ssn, name, RegistrationStatus.IN_SCREENING);
    }

    /**
     * Método que permite alterar o status do registo do paciente
     * tendo em consideração o status atual
     */
    @Override
    public void changeRegistrationStatus() {
        if (this.getStatus().equals(RegistrationStatus.IN_SCREENING)) {
            setStatus(RegistrationStatus.IN_ATTENDANCE);
        } else if (this.getStatus().equals(RegistrationStatus.IN_ATTENDANCE)) {
            setStatus(RegistrationStatus.COMPLETE);
        }
    }

    /**
     * Método equals para a comparação de objetos
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        if (obj == null) return false;
        
        if (!(obj instanceof concretRegistration)) return false;
        
        boolean equal = false;
        concretRegistration temp = (concretRegistration) obj;
        
        if (temp.getName() == this.getName()) {
            if (temp.getSSN() == this.getSSN()) {
                if (temp.getStatus().equals(this.getStatus())){
                    equal = true;
                }
            }
        }
        
        return equal;
    }
    
    /**
     * Método toString para impressão dos atributos da classe
     * @return
     */
    @Override
    public String toString() {
        String text = "";
        
        text += "SSN: " + this.getSSN() + "\n" + "Name: " + this.getName()+ "\n" + "Status: " + this.getStatus() + "\n";
        
        return text;
    } 
}
