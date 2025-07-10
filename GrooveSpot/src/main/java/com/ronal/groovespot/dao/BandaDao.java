/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ronal.groovespot.dao;

import com.ronal.groovespot.entity.Banda;
import java.util.List;

/**
 *
 * @author ronal
 */
public interface BandaDao {
    
    List<Banda> obtenerTodasLasBandas();
    Banda buscarPorId(int idBanda);

}
