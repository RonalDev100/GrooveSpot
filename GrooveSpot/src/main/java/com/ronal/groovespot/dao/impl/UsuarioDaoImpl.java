package com.ronal.groovespot.dao.impl;

import com.ronal.groovespot.dao.UsuarioDao;
import com.ronal.groovespot.entity.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDaoImpl implements UsuarioDao {

    private final Connection conn;

    
    
    
    public UsuarioDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public Usuario login(String nombre, String password) {
        try {
            PreparedStatement stmt = conn.prepareStatement(
                "SELECT * FROM Usuarios WHERE Nombre = ? AND Contrasena = ?"
            );
            stmt.setString(1, nombre);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("IdUsuario"));
                usuario.setCorreo(rs.getString("Nombre"));
                usuario.setContraseña(rs.getString("Contrasena"));
                return usuario;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void registrar(Usuario usuario) {
        try {
            PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO usuario (correo, contraseña) VALUES (?, ?)"
            );
            stmt.setString(1, usuario.getCorreo());
            stmt.setString(2, usuario.getContraseña());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
