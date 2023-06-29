package com.portfolioBackend.gloriaBer.service;

import com.portfolioBackend.gloriaBer.model.Experiencia;
import com.portfolioBackend.gloriaBer.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    public RExperiencia experienciaRepo;
    
    public List<Experiencia> verExperiencias() {
        List<Experiencia> listaExperiencias = experienciaRepo.findAll();
        return listaExperiencias;
    }
    
    public void crearExperiencia(Experiencia experiencia){
        experienciaRepo.save(experiencia);
    }    
    
    public void borrarExperiencia(int id){
        experienciaRepo.deleteById(id);
    }
    
    public Experiencia buscarExperiencia(int id){        
        Experiencia experiencia = experienciaRepo.findById(id).orElse(null);
        return experiencia;
    }
    
    public void editarExperiencia(Experiencia experiencia){
        experienciaRepo.save(experiencia);         
    }
}
