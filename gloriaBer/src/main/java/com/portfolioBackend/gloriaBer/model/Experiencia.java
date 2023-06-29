package com.portfolioBackend.gloriaBer.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    private String empresa; 
    @Temporal(TemporalType.DATE)
    private String fechaInicio;
    @Temporal(TemporalType.DATE)
    private String fechaFin;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String tareas;
    private String imagenEmpresa;

    public Experiencia() {
    }

    public Experiencia(String empresa, String fechaInicio, String fechaFin, String tareas, String imagenEmpresa) {
        this.empresa = empresa;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tareas = tareas;
        this.imagenEmpresa = imagenEmpresa;
    }

    
    

}
