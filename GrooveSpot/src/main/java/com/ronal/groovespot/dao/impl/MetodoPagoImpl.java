package com.ronal.groovespot.dao.impl;

import com.ronal.groovespot.dao.MetodosPagoDao;
import com.ronal.groovespot.entity.MetodosPago;
import com.ronal.groovespot.util.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetodoPagoImpl implements MetodosPagoDao{

    public List<MetodosPago> obtenerTodos() {
        
        List<MetodosPago> lista = new ArrayList<>();
        String sql = "SELECT * FROM MetodoPago";

        try (Connection conn = DbConnection.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                MetodosPago m = new MetodosPago();
                m.setIdMetodoPago(rs.getInt("IdMetodoPago"));
                m.setNombre(rs.getString("Nombre"));
                lista.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
}
