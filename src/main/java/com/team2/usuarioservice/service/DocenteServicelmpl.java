package com.team2.usuarioservice.service;


import com.team2.usuarioservice.Dao.IDocenteDao;
import com.team2.usuarioservice.entity.Docente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class DocenteServicelmpl  implements DocenteService {
    @Autowired
    IDocenteDao DocenteDao; // Lo necesitamos para poder realizar las consultas a la DB

    @Override
    public void delete(Docente docente) {
        DocenteDao.delete(docente);
    }

    @Transactional(readOnly= true)
    @Override
    public List<Docente> findAll() {
        List<Docente> docentes =(List<Docente>) DocenteDao.findAll();
        return docentes;
    }

    @Override
    public Docente findById(Long id) {
        return(Docente) DocenteDao.findById(id).get();
    }

    @Override
    public Docente save(Docente docente) {
        return DocenteDao.save(docente);
    }
}

