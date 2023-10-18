package com.team2.usuarioservice.controller;

import com.team2.usuarioservice.entity.Coordinador;
import com.team2.usuarioservice.service.CoordinadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coordinador-service") //La forma en la que llamo a el servicio
public class CoordinadorRestController {

    @SpringBootApplication
    public class UsuarioServiceApplication {
        @Autowired
        private CoordinadorService coordinadorService;

        @GetMapping( "/coordinador")
        public List<Coordinador> listar(){
            return (List<Coordinador>) coordinadorService.findAll();
        }

        @PostMapping("/coordinador")
        public Coordinador crearCoordinador(@RequestBody Coordinador coordinador){
            return coordinadorService.save(coordinador);

        }

        @PutMapping("/coordinador")
        public Coordinador actualizarCoordinador(@RequestBody Coordinador coordinador){
            return coordinadorService.save(coordinador);
        }
        @GetMapping("/hola/{nombre}") //La forma en la que llamo este metodo (endpoint)
        public String holaMundo(@PathVariable("nombre") String nombre){


            return "Hola"+nombre;
        }
    }
}


