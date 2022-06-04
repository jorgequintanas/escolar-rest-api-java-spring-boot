package com.escolar.springboot.escolar.services;

import java.util.ArrayList;
import java.util.Optional;

import com.escolar.springboot.escolar.models.Clase;
import com.escolar.springboot.escolar.repositories.ClaseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaseService {
    
    @Autowired
    ClaseRepository claseRepository;

    public ArrayList<Clase> obtenerClases(){
        return (ArrayList<Clase>) claseRepository.findAll();
    }

    public Clase guardarClase(Clase clase){
        return claseRepository.save(clase);
    }

    public Optional<Clase> obtenerPorId(Integer id){
        return claseRepository.findById(id);
    }

    public boolean eliminarClase(Integer id){
        try {
            claseRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
