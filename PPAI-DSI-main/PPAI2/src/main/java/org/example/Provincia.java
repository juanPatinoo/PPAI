package org.example;

public class Provincia {

    private String nombre;

    private static Pais pais;

    public Provincia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {Provincia.pais = pais;}

    public Pais buscarPais() {
        return pais;
    }

}