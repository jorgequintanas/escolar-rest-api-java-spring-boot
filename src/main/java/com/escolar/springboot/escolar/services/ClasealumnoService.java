package com.escolar.springboot.escolar.services;

import java.util.ArrayList;
import java.util.Optional;

import com.escolar.springboot.escolar.models.Clasealumno;
import com.escolar.springboot.escolar.repositories.ClasealumnoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClasealumnoService {
    
    @Autowired
    ClasealumnoRepository clasealumnoRepository;

    public ArrayList<Clasealumno> obtenerClasesalumnos(){
        return (ArrayList<Clasealumno>) clasealumnoRepository.findAll();
    }

    public Clasealumno guardarClasealumno(Clasealumno clasealumno){
        return clasealumnoRepository.save(clasealumno);
    }

    public Optional<Clasealumno> obtenerPorId(Integer id){
        return clasealumnoRepository.findById(id);
    }

    public boolean eliminarClasealumno(Integer id){
        try {
            clasealumnoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
