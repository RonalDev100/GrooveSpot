package com.ronal.groovespot.dao.impl;

import com.ronal.groovespot.dao.CompraDao;
import com.ronal.groovespot.entity.Compra;
import com.ronal.groovespot.util.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CompraDaoImpl implements CompraDao{

    public void registrarCompra(Compra compra) {
        String sql = "INSERT INTO Compras (IdUsuario, IdEvento, Cantidad, Estado, IdMetodoPago, CodigoOperacion, TotalPagado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DbConnection.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, compra.getIdUsuario());
            stmt.setInt(2, compra.getIdEvento());
            stmt.setInt(3, compra.getCantidad());
            stmt.setString(4, compra.getEstado());
            stmt.setInt(5, compra.getIdMetodoPago());
            stmt.setString(6, compra.getCodigoOperacion());
            stmt.setDouble(7, compra.getTotalPagado());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Compra> obtenerComprasPorIdUsuario(int idUsuario) {
        List<Compra> lista = new ArrayList<>();
        String sql = "SELECT * FROM Compras WHERE IdUsuario = ?";

        try (Connection conn = DbConnection.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idUsuario);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Compra c = new Compra();
                c.setIdCompra(rs.getInt("IdCompra"));
                c.setIdUsuario(rs.getInt("IdUsuario"));
                c.setIdEvento(rs.getInt("IdEvento"));
                c.setCantidad(rs.getInt("Cantidad"));
                c.setEstado(rs.getString("Estado"));
                c.setFechaCompra(rs.getTimestamp("FechaCompra"));
                c.setIdMetodoPago(rs.getInt("IdMetodoPago"));
                c.setCodigoOperacion(rs.getString("CodigoOperacion"));
                c.setTotalPagado(rs.getDouble("TotalPagado"));
                lista.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;    }
    
}
