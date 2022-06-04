package com.escolar.springboot.escolar.repositories;

import java.util.ArrayList;

import com.escolar.springboot.escolar.models.Maestro;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaestroRepository extends CrudRepository<Maestro, Integer> {
    public abstract ArrayList<Maestro> findByNombre(String nombre);
}
