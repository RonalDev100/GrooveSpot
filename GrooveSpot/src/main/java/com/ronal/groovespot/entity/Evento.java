package com.ronal.groovespot.entity;

import java.sql.Date;
import java.sql.Time;

public class Evento {
    private int idEvento;
    private String nombre;
    private String genero;
    private java.sql.Date fecha;
    private java.sql.Time hora;
    private String ubicacion;
    private int idBanda; // FK a Usuario

    // Getters, setters, constructores

    public Evento(int idEvento, String nombre, String genero, Date fecha, Time hora, String ubicacion, int idBanda) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.genero = genero;
        this.fecha = fecha;
        this.hora = hora;
        this.ubicacion = ubicacion;
        this.idBanda = idBanda;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getIdBanda() {
        return idBanda;
    }

    public void setIdBanda(int idBanda) {
        this.idBanda = idBanda;
    }
    
    
    
}
