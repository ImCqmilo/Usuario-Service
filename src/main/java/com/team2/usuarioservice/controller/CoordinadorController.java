package com.team2.usuarioservice.controller;

import com.team2.usuarioservice.entity.Coordinador;
import com.team2.usuarioservice.service.CoordinadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/user-service")
public class CoordinadorController {

    @Autowired
    private  CoordinadorService coordinadorService;

    @GetMapping
    public List<Coordinador> listar() {return (List<Coordinador>)  coordinadorService.findAll();}

    @PostMapping
    public Coordinador  Crear(@RequestBody Coordinador coordinador){
        return coordinadorService.save(coordinador);
    }


}
