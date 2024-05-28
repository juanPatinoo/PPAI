package org.example;

public class Provincia {
    private String descripcion;
    private String nombre;

    private static Pais pais;

    public Provincia(String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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