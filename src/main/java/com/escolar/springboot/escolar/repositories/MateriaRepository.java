package com.escolar.springboot.escolar.repositories;

import java.util.ArrayList;

import com.escolar.springboot.escolar.models.Materia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends CrudRepository<Materia, Integer> {
    public abstract ArrayList<Materia> findByNombre(String nombre);
}
