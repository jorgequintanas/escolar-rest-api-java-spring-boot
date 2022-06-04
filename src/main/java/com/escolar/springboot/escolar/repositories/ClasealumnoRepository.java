package com.escolar.springboot.escolar.repositories;

import com.escolar.springboot.escolar.models.Clasealumno;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasealumnoRepository extends CrudRepository<Clasealumno, Integer> {
    
}
