package com.team2.usuarioservice.service;

import com.team2.usuarioservice.entity.Coordinador;

import java.util.List;

public interface CoordinadorService {
    void delete(Coordinador coordinador);
    List<Coordinador> findAll();//Devuelve una lista de todos los coordinadores
    Coordinador findById(Long id);
    Coordinador save(Coordinador coordinador);//guardo un coordinador y me retorna el mismo pero con el id

}
