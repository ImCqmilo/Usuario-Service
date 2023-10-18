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

    @GetMapping("/Coordinador")
    public List<Coordinador> listar() {return (List<Coordinador>)  coordinadorService.findAll();}

    @PostMapping("/coordinador")
    public Coordinador  Crear(@RequestBody Coordinador coordinador){
        return coordinadorService.save(coordinador);
    }

    @PutMapping("/coordinador/{coordinadorId}")
        public Coordinador editarCoordinador(@PathVariable Long coordinadorId,@RequestBody Coordinador coordinador){
          return coordinadorService.editarCoordinador(coordinadorId, coordinador);
        }


    @DeleteMapping("/coordinador/{coordinadorId}")
        public void borrarCoordinador(@PathVariable Long coordinadorId){
        coordinadorService.borrarCoordinador(coordinadorId);
    }
}