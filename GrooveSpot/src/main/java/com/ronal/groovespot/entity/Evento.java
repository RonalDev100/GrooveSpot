package com.ronal.groovespot.entity;

import java.sql.Date;
import java.sql.Time;

public class Evento {
    private int idEvento;
    private String titulo;
    private java.sql.Date fecha;
    private String lugar;   // corregido: Lugar → lugar (convención Java)
    private double precio;
    private String imagen;
    private int idBanda;  // FK a Usuario

    public Evento() {
    }

    public Evento(int idEvento, String titulo, Date fecha, String lugar, double precio, String imagen, int idBanda) {
        this.idEvento = idEvento;
        this.titulo = titulo;
        this.fecha = fecha;
        this.lugar = lugar;
        this.precio = precio;
        this.imagen = imagen;
        this.idBanda = idBanda;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getIdBanda() {
        return idBanda;
    }

    public void setIdBanda(int idBanda) {
        this.idBanda = idBanda;
    }


    
   
    
}
