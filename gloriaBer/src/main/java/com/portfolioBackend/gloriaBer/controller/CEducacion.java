package com.portfolioBackend.gloriaBer.controller;

import com.portfolioBackend.gloriaBer.model.Educacion;
import com.portfolioBackend.gloriaBer.service.SEducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("educacion")//localhost:8080/educacion
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
    
    @Autowired
    SEducacion educacionService;
    
    @GetMapping("/lista")//localhost:8080/educacion/lista
    @ResponseBody
    public List<Educacion> verEducacions(){
        return educacionService.verEducacions();
    }
    
    @GetMapping("/buscar/{id}")//localhost:8080/educacion/buscar/id
    @ResponseBody
    public Educacion buscarEducacion(@PathVariable int id){
        return educacionService.buscarEducacion(id);
    }
    
    @PostMapping("/crear")//localhost:8080/educacion/crear
    public String crearEducacion(@RequestBody Educacion educacion){
        educacionService.crearEducacion(educacion);
        return "El educacion fue creado con éxito.";
    }
    
    @DeleteMapping("/borrar/{id}")//localhost:8080/educacion/borrar/id
    public String borrarEducacion(@PathVariable int id){
        educacionService.borrarEducacion(id);
        return "El educacion fue eliminado con éxito.";
    }
        
    @PutMapping("/editar")//localhost:8080/educacion/editar
    public String editarEducacion(@RequestBody Educacion educacion){
        educacionService.editarEducacion(educacion);
        return "El educacion fue editado con éxito.";
    }
}
