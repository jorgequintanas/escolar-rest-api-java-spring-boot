package com.escolar.springboot.escolar.services;

import java.util.ArrayList;
import java.util.Optional;

import com.escolar.springboot.escolar.models.Materia;
import com.escolar.springboot.escolar.repositories.MateriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MateriaService {
    
    @Autowired
    MateriaRepository materiaRepository;

    public ArrayList<Materia> obtenerMaterias(){
        return (ArrayList<Materia>) materiaRepository.findAll();
    }

    public Materia guardarMateria(Materia materia){
        return materiaRepository.save(materia);
    }

    public Optional<Materia> obtenerPorId(Integer id){
        return materiaRepository.findById(id);
    }

    public ArrayList<Materia> obtenerPorNombre(String nombre){
        return materiaRepository.findByNombre(nombre);
    }

    public boolean eliminarMateria(Integer id){
        try {
            materiaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
