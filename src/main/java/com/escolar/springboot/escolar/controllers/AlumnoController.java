package com.escolar.springboot.escolar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.escolar.springboot.escolar.models.Alumno;
import com.escolar.springboot.escolar.services.AlumnoService;

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
@RequestMapping("/alumno")
public class AlumnoController {
    
    @Autowired
    AlumnoService alumnoService;

    @GetMapping()
    public ArrayList<Alumno> obtenerAlumnos(){
        return alumnoService.obtenerAlumnos();
    }

    @PostMapping
    public Alumno guardarAlumno(@RequestBody Alumno alumno){
        return this.alumnoService.guardarAlumno(alumno);
    }

    @GetMapping(path = "/{id}")
    public Optional<Alumno> obtenerAlumnoPorId(@PathVariable("id") Integer id){
        return alumnoService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<Alumno> obtenerAlumnoPorNombre(@RequestParam("nombre") String nombre){
        return alumnoService.obtenerPorNombre(nombre);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.alumnoService.eliminarAlumno(id);
        if (ok){
            return "Se eliminó el alumno con matrícula " + id;
        }
        else{
            return "No se pudo eliminar el alumno con matrícula " + id;
    }
    }
}
