package org.example;

import java.util.List;

public class Bodega {
    private String coordenadasUbicacion;
    private String descripcion;
    private String historia;
    private String nombre;

    //Revisar que es periodoActualizacion? Si es un int, un date o que es
    private int periodoActualizacion;
    private Region region;
    private List<NovedadEvento> novedad;

    public Bodega(String coordenadasUbicacion, String descripcion, String historia, String nombre, int periodoActualizacion, Region region, List<NovedadEvento> novedad) {
        this.coordenadasUbicacion = coordenadasUbicacion;
        this.descripcion = descripcion;
        this.historia = historia;
        this.nombre = nombre;
        this.periodoActualizacion = periodoActualizacion;
        this.region = region;
        this.novedad = novedad;
    }

    public String getCoordenadasUbicacion() {
        return coordenadasUbicacion;
    }

    public void setCoordenadasUbicacion(String coordenadasUbicacion) {
        this.coordenadasUbicacion = coordenadasUbicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeriodoActualizacion() {
        return periodoActualizacion;
    }

    public void setPeriodoActualizacion(int periodoActualizacion) {
        this.periodoActualizacion = periodoActualizacion;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public List<NovedadEvento> getNovedad() {
        return novedad;
    }

    public void setNovedad(List<NovedadEvento> novedad) {
        this.novedad = novedad;
    }

    public Region buscarRegionYPais() {
        return region;
    }
}
