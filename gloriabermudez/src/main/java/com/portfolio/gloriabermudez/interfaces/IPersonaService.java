
package com.portfolio.gloriabermudez.interfaces;

import com.portfolio.gloriabermudez.model.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer lista de personas
    public List<Persona> getPersona();
            
    //Guardar persona
    public void savePersona(Persona persona);
    
    //Eliminar persona
    public void deletePersona(Long id);
    
    //Buscar persona por id
    public Persona findPersona (Long id);
}
