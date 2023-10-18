package com.team2.usuarioservice.controller;

import com.team2.usuarioservice.entity.Docente;
import com.team2.usuarioservice.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/docente-service") //La forma en la que llamo a el servicio

public class DocenteRestController {
    @SpringBootApplication
    public class UsuarioServiceApplication {
        @Autowired
        private DocenteService docenteService;

        @GetMapping( "/docentes")
        public List<Docente> listar(){
            return (List<Docente>) docenteService.findAll();
        }

        @PostMapping("/docente")
        public Docente crearDocente(@RequestBody Docente docente){
            return docenteService.save(docente);

        }

        @PutMapping("/docente")
        public Docente actualizarDocente(@RequestBody Docente docente){
            return docenteService.save(docente);
        }
        @GetMapping("/hola/{nombre}") //La forma en la que llamo este metodo (endpoint)
        public String holaMundo(@PathVariable("nombre") String nombre){


            return "Hola"+nombre;
        }
    }
}
