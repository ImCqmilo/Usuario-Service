package com.team2.usuarioservice.controller;

import com.team2.usuarioservice.entity.Docente;
import com.team2.usuarioservice.service.DocenteImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user-service")
public class DocenteRestController {

    @Autowired
    private DocenteImpl docenteService;
    @PostMapping("/docente")
    public Docente crearDocente(@RequestBody Docente docente){
        return docenteService.save(docente);
    }
    @PutMapping("/{docenteId}")
    public Docente actualizarDocente(@PathVariable Long docenteId,@RequestBody Docente docente){
        return docenteService.actualizar(docenteId, docente);
    }

}
