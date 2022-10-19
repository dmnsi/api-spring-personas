package com.api.controllers;

import com.api.model.PersonaModel;
import com.api.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonaController {

    @Autowired
    PersonaService personaService;
    
    @GetMapping("/")
    public List<PersonaModel> obtenerUsuario() {
        return personaService.obtenerPersonas();
    }
    
    @PostMapping("/guardar")
    public PersonaModel guardarUsuario(@RequestBody PersonaModel persona){
        return this.personaService.guardarPersona(persona);
    }

    @PostMapping("/eliminar")
    public void eliminarUsuario(@RequestBody PersonaModel persona){
        this.personaService.eliminarPersona(persona);
    }
}
