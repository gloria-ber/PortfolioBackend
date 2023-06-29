package com.portfolioBackend.gloriaBer.service;

import com.portfolioBackend.gloriaBer.model.Educacion;
import com.portfolioBackend.gloriaBer.repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    
    @Autowired
    public REducacion estudioRepo;
    
    public List<Educacion> verEducacions() {
        List<Educacion> listaEducacions = estudioRepo.findAll();
        return listaEducacions;
    }
    
    public void crearEducacion(Educacion estudio){
        estudioRepo.save(estudio);
    }    
    
    public void borrarEducacion(int id){
        estudioRepo.deleteById(id);
    }
    
    public Educacion buscarEducacion(int id){        
        Educacion estudio = estudioRepo.findById(id).orElse(null);
        return estudio;
    }
    
    public void editarEducacion(Educacion estudio){
        estudioRepo.save(estudio);         
    }
}