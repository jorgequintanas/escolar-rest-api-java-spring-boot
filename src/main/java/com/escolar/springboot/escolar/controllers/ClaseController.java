package com.escolar.springboot.escolar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.escolar.springboot.escolar.models.Clase;
import com.escolar.springboot.escolar.services.ClaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clase")
public class ClaseController {
    
    @Autowired
    ClaseService claseService;

    @GetMapping()
    public ArrayList<Clase> obtenerClases(){
        return claseService.obtenerClases();
    }

    @PostMapping
    public Clase guardarClase(@RequestBody Clase clase){
        return this.claseService.guardarClase(clase);
    }

    @GetMapping(path = "/{id}")
    public Optional<Clase> obtenerClasePorId(@PathVariable("id") Integer id){
        return claseService.obtenerPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.claseService.eliminarClase(id);
        if (ok){
            return "Se eliminó la clase con id " + id;
        }
        else{
            return "No se pudo eliminar la clase con id " + id;
    }
    }
}
