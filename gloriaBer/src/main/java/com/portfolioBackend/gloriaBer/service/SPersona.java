
package com.portfolioBackend.gloriaBer.service;

import com.portfolioBackend.gloriaBer.model.Persona;
import com.portfolioBackend.gloriaBer.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {
    
    @Autowired
    public RPersona personaRepo;
    
    public List<Persona> verPersonas() {
        List<Persona> listaPersonas = personaRepo.findAll();
        return listaPersonas;
    }
    
    public void crearPersona(Persona persona){
        personaRepo.save(persona);
    }    
    
    public void borrarPersona(int id){
        personaRepo.deleteById(id);
    }
    
    public Persona buscarPersona(int id){        
        Persona persona = personaRepo.findById(id).orElse(null);
        return persona;
    }
    
    public void editarPersona(Persona persona){
        personaRepo.save(persona);         
    }
}
