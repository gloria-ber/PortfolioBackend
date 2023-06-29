
package com.portfolioBackend.gloriaBer.controller;

import com.portfolioBackend.gloriaBer.model.Persona;
import com.portfolioBackend.gloriaBer.service.SPersona;
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
@RequestMapping("persona")//localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {
    
    @Autowired
    SPersona personaService;
    
    @GetMapping("/lista")//localhost:8080/persona/lista
    @ResponseBody
    public List<Persona> verPersonas(){
        return personaService.verPersonas();
    }
    
    @GetMapping("/buscar/{id}")//localhost:8080/persona/buscar/id
    @ResponseBody
    public Persona buscarPersona(@PathVariable int id){
        return personaService.buscarPersona(id);
    }
    
    @PostMapping("/crear")//localhost:8080/persona/crear
    public String crearPersona(@RequestBody Persona persona){
        personaService.crearPersona(persona);
        return "La persona fue creada con éxito.";
    }
    
    @DeleteMapping("/borrar/{id}")//localhost:8080/persona/borrar/id
    public String borrarPersona(@PathVariable int id){
        personaService.borrarPersona(id);
        return "La persona fue eliminada con éxito.";
    }
        
    @PutMapping("/editar")//localhost:8080/persona/editar
    public String editarPersona(@RequestBody Persona persona){
        personaService.editarPersona(persona);
        return "La persona fue editada con éxito.";
    }
}
