package com.escolar.springboot.escolar.repositories;

import com.escolar.springboot.escolar.models.Clase;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaseRepository extends CrudRepository<Clase, Integer> {
    
}
