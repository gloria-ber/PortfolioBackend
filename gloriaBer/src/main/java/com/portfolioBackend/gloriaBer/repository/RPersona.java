
package com.portfolioBackend.gloriaBer.repository;

import com.portfolioBackend.gloriaBer.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository <Persona, Integer> {
    
}
