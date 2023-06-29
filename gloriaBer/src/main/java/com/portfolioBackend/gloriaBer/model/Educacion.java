package com.portfolioBackend.gloriaBer.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    private String institucion;  
    private String titulo;
    private String fechaEgreso;
    private String imagenInst;
    

    public Educacion() {
    }

    public Educacion(String institucion, String titulo, String fechaEgreso, String imagenInst) {
        this.institucion = institucion;
        this.titulo = titulo;
        this.fechaEgreso = fechaEgreso;
        this.imagenInst = imagenInst;
        
    }

      
    
}