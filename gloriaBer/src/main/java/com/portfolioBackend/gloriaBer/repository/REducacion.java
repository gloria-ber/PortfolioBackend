package com.portfolioBackend.gloriaBer.repository;

import com.portfolioBackend.gloriaBer.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository <Educacion, Integer>{
    
}
