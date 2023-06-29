package com.portfolioBackend.gloriaBer.service;

import com.portfolioBackend.gloriaBer.model.Proyecto;
import com.portfolioBackend.gloriaBer.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    
    @Autowired
    public RProyecto proyectoRepo;
    
    public List<Proyecto> verProyectos() {
        List<Proyecto> listaProyectos = proyectoRepo.findAll();
        return listaProyectos;
    }
    
    public void crearProyecto(Proyecto proyecto){
        proyectoRepo.save(proyecto);
    }    
    
    public void borrarProyecto(int id){
        proyectoRepo.deleteById(id);
    }
    
    public Proyecto buscarProyecto(int id){        
        Proyecto proyecto = proyectoRepo.findById(id).orElse(null);
        return proyecto;
    }
    
    public void editarProyecto(Proyecto proyecto){
        proyectoRepo.save(proyecto);         
    }
}
