package com.api.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class PersonaModel implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long idPersona;

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String saldo;

    public PersonaModel() {
    }

    public PersonaModel(Long idPersona) {
        this.idPersona = idPersona;
    }

    public PersonaModel(Long idPersona, String nombre, String apellido, String email, String telefono, String saldo) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }

}
