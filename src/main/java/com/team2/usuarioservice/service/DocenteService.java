package com.team2.usuarioservice.service;

import com.team2.usuarioservice.entity.Docente;

import java.util.List;

public interface DocenteService {
    void delete(Docente docente);
    List<Docente> findAll();//Devuelve una lista de todos los coordinadores
    Docente findById(Long id);
    Docente save(Docente docente);//guardo un coordinador y me retorna el mismo pero con el id
}
