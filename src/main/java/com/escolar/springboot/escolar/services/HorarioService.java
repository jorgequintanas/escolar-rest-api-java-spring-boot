package com.escolar.springboot.escolar.services;

import java.util.ArrayList;
import java.util.Optional;

import com.escolar.springboot.escolar.models.Horario;
import com.escolar.springboot.escolar.repositories.HorarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HorarioService {
    
    @Autowired
    HorarioRepository horarioRepository;

    public ArrayList<Horario> obtenerHorarios(){
        return (ArrayList<Horario>) horarioRepository.findAll();
    }

    public Horario guardarHorario(Horario horario){
        return horarioRepository.save(horario);
    }

    public Optional<Horario> obtenerPorId(Integer id){
        return horarioRepository.findById(id);
    }

    //public ArrayList<Horariodetalle> obtenerDetalles(Horario horario){
    //    return horarioRepository.findDetails(horario);
    //}
    
    public boolean eliminarHorario(Integer id){
        try {
            horarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
