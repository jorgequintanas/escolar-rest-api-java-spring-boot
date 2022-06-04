package com.escolar.springboot.escolar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.escolar.springboot.escolar.models.Horariodetalle;
import com.escolar.springboot.escolar.services.HorariodetalleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/horariodetalle")
public class HorariodetalleController {
    
    @Autowired
    HorariodetalleService horariodetalleService;

    @GetMapping()
    public ArrayList<Horariodetalle> obtenerHorariosdetalle(){
        return horariodetalleService.obtenerHorariosdetalle();
    }

    @PostMapping
    public Horariodetalle guardarHorariodetalle(@RequestBody Horariodetalle horariodetalle){
        return this.horariodetalleService.guardarHorariodetalle(horariodetalle);
    }

    @GetMapping(path = "/{id}")
    public Optional<Horariodetalle> obtenerHorariodetallePorId(@PathVariable("id") Integer id){
        return horariodetalleService.obtenerPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.horariodetalleService.eliminarHorariodetalle(id);
        if (ok){
            return "Se eliminó el detalle de horario con id " + id;
        }
        else{
            return "No se pudo eliminar el detalle de horario con id " + id;
    }
    }
}
