/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ronal.groovespot.entity;

/**
 *
 * @author ronal
 */
public class MetodosPago {
    private int idMetodoPago;
    private String nombre;

    public MetodosPago() {
    }

    public MetodosPago(int idMetodoPago, String nombre) {
        this.idMetodoPago = idMetodoPago;
        this.nombre = nombre;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
