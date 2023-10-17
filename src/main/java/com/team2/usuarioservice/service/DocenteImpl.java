package com.team2.usuarioservice.service;

import com.team2.usuarioservice.dao.IDocenteDao;
import com.team2.usuarioservice.entity.Docente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class DocenteImpl implements IDocenteService{

    @Autowired
    IDocenteDao docenteDao;
    @Override
    public Docente findById(Long docenteId) {
        return docenteDao.findById(docenteId).get();
    }

    @Override
    public Docente save(Docente docente) {
        return docenteDao.save(docente);
    }
}
