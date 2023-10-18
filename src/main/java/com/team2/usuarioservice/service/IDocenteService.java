package com.team2.usuarioservice.service;

import com.team2.usuarioservice.entity.Docente;

import java.util.List;

public interface IDocenteService {
    Docente findById(Long docenteId);
    Docente save(Docente docente);
    Docente actualizar(Long docenteId, Docente docente);
}
