package waiting_room;

/**
 * <h2>
 * Escola Superior de Tecnologia e Gestão (ESTG)<br>
 * Politécnico do Porto (PP)<br>
 * Licenciatura em Engenharia Informática (LEI)<br>
 * Licenciatura em Segurança Informática em Redes de Computadores (LSIRC)<br>
 * Paradigmas de Programação (PP)<br>
 * 2019 / 2020<br>
 * </h2>
 * <p>
 * The <code>Registration</code> represents the patient registration in the
 * hospital (emergency service) to obtain health advice or treatment for a
 * symptom or condition.
 * </p>
 * * <p>
 * Authors:
 * </p>
 * <ul>
 * <li>@author <a href="rjs@estg.ipp.pt">Ricardo Santos</a></li>
 * <li>@author <a href="bmo@estg.ipp.pt">Bruno Oliveira</a></li>
 * <li>@author <a href="fas@estg.ipp.pt">Fábio Silva</a></li>
 * <li>@author <a href="jrmr@estg.ipp.pt">João Ramos</a></li>
 * <li>@author <a href="oao@estg.ipp.pt">Óscar Oliveira</a></li>
 * </ul>
 *
 */
public abstract class Registration {

    /**
     * The patient Social Security Number
     */
    private String ssn;

    /**
     * The patient name
     */
    private String name;

    /**
     * The registration status
     */
    private RegistrationStatus registrationStatus;

    /**
     * Creates an instance of <code>Registration</code>
     *
     * @param ssn The {@link Registration#ssn patient SSN}
     * @param name The {@link Registration#name patient name}
     * @param registrationStatus The
     * {@link Registration#registrationStatus patient status}
     *
     */
    protected Registration(String ssn, String name, RegistrationStatus registrationStatus) {
        this.setSSN(ssn);
        this.setName(name);
        this.setStatus(registrationStatus);
    }

    /**
     * Sets the attribute {@link Registration#ssn SSN}.
     *
     * @param ssn The {@link Registration#ssn patient ssn}
     *
     */
    private void setSSN(String ssn) {
        this.ssn = ssn;
    }

    /**
     * Sets the attribute {@link Registration#name patient name}.
     *
     * @param name The {@link Registration#name patient name}
     *
     */
    private void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the attribute
     * {@link Registration#registrationStatus patient status}.
     *
     * @param status The {@link Registration#registrationStatus patient status}
     *
     */
    protected final void setStatus(RegistrationStatus status) {
        this.registrationStatus = status;
    }

    /**
     * Gets the attribute {@link Registration#ssn SSN}
     *
     * @return The {@link Registration#ssn patient SNN}
     *
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Gets the attribute {@link Registration#name patient name}
     *
     * @return The {@link Registration#name patient name}
     *
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the attribute
     * {@link Registration#registrationStatus registration status}
     *
     * @return The {@link Registration#registrationStatus registration status}
     *
     */
    public RegistrationStatus getStatus() {
        return this.registrationStatus;
    }

    /**
     * Changes the attribute registration Status. The status must be assigned
     * considering the following order: 1.
     * {@link RegistrationStatus#IN_SCREENING in screening} 2.
     * {@link RegistrationStatus#IN_ATTENDANCE in attendance} 3.
     * {@link RegistrationStatus#COMPLETE complete}
     *
     */
    public abstract void changeRegistrationStatus();

    /**
     * Indicates whether some other object is "equal to" this one, that is, if
     * the other object is an instance of <code>Registration</code> and his
     * {@link Registration#ssn ssn} is the same as this object
     *
     * @param obj The reference object with which to compare
     *
     * @return <code>true</code>if this object is "the same" as the
     * <code>obj</code>, <code>false</code> otherwise
     *
     */
    @Override
    public abstract boolean equals(Object obj);

    /**
     * Returns a string representation of the object. In general, the toString
     * method returns a string that "textually represents" this object. The
     * result should be a concise but informative representation that is easy
     * for a person to read
     *
     * @return A string representation of the object
     *
     */
    @Override
    public abstract String toString();

}
