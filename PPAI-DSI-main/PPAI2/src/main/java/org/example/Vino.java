package org.example;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vino {
    private String nombre;
    private double precio;
    private double notaCata;
    private Date anada;
    private URI imagen;
    private Bodega bodega;
    private List<Maridaje> maridajes;
    private Varietal varietales;
    private ArrayList<Resena> resena;

    public Vino(String nombre, double precio, double notaCata, Date anada, URI imagen, Bodega bodega, List<Maridaje> maridajes, Varietal varietales, ArrayList<Resena> resena) {
        this.nombre = nombre;
        this.precio = precio;
        this.notaCata = notaCata;
        this.anada = anada;
        this.imagen = imagen;
        this.bodega = bodega;
        this.maridajes = maridajes;
        this.varietales = varietales;
        this.resena = resena;
    }

    public List<Resena> getResena() {
        return resena;
    }

    public void setResena(ArrayList<Resena> resena) {
        this.resena = resena;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public List<Maridaje> getMaridajes() {
        return maridajes;
    }

    public Varietal getVarietales() {
        return varietales;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    public void setMaridajes(List<Maridaje> maridajes) {
        this.maridajes = maridajes;
    }

    public void setVarietales(Varietal varietales) {
        this.varietales = varietales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNotaCata(double notaCata) {
        this.notaCata = notaCata;
    }

    public void setAnada(Date anada) {
        this.anada = anada;
    }

    public void setImagen(URI imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getNotaCata() {
        return notaCata;
    }

    public Date getAnada() {
        return anada;
    }

    public URI getImagen() {
        return imagen;
    }

    public double calcularPuntajeSommelierEnPeriodo(){
        // Tenemos que recorrer las resenas de vino para preguntarle si son del periodo pasado por parametro
        return 2;
    }


    public double buscarPuntajeSommelierEnPeriodo(Date fechaDesde, Date fechaHasta) {
        ArrayList<Double> puntajes = new ArrayList<Double>();
        for (Resena resena : resena){
            if(resena.sosDePeriodo(fechaDesde, fechaHasta)){
                if(resena.sosSommelierVerificado()){
                    puntajes.add(resena.getPuntaje());
                } else { puntajes.add((double) 0);}
            }
        }
        // Calculamos el promedio
        double sum = 0;
        for (Double puntaje : puntajes) {
            sum += puntaje;
        }
        return sum / puntajes.size();
    }


    public boolean tenesResenaEnPeriodo(Date fechaDesde, Date fechaHasta) {
        if (resena == null || resena.isEmpty()) {
            return false; //no hay resenas
        }

        for (Resena resena : resena) {
            if (resena.sosDePeriodo(fechaDesde, fechaHasta)) {
                return true; //si hay resenas en periodo
            }
        }
        return false; // no hay resenas en periodo
    }


    public Bodega buscarInfoBodega() {
        return bodega;
    }

    public Varietal buscarVarietal() {
        return varietales;
    }
}
