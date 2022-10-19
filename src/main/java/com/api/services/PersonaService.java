package com.api.services;

import com.api.model.PersonaModel;
import com.api.repositories.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public List<PersonaModel> obtenerPersonas() {
        return (List<PersonaModel>) personaRepository.findAll();
    }

    public PersonaModel guardarPersona(PersonaModel persona) {
        return personaRepository.save(persona);
    }

    public void eliminarPersona(PersonaModel persona) {
        personaRepository.deleteById(persona.getIdPersona());
    }

    public void buscarPersona(PersonaModel persona) {
        personaRepository.findById(persona.getIdPersona());
    }
}
