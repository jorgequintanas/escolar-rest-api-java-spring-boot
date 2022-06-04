package com.escolar.springboot.escolar.services;

import java.util.ArrayList;

import com.escolar.springboot.escolar.models.Kardex;
import com.escolar.springboot.escolar.repositories.KardexRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KardexService {
    
    @Autowired
    KardexRepository kardexRepository;

    public ArrayList<Kardex> obtenerCalificaciones(){
        return (ArrayList<Kardex>) kardexRepository.findAll();
    }

    public Kardex guardarCalificacion(Kardex kardex){
        return kardexRepository.save(kardex);
    }

    //public ArrayList<Kardex> obtenerCalificacionesPorIdAlumno(Integer alumno){
    //    return kardexRepository.findByIdAlumno(alumno);
    //}

    public boolean eliminarCalificacion(Integer id){
        try {
            kardexRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
