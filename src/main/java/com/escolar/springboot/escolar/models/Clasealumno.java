package com.escolar.springboot.escolar.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clases_alumnos")

public class Clasealumno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "id_clase", nullable = false)
    Clase clase;

    @ManyToOne
    @JoinColumn(name = "id_alumno", nullable = false)
    Alumno alumno;
    
    @Column(name = "estatus", nullable = false)
    private Boolean estatus;
    
}

