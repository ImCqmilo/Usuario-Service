package com.team2.usuarioservice.service;

import com.team2.usuarioservice.entity.Coordinador;

import java.util.List;

public interface ICoordinadorService {

    List<Coordinador> findAll();
    Coordinador findById(Long id);
    Coordinador save(Coordinador coordinador);

}
