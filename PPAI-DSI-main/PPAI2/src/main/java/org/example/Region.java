package org.example;

public class Region {
    private String descripcion;
    private String nombre;

    private static Provincia provincia;

    public Region(String descripcion, String nombre) {
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

    public Provincia getProvincia() {return provincia;}

    public void setProvincia(Provincia provincia) {Region.provincia = provincia;}

    public Provincia buscarPais() {
        return provincia;
    }
}
