/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ronal.groovespot.entity;

/**
 *
 * @author ronal
 */
public class Banda {
    private int idBanda;
    private String nombre;
    private String genero;
    private String descripcion;
    private String imagen;
    private int idUsuario; 

    public Banda() {
    }

    public Banda(int idBanda, String nombre, String genero, String descripcion, String imagen, int idUsuario) {
        this.idBanda = idBanda;
        this.nombre = nombre;
        this.genero = genero;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.idUsuario = idUsuario;
    }

    public int getIdBanda() {
        return idBanda;
    }

    public void setIdBanda(int idBanda) {
        this.idBanda = idBanda;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
}
