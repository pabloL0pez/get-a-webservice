package jaja;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Valor {
    
    @JsonProperty("id") private int id;
    @JsonProperty("quote") private String cita;

    public Valor() {

    }

    public Valor(int id, String cita) {
        this.id = id;
        this.cita = cita;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cita
     */
    public String getCita() {
        return cita;
    }

    /**
     * @param cita the cita to set
     */
    public void setCita(String cita) {
        this.cita = cita;
    }
}