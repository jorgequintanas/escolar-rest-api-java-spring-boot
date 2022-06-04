package com.escolar.springboot.escolar.repositories;

import com.escolar.springboot.escolar.models.Kardex;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KardexRepository extends CrudRepository<Kardex, Integer> {
    
}
