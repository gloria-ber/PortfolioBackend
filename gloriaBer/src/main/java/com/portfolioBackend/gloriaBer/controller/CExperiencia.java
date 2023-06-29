package com.portfolioBackend.gloriaBer.controller;

import com.portfolioBackend.gloriaBer.model.Experiencia;
import com.portfolioBackend.gloriaBer.service.SExperiencia;
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
@RequestMapping("experiencia")//localhost:8080/experiencia
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {
    
    @Autowired
    SExperiencia experienciaService;
    
    @GetMapping("/lista")//localhost:8080/experiencia/lista
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return experienciaService.verExperiencias();
    }
    
    @GetMapping("/buscar/{id}")//localhost:8080/experiencia/buscar/id
    @ResponseBody
    public Experiencia buscarExperiencia(@PathVariable int id){
        return experienciaService.buscarExperiencia(id);
    }
    
    @PostMapping("/crear")//localhost:8080/experiencia/crear
    public String crearExperiencia(@RequestBody Experiencia experiencia){
        experienciaService.crearExperiencia(experiencia);
        return "La experiencia fue creada con éxito.";
    }
    
    @DeleteMapping("/borrar/{id}")//localhost:8080/experiencia/borrar/id
    public String borrarExperiencia(@PathVariable int id){
        experienciaService.borrarExperiencia(id);
        return "La experiencia fue eliminada con éxito.";
    }
        
    @PutMapping("/editar")//localhost:8080/experiencia/editar
    public String editarExperiencia(@RequestBody Experiencia experiencia){
        experienciaService.editarExperiencia(experiencia);
        return "La experiencia fue editada con éxito.";
    }
    
}
