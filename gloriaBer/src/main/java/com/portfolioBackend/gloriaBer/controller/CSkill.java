package com.portfolioBackend.gloriaBer.controller;

import com.portfolioBackend.gloriaBer.model.Skill;
import com.portfolioBackend.gloriaBer.service.SSkill;
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
@RequestMapping("skill")//localhost:8080/skill
@CrossOrigin(origins = "http://localhost:4200")
public class CSkill {
    
    @Autowired
    SSkill skillService;
    
    @GetMapping("/lista")//localhost:8080/skill/lista
    @ResponseBody
    public List<Skill> verSkills(){
        return skillService.verSkills();
    }
    
    @GetMapping("/buscar/{id}")//localhost:8080/skill/buscar/id
    @ResponseBody
    public Skill buscarSkill(@PathVariable int id){
        return skillService.buscarSkill(id);
    }
    
    @PostMapping("/crear")//localhost:8080/skill/crear
    public String crearSkill(@RequestBody Skill skill){
        skillService.crearSkill(skill);
        return "La skill fue creado con éxito.";
    }
    
    @DeleteMapping("/borrar/{id}")//localhost:8080/skill/borrar/id
    public String borrarSkill(@PathVariable int id){
        skillService.borrarSkill(id);
        return "La skill fue eliminado con éxito.";
    }
        
    @PutMapping("/editar")//localhost:8080/skill/editar
    public String editarSkill(@RequestBody Skill skill){
        skillService.editarSkill(skill);
        return "La skill fue editado con éxito.";
    }
    
}
