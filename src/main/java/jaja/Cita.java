package jaja;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cita {
    
    @JsonProperty("type") private String tipo;
    @JsonProperty("value") private Valor valor;

    public Cita() {

    }

    public Cita(String tipo, Valor valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the valor
     */
    public Valor getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Valor valor) {
        this.valor = valor;
    }

}