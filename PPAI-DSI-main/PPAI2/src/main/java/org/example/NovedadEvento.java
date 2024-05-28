package org.example;

import java.util.Date;

public class NovedadEvento {
    private String codigoDescuentoPremium;
    private String descripcion;
    private boolean esSoloPremium;
    private Date fechaHoraEvento;
    private String nombreEvento;

    public NovedadEvento(String codigoDescuentoPremium, String descripcion, boolean esSoloPremium, Date fechaHoraEvento, String nombreEvento) {
        this.codigoDescuentoPremium = codigoDescuentoPremium;
        this.descripcion = descripcion;
        this.esSoloPremium = esSoloPremium;
        this.fechaHoraEvento = fechaHoraEvento;
        this.nombreEvento = nombreEvento;
    }

    public String getCodigoDescuentoPremium() {
        return codigoDescuentoPremium;
    }

    public void setCodigoDescuentoPremium(String codigoDescuentoPremium) {
        this.codigoDescuentoPremium = codigoDescuentoPremium;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEsSoloPremium() {
        return esSoloPremium;
    }

    public void setEsSoloPremium(boolean esSoloPremium) {
        this.esSoloPremium = esSoloPremium;
    }

    public Date getFechaHoraEvento() {
        return fechaHoraEvento;
    }

    public void setFechaHoraEvento(Date fechaHoraEvento) {
        this.fechaHoraEvento = fechaHoraEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }
}
