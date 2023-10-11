package com.team2.usuarioservice.Dao;

import com.team2.usuarioservice.entity.Docente;
import org.springframework.data.repository.CrudRepository;

public interface IDocenteDao extends CrudRepository<Docente, Long> {
}
