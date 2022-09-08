package com.api.repositories;

import com.api.model.PersonaModel;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaModel, Long> {
    
}
