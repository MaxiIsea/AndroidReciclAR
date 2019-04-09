package com.example.unnobareciclar;

public class Residuo {

    private String descripcion;
    private int foto;

    public Residuo(String descripcion, int foto) {
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
