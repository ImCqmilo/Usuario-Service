package com.team2.usuarioservice.service;

import com.team2.usuarioservice.entity.Coordinador;

import java.util.List;

public interface ICoordinadorService {

    List<Coordinador> findAll();
    Coordinador findById(Long id);
    Coordinador save(Coordinador coordinador);
    Coordinador editarCoordinador(Long id, Long Nuevo_coordinadorId, String Nuevo_nombre, String Nuevo_apellido, String Nuevo_telefono, String Nuevo_correo );
    void borrarCoordinador(Long id);
}
