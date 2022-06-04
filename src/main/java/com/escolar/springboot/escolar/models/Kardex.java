package com.escolar.springboot.escolar.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "kardex")

public class Kardex {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "id_alumno", nullable = false)
    Alumno alumno;
    
    @ManyToOne
    @JoinColumn(name = "id_materia", nullable = false)
    Materia materia;

    @Column(name = "promedio", nullable = false)
    private Integer promedio;
    
    @Column(name = "estatus", nullable = false)
    private Boolean estatus;
    
}
