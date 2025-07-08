package com.ronal.groovespot.dao;

import com.ronal.groovespot.entity.Usuario;

public interface UsuarioDao {
    
    
    Usuario login(String correo, String contraseña);
    void registrar(Usuario usuario);
}
