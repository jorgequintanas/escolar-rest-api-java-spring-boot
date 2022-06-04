package com.escolar.springboot.escolar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.escolar.springboot.escolar.models.Clasealumno;
import com.escolar.springboot.escolar.services.ClasealumnoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clasealumno")
public class ClasealumnoController {
    
    @Autowired
    ClasealumnoService clasealumnoService;

    @GetMapping()
    public ArrayList<Clasealumno> obtenerClasesalumnos(){
        return clasealumnoService.obtenerClasesalumnos();
    }

    @PostMapping
    public Clasealumno guardarClasealumno(@RequestBody Clasealumno clasealumno){
        return this.clasealumnoService.guardarClasealumno(clasealumno);
    }

    @GetMapping(path = "/{id}")
    public Optional<Clasealumno> obtenerClasealumnoPorId(@PathVariable("id") Integer id){
        return clasealumnoService.obtenerPorId(id);
    }

    @GetMapping(path = "/alumno/{idalumno}")
    public Optional<Clasealumno> obtenerClasealumnoPorIdAlumno(@PathVariable("idalumno") Integer idalumno){
        return clasealumnoService.obtenerPorId(idalumno);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.clasealumnoService.eliminarClasealumno(id);
        if (ok){
            return "Se eliminó la carga clase-alumno con id " + id;
        }
        else{
            return "No se pudo eliminar la carga clase-alumno con id " + id;
    }
    }
}
