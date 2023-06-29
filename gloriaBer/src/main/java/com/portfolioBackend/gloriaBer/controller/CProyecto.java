package com.portfolioBackend.gloriaBer.controller;

import com.portfolioBackend.gloriaBer.model.Proyecto;
import com.portfolioBackend.gloriaBer.service.SProyecto;
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
@RequestMapping("proyecto")//localhost:8080/proyecto
@CrossOrigin(origins = "http://localhost:4200")
public class CProyecto {
    @Autowired
    SProyecto proyectoService;
    
    @GetMapping("/lista")//localhost:8080/proyecto/lista
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyectoService.verProyectos();
    }
    
    @GetMapping("/buscar/{id}")//localhost:8080/proyecto/buscar/id
    @ResponseBody
    public Proyecto buscarProyecto(@PathVariable int id){
        return proyectoService.buscarProyecto(id);
    }
    
    @PostMapping("/crear")//localhost:8080/proyecto/crear
    public String crearProyecto(@RequestBody Proyecto proyecto){
        proyectoService.crearProyecto(proyecto);
        return "El proyecto fue creado con éxito.";
    }
    
    @DeleteMapping("/borrar/{id}")//localhost:8080/proyecto/borrar/id
    public String borrarProyecto(@PathVariable int id){
        proyectoService.borrarProyecto(id);
        return "El proyecto fue eliminado con éxito.";
    }
        
    @PutMapping("/editar")//localhost:8080/proyecto/editar
    public String editarProyecto(@RequestBody Proyecto proyecto){
        proyectoService.editarProyecto(proyecto);
        return "El proyecto fue editado con éxito.";
    }
}
