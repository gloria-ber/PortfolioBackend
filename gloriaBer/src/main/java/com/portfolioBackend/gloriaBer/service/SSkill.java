package com.portfolioBackend.gloriaBer.service;

import com.portfolioBackend.gloriaBer.model.Skill;
import com.portfolioBackend.gloriaBer.repository.RSkill;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSkill {
    
    @Autowired
    public RSkill skillRepo;
    
    public List<Skill> verSkills() {
        List<Skill> listaSkills = skillRepo.findAll();
        return listaSkills;
    }
    
    public void crearSkill(Skill skill){
        skillRepo.save(skill);
    }    
    
    public void borrarSkill(int id){
        skillRepo.deleteById(id);
    }
    
    public Skill buscarSkill(int id){        
        Skill skill = skillRepo.findById(id).orElse(null);
        return skill;
    }
    
    public void editarSkill(Skill skill){
        skillRepo.save(skill);         
    }
}
