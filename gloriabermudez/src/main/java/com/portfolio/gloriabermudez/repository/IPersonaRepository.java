
package com.portfolio.gloriabermudez.repository;

import com.portfolio.gloriabermudez.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
