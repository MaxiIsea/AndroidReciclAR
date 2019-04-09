package com.example.unnobareciclar;

import java.sql.Time;

public class Alarmas {

    private Time hora;
    private String dias;

    public Alarmas(Time hora, String dias) {
        this.hora = hora;
        this.dias = dias;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
}
