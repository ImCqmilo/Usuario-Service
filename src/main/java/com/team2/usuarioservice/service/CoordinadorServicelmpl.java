package com.team2.usuarioservice.service;

import com.team2.usuarioservice.Dao.ICoordinadorDao;
import com.team2.usuarioservice.entity.Coordinador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CoordinadorServicelmpl implements CoordinadorService {
    @Autowired
    ICoordinadorDao CoordinadorDao; // Lo necesitamos para poder realizar las consultas a la DB

    @Override
    public void delete(Coordinador coordinador) {
        CoordinadorDao.delete(coordinador);
    }

    @Transactional(readOnly= true)
    @Override
    public List<Coordinador> findAll() {
        List<Coordinador> coordinadores =(List<Coordinador>) CoordinadorDao.findAll();
        return coordinadores;
    }

    @Override
    public Coordinador findById(Long id) {
        return(Coordinador) CoordinadorDao.findById(id).get();
    }

    @Override
    public Coordinador save(Coordinador coordinador) {
        return CoordinadorDao.save(coordinador);
    }
}
