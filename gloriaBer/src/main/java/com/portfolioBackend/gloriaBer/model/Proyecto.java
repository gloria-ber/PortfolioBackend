package com.portfolioBackend.gloriaBer.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    private String nombreProyecto;  
    private String imagenProyecto;
    private String urlProyecto;

    public Proyecto() {
    }

    public Proyecto(String nombreProyecto, String imagenProyecto, String urlProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.imagenProyecto = imagenProyecto;
        this.urlProyecto = urlProyecto;
    }
    
    
    
}
