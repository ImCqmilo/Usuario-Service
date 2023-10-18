package com.team2.usuarioservice.service;

import com.team2.usuarioservice.dao.ICoordinadorDao;
import com.team2.usuarioservice.Dao.IDocenteDao;
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
    public List<Docente> findAll() {
        List<Docente> docentes = (List<Docente>) docenteDao.findAll();
        return docentes;
    }

    @Override
    public Docente findById(Long Id) {
        return docenteDao.findById(Id).get();
    }

    @Override
    public Docente save(Docente docente) {
        return docenteDao.save(docente);
    }

    public Docente actualizar(Long docenteId, Docente docente) {
        Docente editarDocente = docenteDao.findById(docenteId).orElse(null);

        if (editarDocente != null) {
            editarDocente.setNombre(docente.getNombre());
            editarDocente.setApellido(docente.getApellido());
            editarDocente.setTelefono(docente.getTelefono());
            editarDocente.setCorreo(docente.getCorreo());
            editarDocente.setFacultad(docente.getFacultad());
            editarDocente.setAsignatura(docente.getAsignatura());

            return docenteDao.save(editarDocente);
        }

        return null;
    }
    public void borrarDocente(Long Id){
        docenteDao.deleteById(Id);
    }

}
