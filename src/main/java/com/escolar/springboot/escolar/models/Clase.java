package com.escolar.springboot.escolar.models;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clases")

public class Clase {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @OneToOne
    @JoinColumn(name = "id_maestro", nullable = false)
    Maestro maestro;

    @OneToOne
    @JoinColumn(name = "id_materia", nullable = false)
    Materia materia;

    @OneToOne
    @JoinColumn(name = "id_horario", nullable = false)
    Horario horario;

    @Column(name = "max_alumnos", nullable = false)
    private Integer maxAlumnos;
    
    @Column(name = "estatus", nullable = false)
    private Boolean estatus;

    @JsonIgnore
    @OneToMany(mappedBy = "clase")
    List<Clasealumno> alumnos;

}
