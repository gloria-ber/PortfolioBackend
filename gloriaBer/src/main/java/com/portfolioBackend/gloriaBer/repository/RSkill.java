
package com.portfolioBackend.gloriaBer.repository;

import com.portfolioBackend.gloriaBer.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkill extends JpaRepository <Skill, Integer>{
    
}
