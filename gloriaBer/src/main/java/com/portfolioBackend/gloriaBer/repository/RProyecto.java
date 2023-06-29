package com.portfolioBackend.gloriaBer.repository;

import com.portfolioBackend.gloriaBer.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository <Proyecto, Integer>{
    
}
