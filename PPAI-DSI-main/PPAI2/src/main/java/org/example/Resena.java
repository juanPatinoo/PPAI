package org.example;

import java.util.Date;

public class Resena {
    private String comentario;
    private boolean esPremium;
    private Date fechaResena;
    private double puntaje;

    private Vino vino;

    public Resena(String comentario, boolean esPremium, Date fechaResena, double puntaje, Vino vino) {
        this.comentario = comentario;
        this.esPremium = esPremium;
        this.fechaResena = fechaResena;
        this.puntaje = puntaje;
        this.vino = vino;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean isEsPremium() {
        return esPremium;
    }

    public void setEsPremium(boolean esPremium) {
        this.esPremium = esPremium;
    }

    public Date getFechaResena() {
        return fechaResena;
    }

    public void setFechaResena(Date fechaResena) {
        this.fechaResena = fechaResena;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public Vino getVino() {
        return vino;
    }

    public void setVino(Vino vino) {
        this.vino = vino;
    }

    public boolean sosDePeriodo(Date fechaDesde, Date fechaHasta) {
        // Comprobar si this.fechaResena está en el rango [fechaDesde, fechaHasta]
        return !this.fechaResena.before(fechaDesde) && !this.fechaResena.after(fechaHasta);
    }

    public boolean sosSommelierVerificado() {
        return this.esPremium;
    }
}
