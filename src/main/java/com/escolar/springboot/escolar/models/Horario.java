package com.escolar.springboot.escolar.models;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "horarios")

public class Horario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "estatus", nullable = false)
    private Boolean estatus;
    
    @JsonIgnore
    @OneToOne(mappedBy = "horario")
    Clase clase;

    @JsonIgnore
    @OneToMany(mappedBy = "horario")
    private List<Horariodetalle> horarios;
    
}
