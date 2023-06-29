package com.portfolioBackend.gloriaBer.repository;

import com.portfolioBackend.gloriaBer.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository <Experiencia, Integer>{
    
}
