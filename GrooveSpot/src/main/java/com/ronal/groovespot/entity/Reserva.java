package com.ronal.groovespot.entity;

import java.sql.Timestamp;

public class Reserva {
    private int idReserva;
    private int idUsuario; // FK a Usuario
    private int idEvento;  // FK a Evento
    private java.sql.Timestamp fechaHora;

    // Getters, setters, constructores

    public Reserva() {
    }

    
    public Reserva(int idReserva, int idUsuario, int idEvento, Timestamp fechaHora) {
        this.idReserva = idReserva;
        this.idUsuario = idUsuario;
        this.idEvento = idEvento;
        this.fechaHora = fechaHora;
    }

    
    
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public Timestamp getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Timestamp fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    
    
}
