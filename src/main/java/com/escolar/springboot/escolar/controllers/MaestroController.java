package com.escolar.springboot.escolar.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.escolar.springboot.escolar.models.Maestro;
import com.escolar.springboot.escolar.services.MaestroService;

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
@RequestMapping("/maestro")
public class MaestroController {
    
    @Autowired
    MaestroService maestroService;
    
    @GetMapping()
    public ArrayList<Maestro> obtenerMaestros(){
        return maestroService.obtenerMaestros();
    }

    @PostMapping
    public Maestro guardarMaestro(@RequestBody Maestro maestro){
        return this.maestroService.guardarMaestro(maestro);
    }

    @GetMapping(path = "/{id}")
    public Optional<Maestro> obtenerMaestroPorId(@PathVariable("id") Integer id){
        return maestroService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<Maestro> obtenerMaestroPorNombre(@RequestParam("nombre") String nombre){
        return maestroService.obtenerPorNombre(nombre);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.maestroService.eliminarMaestro(id);
        if (ok){
            return "Se eliminó el maestro con id " + id;
        }
        else{
            return "No se pudo eliminar el maestro con id " + id;
    }
    }
}
