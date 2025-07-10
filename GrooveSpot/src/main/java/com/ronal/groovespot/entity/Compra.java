/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ronal.groovespot.entity;

import java.sql.Timestamp;

/**
 *
 * @author ronal
 */
public class Compra {
    private int idCompra;
    private int idUsuario;
    private int idEvento;
    private int cantidad;
    private String estado; // 'Pagado' o 'Pendiente'
    private java.sql.Timestamp fechaCompra;
    private int idMetodoPago;
    private String codigoOperacion;
    private double totalPagado;

    public Compra() {
    }

    public Compra(int idCompra, int idUsuario, int idEvento, int cantidad, String estado, Timestamp fechaCompra, int idMetodoPago, String codigoOperacion, double totalPagado) {
        this.idCompra = idCompra;
        this.idUsuario = idUsuario;
        this.idEvento = idEvento;
        this.cantidad = cantidad;
        this.estado = estado;
        this.fechaCompra = fechaCompra;
        this.idMetodoPago = idMetodoPago;
        this.codigoOperacion = codigoOperacion;
        this.totalPagado = totalPagado;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Timestamp getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Timestamp fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public String getCodigoOperacion() {
        return codigoOperacion;
    }

    public void setCodigoOperacion(String codigoOperacion) {
        this.codigoOperacion = codigoOperacion;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(double totalPagado) {
        this.totalPagado = totalPagado;
    }
    
    
}
