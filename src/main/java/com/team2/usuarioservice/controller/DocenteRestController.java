package com.team2.usuarioservice.controller;

import com.team2.usuarioservice.Dao.IDocenteDao;
import com.team2.usuarioservice.entity.Docente;
import com.team2.usuarioservice.service.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pais-service")
public class DocenteRestController {

    private IDocenteService docenteService;

    @PostMapping("/docente")
    public Docente crearDocente(@RequestBody Docente docente){
        return docenteService.save(docente);
    }
    @PutMapping("/docente")
    public Docente actualizarDocente(@RequestBody Docente docente){
        return docenteService.save(docente);
    }

}
