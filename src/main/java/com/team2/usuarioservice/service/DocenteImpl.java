package com.team2.usuarioservice.service;

import com.team2.usuarioservice.Dao.IDocenteDao;
import com.team2.usuarioservice.entity.Docente;

public class DocenteImpl implements IDocenteService{
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
