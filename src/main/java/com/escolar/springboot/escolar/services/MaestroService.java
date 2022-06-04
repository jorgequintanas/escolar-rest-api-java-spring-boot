package com.escolar.springboot.escolar.services;

import java.util.ArrayList;
import java.util.Optional;

import com.escolar.springboot.escolar.models.Maestro;
import com.escolar.springboot.escolar.repositories.MaestroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaestroService {
    
    @Autowired
    MaestroRepository maestroRepository;

    public ArrayList<Maestro> obtenerMaestros(){
        return (ArrayList<Maestro>) maestroRepository.findAll();
    }

    public Maestro guardarMaestro(Maestro maestro){
        return maestroRepository.save(maestro);
    }

    public Optional<Maestro> obtenerPorId(Integer id){
        return maestroRepository.findById(id);
    }

    public ArrayList<Maestro> obtenerPorNombre(String nombre){
        return maestroRepository.findByNombre(nombre);
    }

    public boolean eliminarMaestro(Integer id){
        try {
            maestroRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
