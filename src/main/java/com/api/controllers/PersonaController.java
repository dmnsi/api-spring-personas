package com.api.controllers;

import com.api.model.PersonaModel;
import com.api.services.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PersonaController {

    @Autowired
    PersonaService personaService;
    
    @GetMapping()
    public List<PersonaModel> obtenerUsuario() {
        return personaService.obtenerPersonas();
    }
    
    @PostMapping()
    public PersonaModel guardarUsuario(@RequestBody PersonaModel persona){
        return this.personaService.guardarPersona(persona);
    }
}
