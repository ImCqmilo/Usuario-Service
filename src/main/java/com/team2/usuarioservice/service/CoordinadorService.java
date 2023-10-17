package com.team2.usuarioservice.service;

import com.team2.usuarioservice.dao.ICoordinadorDao;
import com.team2.usuarioservice.entity.Coordinador;
import com.team2.usuarioservice.repository.CoordinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CoordinadorService implements ICoordinadorService {
    @Autowired
    ICoordinadorDao CoordinadorDao;

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
    public Coordinador save(Coordinador coordinador){return CoordinadorDao.save(coordinador);}
}
