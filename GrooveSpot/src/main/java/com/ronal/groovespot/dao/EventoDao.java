package com.ronal.groovespot.dao;

import com.ronal.groovespot.entity.Evento;
import java.util.List;

public interface EventoDao {
    List<Evento> obtenerTodosLosEventos();
    Evento buscarPorId(int idEvento);
}

