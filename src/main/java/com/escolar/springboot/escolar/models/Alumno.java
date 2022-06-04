package com.escolar.springboot.escolar.models;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "alumnos")

public class Alumno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellidos", nullable = false)
    private String apellidos;
    @Column(name = "telefono", nullable = false)
    private String telefono;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "estatus", nullable = false)
    private Boolean estatus;
    
    @JsonIgnore
    @OneToMany(mappedBy = "alumno")
    List<Clasealumno> clases;
    
    @JsonIgnore
    @OneToMany(mappedBy = "alumno")
    List<Kardex> calificaciones;

}
