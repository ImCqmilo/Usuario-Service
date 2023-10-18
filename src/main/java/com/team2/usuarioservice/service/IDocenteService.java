package com.team2.usuarioservice.service;

import com.team2.usuarioservice.entity.Coordinador;
import com.team2.usuarioservice.entity.Docente;

import java.util.List;

public interface IDocenteService {
    List<Docente> findAll();
    Docente findById(Long Id);
    Docente save(Docente docente);
    Docente actualizar(Long docenteId, Docente docente);
    void borrarDocente(Long docenteId);
}
