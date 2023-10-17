package com.team2.usuarioservice.service;

import com.team2.usuarioservice.dao.ICoordinadorDao;
import com.team2.usuarioservice.entity.Coordinador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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


   public Coordinador editarCoordinador( Long id,
                                        Long Nuevo_coordinadorId,
                                        String Nuevo_nombre,
                                        String Nuevo_apellido,
                                        String Nuevo_telefono,
                                        String Nuevo_correo){
        Coordinador coordinador = CoordinadorDao.findById(id).get();
        if( coordinador != null ){
            coordinador.setCoordinadorId(Nuevo_coordinadorId);
            coordinador.setNombre(Nuevo_nombre);
            coordinador.setApellido(Nuevo_apellido);
            coordinador.setTelefono(Nuevo_telefono);
            coordinador.setCorreo(Nuevo_correo);
            save(coordinador);
        }
        return coordinador;
    }

    public void borrarCoordinador(Long Id){
       CoordinadorDao.deleteById(Id);
    }


}

