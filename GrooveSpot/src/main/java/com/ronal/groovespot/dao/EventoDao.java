package com.ronal.groovespot.dao;

import com.ronal.groovespot.entity.Evento;
import java.util.List;

public interface EventoDao {
    List<Evento> findAll();
    List<Evento> findByGenero(String genero);
    Evento findById(int id);
}

