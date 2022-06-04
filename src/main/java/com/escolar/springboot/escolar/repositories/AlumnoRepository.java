package com.escolar.springboot.escolar.repositories;

import java.util.ArrayList;

import com.escolar.springboot.escolar.models.Alumno;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {
    public abstract ArrayList<Alumno> findByNombre(String nombre);
}
