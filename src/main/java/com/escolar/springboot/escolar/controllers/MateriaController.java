package com.escolar.springboot.escolar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.escolar.springboot.escolar.models.Materia;
import com.escolar.springboot.escolar.services.MateriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/materia")
public class MateriaController {
    
    @Autowired
    MateriaService materiaService;

    @GetMapping()
    public ArrayList<Materia> obtenerMaterias(){
        return materiaService.obtenerMaterias();
    }

    @PostMapping
    public Materia guardarMateria(@RequestBody Materia materia){
        return this.materiaService.guardarMateria(materia);
    }

    @GetMapping(path = "/{id}")
    public Optional<Materia> obtenerMateriaPorId(@PathVariable("id") Integer id){
        return materiaService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<Materia> obtenerMateriaPorNombre(@RequestParam("nombre") String nombre){
        return materiaService.obtenerPorNombre(nombre);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.materiaService.eliminarMateria(id);
        if (ok){
            return "Se eliminó la materia con " + id;
        }
        else{
            return "No se pudo eliminar la materia con id " + id;
        }
    }
}
