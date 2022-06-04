package com.escolar.springboot.escolar.services;

import java.util.ArrayList;
import java.util.Optional;

import com.escolar.springboot.escolar.models.Horariodetalle;
import com.escolar.springboot.escolar.repositories.HorariodetalleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HorariodetalleService {
    
    @Autowired
    HorariodetalleRepository horariodetalleRepository;

    public ArrayList<Horariodetalle> obtenerHorariosdetalle(){
        return (ArrayList<Horariodetalle>) horariodetalleRepository.findAll();
    }

    public Horariodetalle guardarHorariodetalle(Horariodetalle horariodetalle){
        return horariodetalleRepository.save(horariodetalle);
    }

    public Optional<Horariodetalle> obtenerPorId(Integer id){
        return horariodetalleRepository.findById(id);
    }

    public boolean eliminarHorariodetalle(Integer id){
        try {
            horariodetalleRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
