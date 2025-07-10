package com.ronal.groovespot.dao.impl;

import com.ronal.groovespot.dao.EventoDao;
import com.ronal.groovespot.entity.Evento;
import com.ronal.groovespot.util.DbConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EventoDaoImpl implements EventoDao {

    public List<Evento> obtenerTodosLosEventos() {
        List<Evento> lista = new ArrayList<>();
        String sql = "SELECT * FROM Eventos";

        try (Connection conn = DbConnection.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Evento e = new Evento();
                e.setIdEvento(rs.getInt("IdEvento"));
                e.setTitulo(rs.getString("Titulo"));
                e.setFecha(rs.getDate("Fecha"));
                e.setLugar(rs.getString("Lugar"));
                e.setPrecio(rs.getDouble("Precio"));
                e.setImagen(rs.getString("Imagen"));
                e.setIdBanda(rs.getInt("IdBanda"));
                lista.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }


    public Evento buscarPorId(int idEvento) {
        String sql = "SELECT * FROM Eventos WHERE IdEvento = ?";
        Evento e = null;
        try (Connection conn = DbConnection.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idEvento);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                e = new Evento();
                e.setIdEvento(rs.getInt("IdEvento"));
                e.setTitulo(rs.getString("Titulo"));
                e.setFecha(rs.getDate("Fecha"));
                e.setLugar(rs.getString("Lugar"));
                e.setPrecio(rs.getDouble("Precio"));
                e.setImagen(rs.getString("Imagen"));
                e.setIdBanda(rs.getInt("IdBanda"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return e;
    }
}