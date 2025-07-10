package com.ronal.groovespot.dao.impl;

import com.ronal.groovespot.dao.BandaDao;
import com.ronal.groovespot.entity.Banda;
import com.ronal.groovespot.util.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ronal
 */
public class BandaDaoImpl implements BandaDao{

    public List<Banda> obtenerTodasLasBandas() {
        List<Banda> lista = new ArrayList<>();
        String sql = "SELECT * FROM Bandas";

        try (Connection conn = DbConnection.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Banda b = new Banda();
                b.setIdBanda(rs.getInt("IdBanda"));
                b.setNombre(rs.getString("Nombre"));
                b.setGenero(rs.getString("Genero"));
                b.setDescripcion(rs.getString("Descripcion"));
                b.setImagen(rs.getString("Imagen"));
                b.setIdUsuario(rs.getInt("IdUsuario"));
                lista.add(b);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public Banda buscarPorId(int idBanda) {
        String sql = "SELECT * FROM Bandas WHERE IdBanda = ?";
        Banda b = null;
        try (Connection conn = DbConnection.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idBanda);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                b = new Banda();
                b.setIdBanda(rs.getInt("IdBanda"));
                b.setNombre(rs.getString("Nombre"));
                b.setGenero(rs.getString("Genero"));
                b.setDescripcion(rs.getString("Descripcion"));
                b.setImagen(rs.getString("Imagen"));
                b.setIdUsuario(rs.getInt("IdUsuario"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return b;
    }
    
}
