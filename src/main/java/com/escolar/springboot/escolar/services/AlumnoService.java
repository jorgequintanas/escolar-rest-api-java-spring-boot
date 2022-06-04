package com.escolar.springboot.escolar.services;

import java.util.ArrayList;
import java.util.Optional;

import com.escolar.springboot.escolar.models.Alumno;
import com.escolar.springboot.escolar.repositories.AlumnoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService {
    
    @Autowired
    AlumnoRepository alumnoRepository;

    public ArrayList<Alumno> obtenerAlumnos(){
        return (ArrayList<Alumno>) alumnoRepository.findAll();
    }

    public Alumno guardarAlumno(Alumno alumno){
        return alumnoRepository.save(alumno);
    }

    public Optional<Alumno> obtenerPorId(Integer id){
        return alumnoRepository.findById(id);
    }

    public ArrayList<Alumno> obtenerPorNombre(String nombre){
        return alumnoRepository.findByNombre(nombre);
    }

    public boolean eliminarAlumno(Integer id){
        try {
            alumnoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
