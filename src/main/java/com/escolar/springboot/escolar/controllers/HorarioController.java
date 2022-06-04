package com.escolar.springboot.escolar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.escolar.springboot.escolar.models.Horario;
import com.escolar.springboot.escolar.services.HorarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/horario")
public class HorarioController {
    
    @Autowired
    HorarioService horarioService;

    @GetMapping()
    public ArrayList<Horario> obtenerHorarios(){
        return horarioService.obtenerHorarios();
    }

    @PostMapping
    public Horario guardarHorario(@RequestBody Horario horario){
        return this.horarioService.guardarHorario(horario);
    }

    @GetMapping(path = "/{id}")
    public Optional<Horario> obtenerHorarioPorId(@PathVariable("id") Integer id){
        return horarioService.obtenerPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.horarioService.eliminarHorario(id);
        if (ok){
            return "Se eliminó el horario con id " + id;
        }
        else{
            return "No se pudo eliminar el horario con id " + id;
    }
    }
}
